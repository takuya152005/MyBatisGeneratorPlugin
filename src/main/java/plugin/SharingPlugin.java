package plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * <pre>
 * テーブルの水平分散を支援するプラグイン。<br>
 * 注意事項
 * ・分散でのtableNameSuffixの値は、整数しか対応していません。テーブルの末尾の整数を削除するため、テーブル名にsuffix以外の数字を使わないこと
 *
 * 変更点
 * ・sql mapのテーブル名にsuffix追加
 *  ex:i_user -> &lttrim&gti_user&ltif test="tableNameSuffix != null" &gt_${tableNameSuffix}&lt/if&gt&lt/trim&gt
 * ・dtoのkeyクラスにtableNameSuffix変数追加
 * ・generatorCongig.xmlにsuffix付きのテーブルを指定した場合、suffixを外して処理を行うように変更
 *
 * 使い方
 * 分散対象のテーブルの場合、dtoのkeyクラスのtableNameSuffixに値を入れると、SQL分のfromを「tableName_${tableNameSuffix}」に変更する
 *
 * generator方法
 * ・generatorCongig.xmlのテーブルは、分散しているテーブルの1つを指定してください。
 *  ex:&lttable tableName="i_user_bookmark_0"/&gt
 *
 * </pre>
 */
public class SharingPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		// sql mapのテーブル名にsuffix追加
		String tableName = table.getAliasedFullyQualifiedTableNameAtRuntime();
		tableName = tableName.replaceAll("_\\d+$", "");
		tableName = "<trim>" + tableName + "<if test=\"tableNameSuffix != null\" >_${tableNameSuffix}</if></trim>";
		table.setSqlMapAliasedFullyQualifiedRuntimeTableName(tableName);
		table.setSqlMapFullyQualifiedRuntimeTableName(tableName);

		// generatorCongig.xmlのsuffix付きのテーブル対応
		// sql map
		// ATTR_MYBATIS3_XML_MAPPER_FILE_NAME=IUserBookmark0.xml
		table.setMyBatis3XmlMapperFileName(
				table.getMyBatis3XmlMapperFileName()
				.replaceAll("\\d+\\.xml$", ".xml"));
		// dao
		// ATTR_MYBATIS3_JAVA_MAPPER_TYPE=jp.takuya152005.entities.dao.IUserBookmark0Dao
		table.setMyBatis3JavaMapperType(
				table.getMyBatis3JavaMapperType()
				.replaceAll("\\d+(Dao|Mapper)$", "$1"));

		// ATTR_DAO_INTERFACE_TYPE=jp.takuya152005.entities.dao.IUserBookmark0DAO
		table.setDAOInterfaceType(
				table.getDAOInterfaceType()
				.replaceAll("\\d+DAO$", "DAO"));

		// dao impl出せるの？
		// ATTR_DAO_IMPLEMENTATION_TYPE=jp.takuya152005.entities.dao.IUserBookmark0DAOImpl
		table.setDAOImplementationType(
				table.getDAOImplementationType()
				.replaceAll("\\d+DAOImpl$", "DAOImpl"));

		// ATTR_MYBATIS3_SQL_PROVIDER_TYPE=jp.takuya152005.entities.dao.IUserBookmark0SqlProvider
		table.setMyBatis3SqlProviderType(
				table.getMyBatis3SqlProviderType()
				.replaceAll("\\d+SqlProvider$", "SqlProvider"));


		// dto
		// ATTR_MYBATIS3_FALLBACK_SQL_MAP_NAMESPACE
		table.setMyBatis3FallbackSqlMapNamespace(
				table.getMyBatis3FallbackSqlMapNamespace()
				.replaceAll("\\d+(Dao|Mapper)$", "$1"));

		// ATTR_EXAMPLE_TYPE=jp.takuya152005.entities.dto.IUserBookmark0Example
		table.setExampleType(
				table.getExampleType()
				.replaceAll("\\d+Example$", "Example"));

		// ATTR_RECORD_WITH_BLOBS_TYPE=jp.takuya152005.entities.dto.IUserBookmark0WithBLOBs
		table.setRecordWithBLOBsType(
				table.getRecordWithBLOBsType()
				.replaceAll("\\d+WithBLOBs$", "WithBLOBs"));

		// ATTR_PRIMARY_KEY_TYPE=jp.takuya152005.entities.dto.IUserBookmark0Key
		table.setPrimaryKeyType(
				table.getPrimaryKeyType()
				.replaceAll("\\d+Key$", "Key"));


		// ATTR_BASE_RECORD_TYPE=jp.takuya152005.entities.dto.IUserBookmark0
		table.setBaseRecordType(
				table.getBaseRecordType()
				.replaceAll("\\d+$", ""));


	}


	@Override
	public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		makeTableNameSuffix(topLevelClass, introspectedTable);
		return true;
	}

	protected void makeTableNameSuffix(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

		// private Integer tableNameSuffix;
		Field field = new Field();
		field.setVisibility(JavaVisibility.PRIVATE);
		field.setType(new FullyQualifiedJavaType("Integer"));
		field.setName("tableNameSuffix");
		context.getCommentGenerator().addFieldComment(field, introspectedTable);
		topLevelClass.addField(field);

		// setter,getter
		Method getMethod = new Method();
		getMethod.setVisibility(JavaVisibility.PUBLIC);
		getMethod.setReturnType(new FullyQualifiedJavaType("Integer"));
		getMethod.setName("getTableNameSuffix");
		getMethod.addBodyLine("return tableNameSuffix;");
		context.getCommentGenerator().addGeneralMethodComment(getMethod, introspectedTable);
		topLevelClass.addMethod(getMethod);

		Method setMethod = new Method();
		setMethod.setVisibility(JavaVisibility.PUBLIC);
		setMethod.setReturnType(new FullyQualifiedJavaType("void"));
		setMethod.setName("setTableNameSuffix");
		setMethod.addParameter(new Parameter(new FullyQualifiedJavaType("Integer"), "tableNameSuffix"));
		setMethod.addBodyLine("this.tableNameSuffix = tableNameSuffix;");
		context.getCommentGenerator().addGeneralMethodComment(setMethod, introspectedTable);
		topLevelClass.addMethod(setMethod);

	}
}

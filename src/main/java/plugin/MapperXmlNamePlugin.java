package plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * MyBatis Generatorが生成するマッパーXMLファイル名の末尾のMapperを削除するプラグイン。
 */
public class MapperXmlNamePlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		table.setMyBatis3XmlMapperFileName(
				table.getMyBatis3XmlMapperFileName()
				.replaceAll("Mapper", ""));
	}
}

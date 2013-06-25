package plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * MyBatis Generatorが生成するマッパークラス名の末尾を、MapperからDaoに変更するプラグイン。
 */
public class MapperClassNamePlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		table.setMyBatis3JavaMapperType(
				table.getMyBatis3JavaMapperType()
				.replaceAll("Mapper$", "Dao"));
	}
}

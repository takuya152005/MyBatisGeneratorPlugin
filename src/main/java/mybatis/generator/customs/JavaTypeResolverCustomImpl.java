package mybatis.generator.customs;

import java.sql.Types;

import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * JavaTypeResolverの拡張クラス
 * TINYINTのマッピングをByte -> Integerに修正
 *
 * 使い方：generatorConfig.xml のjavaTypeResolver type="plugin.JavaTypeResolverCustomImpl"を指定
 *
 * @author iwamoto takuya
 */
public class JavaTypeResolverCustomImpl extends JavaTypeResolverDefaultImpl implements JavaTypeResolver {

	public JavaTypeResolverCustomImpl() {
		super();

		// typeMapのカスタマイズ
		typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", //$NON-NLS-1$
				new FullyQualifiedJavaType(Integer.class.getName())));
	}

}

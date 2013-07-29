MyBatisGeneratorPlugin
======================

MyBatis Generator plugin

プラグイン一覧
------

* MapperXmlNamePlugin  
  ->MyBatis Generatorが生成するマッパーXMLファイル名の末尾のMapperを削除するプラグイン。

* MapperClassNamePlugin  
  ->MyBatis Generatorが生成するマッパークラス名の末尾を、MapperからDaoに変更するプラグイン。

* SharingPlugin  
  ->テーブルの水平分散を支援するプラグイン。

* MySQLのTinyintのカラムのマッピングをByte→Integerに変更

使い方
------

・generatorConfig.xmlにプラグインの設定を追加。javaTypeResolverにtype指定

    <plugin type="plugin.MapperClassNamePlugin" />
    <plugin type="plugin.MapperXmlNamePlugin" />
    <plugin type="plugin.SharingPlugin" />
    <javaTypeResolver type="mybatis.generator.customs.JavaTypeResolverCustomImpl">


・eclipseの「MyBatis Generator Eclipse plugin」から実行  
  http://mybatis.googlecode.com/svn/sub-projects/generator/trunk/eclipse/UpdateSite/


アーキテクチャ
------

・水平分割の方法
SQL文の作成時にテーブル名を「tableName_${tableNameSuffix}」として対応。  
dtoクラス作成時に必ず「base dto」「example」「key」クラスを作成するように設定を行なっている。keyクラスにtableNameSuffixのカスタマイズを入れているので分散対象のテーブルの場合は指定をして下さい。

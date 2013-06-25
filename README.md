MyBatisGeneratorPlugin
======================

MyBatis Generator plugin

プラグイン一覧
------

・MapperXmlNamePlugin
→MyBatis Generatorが生成するマッパーXMLファイル名の末尾のMapperを削除するプラグイン。

・MapperClassNamePlugin
→MyBatis Generatorが生成するマッパークラス名の末尾を、MapperからDaoに変更するプラグイン。

・SharingPlugin
→テーブルの水平分散を支援するプラグイン。


使い方
------

・generatorConfig.xmlにプラグインの設定を追加
<plugin type="plugin.MapperClassNamePlugin" />
<plugin type="plugin.MapperXmlNamePlugin" />
<plugin type="plugin.SharingPlugin" />


・eclipseの「MyBatis Generator Eclipse plugin」から実行
http://mybatis.googlecode.com/svn/sub-projects/generator/trunk/eclipse/UpdateSite/



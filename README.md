AndroidTrainingForGraduates2014
===============================

2014新卒向け Android 研修課題です。

#### ゴール
Android の重要なコンポーネントの1つである Intent の基礎について理解し、利用できるようになること。


#### Intent について
参考 : [AndroidTraining | 2.04. メッセージングと通知](https://github.com/mixi-inc/AndroidTraining/wiki/2.04.-%E3%83%A1%E3%83%83%E3%82%BB%E3%83%BC%E3%82%B8%E3%83%B3%E3%82%B0%E3%81%A8%E9%80%9A%E7%9F%A5)

#### 課題

リポジトリ内の Android Project を Android Stodio にインポートして以下の課題を進めてください。

##### 明示的 Intent
1. 新たに画面(B)を作成してください。用意されている画面(A)の「viewImage」ボタンをタップしたら、画面(B)に遷移するようにしてください。
2. assets フォルダ内にある画像(m_balloon_icon.png)の URI を画面(A)から画面(B)に受け渡し、画面(B)で画像を表示してください。
   assets フォルダに格納されている画像の URI は以下のように作成できます。
   
   	`Uri uri = Uri.parse("content://" + AssetsFileProvider.AUTHORITY + "/m_balloon_icon.png");`
    

##### 暗黙的 Intent

3. 画面(A)にボタンを追加して、タップしたらカメラアプリを起動するようにしてください。
4. カメラで写真を撮ったら、写真の情報を画面(B)に渡して画像を表示してください。  
ヒント:Intent camera onActivityResult

##### ContentProvider
4. 明示的 Intentの課題で使用した URI 生成コードは、ContentProvider を用いた AssetsFileProvider を使用することで実現しています。  
	* ContentProvider が、どのようなコンポーネントであるかをレポートしてください。
	* AssetsFileProvider が、どのように機能を提供しているかをレポートしてください。


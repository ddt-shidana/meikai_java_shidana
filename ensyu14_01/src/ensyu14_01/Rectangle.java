/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-1 p463
 * 	ここに示した図形クラス群を利用するプログラム例を作成せよ。
 *
 * パッケージ名:ensyu14_01
 * 作成日:2022/03/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu14_01;

//===================== 具体クラス：長方形を表す =====================//
/**
* 概要：	長方形を表す具体クラス。<BR>
* 補足：	このクラスは、四角形を表す抽象クラスTetragonから派生したクラス。<BR>
 * 	@see Shape
 * 	@see Dimension_2
 *  @see Tetragon
*/
public class Rectangle extends Tetragon {

	//----- コンストラクタ -----//
	/**
	 * 概要：	長方形を生成するコンストラクタ。
	 * @param width 長方形の幅、int型
	 * @param height 長方形の高さ、int型
	 */
	public Rectangle(int width, int height) {
		//このクラスの各フィールドに、各引数を設定
		super(width, height);
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	長方形に関する図形情報をあらわす文字列を返却するメソッド。
	 * 返却値：	String型、「Rectangle(width:3, height:4)」※3,4は各長さに応じた値<BR>
	 * @return	"Rectangle(width:" + width + ", height:" + height + ")"
	 */
	@Override
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	//----- 抽象メソッド：図形を描画する -----//
	/**
	 * 概要：	長方形を描画する抽象メソッド。<BR>
	 * 補足：<BR>
	 * 			描画は、'*'を並べることによって行う。<BR>
	 * 			幅の個数だけ'*'を表示し、改行するのをwidth回だけ繰り返す。
	 */
	@Override
	public void draw() {
		//縦のループ
		for (int i = 1; i <= height; i++) {
			//横のループ
			for (int j = 1; j <= width; j++) {
				//アスタリスクを表示
				System.out.print('*');
			}
			//横のループが終わったら、次の段にうつるため改行
			System.out.println("");	}
	}
}

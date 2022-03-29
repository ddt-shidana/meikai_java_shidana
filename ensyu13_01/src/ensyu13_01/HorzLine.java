/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13-1 p415
 * 	図形クラス群をテストするプログラムを作成せよ。List13-9と同じく、
 * 	Shape型の配列を利用して、インスタンスの生成と表示を行うこと。
 * 		ただし、個々の要素が参照するインスタンスは、プログラム内で与えるのではなく、
 * 		キーボードから読み込むようにすること。
 *
 * パッケージ名:ensyu13_01
 * クラス名:HorzLine
 * 作成日:2022/03/25
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu13_01;

//===================== 具体クラス：水平直線を表す =====================
/**
* 概要：	水平直線を表すクラス。<BR>
* 補足：<BR>
* 			このクラスは、直線を表す抽象クラスAbstLineから派生したクラス。
* 	@see Shepe
* 	@see AbstLine
*/
public class HorzLine extends AbstLine {

	//----- コンストラクタ -----//
	/**
	 * 概要：	水平直線を生成するコンストラクタ。
	 * @param length 生成する直線の長さ、int型
	 */
	public HorzLine(int length) {
		super(length);
	}
	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	水平直線を表す文字列を返却するメソッド。<BR>
	 * 返却値：	String型、「HorzLine(length:3)」※3は長さに応じた値<BR>
	 * @return	"HorzLine(length:" + getLength() + ")"
	 */
	@Override
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}

	//----- メソッド：図形を描画する -----//
	/**
	 * 概要：	水平直線を描画するメソッド。<BR>
	 * 補足；<BR>
	 * 			描画はマイナス記号'-'を横に並べることによって行う。<BR>
	 * 			長さの個数だけ'-'を連続表示して改行する。
	 */
	@Override
	public void draw() {
		//指定された長さ分、繰り返す
		for (int i = 1; i <= getLength(); i++) {
			//'-'を並べる
			System.out.print('-');
		}
		//描画し終わったら改行
		System.out.println("");
	}

}
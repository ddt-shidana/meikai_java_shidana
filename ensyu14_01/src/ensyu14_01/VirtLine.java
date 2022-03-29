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

//===================== 具体クラス：垂直直線を表す =====================
/**
* 概要：	垂直線分を表すクラス。<BR>
* 補足：<BR>
* 			このクラスは、直線を表す抽象クラスLineSegmentから派生したクラス。
* 	@see Shape
*  	@see Dimension_1
* 	@see LineSegment
*/
public class VirtLine extends LineSegment  {

	//----- コンストラクタ -----//
	/**
	 * 概要：	垂直線分を生成するコンストラクタ。
	 * @param length 生成する線分の長さ、int型
	 */
	public VirtLine(int length) {
		//線分の抽象クラス（LineSegment）て用意されているコンストラクタを利用
		super(length);
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	垂直線分を表す文字列を返却するメソッド。<BR>
	 * 返却値：	String型、「VirtLine(length:3)」※3は長さに応じた値<BR>
	 * @return	"VirtLine(length:" + getLength() + ")"
	 */
	@Override
	public String toString() {
		return "VirtLine(length:" + getLength() + ")";
	}

	//----- メソッド：図形を描画する -----//
	/**
	 * 概要：	垂直線分を描画するメソッド。<BR>
	 * 補足；<BR>
	 * 			描画はマイナス記号'｜'を縦に並べることによって行う。<BR>
	 * 			長さの個数だけ'｜'を連続表示して改行する。
	 */
	@Override
	public void draw() {
		//指定された長さ分、繰り返す
		for (int i = 1; i <= getLength(); i++) {
			//'｜'を表示して改行
			System.out.println('｜');
		}
	}

}

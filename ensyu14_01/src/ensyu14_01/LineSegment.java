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

//===================== 抽象クラス：直線を表す =====================
/**
 * 概要：	線分を表す抽象クラス。<BR>
 * 補足：<BR>
 * 			このクラスは、図形を表す抽象クラスShapeから派生したクラス。<BR>
 * 			本クラスのインスタンスを生成することはできない。<BR>
 * 			具体的な線分クラスは、このクラスから派生させる。<BR>
 * 	@see Shape
 * 	@see Dimension_1
 * 	@see HorzLine VirtLine
 */
public abstract class LineSegment extends Shape {

	//----- フィールド -----//
	/**
	 * 概要：	位相次元1の長さを表すint型のフィールド。
	 */
	private int length;

	//----- コンストラクタ -----//
	/**
	 * 概要：	線分を生成するコンストラクタ。
	 * @param length 線分の長さ、int型
	 */
	public LineSegment(int length) {
		setLength(length);
	}

	//----- アクセッサ（ゲッタメソッド）：直線の長さを取得 -----//
	/**
	 * 概要：	線分の長さを取得する。
	 * @return	length 位相次元1の長さ、int型
	 */
	public int getLength() {
		return length;
	}

	//----- アクセッサ（セッタメソッド）：直線の長さを設定 -----//
	/**
	 * 概要：	直線の長さを設定する。
	 * @param length int型、位相次元1の長さ。
	 */
	public void setLength(int length) {
		this.length = length;
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	線分に関する図形情報を表す文字列を返却する。<BR>
	 * 返却値：	String型、「AbstLine(length:3)」※3は長さに応じた値<BR>
	 * @return	"LineSegment(length:" + length + ")"
	 */
	@Override
	public String toString() {
		return "LineSegment(length:" + length + ")";
	}

}

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

/**
 * 概要：	0次元の図形を表す抽象クラス。<BR>
 * 補足：<BR>
 * 			このクラスは、図形を表す抽象クラスShapeから派生したクラス。<BR>
 * 			本クラスのインスタンスを生成することはできない。<BR>
 * 			具体的な0次元クラスは、このクラスから派生させる。<BR>
 * 	@see Shape
 * 	@see Point
 */
public abstract class Dimension_0 extends Shape {

	//----- コンストラクタ -----//
	/**
	 * 概要：	0次元の図形を生成するコンストラクタ
	 * @param なし
	 */
	public Dimension_0() {
		//デフォルトコンストラクタの継承
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	0次元の図形情報を表す文字列を返却する。<BR>
	 * @return	"Dimension_0"
	 */
	@Override
	public String toString() {
		return "Dimension_0";
	}
}
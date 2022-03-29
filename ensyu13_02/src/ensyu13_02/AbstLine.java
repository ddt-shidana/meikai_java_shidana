/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13-2 p415
 * 	図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
 * 	左下が直角のもの、右下が直角のもの、右上が直角のもの追加すること。
 * 	直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること。
 *
 * パッケージ名:ensyu13_02
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu13_02;

//===================== 抽象クラス：直線を表す =====================
/**
 * 概要：	直線を表す抽象クラス。<BR>
 * 補足：<BR>
 * 			このクラスは、図形を表す抽象クラスShapeから派生したクラス。<BR>
 * 			本クラスのインスタンスを生成することはできない。<BR>
 * 			具体的な直線クラスは、このクラスから派生させる。<BR>
 * 	@see Shape
 * 	@see HorzLine VirtLine
 */
public abstract class AbstLine extends Shape {

	//----- フィールド -----//
	/**
	 * 概要：	直線の長さを表すint型のフィールド。
	 */
	private int length;

	//----- コンストラクタ -----//
	/**
	 * 概要：	直線を生成するコンストラクタ。
	 * @param length 直線の長さ、int型
	 */
	public AbstLine(int length) {
		setLength(length);
	}

	//----- アクセッサ（ゲッタメソッド）：直線の長さを取得 -----//
	/**
	 * 概要：	直線の長さを取得する。
	 * @return	length 直線の長さ、int型
	 */
	public int getLength() {
		return length;
	}

	//----- アクセッサ（セッタメソッド）：直線の長さを設定 -----//
	/**
	 * 概要：	直線の長さを設定する。
	 * @param length int型、直線の長さ。
	 */
	public void setLength(int length) {
		this.length = length;
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	直線に関する図形情報を表す文字列を返却する。<BR>
	 * 返却値：	String型、「AbstLine(length:3)」※3は長さに応じた値<BR>
	 * @return	"AbstLine(length:" + length + ")"
	 */
	@Override
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}

}

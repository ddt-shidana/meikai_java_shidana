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

//===================== 抽象クラス：直角三角形を表す =====================
/**
* 概要：	直角三角形を表す抽象クラス。<BR>
* 補足：<BR>
* 			このクラスは、図形を表す抽象クラスShapeから派生したクラス。<BR>
* 			本クラスのインスタンスを生成することはできない。<BR>
* 			具体的な直角三角形クラスは、このクラスから派生させる。<BR>
* 	@see Shape
* 	@see RiIsoTriangle_LD RiTriangle_LU RiTriangle_RD RiTriangle_RU
*/
public abstract class AbstRiIsoTriangle extends Shape {

	//----- フィールド -----//
	/**
	 * 概要：	直角二等辺三角形の辺の長さを表すint型フィールド。
	 */
	//辺の長さ（底辺）
	private int length;

	//----- コンストラクタ -----//
	/**
	 * 概要：	直角二等辺三角形を生成するコンストラクタ。
	 * @param length 直角二等辺三角形の辺の長さ
	 */
	public AbstRiIsoTriangle(int length) {
		//このクラスのフィールド、直角二等辺三角形の辺の長さに、仮引数を代入
		this.length = length;
	}

	//----- アクセッサ（ゲッタメソッド）：各長さを取得 -----//
	/**
	 * 概要：	直角二等辺三角形の辺の長さを取得する。
	 * @return	length 直角二等辺三角形の辺の長さ、int型
	 */
	public int getLength() {
		return length;
	}

	//----- アクセッサ（セッタメソッド）：各長さを設定 -----//
	/**
	 * 概要：	直角二等辺三角形の辺の長さを設定する。
	 * @param length 直角二等辺三角形の辺の長さ、int型
	 */
	public void setLength(int length) {
		this.length = length;
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	直線に関する図形情報を表す文字列を返却する。<BR>
	 * 返却値：	String型、「AbstRiTriangle(length:3)」※3は長さに応じた値<BR>
	 * @return	"AbstRiTriangle(length:" + length + ")"
	 */
	@Override
	public String toString() {
		return "AbstRiTriangle(length:" + length + ")";
	}

}

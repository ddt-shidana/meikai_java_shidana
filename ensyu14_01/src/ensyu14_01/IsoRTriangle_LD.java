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

//===================== 具体クラス：左下直角二等辺三角形を表す =====================
/**
* 概要：	左上直角二等辺三角形を表すクラス。<BR>
* 補足：<BR>
* 			このクラスは、直角二等辺三角形を表す抽象クラスAbstRiIsoTriangleから派生したクラス。<BR>
* 	@see Shape
*	@see Dimension_2
* 	@see Triangle
*/
public class IsoRTriangle_LD extends Triangle {

	//----- コンストラクタ -----//
	/**
	 * 概要：	左上直角二等辺三角形を生成するコンストラクタ。
	 * @param length 生成する二等辺三角形の一辺の長さ、int型
	 */
	public IsoRTriangle_LD(int length) {
		super(length, length);
	}

	//----- アクセッサ（セッタメソッド）：各長さを設定 -----//
	/**
	 * 概要：	直角二等辺三角形の辺の長さを設定する。
	 * @param length 直角二等辺三角形の辺の長さ、int型
	 */
	public void setLength(int length) {
		super.width = length;
		super.height = length;
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	直線に関する図形情報を表す文字列を返却する。<BR>
	 * 返却値：	String型、「IsoRTriangle_LD(length:3)」※3は長さに応じた値<BR>
	 * @return	"IsoRTriangle_LD(length:" + length + ")"
	 */
	@Override
	public String toString() {
		return "IsoRTriangle_LD(length:" + getWidth() + ")";
	}
	//----- メソッド：図形を描画する -----//
	/**
	 * 概要：	左上直角二等辺三角形を描画するメソッド。<BR>
	 * 補足；<BR>
	 * 			描画は'*'を並べることによって行う。<BR>
	 * 			二等辺三角形になるように、適度に空白スペースを表示する。
	 */
	@Override
	public void draw() {
		//縦のループ
		for (int vertical = 1; vertical <= getWidth(); vertical++) {
			//横のループ
			for (int beside = 1; beside <= vertical; beside++) {
				//アスタリスクを表示
				System.out.print("*");
				//2文字以上並ぶとき、
				if (vertical >= 2) {
					//二等辺三角形に見えるように、スペースを追加する
					System.out.print(" ");
				}
			}
			//次の行に行くため改行
			System.out.println("");
		}
	}
}
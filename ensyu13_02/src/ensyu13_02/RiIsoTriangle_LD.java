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

//===================== 具体クラス：左下直角二等辺三角形を表す =====================
/**
* 概要：	左下直角二等辺三角形を表すクラス。<BR>
* 補足：<BR>
* 			このクラスは、直角二等辺三角形を表す抽象クラスAbstRiIsoTriangleから派生したクラス。<BR>
* 	@see Shape
* 	@see AbstRiIsoTriangle
*/
public class RiIsoTriangle_LD extends AbstRiIsoTriangle {

	//----- コンストラクタ -----//
	/**
	 * 概要：	左下直角二等辺三角形を生成するコンストラクタ。
	 * @param length 生成する直線の長さ、int型
	 */
	public RiIsoTriangle_LD(int length) {
		super(length);
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	左下直角二等辺三角形を表す文字列を返却するメソッド。<BR>
	 * 返却値：	String型、「RiIsoTriangle_LD(length:3)」※3は長さに応じた値<BR>
	 * @return	"RiIsoTriangle_LD(length:" + getLength() + ")"
	 */
	@Override
	public String toString() {
		return "RiIsoTriangle_LD(length:" + getLength() + ")";
	}

	//----- メソッド：図形を描画する -----//
	/**
	 * 概要：	左下直角二等辺三角形を描画するメソッド。<BR>
	 * 補足；<BR>
	 * 			描画は'*'を並べることによって行う。<BR>
	 * 			二等辺三角形になるように、適度に空白スペースを表示する。
	 */
	@Override
	public void draw() {
		//縦のループ
		for (int vertical = 1; vertical <= getLength(); vertical++) {
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
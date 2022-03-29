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

//===================== 具体クラス：平行四辺形を表す =====================//
/**
* 概要：	平行四辺形を表す具体クラス。<BR>
* 補足：	このクラスは、四角形を表す抽象クラスTetragonから派生したクラス。<BR>
 * 	@see Shape
 * 	@see Dimension_2
 *  @see Tetragon
*/
public class Parallelogram extends Tetragon {

	//----- コンストラクタ -----//
	/**
	 * 概要：	平行四辺形を生成するコンストラクタ。
	 * @param width 平行四辺形の幅、int型
	 * @param height 平行四辺形の高さ、int型
	 */
	public Parallelogram(int width, int height) {
		//このクラスの各フィールドに、各引数を設定
		super(width, height);
	}

	//----- メソッド：図形情報を表す文字列を返却する -----//
	/**
	 * 概要：	平行四辺形に関する図形情報をあらわす文字列を返却するメソッド。
	 * 返却値：	String型、「Parallelogram(width:3, height:4)」※3,4は各長さに応じた値<BR>
	 * @return	"Parallelogram(width:" + width + ", height:" + height + ")"
	 */
	@Override
	public String toString() {
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	//----- 抽象メソッド：図形を描画する -----//
	/**
	 * 概要：	平行四辺形を描画する抽象メソッド。<BR>
	 * 補足：<BR>
	 * 			描画は、空白スペースと'＃'を並べることによって行う。<BR>
	 * 			幅の個数だけ'*'を表示し、空白スペースで長方形からの変形を表現し、改行するのをwidth回だけ繰り返す。
	 */
	@Override
	public void draw() {
		//縦のループ
		for (int i = 1; i <= height; i++) {
			//横（空白スペース）のループ
			for (int j = 1; j <= height - i; j++) {
				//空白スペースの表示
				System.out.print(' ');
			}
			//横（'＃'）のループ
			for (int j = 1; j <= width; j++) {
				//'＃'を表示
				System.out.print('＃');
			}
			//横のループが終わったら、次の段にうつるため改行
			System.out.println();	}
	}
}

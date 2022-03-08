/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-1 p229
 * 	受け取ったint型因数の値nが
 * 		負であれば-1を返却し、
 * 		0であれば0を返却し、
 * 		正であれば1を返却する
 * 	メソッドsign0fを作成せよ。
 *
 * パッケージ名:ensyu07_01
 * クラス名:Ensyu07_01
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_01 {

	//----------------------正か負かまたは0かを返却するメソッド----------------------//
	/*メソッド名：plusAndMinus
	 * 	int型因数の値nが・・・
	 * 		負であれば-1を返却し、
	 * 		0であれば0を返却し、
	 * 		正であれば1を返却する
	 */
	static int plusAndMinus(int n) {
		int plusAndMinus = n;
		if (n < 0) {
			plusAndMinus = -1;
		}
		else if (n == 0) {
			plusAndMinus = 0;
		}
		else {
			plusAndMinus = 1;
		}
		return plusAndMinus;
	}
	//-------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("整数nの正負を判定するプログラムです。");
		System.out.println("負:-1/0:0/正:1 で結果表示します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数nを入力してもらう
			System.out.print("\n整数n：");

			//変数nInに入力値を取得
			int nIn = stdIn.nextInt();

			//plusAndMinusメソッドを呼出して、正負判定結果をメッセージ表示
			System.out.println("\t正負判定：" + plusAndMinus(nIn));

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-2 p229
 * 	三つのint型引数a,b,cの最小値を求めるメソッドminを作成せよ。
 *
 * パッケージ名:ensyu07_02
 * クラス名:Ensyu07_02
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_02;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_02 {

	//-----------------3つのint型引数a,b,cの最小値を求めるメソッド-----------------//
	/*メソッド名：min
	 * 	minComという比較用の変数を用意し、
	 * 	minComとb, minComとcと順番に比較し、minComの方が大きい時に値を入れ替える。
	 */
	static int min(int a, int b, int c) {
		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		return min;
	}
	//-------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("3つの整数の最小値を判定するプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数aを入力してもらう
			System.out.print("\n整数a：");
			//変数aInに入力値を取得
			int aIn = stdIn.nextInt();

			//整数bを入力してもらう
			System.out.print("整数b：");
			//変数bInに入力値を取得
			int bIn = stdIn.nextInt();

			//整数cを入力してもらう
			System.out.print("整数c：");
			//変数bInに入力値を取得
			int cIn = stdIn.nextInt();

			//minメソッドを呼出して、最小値をメッセージ表示
			System.out.println("\t最小値：" + min(aIn, bIn,cIn));

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

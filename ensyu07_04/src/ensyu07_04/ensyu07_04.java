/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-4 p231
 * 	1からnまでの全整数の和を求めて返却するメソッドsumUpを作成せよ。
 *
 * パッケージ名:ensyu07_04
 * クラス名:Ensyu07_04
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_04;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class ensyu07_04 {

	//-----------------1からnまでの全整数の和を求めて返却するメソッド-----------------//
	/*メソッド名：sumUp
	 *	sum変数を用意
	 *	①1<=nの時
	 *		ループ変数:iItr(初期値:1/終端値:<=n/更新値++)で
	 *		処理内容:sumにiを加算
	 *	②n<1の時
	 *		ループ変数:iItr(初期値:n/終端値:<=1/更新値++)で
	 *		処理内容:sumにiを加算
	 */
	static int sumUp(int n) {
		int sum = 0;
		if (n >= 1) {
			for (int zItr = 1; zItr <= n; zItr++) {
				sum += zItr;
			}
		}
		else {
			for (int zItr = n; zItr <= 1; zItr++) {
				sum += zItr;
			}
		}
		return sum;
	}
	//-------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("1～nまでの全整数の和を求めるプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数aを入力してもらう
			System.out.print("\n整数n：");
			//変数aInに入力値を取得
			int nIn = stdIn.nextInt();

			//sumUpメソッドを呼出して、総和をメッセージ表示
			System.out.println("\t総和：" + sumUp(nIn));

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

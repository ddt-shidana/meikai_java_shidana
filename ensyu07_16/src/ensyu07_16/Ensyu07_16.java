/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-16 p251
 * 	配列aの全要素の最小値を求めるメソッドminOfを作成せよ。
 *
 * パッケージ名:ensyu07_16
 * クラス名:Ensyu07_16
 * 作成日:2022/03/07
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_16 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//---------------------------続行の確認を行うメソッド---------------------------//
	/*メソッド名：confirmRetry
	 *	入力値が1のとき繰り返す、0のとき終了
	 */
	static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		return retryNum == 1;
	}
	//------------------------------------------------------------------------------//

	//----------------------配列aの要素の最小値を求めるメソッド---------------------//
	/*メソッド名：minOf
	 */
	static int minOf(int[] a) {
		//合計値を加算していく変数を用意し、初期値は0
		int min = a[0];
		//sumAに各要素を順番に加算して、合計値を求める
		for (int indexItr = 1; indexItr < a.length; indexItr++) {
			if (min > a[indexItr]) {
				min = a[indexItr];
			}
		}
		//返却値
		return min;
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aの全要素の合計を求めるプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int nIn;
			//要素数n(>0)を入力してもらう
			do {
				System.out.print("要素数：");
				nIn = stdIn.nextInt();
				//n<=0だったときのエラーメッセージを表示
				if (nIn <= 0) {
					System.out.println("正の整数を入力してください。");
				}
			} while (nIn <= 0);

			//配列aを設定
			int[] array = new int[nIn];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < nIn; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//各要素の値を表示
			System.out.print("a = {");
			for (int indexItr = 0; indexItr < nIn; indexItr++) {
				System.out.print(array[indexItr]);
				if(indexItr < nIn - 1)
					System.out.print(", ");
			}
			System.out.println("}");

			//配列aの全要素の合計を求めるメソッドsumOFを呼び出し、表示
			System.out.println("\t配列aの要素の最小値：" + minOf(array));

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

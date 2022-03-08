/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-3 p229
 * 	三つのint型引数a, b, cの中央値を求めるメソッドmedを作成せよ。
 *
 * パッケージ名:ensyu07_03
 * クラス名:Ensyu07_03
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_03;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_03 {

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

	//-----------------3つのint型引数a,b,cの最大値を求めるメソッド-----------------//
	/*メソッド名：max
	 * 	minComという比較用の変数を用意し、
	 * 	minComとb, minComとcと順番に比較し、maxComの方が小さい時に値を入れ替える。
	 */
	static int max(int a, int b, int c) {
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		return max;
	}
	//-------------------------------------------------------------------------------//

	//-----------------3つのint型引数a,b,cの中央値を求めるメソッド-----------------//
	/*メソッド名：med
	 *	 ①a=b=cのとき・・・中央値：a=b=c
	 *	 ②a=b||b=c||c=aのとき
	 * 		(1)a=b(!=c)のとき・・・中央値：a=b
	 * 		(2)b=c(!=a)のとき・・・中央値：b=c
	 * 		(3)c=a(!=b)のとき・・・中央値：c=a
	 *	 ③a!=b&b!=c&&c!=aのとき
	 * 		(1)a=maxのとき
	 * 			(ⅰ)b=minのとき・・・中央値：c
	 * 			(ⅱ)c=minのとき・・・中央値：b
	 * 		(2)b=maxのとき
	 * 			(ⅰ)a=minのとき・・・中央値：c
	 * 			(ⅱ)c=minのとき・・・中央値：a
	 * 		(3)c=maxのとき
	 * 			(ⅰ)a=minのとき・・・中央値：b
	 * 			(ⅱ)b=minのとき・・・中央値：a
	 */
	static int med(int a, int b, int c) {
		//maxメソッドを呼び出し
		int max = max(a, b, c);
		//minメソッドを呼び出し
		int min = min(a, b, c);
		//比較用にmed変数を初期値aで用意
		int med = a;
		if (a == b && b == a && c == a)
			med = a;
		else if (a == b || b == c || c == a) {
			if (a == b) 		med = a;
			else if (b == c)	med = c;
			else 				med = b;
		}
		else {
			if (a == max) {
				if (b == min)			med = c;
				else if (c == min)		med = b;
			}
			else if (b == max) {
				if (a == min)			med = c;
				else if (c == min)		med = a;
			}
			else {
				if (a == min)			med = b;
				else if (b == min)		med = a;
			}
		}

		//戻り値
		return med;
	}
	//-------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("3つの整数の中央値を判定するプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

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

			//medメソッドを呼出して、中央値をメッセージ表示
			System.out.println("\t中央値：" + med(aIn, bIn,cIn));

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


/*
 * 問題:
 * 	任意の整数値を入力すると、その整数値以下のすべての素数を出力するプログラムを作成せよ。
 * 	ただし、mainメソッドのほかに以下のメソッドを定義して用いる形で作成すること。
 * 		boolean isPrimenumber(int inputNum)
 *
 * パッケージ名:question01
 * クラス名:Question01
 * 作成日:2022/03/04
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package question01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Question01 {
/***************************************クラス内容***************************************/

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//--------------------------素数か否かを判定するメソッド---------------------------//
	/*メソッド名：isPrimeNumber
	 *
	 *		t(2<=divisor<dividend)でdividendを割り、余りが0になることがあれば素数ではない、
			t(2<=divisor<dividend)でdividendを割り、余りが1以上であれば素数である
	 */
	static boolean isPrimeNumber(int inputNum) {
		//割る数（1ずつふやしていく）
		int divisor = 2;
		//素数か素数じゃないかの判定（1・・・素数/0・・・素数ではない）
		int returnNum = 2;
		//2～（割られる数-1）まで、divisorをふやしていく
		//割り切れた場合break
		for (divisor = 2; divisor < inputNum; divisor++) {
			//割り切れる→素数ではないので終了
			if (inputNum % divisor == 0) {
				returnNum = 0;
				break;
			}
			//割り切れない→素数の可能性があるので続行
			else
				//割る数が、（割られる数-1）まで割り切れないときその数は素数である
				if (divisor == inputNum - 1)
					returnNum = 1;
				else continue;
		}
		return (returnNum == 1);
	}
	//--------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {

		//正の整数n(n>0)変数を用意
		int n;

		//nは正の整数なので0未満の場合は聞き直す
		do {
			//正の整数nを聞く
			System.out.print("整数を入力: ");
			n = stdIn.nextInt();
		} while (n < 0);

		//n以下の素数を表示させる
		System.out.println("\n" + n + "以下の素数は以下の通りです。");

		//2は自身でも割れてしまうので特別に表示
		if (n >= 2)
			System.out.println("2");

		/*素数の場合素数を表示するためのループ
		 * 	変数・・・nItr(初期値:/終端値:>1/更新値:--)
		 * 	処理内容・・・n以下の全ての整数で素数か否かを判定し、
		 * 			・・・素数の場合nItrを表示する
		 */
		for (int nItr = 2; nItr <= n; nItr++) {
			//isPrimeNumberメソッドがtrueの時、現在のnItrが素数なので画面に表示する
			if (isPrimeNumber(nItr))
				System.out.println(nItr);
			else ;
		}

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

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
 * ver:1.1.0
 *
 */


package question01_2;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Question01_2 {
/***************************************クラス内容***************************************/

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//--------------------------素数か否かを判定するメソッド---------------------------//
	/*メソッド名：isPrimeNumber
	 * 配列（primeNumber[]）の要素数が0のときfalse
	 * 配列（primeNumber[]）の要素数が1以上のときtrue
	 *
	 *	①2～inputNumまでの整数が入っている配列を用意・・・sieve[]
	 *	②p=2から終了するまで繰り返す
	 *		(1)sieve[]の要素から、deleatePを削除するループ
	 *			変数・・・deleateP(初期値:p^2/終端値:<inputNum/更新値p)
	 *			処理内容・・・sieve[deleateP-1]=0に上書き
	 *		(2)nextPを探すループ
	 *			変数・・・itr(初期値:p+1/終端値:<n/更新値++)
	 *			処理内容・・・配列の中で現在のpよりも大きくて、0になっていない要素数をnextPとする
	 *					・・・無い場合は終了
	 *	③sieve[]で0を消したものをprimeNumber[]に格納
	 *	④primeNumberをインデックスごとに改行して画面表示する
	 */

	static boolean isPrimeNumber(int inputNum) {

		int sieve[] = new int[inputNum-1];

		//①
		for (int itr = 2; itr <= inputNum; itr++) {
			sieve[itr - 2] = itr;
		}

		//②-1
		int p = 2;
		int nextP = p;
//		int end = 0;
		do {
			for (int deleateP = p * p; deleateP <= inputNum; deleateP += p) {
				sieve[deleateP-2] = 0;
			}

			//②-2
			for (int serchItr = p + 1; serchItr < sieve.length; serchItr++) {
				if (sieve[serchItr - 2] != 0) {
					nextP = serchItr;
					break;
				}
			}
			p = nextP;
/*
			//・・・無い場合
			for (int endItr = p - 1; endItr < inputNum - 1; endItr++) {
				if (sieve[endItr] == 0)
					end = 1;
				else {
					end = 0;
					break;
				}
			}
*/
		} while(p * p < inputNum);

		//③
		//0じゃない数を数える
		int lengthP = 0;
		for (int itr = 0; itr < sieve.length; itr++) {
			if (sieve[itr] != 0) {
				lengthP++;
			}
		}

		int primeNumber[] = new int[lengthP];
		int k = 0;
		for (int itr = 0; itr < sieve.length; itr++) {
			if (sieve[itr] != 0) {
				primeNumber[k] = sieve[itr];
				k++;
			}
			else ;
		}
		//④
		for (int outItr = 0; outItr < primeNumber.length; outItr++) {
			System.out.println(primeNumber[outItr]);
		}

		return (inputNum > 1);
	}
	//--------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//

	public static void main(String[] args) {

		//正の整数n(n>0)変数を用意
		int n = 2;

		//nは正の整数なので0未満の場合は聞き直す
		do {
			if (n < 2) {
				System.out.println("2以上の整数を入力してください。");
			}
			//正の整数nを聞く
			System.out.print("整数を入力: ");
			n = stdIn.nextInt();
		} while (n < 2);

		//n以下の素数を表示させる
		System.out.println("\n" + n + "以下の素数は以下の通りです。");
		isPrimeNumber(n);

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

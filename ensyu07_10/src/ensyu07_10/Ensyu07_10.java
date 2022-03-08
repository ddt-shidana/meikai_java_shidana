/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-10 p235
 * 	List7-11を拡張して、以下の四つの問題をランダムに出題するプログラムを作成せよ。
 *		x + y + z
 *		x + y - z
 *		x - y + z
 *		x - y - z
 *
 * パッケージ名:ensyu07_10
 * クラス名:Ensyu07_10
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_10;

//乱数取得するための準備
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_10 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//------------------Randomメソッド(randに乱数生成値を初期値設定)------------------//
	static 	Random rand = new Random();

	//----------------------3桁の整数をランダム生成するメソッド----------------------//
	/*メソッド名：rand3New
	 */
	static int rand3New() {
		int rand3New = rand.nextInt(900) + 100;
		return rand3New;
	}
	//------------------------------------------------------------------------------//

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

	//-------------回答が不正解だった場合にメッセージを表示するメソッド-------------//
	/*メソッド名：judgInc
	 *	入力した値と正解が一致しているかどうかを判定
	 *	一致していた場合・・・トレーニングを続けるかを聞く
	 *	一致していなかった場合・・・「違いますよ！！」と表示し、再度同じ問題を出題
	 */
	static boolean judgInc(int inputAnser, int randQAnswer) {
		if (inputAnser != randQAnswer)
			System.out.println("違いますよ！！");
//test
//System.out.println(randQAnswer + "," + inputAnser);

		return (inputAnser != randQAnswer);
	}
	//-----------------------------------------------------------------------------//

	//-------------------4種類の問題をランダムに出題するメソッド-------------------//
	/*メソッド名：randQ
	 *	0～3の乱数を生成し、返却値を以下のスイッチで取得
	 *		0： x + y + z
	 *		1： x + y - z
	 *		2： x - y + z
	 *		3： x - y - z
	 */
	static void randQ() {
		do {
			//見やすくするために改行
			System.out.println("");

			//暗算問題で足し合わせる3桁の整数を3種類、ランダム生成する
			int x = rand3New();
			int y = rand3New();
			int z = rand3New();

			int randQInt = 0;
			int answer = 0;
			int randNum = rand.nextInt(3);

//test
//System.out.println(randNum);

			switch (randNum) {
			case 0:
				do {
					System.out.print(x + " + " + y + " + " + z + " = ");
					answer = stdIn.nextInt();
					randQInt = (x + y + z);
					judgInc(answer, randQInt);
				} while (answer != randQInt);
			break;
			case 1:
				do {
					System.out.print(x + " + " + y + " - " + z + " = ");
					answer = stdIn.nextInt();
					randQInt = x + y - z;
					judgInc(answer, randQInt);
				} while (answer != randQInt);
			break;
			case 2:
				do {
					System.out.print(x + " - " + y + " + " + z + " = ");
					answer = stdIn.nextInt();
					randQInt = x - y + z;
					judgInc(answer, randQInt);
				} while (answer != randQInt);
			break;
			case 3:
				do {
					System.out.print(x + " - " + y + " - " + z + " = ");
					answer = stdIn.nextInt();
					randQInt = x - y - z;
					judgInc(answer, randQInt);
				} while (answer != randQInt);
			break;
			}
		} while (confirmRetry());
	}
	//-----------------------------------------------------------------------------//


	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("暗算力トレーニング2!!!");
		//randQメソッドを呼び出す
		randQ();

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/


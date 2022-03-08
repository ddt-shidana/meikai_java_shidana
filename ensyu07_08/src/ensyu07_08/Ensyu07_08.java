/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-8 p235
 * 	a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ。
 * 	bの値がaより小さい場合には、aの値をそのまま返却すること
 *
 * パッケージ名:ensyu07_08
 * クラス名:Ensyu07_08
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_08;

//乱数取得するための準備
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_08 {

	//---------------a以上b未満の乱数を生成し、その値を返却するメソッド---------------//
	/*メソッド名：random
	 * 	※a = b のとき
	 *  	乱数生成不可の為聞き直す
	 * 	①a > b のとき
	 * 		返却値はa
	 * 	②a < b のとき
	 * 		返却値はa以上b未満の乱数
	 */
	static int random(int a, int b) {
		//randに乱数を取得
		Random rand = new Random();
		//条件によって返却値が異なるため、返却値を格納するための変数を用意
		int returnNum = 0;
		//a=bの間、返却値を取得するのを繰り返す
			if (a > b)
				returnNum = a;
			else if (a < b) {
				int randNum = rand.nextInt(b - a) + a;
				returnNum = randNum;
			}
		//返却値
		return returnNum;
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("a以上b未満の乱数を生成するプログラムです。");
		System.out.println("bの値がaより小さい場合には、aの値をそのまま表示します。");
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//a=bの間聞き直す
			int aIn = 0;
			int bIn = 1;
			do {
				if (aIn == bIn)
					System.out.println("aとbは異なる値を入力してください。");
				//aを入力してもらう
				System.out.print("\n整数a：");
				aIn = stdIn.nextInt();
				//bを入力してもらう
				System.out.print("整数b：");
				bIn = stdIn.nextInt();
			} while (aIn == bIn);

			//randomメソッドを呼出して、乱数を表示
				System.out.println("\t乱数：" + random(aIn, bIn));

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

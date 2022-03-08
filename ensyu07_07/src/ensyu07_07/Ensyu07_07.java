/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-7 p235
 * 	List7-7に示したn個の'*'を連続表示するメソッドputStarsを、
 * 	内部でList7-8のメソッドputCharsを呼び出すことによって表示を行うように書きかえよ。
 *
 * パッケージ名:ensyu07_07
 * クラス名:Ensyu07_07
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_07;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_07 {

	//--------------------List7-8(文字cをn個連続表示するメソッド--------------------//
	/*メソッド名：putChars
	 */
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}
	//------------------------------------------------------------------------------//

	//-------------------List7-7(文字'*'をn個連続表示するメソッド-------------------//
	/*メソッド名：putStars
	 */
	static void putStars(int n) {
		putChars('*', n);
	}
	//------------------------------------------------------------------------------//

	/*----------------------------------mainメソッド----------------------------------//
	 * List7-7を書き換えたプログラム
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("左下直角の三角形を表示します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//段数を取得するための変数
			int step;
			//段数stepは正の整数
			do {
				//段数を入力してもらう
				System.out.print("\n段数は：");
				//変数stepに入力値を取得
				step = stdIn.nextInt();
			} while (step <= 0);

			//putStarsメソッドを呼出して、図形を表示
			for (int stepItr = 0; stepItr <= step; stepItr++) {
				putStars(stepItr);
				System.out.println();
			}

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


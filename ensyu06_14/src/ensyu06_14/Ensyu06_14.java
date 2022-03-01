/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-14 p205
 * 	月を1〜12の数値として表示して、その英語表現を入力させるプログラムを作成せよ。
 * 		・出題する月の値は乱数で生成する。
 * 		・学習者が望む限り、何度でも繰り返せる。
 * 		・同一月を連続して出題しない。
 *
 * パッケージ名:ensyu06_14
 * クラス名:Ensyu06_14
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_14;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_14 {
//クラスの内容ここから

	public static void main(String[] args) {
	//mainメソッドここから

		//英単語学習プログラムスタートのメッセージを表示
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		//1月から12月の順番で、英語の月名を配列monthStに格納しておく
		String[] monthSt = {
				"January", "February", "March", "April", "May", "June", "July",
				"Auguest", "September", "October", "November", "December"
		};

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//問題の月を生成する変数を用意
		int month;
		//前問題のmonthを控えておくための変数を用意
		int monthP = 12;

		//retryNumが1のとき繰り返す
		do {
			//出題月monthをランダム取得
			do {
				month = rand.nextInt(12);
				//前の出題月と被っていたら再度取得し直す
				//1問目の場合は関係無し
				if (monthP == 12)
					break;
			}while (monthP == month);

			//monthPを更新
			monthP = month;

			//回答の文字列を格納する変数をあらかじめ用意しておく
			String monthAns;

			//不正解の場合、同じ問題を再度出題
			do {
				//画面に出題表示
				System.out.print(month + 1 + "月 ：");
				//回答を取得するための変数を用意し、入力文字列を設定
				monthAns = stdIn.next();
//test
//System.out.println(monthSt[month]);

				//不正解の時のメッセージ表示
				if (! (monthAns.equals(monthSt[month])))
					System.out.println("不正解です。");

			} while (! (monthAns.equals(monthSt[month])));

			//正解の場合のメッセージ表示
			if (monthAns.equals(monthSt[month])) {
				System.out.print("正解です。");
			}

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);


		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}
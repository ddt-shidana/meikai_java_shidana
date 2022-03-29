/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-15 p205
 * 	曜日を表示して。その英語表現を入力させるプログラムを作成せよ。
 * 		・出題する曜日は乱数で生成する。
 * 		・学習者が望む限り、何度でも繰り返せる。
 * 		・同一曜日を連続して出題しない。
 *
 * パッケージ名:ensyu06_15
 * クラス名:Ensyu06_15
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_15;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_15 {
//クラスの内容はここから

	public static void main(String[] args) {
	//mainメソッドここから
		//英単語学習プログラムスタートのメッセージを表示
		System.out.println("英語の曜日名を小文字で入力してください。");

		/*	曜日の日本語と英語を（インデックスで）対応するように
		 *	配列dayOfWeekStに格納しておく
		 *    曜日    英語    配列インデックス
		 * ・日曜日　sunday		0
		 * ・月曜日　monday		1
		 * ・火曜日　tuesday	2
		 * ・水曜日　wednesday	3
		 * ・木曜日　thursday	4
		 * ・金曜日　friday		5
		 * ・土曜日　saturday	6
		 */
		//日本語
		String[] youbiSt = {
				"日", "月", "火", "水", "木",
				"金", "土"
		};
		//英語
		String[] dayOfWeekSt = {
				"sunday", "monday", "tuesday", "wednesday", "thursday",
				"friday", "saturday"
		};

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//問題の曜日を生成する変数を用意
		int dayOfWeek;
		//前問題のdayOfweekを控えておくための変数を用意
		int dayOfWeekP = 7;

		//retryNumが1のとき繰り返す
		do {
			//出題月monthをランダム取得
			do {
				dayOfWeek = rand.nextInt(7);
				//前の出題月と被っていたら再度取得し直す
				//1問目の場合は関係無し
				if (dayOfWeekP == 7)
					break;
			}while (dayOfWeekP == dayOfWeek);

			//dayOfWeekPを更新
			dayOfWeekP = dayOfWeek;

			//回答の文字列を格納する変数をあらかじめ用意しておく
			String dayOfWeekAns;

			//不正解の場合、同じ問題を再度出題
			do {
				//画面に出題表示
				System.out.print(youbiSt[dayOfWeek] + "曜日 ：");
				//回答を取得するための変数を用意し、入力文字列を設定
				dayOfWeekAns = stdIn.next();

				//不正解の時のメッセージ表示
				if (! (dayOfWeekAns.equals(dayOfWeekSt[dayOfWeek])))
					System.out.println("不正解です。");

			} while (! (dayOfWeekAns.equals(dayOfWeekSt[dayOfWeek])));

			//正解の場合のメッセージ表示
			if (dayOfWeekAns.equals(dayOfWeekSt[dayOfWeek])) {
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
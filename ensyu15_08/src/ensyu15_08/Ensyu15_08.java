/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-8 p501
 * 	コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。
 * 	コマンドラインから年のみが与えられた場合は、
 * 	その年の1月から12月までのカレンダーを表示して、
 * 	年月が与えられた場合は、その月のカレンダーを表示して、
 * 	年も月も与えられなかったら、現在の月のカレンダーを表示すること。
 *
 * パッケージ名:ensyu15_08
 * 作成日:2022/03/31
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_08;

import java.util.Scanner;

public class Ensyu15_08 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- 続行の確認を行うメソッド -----//
	/**
	 * 概要：	続行の確認を入力値（0か1）で決めるメソッド。
	 * @return retryNum == 1 （入力値が1の時true）
	 */
	static boolean confirmRetry() {
		//繰り返すかどうかの選択ナンバを格納する変数を用意
		int retryNum;
		//繰り返すか繰り返さないか（1か0か）をきくかたまり
		do {
			//繰り返すかどうかを聞く
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			//入力された値をretryNumとして扱う
			retryNum = stdIn.nextInt();
			//0と1以外が入力された場合のエラーメッセージ
			if (retryNum < 0 || retryNum > 1) {
				System.out.println("0か1を入力してください。");
			}
		//0と1以外が入力されている間はループ
		} while (retryNum < 0 || retryNum > 1);
		//1が入力されている間はtrue
		return retryNum == 1;
	}

	//----- 年月を指定して、カレンダーを表示するメソッド -----//
	/**
	 * 概要：	年月を指定して、日曜はじまりのカレンダーを表示するメソッド。
	 * @param year 表示したいカレンダーの年
	 * @param month 表示したいカレンダーの月
	 */
	public static void printCalender(int year, int month) {
		//初週の日数
		int firstWeekD = 7 - Day.dayOfWeek(year, month, 1);
		//中間週の数
		int mediumWeekD = (Day.maxDate(year,  month) - firstWeekD) / 7;
		//最終週の数
		int lastWeekD = (Day.maxDate(year,  month) - firstWeekD) % 7;
		//何週間あるか
		int WeekD = 0;
		//最終週がある場合
		if (lastWeekD >= 1) {
			//初週1+中間週+最終週1
			WeekD = 1 + mediumWeekD + 1;
		}
		//最終週が無い場合
		else {
			//初週1+中間週
			WeekD = 1 + mediumWeekD;
		}


		//1月のカレンダー（日曜始まり）の行列を用意
		//行数…何週間あるか、列数…7
		int[][] calendarM = new int[WeekD][7];

		//日数のカウント用変数
		int countDays = 0;

		//行のループ
		for (int weeksItr = 0; weeksItr < WeekD; weeksItr++) {
			//初週の格納
			if (weeksItr <= 0) {
				//初週の日数分ループ
				for (int daysItr = Day.dayOfWeek(year, month, 1); daysItr < 7; daysItr++) {
					//配列に格納
					calendarM[weeksItr][daysItr] = ++countDays;
				}
			}
			//中間週の格納
			else if (weeksItr <= mediumWeekD) {
				//7週間分のループ
				for (int daysItr = 0; daysItr < 7; daysItr++) {
					//配列に格納
					calendarM[weeksItr][daysItr] = ++countDays;
				}
			}
			//最終週の場合
			else {
				//最終週の日数分ループ
				for (int daysItr = 0; daysItr < lastWeekD; daysItr++) {
					//配列に格納
					calendarM[weeksItr][daysItr] = ++countDays;
				}
			}
		}

		//カレンダーの表示
		//年月のヘッダ
		System.out.printf("%4d月%2d月\n", year, month);
		//曜日配列の各要素を順番に表示するループ
		for (String daySt : Day.wd) {
			System.out.print(daySt + " ");
		}
		//改行
		System.out.println(" ");
		//カレンダー行列の表示
		//行のループ
		for (int lItr = 0; lItr < calendarM.length; lItr++) {
			//列のループ
			for (int cItr = 0; cItr < 7; cItr++) {
				//0のとき
				if (calendarM[lItr][cItr] <= 0) {
					//空白スペースを表示
					System.out.print("   ");
				}
				//1以上の時
				else {
					//空白スペースを表示
					System.out.printf("%2d ", calendarM[lItr][cItr]);
				}
			}
			//改行
			System.out.println();
		}
	}

	//----- 年を指定して、カレンダーを表示するメソッド -----//
	/**
	 * 概要：	年を指定して、日曜はじまりのカレンダーを表示するメソッド。
	 * @param year 表示したいカレンダーの年
	 */
	public static void printCalender(int year) {
		//その年の1～12月のカレンダーを表示するループ
		for (int mItr = 1; mItr <= 12; mItr++) {
			//年月を指定してカレンダーを表示
			printCalender(year, mItr);
			//改行
			System.out.println();
		}
	}

	//----- 本日の日付を指定して、カレンダーを表示するメソッド -----//
	/**
	 * 概要：	Dayクラスの日付を含む年月のカレンダーを表示するメソッド。
	 * @param today y,m,dをフィールドに持つ参照（本日の日付が入っている引数）
	 */
	public static void printCalender(Day today) {
		//年月を指定してカレンダーを表示
		printCalender(today.getYear(), today.getMonth());
	}

	//----- mainメソッド-----//
	public static void main(String[] args) {

		//繰り返す
		do {
			//コマンドライン引数の個数で分岐
			switch (args.length) {
				//引数が0個の場合
				case 0: {
					//Dayクラスの初期化子を使用
					Day today = new Day();
					//カレンダーを表示
					printCalender(today);
					//ここでスイッチ分をブレイク
					break;
				}
				//引数が1個の場合
				case 1: {
					//yearを実引数としてカレンダーを表示
					printCalender(Integer.parseInt(args[0]));
					//ここでスイッチ分をブレイク
					break;
				}
				//引数が2個の場合
				case 2: {
					//yearとmonthを実引数としてカレンダーを表示
					printCalender(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
					//ここでスイッチ分をブレイク
					break;
				}
			}

		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());


	}
}

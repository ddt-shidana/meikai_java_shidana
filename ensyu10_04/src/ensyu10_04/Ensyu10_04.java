/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10-4 p357
 * 	日付クラス第4版を以下のように改良せよ。
 * 		・引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦1年1月1日で初期化するのではなく、プログラム実行時の日付で初期化する。
 * 		・引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する。
 * 		さらに、以下に示すメソッドを追加すること。
 * 		・年内での経過日数を求めるメソッド
 * 		・年内の残り日数を求めるメソッド
 * 		・他の日付との前後関係を判定するインスタンスメソッド
 * 		・他の日付との前後関係を判定するクラスメソッド
 * 		・日付をn日ずらすメソッド
 * 		etc…
 *
 * パッケージ名:ensyu10_04
 * クラス名:Day
 * 作成日:2022/03/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu10_04;

import java.util.Scanner;

/***************************************mainのクラス*****************************************
 * クラス名：Ensyu10_04
 *	改訂したクラス【第4版】をテストするクラス
 */
public class Ensyu10_04 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//スキャナークラスのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		//年月日の変数を用意
		int y, m, d;

		//コンストラクタのテスト
		//・・・引数0のインスタンス生成時は、今日の日付が表示されるはず
		System.out.println(new Day4());

		//改行
		System.out.println("");

		//年月日を聞く
		System.out.println("年月日を入力せよ");
		System.out.print("年");
		y = stdIn.nextInt();
		System.out.print("月");
		m = stdIn.nextInt();
		System.out.print("日");
		d = stdIn.nextInt();
		//入力したymdでDay4クラスのインスタンスを作成
		Day4 a = new Day4(y, m, d);
		System.out.println(a);

		//改行
		System.out.println("");

		//aの年の元旦からの経過日数を表示・・・elapsedDayのテスト
		System.out.println(a.getYear() + "年は、" + a.elapsedDay() + "日経過しました。");
		//aの年の残日数を表示・・・elapsedDayLeftのテスト
		System.out.println(a.getYear() + "年は、のこり" + a.elapsedDayLeft() + "日です。");

		//改行
		System.out.println("");

		//aが今日より後か前か一緒かを判定・・・インスタンスメソッドcompareDayのテスト
		a.compareDay(new Day4());
		//aが今日より後か前か一緒かを判定・・・インスタンスメソッドcompareDayのテスト
		Day4.compareDay(a, new Day4());

		//改行
		System.out.println("");

		//aのn日後に変更
		System.out.println("日付をn日後にずらします。");
		System.out.print("n日：");
		int addN = stdIn.nextInt();
		a.addNdays(addN);
		System.out.println(a);
		//改行
		System.out.println("");

		//aのn日後に変更
		System.out.println("日付をn日前にずらします。");
		System.out.print("n日：");
		int subN = stdIn.nextInt();
		a.subNdays(subN);
		//インスタンスをクローズ
		stdIn.close();
	}

}

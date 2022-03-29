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


package ensyu10_05;

import static java.util.Calendar.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

/***************************************日付クラス*****************************************
 * クラス名：Day
 * 	ensyu10_04のDay4の複製
 */
public class Day {
	//----- フィールド -----//
	//何番までの識別番号を与えたか（初期値0）・・・クラスだけが持つ整数値
	private static int couter = 0;
	//識別番号・・・インスタンス生成時に与えられる個別の番号
	private int id;
	//年
	private int year;
	//月
	private int month;
	//日
	private int date;
	//1月からの12月までの大小歴を格納した配列を用意（定数として用意）
	public static final int[] dateLS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//1月からの12月までの閏年大小歴を格納した配列を用意（定数として用意）
	public static final int[] dateLeapLS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	//----- フィールド（クラスメソッド） -----//
	//y年が閏年かどうかの判定
	//閏年の判定「うるう年は西暦年号が4で割り切れる年※ただし西暦年号が100で割り切れて400で割り切れない年は平年」
	public static boolean isLeap(int y) {
		//グレゴリオ暦yで4の倍数のなかで、そもそも100で割り切れない年は閏年
		boolean isLeap1 = (y % 4 == 0) && (y % 100 != 0);
		//グレゴリオ暦yで400で割り切れる年は閏年（4の倍数でもあり、100でも割り切れる）
		boolean isLeap2 = y % 400 == 0;
		//返却値はisLeap1かisLeap2に当てはまる時
		return (isLeap1 || isLeap2);
	}

	//----- コンストラクタ -----//
	/*	多重定義する
	 * 	(1)引数無し（初期値を呼び出し）
	 * 	(2)int型引数 × 1つ
	 * 	(3)int型引数 × 2つ
	 * 	(4)int型引数 × 3つ
	 * 	(5)自分自身のクラス型引数 × 1つ
	 */
	//(1)引数無し（初期値を呼び出し）
	public Day() {
		//id付与
		id = ++couter;
		//GregorianCalendarクラスのインスタンスを生成
		GregorianCalendar today = new GregorianCalendar();
		//y：プログラム実行時の年
		this.year = today.get(YEAR);
		//m：プログラム実行時の月（getメソッドで得られる値は0からなので+1する）
		this.month = today.get(MONTH) + 1;
		//d：プログラム実行時の日
		this.date = today.get(DATE);

		//初期化子の表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n", year, month, date);
	}
	//(2)int型引数 × 1つ・・・年を指定
	public Day(int year) {
		//idを付与
		id = ++couter;
		//Dayクラスの年フィールドに、引数であるyearを受け取る
		this.year = year;
		//月日は1で初期化
		this.month = 1;
		this.date = 1;
	}
	//(3)int型引数 × 2つ・・・年月を指定
	public Day(int year, int month) {
		//Day(year)コンストラクタを使用
		this(year);
		//Dayクラスの月フィールドに、引数であるmonthを受け取る
		//13以上の値を受けた場合
		if (month > 12) {
			//12とする
			this.month = 12;
		}
		//0以下の値を受けた場合
		else if (month < 1) {
			this.month = 1;
		}
		//範囲内
		else {
			this.month =  month;
		}
	}
	//(4)int型引数 × 3つ・・・年月日を指定
	public Day(int year, int month, int date) {
		//Day(year, month)コンストラクタを使用
		this(year, month);
		//Dayクラスの日フィールドに、引数であるdateを受け取る
		//1未満の値を受けた時
		if (date < 1) {
			this.date = 1;
		}
		else {
			//各月の最終日より大きい値を受けた時（閏年で場合分け）
			//閏年の時
			if (isLeap(year)) {
				//大小歴上で該当月の日数よりdが大きい場合
				if (date > dateLeapLS[this.month - 1]) {
					//該当月の最終日に変換
					this.date = dateLeapLS[this.month - 1];
				}
				//範囲内
				else {
					this.date = date;
				}
			}
			//平年の時
			else {
				//大小歴上で該当月の日数よりdが大きい場合
				if (date > dateLS[this.month - 1]) {
					//該当月の最終日に変換
					this.date = dateLS[this.month - 1];
				}
				//範囲内
				else {
					this.date = date;
				}
			}
		}
	}
	//(5)自分自身のクラス型引数 × 1つ・・・年月日をもつコンストラクタ変数を指定
	public Day(Day d) {
		//Day(year, month, date)コンストラクタを使用、引数にはクラス変数のもつフィールド値を使用
		this(d.year, d.month, d.date);
	}

	//----- 年月日を取得（ゲッタメソッド※返却値を得る） -----//
	//年を取得
	public int getYear() {
		return year;
	}
	//月を取得
	public int getMonth() {
		return month;
	}
	//日を取得
	public int getDate() {
		return date;
	}
	//識別番号を取得
	public int getId() {
		return id;
	}

	//----- 年月日を設定（セッタメソッド※引数を渡す） -----//
	//年を設定
	public void setYear(int year) {
		//このクラスのフィールド：yearに引数を設定
		this.year = year;
	}
	//月を設定
	public void setMonth(int month) {
		//このクラスのフィールド：monthに引数を設定
		this.month = month;
	}
	//日を設定
	public void setDate(int date) {
		//このクラスのフィールド：dateに引数を設定
		this.date = date;
	}
	//年月日を設定
	public void set(int year, int month, int date) {
		//このクラスのフィールド：yearに引数を設定
		this.year = year;
		//このクラスのフィールド：monthに引数を設定
		this.month = month;
		//このクラスのフィールド：dateに引数を設定
		this.date = date;
	}

	//----- 曜日を求める -----//
	public int dayOfWeek() {
		/*dayOfWeek：曜日を格納する変数（初期値:-1に設定）
		 * 	0・・・日曜日
		 * 	1・・・月曜日
		 * 	2・・・火曜日
		 * 	3・・・水曜日
		 * 	4・・・木曜日
		 * 	5・・・金曜日
		 * 	6・・・土曜日
		 */
		int dayOfWeek = -1;
		//年数
		int y = year;
		//月数
		int m = month;
		//日数
		int d = date;
		//ツウェラーの公式を利用
		//フェアフィールドの公式から1年1月1日（0年13月1日） ～ y 年 m 月 d の日数を求める
		//1月と2月は
		if (m == 1 || m == 2) {
			//y=y-1
			y--;
			//m=m+12
			m += 12;
		}
		//計算式
		dayOfWeek = (y + (y / 4) - (y / 100) + (y / 400) + (((13 * m) + 8) / 5) + d) % 7;
		//返却値(0～6)が返るはず
		return dayOfWeek;
	}

	//----- 日付クラス変数ymdと等しいか -----//
	public boolean equalTo(Day ymd) {
		//年が等しいかどうか
		boolean isY = (year == ymd.year);
		//月が等しいかどうか
		boolean isM = (month == ymd.month);
		//日が等しいかどうか
		boolean isD = (date == ymd.date);
		//年月日が等しいかどうか
		boolean equalTo = (isY && isM && isD);
		//返却値（年月日が等しいかどうか）
		return equalTo;
	}

	//----- 年内での経過日数を求めるメソッド -----//
	public long elapsedDay() {
		//開始日～終了日までの期間を求める
		//開始日：該当インスタンスの年の元旦
		//終了日：該当インスタンスの年月日
		long elapsedDay = ChronoUnit.DAYS.between(LocalDate.of(this.year, 1, 1).minusDays(1), LocalDate.of(this.year, this.month, this.date));
		//返却値
		return elapsedDay;
	}

	//----- 年内の残日数を求めるメソッド -----//
	public long elapsedDayLeft() {
		long elapsedDayLeft = 0;
		//閏年の場合
		if (isLeap(this.year)) {
			//366から年内の経過日数を引く
			elapsedDayLeft = 366 - elapsedDay();
		}
		//平年の場合
		else {
			//365から年内の経過日数を引く
			elapsedDayLeft = 365 - elapsedDay();
		}
		//返却値
		return elapsedDayLeft;
	}

	//----- d2の日付より後か前か同じかを求めるインスタンスメソッド -----//
	public void compareDay(Day d2) {
		compareDay(this, d2);
	}

	//----- d1がd2の日付より後か前か同じかを求めるクラスメソッド -----//
	public static void compareDay(Day d1, Day d2) {
		//判定用変数(初期値365/前-1/一致0/後1)
		int compareDay = 365;

		//年が等しい
		if (d1.year == d2.year) {
			//月が等しい
			if (d1.month == d2.year) {
				//日が等しい
				if (d1.date == d2.date) {
					//一致
					compareDay = 0;
				}
				//日が等しくない
				else {
					//日がd2よりも後のとき
					if (d1.date > d2.date) {
						compareDay = 1;
					}
					//日がd2よりも前のとき
					else {
						compareDay = -1;
					}
				}
			}
			//月が等しくない
			else {
				//月がd2よりも後のとき
				if (d1.year > d2.year) {
					compareDay = 1;
				}
				//月がd2よりも前のとき
				else {
					compareDay = -1;
				}
			}
		}
		//年が等しくない
		else {
			//年がd2より後のとき
			if (d1.year > d2.year) {
				compareDay = 1;
			}
			//年がd2より前のとき
			else {
				compareDay = -1;
			}
		}
		//返却値
		switch (compareDay) {
		case -1: {
			System.out.println("前です。");
			break;
		}
		case 0: {
			System.out.println("同じです。");
			break;
		}
		case 1: {
			System.out.println("後です。");
			break;
		}
		}
	}

	//----- 日付をn日前に変更するメソッド -----//
	public void subNdays(int n) {
		//更新後の日付を変数で用意
		int targetY = this.year;
		int targetM = this.month;
		int targetD = this.date;

		//nがなくなるまでループするかたまり
		do {
			//閏年かどうかで分岐
			//閏年の場合
			if (isLeap(targetY)) {
				//dにnを引いた日付が、0にならない場合
				if (targetD - n > 0) {
					//n日前を求めて終了
					targetD = targetD - n;
					n = 0;
					break;
				}
				//0以下になる場合
				else {
					//引いた分のnを減らす
					n = n - targetD;
					//dは仮に0になる
					targetD = 0;
					//mが1じゃないとき
					if (targetM > 1) {
						//mをひとつ減らす
						targetM = targetM - 1;
					}
					//mが1のとき
					else {
						//mは12になる
						targetM = 12;
						//年が減る
						targetY = targetY - 1;
					}
					//dをその月の前月の最終日まで減算する
					targetD = dateLeapLS[targetM - 1];
				}
			}
			//閏年じゃない場合
			else {
				//dにnを引いた日付が、0にならない場合
				if (targetD - n > 0) {
					//n日前を求めて終了
					targetD = targetD - n;
					n = 0;
					break;
				}
				//0以下になる場合
				else {
					//引いた分のnを減らす
					n = n - targetD;
					//dは仮に0になる
					targetD = 0;
					//mが1じゃないとき
					if (targetM > 1) {
						//mをひとつ減らす
						targetM = targetM - 1;
					}
					//mが1のとき
					else {
						//mは12になる
						targetM = 12;
						//年が減る
						targetY = targetY - 1;
					}
					//dをその月の前月の最終日まで減算する
					targetD = dateLS[targetM - 1];
				}
			}
		} while(n > 0);

		//更新
		this.year = targetY;
		this.month = targetM;
		this.date = targetD;

		//更新後の日付の表示
		System.out.printf("変更後は%04d年%02d月%02d日です。\n", this.year, this.month, this.date);
	}

	//----- 日付をn日後に変更するメソッド -----//
	public void addNdays(int n) {
		//更新後の日付を変数で用意
		int targetY = this.year;
		int targetM = this.month;
		int targetD = this.date;

		//nがなくなるまでループするかたまり
		do {
			//閏年かどうかで分岐
			//閏年の場合
			if (isLeap(targetY)) {
				//dにnを足した日付が、大小歴を越さない場合
				if (targetD + n <= dateLeapLS[targetM - 1]) {
					//n日後を求めて終了
					targetD = targetD + n;
					n = 0;
					break;
				}
				//大小歴を超す場合
				else {
					//足した分のnを減らす
					n = n - (dateLeapLS[targetM - 1] - targetD);
					//dをその月の末日まで加算する
					targetD = 0;
					//mが12じゃないとき
					if (targetM < 12) {
						//mをひとつ増やす
						targetM = targetM + 1;
					}
					//mが12のとき
					else {
						//mは1になる
						targetM = 1;
						//年が増える
						targetY = targetY + 1;
					}
				}
			}
			//閏年じゃない場合
			else {
				//dにnを足した日付が、大小歴を越さない場合
				if (targetD + n <= dateLS[targetM - 1]) {
					//n日後を求めて終了
					targetD = targetD + n;
					n = 0;
					break;
				}
				//大小歴を超す場合
				else {
					//足した分のnを減らす
					n = n - (dateLS[targetM - 1] - targetD);
					//dをその月の末日まで加算する
					targetD = 0;
					//mが12じゃないとき
					if (targetM < 12) {
						//mをひとつ増やす
						targetM = targetM + 1;
					}
					//mが12のとき
					else {
						//mは1になる
						targetM = 1;
						//年が増える
						targetY = targetY + 1;
					}
				}
			}
		} while(n > 0);

		//更新
		this.year = targetY;
		this.month = targetM;
		this.date = targetD;

		//更新後の日付の表示
		System.out.printf("変更後は%04d年%02d月%02d日です。\n", this.year, this.month, this.date);
	}

	//----- 文字列表現を返却 -----//
	public String toString() {
		//文字列表現の変数を用意
		String toString;
		//dayOfWeekに対応する曜日文字列配列を設定
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		//文字列表現を変数に保管・・・「yyyy年mm月dd日(aaa)」のフォーマット
		toString = String.format("%04d年%02d月%02d日(%s)",
									year, month, date, wd[dayOfWeek()]);
		//返却値
		return toString;
	}
//クラスの内容ここまで
}
/**************************************************************************************/



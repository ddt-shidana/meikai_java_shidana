/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-2 p323
 * 	日付クラス第3版を利用するプログラムを作成せよ。
 * 	すべてのコンストラクタの働きを確認できるようにすること。
 *
 * パッケージ名:ensyu09_03
 * クラス名:Day（クラス名:Ensyu09_02作成物）
 * 作成日:2022/03/17
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_03;

/***************************************日付クラス*****************************************
 * クラス名：Day
 * ensyu09_02から複製
 */
public class Day {
	//----- フィールド -----//
	//年 初期値:1(インストラクタ生成時に0で作られ、後から1を代入する)
	private int year = 1;
	//月 初期値:1(インストラクタ生成時に0で作られ、後から1を代入する)
	private int month = 1;
	//日 初期値:1(インストラクタ生成時に0で作られ、後から1を代入する)
	private int date = 1;

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
		//空のコンストラクタ
	}
	//(2)int型引数 × 1つ・・・年を指定
	public Day(int year) {

		//Dayクラスの年フィールドに、引数であるyearを受け取る
		this.year = year;
	}
	//(3)int型引数 × 2つ・・・年月を指定
	public Day(int year, int month) {
		//Day(year)コンストラクタを使用
		this(year);
		//Dayクラスの月フィールドに、引数であるmonthを受け取る
		this.month = month;
	}
	//(4)int型引数 × 3つ・・・年月日を指定
	public Day(int year, int month, int date) {
		//Day(year, month)コンストラクタを使用
		this(year, month);
		//Dayクラスの日フィールドに、引数であるdateを受け取る
		this.date = date;
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

	//----- 年月日を設定（セッタメソッド※引数を渡す） -----//
	//年を取得
	public void setYear(int year) {
		//このクラスのフィールド：yearに引数を設定
		this.year = year;
	}
	//月を取得
	public void setMonth(int month) {
		//このクラスのフィールド：monthに引数を設定
		this.month = month;
	}
	//日を取得
	public void setDate(int date) {
		//このクラスのフィールド：dateに引数を設定
		this.date = date;
	}
	//年月日を取得
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



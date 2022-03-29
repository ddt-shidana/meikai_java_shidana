/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-5 p330
 * 	開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
 * 	コンストラクタやメソッドを自由に定義すること。
 *
 * パッケージ名:ensyu09_05
 * クラス名:Period
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/***************************************期間クラス*****************************************
 * クラス名：Period
 *	新規作成
 * 	開始日と終了日をもち、その期間の日数を求めるメソッドを持つ
 */
public class Period {
	//----- フィールド -----//
	//開始日
	private Day from;
	//終了日
	private Day to;

	//----- コンストラクタ -----//
	public Period(Day from, Day to) {
		//Periodクラスのfromフィールドに、引数fromのDayクラスインスタンスを設定する
		this.from = new Day(from);
		//Periodクラスのtoフィールドに、引数fromのDayクラスインスタンスを設定する
		this.to = new Day(to);
	}

	//----- 開始日から終了日までの期間日数を調べるメソッド -----//
	public long getPeriodVal() {
		return ChronoUnit.DAYS.between(LocalDate.of(from.getYear(), from.getMonth(), from.getDate()).minusDays(1), LocalDate.of(to.getYear(), to.getMonth(), to.getDate()));
	}

	//----- 文字列表現を返却 -----//
	public String toString() {
		//文字列表現の変数を用意
		String toString;
		//文字列表現を変数に保管・・・「xx 様(口座番号:xxxxx)  残高：￥x,xxx-」のフォーマット
		toString = String.format(from + "～" +  to + " (期間：%d日) ", getPeriodVal());
		//返却値
		return toString;
	}
}
/**************************************************************************************/


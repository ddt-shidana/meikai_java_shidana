/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-5 p330
 * 	開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
 * 	コンストラクタやメソッドを自由に定義すること。
 *
 * パッケージ名:ensyu09_05
 * クラス名:Ensyu09_05
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_05;

/***************************************期間クラスを利用する***************************************
 * クラス名：Ensyu09_05
 *	期間クラスをテストするクラス
 */
public class Ensyu09_05 {

	//----- mainメソッド-----//
	public static void main(String[] args) {

		//期間を登録・・・フィールド・コンストラクタの確認
		Period p = new Period(new Day(2021, 1, 1), new Day(2022, 1, 5));

		//期間pを表示・・・toString・getPeriodValの確認
		System.out.println(p.toString());
	}
}
/**************************************************************************************/

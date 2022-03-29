/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-2 p323
 * 	第8章で作成した《銀行口座クラス（第2版）》に、
 * 	口座開設日のフィールドとtoStringメソッドを追加せよ。
 *
 * パッケージ名:ensyu09_03
 * クラス名:Ensyu09_03
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_03;

/***************************************銀行クラス【第2版】を利用する***************************************
 * クラス名：ensyu09_03
 *	銀行クラスをテストするクラス
 */
public class Ensyu09_03 {

	//----- mainメソッド -----//
	public static void main(String[] args) {
		//コンストラクタのテスト-------------------
		//Accounクラスのインスタンス生成を使用し、口座開設日はDayクラスのインスタンス生成を使用
		//足立君の口座
		Account adachi = new Account("足立幸一", "123456", 1000, new Day(2000, 9, 10));
		//仲田君の口座
		Account nakata = new Account("仲田真二", "654321", 200, new Day(2021));

		//残金操作メソッドのテスト-------------------
		//足立君が200円おろす
		adachi.deposit(200);
		//仲田君が100円預ける
		nakata.withdraw(100);

		//getOpenDayメソッドのテスト-------------------
		//足立君の口座開設日を表示
		System.out.println("口座開設日：" + adachi.getOpenDay());
		//仲田君の口座開設日を表示
		System.out.println("口座開設日：" + nakata.getOpenDay());

		//toStringメソッドのテスト-------------------
		//足立君の口座情報を表示
		System.out.println(adachi.toString());
		//仲田君の口座情報を表示
		System.out.println(nakata.toString());

	}
}
/**************************************************************************************/

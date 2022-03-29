/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-4 p329
 * 	演習8-1で作成した《人間クラス》に、
 * 	誕生日のフィールドとtoStringメソッドを追加せよ。
 *
 * パッケージ名:ensyu09_04
 * クラス名:Ensyu09_04
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_04;

/***************************************人間クラスを利用する***************************************
 * クラス名：Ensyu09_04
 *	人間クラスをテストするクラス
 */
public class Ensyu09_04 {

	//----- mainメソッド-----//
	public static void main(String[] args) {

		//安倍晋三のプロフィールを登録・・・フィールドの確認
		Human abeshinzou = new Human("安倍晋三", 174, 73, new Day(1954, 9, 21));

		//安倍晋三のプロフィールを表示・・・toStringの確認
		System.out.println(abeshinzou.toString());

		//安倍晋三の誕生日を表示・・・getBirthdaynの確認
		System.out.println(abeshinzou.getName() + "の誕生日：" + abeshinzou.getBirthday());
	}
}
/**************************************************************************************/

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10-5 p359
 * 	インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、
 * 	銀行口座クラスAccountを変更せよ。
 * 	表示はインスタンス初期化子で行うこと。
 *
 * パッケージ名:ensyu10_05
 * クラス名:Ensyu10_05
 * 作成日:2022/03/23
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu10_05;

/***************************************日付クラス【第3版】を利用する***************************************
 * クラス名：Ensyu09_02
 */
public class Ensyu10_05 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//アカウントを作成
		Account a = new Account("山田太郎", "00123", 25000, new Day());
		System.out.println(a);

		//改行
		System.out.println();

		//アカウントを作成
		Account b = new Account("山田花子", "00321", 100, new Day());
		System.out.println(b);
	}
//クラスの内容ここまで
}
/**************************************************************************************/


/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-2 p415
 * 	定期預金付き銀行口座クラス型変数a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッドcompBalanceを作成せよ。
 * 	合計額を比較して、aの方が多ければ1、等しければ0、bの方が多ければ-1を返却すること。
 * 	もしaやbの参照先が、定期預金をもたないAccount型のインスタンスであれば、普通預金の金額を比較対象とすること。
 *
 * パッケージ名:ensyu12_02
 * クラス名:Ensyu12_02
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu12_02;

/***************************************compBalanceメソッドをテストするクラス*****************************************
 * クラス名：Ensyu12_02
 */
public class Ensyu12_02 {

	//----- -1→a>b/0→a=b/1a<bと表示するメソッド-----//
	static void printCompSt(int compBalance) {
		//compBalanceの値結果で分岐
		switch (compBalance) {
		//-1のとき
		case -1: {
			System.out.println("a < bです。");
			break;
		}
		case 0: {
			System.out.println("a = bです。");
			break;
		}
		case 1: {
			System.out.println("a > bです。");
			break;
		}
		}
	}


	//----- mainメソッド-----//
	public static void main(String[] args) {
		//Account型のインスタンスを2つ生成
		//※TimeAccountで生成し、Accountの参照へアップキャスト（TimeAccountを実引数にもつメソッドを使用したいため）
		Account a1 = new TimeAccount("鈴木一郎", "001", 1000, 100);
		Account a2 = new TimeAccount("鈴木次郎", "002", 50000, -100000);
		//TimeAccount型のインスタンスを2つ生成
		TimeAccount a3 = new TimeAccount ("鈴木三郎", "003", 20000000, 1000000);
		TimeAccount a4 = new TimeAccount ("鈴木太郎", "004", 500, 0);

		//TimeAccount型参照の変数を2つ用意
		TimeAccount xTA;
		TimeAccount yTA;

		//TimeAccount(サブクラス）型変数に、サブクラスのインスタンスを参照にもたせる
		xTA = a3;
		//TimeAccount(サブクラス）型変数に、サブクラスのインスタンスを参照にもたせる
		yTA = a4;
		//TimeAccount型の口座a3,a4の預金金額を比較する
		System.out.println("サブクラス同士の比較");
		printCompSt(TimeAccount.compBalance(xTA, yTA));

		//改行
		System.out.println("");
		//TimeAccount(サブクラス）型変数に、スーパークラスのインスタンスを参照にもたせる（ダウンキャスト）
		xTA = (TimeAccount)a1;
		//TimeAccount(サブクラス）型変数に、スーパークラスのインスタンスを参照にもたせる（ダウンキャスト）
		yTA = (TimeAccount)a2;
		//TimeAccount型の口座a3,a4の預金金額を比較する
		System.out.println("スーパークラス同士の比較");

		printCompSt(TimeAccount.compBalance(xTA, yTA));

		//改行
		System.out.println("");
		//TimeAccount(サブクラス）型変数に、スーパークラスのインスタンスを参照させる（ダウンキャスト）
		xTA = a3;
		//TimeAccount(サブクラス）型変数に、サブクラスのインスタンスを参照させる（ダウンキャスト）
		yTA = (TimeAccount)a1;
		//TimeAccount型の口座a3,a4の預金金額を比較する
		System.out.println("サブクラスとスーパークラスの比較");
		printCompSt(TimeAccount.compBalance(xTA, yTA));


		//改行
		System.out.println("");
		//TimeAccount(サブクラス）型変数に、スーパークラスのインスタンスを参照させる（ダウンキャスト）
		xTA = (TimeAccount)a2;
		//TimeAccount(サブクラス）型変数に、サブクラスのインスタンスを参照させる（ダウンキャスト）
		yTA = a4;
		//TimeAccount型の口座a3,a4の預金金額を比較する
		System.out.println("スーパークラスとサブクラスの比較");
		printCompSt(TimeAccount.compBalance(xTA, yTA));

	}

}
/**************************************************************************************/


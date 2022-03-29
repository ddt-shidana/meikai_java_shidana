/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-2 p415
 * 	定期預金付き銀行口座クラス型変数a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッドcompBalanceを作成せよ。
 * 	合計額を比較して、aの方が多ければ1、等しければ0、bの方が多ければ-1を返却すること。
 * 	もしaやbの参照先が、定期預金をもたないAccount型のインスタンスであれば、普通預金の金額を比較対象とすること。
 *
 * パッケージ名:ensyu12_02
 * クラス名:Account
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu12_02;

/***************************************銀行クラス【第二版】*****************************************
 * クラス名：Account
 */
public class Account {
	//----- フィールド -----//
	//口座名義
	private String name;
	//口座番号
	private String no;
	//口座残高
	protected long balance;

	//----- コンストラクタ※オーバーロード無し -----//
	Account(String name, String no, long balance) {
		//Accountクラスのnameフィールドに、引数nameを設定する
		this.name = name;
		//Accountクラスのnoフィールドに、引数noを設定する
		this.no = no;
		//Accountクラスのbalanceフィールドに、引数balanceを設定する
		this.balance = balance;
	}

	//----- 各フィールド値を取得（ゲッタメソッド※返却値を得る） -----//
	//口座名義を取得
	String getName() {
		return name;
	}
	//口座番号を取得
	String getNo() {
		return no;
	}
	//口座残高を取得
	long getBalance() {
		return balance;
	}

	//----- 残金操作メソッド -----//
	//k円預ける
	void deposit(long k) {
		balance += k;
	}
	//k円おろす
	void withdraw(long k) {
		balance -= k;
	}

	//----- 文字列表現を返却 -----//
	public String toString() {
		//文字列表現の変数を用意
		String toString;
		//文字列表現を変数に保管・・・「xx 様(口座番号:xxxxx)  残高：￥x,xxx-」のフォーマット
		toString = String.format("\n\t%s 様(口座番号： %s)\t残高： ￥%,d-.", name, no, balance);
		//返却値
		return toString;
	}
}
/**************************************************************************************/

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-2 p323
 * 	第8章で作成した《銀行口座クラス（第2版）》に、
 * 	口座開設日のフィールドとtoStringメソッドを追加せよ。
 *
 * パッケージ名:ensyu09_03
 * クラス名:Account（クラス名:Ensyu09_03で利用）
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_03;

/***************************************銀行クラス【第二版】*****************************************
 * クラス名：Account
 * List8-3(p277)の写し＋加筆(検索キー★）
 */
public class Account {
	//----- フィールド -----//
	//口座名義
	private String name;
	//口座番号
	private String no;
	//口座残高
	private long balance;
	//口座開設日・・・★追加
	private Day openDay;

	//----- コンストラクタ※オーバーロード無し -----//
	Account(String name, String no, long balance, Day openDay) {
		//Accountクラスのnameフィールドに、引数nameを設定する
		this.name = name;
		//Accountクラスのnoフィールドに、引数noを設定する
		this.no = no;
		//Accountクラスのbalanceフィールドに、引数balanceを設定する
		this.balance = balance;
		//AccountクラスのopenDayフィールドに、引数openDayのDayクラスインスタンスを設定する
		this.openDay = new Day(openDay);
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
	//口座開設日を取得・・・★追加
	Day getOpenDay() {
		return openDay;
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
		toString = String.format("\t%s 様(口座番号： %s)\t残高： ￥%,d-.", name, no, balance);
		//返却値
		return toString;
	}
}
/**************************************************************************************/

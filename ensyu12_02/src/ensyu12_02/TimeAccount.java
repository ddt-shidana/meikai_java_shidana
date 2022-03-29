/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-2 p415
 * 	定期預金付き銀行口座クラス型変数a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッドcompBalanceを作成せよ。
 * 	合計額を比較して、aの方が多ければ1、等しければ0、bの方が多ければ-1を返却すること。
 * 	もしaやbの参照先が、定期預金をもたないAccount型のインスタンスであれば、普通預金の金額を比較対象とすること。
 *
 * パッケージ名:ensyu12_02
 * クラス名:TimeAccount
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu12_02;

/************************************定期預金付き銀行クラス【第1版】*****************************************
 * クラス名：TimeAccount
 * List12-5（p401）の写し+一部追加
 */
public class TimeAccount extends Account {
	//----- フィールド -----//
	//預金残高
	private long timeBalance;

	//----- コンストラクタ※オーバーロード無し -----//
	TimeAccount(String name, String no, long balance, long timeBalance) {
		//スーパークラス；Accoutのコンストラクタを呼び出し
		super(name, no, balance);
		//預金残高（定期預金）
		this.timeBalance = timeBalance;
	}

	//----- アクセッサ(ゲッタメソッド) -----//
	//定期預金残高を調べる
	long getTimeBalance () {
		return  timeBalance;
	}

	//----- 定期預金を解約して全額普通預金に移すメソッド -----//
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}

	//----- 普通預金または、普通預金と定期預金の合計金額を求めるメソッド -----//
	static public long compX(TimeAccount x) {
		//比較金額を格納する変数
		long compX = 0;

		//aがAccount参照の場合
		if (x instanceof Account) {
			//比較金額に使用する値はaの普通預金金額（定期金額を持たないので）
			compX = x.balance;
		}
		//aがTimeAccountの場合
		else {
			//普通預金と定期預金の合計金額を計算
			compX = x.balance + x.timeBalance;
		}

		//返却値は計算結果
		return compX;
	}

	//----- クラスメソッド：2つのAccountの普通預金金額(と定期預金金額の合計)を比較するメソッド -----//
	static int compBalance(TimeAccount a, TimeAccount b) {
		//比較用変数(初期値-2/a>b→1/a=b→0/a<v→-1)
		int compBalance = -2;

		//比較する金額を表示する
		System.out.println(compX(a) + "円 と " + compX(b) + "円 を比較します。");

		//aの金額がbの金額より少ないとき
		if (compX(a) < compX(b)) {
			//比較用変数は-1
			compBalance = -1;
		}
		//aの金額とbの金額が一緒のとき
		else if (compX(a) == compX(b)) {
			//比較用変数は0
			compBalance = 0;
		}
		//aの金額がbの金額より多いとき
		else {
			//比較用変数は1
			compBalance = 1;
		}
		//返却値
		return compBalance;
	}

}
/**************************************************************************************/


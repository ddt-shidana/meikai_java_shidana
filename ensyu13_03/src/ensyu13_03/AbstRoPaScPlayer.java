/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13-3 p415
 * 	ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ。
 * 	そのクラスから以下のクラスを派生すること。
 * 		・人間プレーヤクラス（出す手をキーボードから読み込む）
 * 		・コンピュータプレーヤクラス（出す手を乱数で生成する）
 *
 * パッケージ名:ensyu13_03
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu13_03;

//===================== 抽象クラス：じゃんけんプレイヤーを表す =====================//
/**
* 概要：	じゃんけんプレイヤーの概念を表す抽象クラス。<BR>
* 補足：	このクラスは、プレイヤーの概念を表す抽象クラスAbstPlayerから派生したクラス。<BR>
* 			本クラスのインスタンスを生成することはできない。<BR>
* 			具体的なプレイヤークラスは、このクラスから派生させる。
* @see	Object
* @see	Player
*/
public abstract class AbstRoPaScPlayer extends Player {

	//----- フィールド -----//
	/**
	 * 概要：	じゃんけんで出す手を表すint型フィールド。（0:グー 1:チョキ 2:パー）
	 */
	//最初はグー
	protected int hand = 0;

	//----- コンストラクタ -----//
	/**
	 * 概要：	じゃんけんプレイヤーを生成するコンストラクタ。
	 */
	public AbstRoPaScPlayer() {
	}

	//----- アクセッサ（ゲッタメソッド）：じゃんけんで出す手を取得 -----//
	/**
	 * 概要：	じゃんけんで出す手をを取得する。
	 * @return	hand じゃんけんで出す手、int型
	 */
	public int getHand() {
		return hand;
	}

	//----- アクセッサ（セッタメソッド）：じゃんけんで出す手を設定 -----//
	/**
	 * 概要：	じゃんけんで出す手をを設定する。
	 * @param hand じゃんけんで出す手、int型
	 */
	public void setHand(int hand) {
		this.hand = hand;
	}

	//----- メソッド：プレイヤー情報を表す文字列を返却する -----//
	/**
	 * 概要：	プレイヤー情報を表す文字列を返却するメソッド。<BR>
	 * 補足：<BR>
	 * 			このメソッドの本体は、このクラスAbstRoPaScPlayerから派生するクラスで実装する。<BR>
	 * @return "Rock-paper-scissors player"
	 */
	@Override
	public String toString() {
		return "player：Rock-paper-scissors player";
	}


	//----- メソッド：じゃんけんで出す手の値を返却する -----//
	/**
	 * 概要：	プレイヤーがじゃんけんで出す手の値を返却するメソッド。<BR>
	 * 補足：<BR>
	 * 			このメソッドの本体は、このクラスAbstRoPaScPlayerから派生するクラスで実装する。
	 */
	public abstract int drawHand();

	//----- メソッド：じゃんけんで出す手を表示する -----//
	/**
	 * 概要：	じゃんけんで出す手を表示するメソッド。<BR>
	 * 詳細：	0～2の乱数値でグー/チョキ/パーを表現する。
	 * return drawHand
	 */
	public void printHand(int hand) {
		//0～2のhandで分岐
		switch (hand) {
		//0:グー
		case 0 : {
			System.out.println("\t グー");
			break;
		}
		//1:チョキ
		case 1 : {
			System.out.println("\tチョキ");
			break;
		}
		//2:パー
		case 2 :{
			System.out.println("\t パー");
			break;
		}
		}
	}

	//----- メソッド：プレイヤー情報と、じゃんけんで出す手の表示を行う -----//
	/**
	 * 概要：<BR>
	 * 			以下の2つのステップを順次行うメソッド。<BR>
	 * 			Step 1.	メソッドtoStringが返却する文字列を表示して改行。<BR>
	 * 			Step 2.	メソッドdrawHandを呼び出してジャンケンで出す手を表示。<BR>
	 * 補足：	このクラスの派生クラス全共通のメソッド。
	 */
	public void print() {
		//メソッドtoStringを表示
		System.out.println(toString());
		//メソッドdrawHandを呼び出し
		printHand(drawHand());
	}

}

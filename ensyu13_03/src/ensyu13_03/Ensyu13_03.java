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

import java.util.Scanner;

//===================== メインクラス：じゃんけんプレイヤークラス群をテストする =====================//
/**
* 概要：	じゃんけんプレイヤークラス群をテストするクラス。<BR>
*/
public class Ensyu13_03 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- 続行の確認を行うメソッド -----//
	/**
	 * 概要：	続行の確認を入力値（0か1）で決めるメソッド。
	 * @return retryNum == 1 （入力値が1の時true）
	 */
	static boolean confirmRetry() {
		//繰り返すかどうかの選択ナンバを格納する変数を用意
		int retryNum;
		//繰り返すか繰り返さないか（1か0か）をきくかたまり
		do {
			//繰り返すかどうかを聞く
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			//入力された値をretryNumとして扱う
			retryNum = stdIn.nextInt();
			//0と1以外が入力された場合のエラーメッセージ
			if (retryNum < 0 || retryNum > 1) {
				System.out.println("0か1を入力してください。");
			}
		//0と1以外が入力されている間はループ
		} while (retryNum < 0 || retryNum > 1);
		//見やすいように改行
		System.out.println("");
		//1が入力されている間はtrue
		return retryNum == 1;
	}

	//----- じゃんけんの勝敗を判定するメソッド -----//
	/**
	 * 概要：	2人のじゃんけんでどちらが勝ったか、引き分けかを判定するメソッド。
	 * @param humHand （人間プレイヤーが入力したじゃんけんの手のナンバ）
	 * @param comHand （コンピュータープレイヤーがランダムで生成したじゃんけんの手のナンバ）
	 */
	static void judge(int humHand, int comHand) {
		//二人が同じ手を出したとき
		if (humHand == comHand) {
			System.out.println(" ▶あいこ");
		}
		//二人が違う手を出したとき
		else {
			//人間プレイヤーが勝ちのとき
			if ((humHand == 0 && comHand == 1) || (humHand == 1 && comHand == 2) || (humHand == 2 && comHand == 0)) {
				System.out.println(" ▶Humanの勝利！");
			}
			//コンピュータープレイヤーが勝ちのとき
			else {
				System.out.println(" ▶Computerの勝利！");
			}
		}
	}

	//----- mainメソッド -----//
	/**
	 * 概要： メインメソッド。<br>
	 */
	public static void main(String[] args) {

		//プログラム開始のメッセージ
		System.out.println("じゃんけんプレイヤークラス群をテストするプログラムを開始します。");
		//見やすいように改行
		System.out.println("");

		//人間プレイヤとコンピュータープレイヤの生成
		AbstRoPaScPlayer[] player2 = { new Human(),
		                      new Computer() };

		//テストを繰り返しできるように、プログラムのかたまりをdoでかこう
		do {

			//player2配列の中身を順番に表示させる
			for (AbstRoPaScPlayer pValue : player2) {
				//プレイヤー名を表示し、じゃんけんの手を出す
				pValue.print();
				//手を出し終わったら改行
				System.out.println("");
			}
			//人間vsコンピューターの対戦結果を表示
			judge(player2[0].getHand(), player2[1].getHand());

			//見やすいように改行
			System.out.println("");
		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());

		//見やすいように改行
		System.out.println("");
		//プログラム終了のメッセージ
		System.out.println("プログラムを終了しました。");

	}
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-5 p497
 * 	3人で行うジャンケンプログラムを作成せよ。
 * 	プレーヤー3人のうち、コンピューターを2人として、人間を1人とすること。
 * 	また、演習13-3（p443）で作成した、プレーヤークラスを利用すること。
 *
 * パッケージ名:ensyu15_05
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_05;

import java.util.Scanner;

//===================== メインクラス：3人のじゃんけんプログラムを実行するクラス =====================//
/**
* 概要：	3人のじゃんけんプログラムを実行するクラス。<BR>
*/
public class Ensyu15_05 {

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
	 * 概要：	人間vsコンピュータ×2のじゃんけんで、人間が勝ったか負けたかを判定するメソッド。
	 * @param humHand （人間プレイヤーが入力したじゃんけんの手のナンバ）
	 * @param com1Hand （コンピュータープレイヤー1がランダムで生成したじゃんけんの手のナンバ）
	 * @param com2Hand （コンピュータープレイヤー2がランダムで生成したじゃんけんの手のナンバ）
	 */
	static void judge(int humHand, int com1Hand, int com2Hand) {
		//3人の出したhand値合計の剰余で判定するため、先に計算しておく
		int sumSurplus = (humHand + com1Hand + com2Hand) % 3;
		//剰余が0のとき
		if (sumSurplus == 0) {
			//…あいこ
			System.out.println(" ▶あいこ");
		}
		//剰余が1のとき
		else if (sumSurplus == 1) {
			//humHandとcom1Handが等しい場合、またはhumHandとcom2Handが等しい場合
			if (humHand == com1Hand || humHand == com2Hand) {
				//…Humanの勝利
				System.out.println(" ▶Humanの勝利！");
			}
			//humanhandだけ違う手を出している場合
			else {
				//…Computerの勝利
				System.out.println(" ▶Humanの完敗↷");
			}
		}
		//剰余が2のとき
		else {
			//com1Handとcom2Handが等しい場合
			if (com1Hand == com2Hand) {
				//…Humanの一人勝ち
				System.out.println(" ▶Humanの一人勝ち！");
			}
			//com1Handとcom2Handが等しくない場合
			else {
				//…Computerの勝利
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
		System.out.println("■あなたvsコンピューター×2でじゃんけんを行います！■");
		//見やすいように改行
		System.out.println("");

		//人間プレイヤとコンピュータープレイヤ×2の生成
		AbstRoPaScPlayer[] player3 = {
										new Human(),
										new Computer(),
										new Computer()
									};

		//テストを繰り返しできるように、プログラムのかたまりをdoでかこう
		do {

			//player2配列の中身を順番に表示させる
			for (AbstRoPaScPlayer pValue : player3) {
				//プレイヤー名を表示し、じゃんけんの手を出す
				pValue.print();
				//手を出し終わったら改行
				System.out.println("");
			}
			//人間vsコンピューターの対戦結果を表示
			judge(player3[0].getHand(), player3[1].getHand(), player3[2].getHand());

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


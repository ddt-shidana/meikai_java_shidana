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

//===================== 具体クラス：人間プレイヤーを表す =====================//
/**
* 概要：	人間プレイヤーを表すクラス。<BR>
* 補足：	このクラスは、じゃんけんプレイヤーの概念を表す抽象クラスAbstRoPaScPlayerから派生したクラス。<BR>
* @see	Player
* @see	AbstRoPaScPlayer
*/
public class Human extends AbstRoPaScPlayer {

	//----- コンストラクタ -----//
	/**
	 * 概要：	人間プレイヤーを生成するコンストラクタ。
	 */
	public Human() {
		super();
	}

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- メソッド：人間プレイヤー情報を表す文字列を返却する -----//
	/**
	 * 概要：	人間プレイヤー情報を表す文字列を返却するメソッド。
	 * @return "player：Human"
	 */
	@Override
	public String toString() {
		return "player：Human";
	}

	//----- メソッド：じゃんけんで出す手の値を返却する -----//
	/**
	 * 概要：	人間プレイヤーがじゃんけんで出す手の値を返却するメソッド。<BR>
	 * @return drawHand （0,1,2の3つの整数値のいずれかの入力値）
	 */
	public int drawHand() {
		//じゃんけんで出す手の値を格納する変数を用意
		int drawHand = -1;
		//0～3を入力してもらうためのかたまり
		do {
			//じゃんけんの手を入力してもらう
			System.out.print("じゃんけんで出す手（0…グー／1…チョキ／2…パー）：");
			//入力値をhandNumとして扱う
			drawHand = stdIn.nextInt();
			//0～2以外が入力されたらエラーメッセージを表示する
			if (drawHand < 0 || drawHand > 2) {
				System.out.println("0～2を入力してください。");
			}
		//0～2以外が入力されたら聞き直すループ
		} while (drawHand < 0 || drawHand > 2);
		//handにdrawHandを設定
		this.hand = drawHand;
		//0,1,2の3つの整数値のいずれかの乱数を返却
		return drawHand;

	}

}

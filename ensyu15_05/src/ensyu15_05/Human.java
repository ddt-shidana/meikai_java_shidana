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
			//じゃんけんスタート
			System.out.println("最初は グー。じゃんけんポン！");
			//hands文字列配列を順番に表示するためのループ
			for (int hItr = 0; hItr < 3; hItr++) {
				//（0:グー 1:チョキ 2:パー）
				System.out.printf("  (%d)%s ", hItr,  hands[hItr]);
			}
			//選択案内メッセージの区切り
			System.out.print("：");
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

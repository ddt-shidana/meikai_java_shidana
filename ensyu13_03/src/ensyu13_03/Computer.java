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

//utilパッケージのRandomクラスを単一単純名で使用できるようにインポート宣言
import java.util.Random;

//===================== 具体クラス：コンピュータープレイヤーを表す =====================//
/**
* 概要：	コンピュータープレイヤーを表すクラス。<BR>
* 補足：	このクラスは、じゃんけんプレイヤーの概念を表す抽象クラスAbstRoPaScPlayerから派生したクラス。<BR>
* @see	Player
* @see	AbstRoPaScPlayer
*/
public class Computer extends AbstRoPaScPlayer {

	//----- コンストラクタ -----//
	/**
	 * 概要：	コンピュータープレイヤーを生成するコンストラクタ。
	 */
	public Computer() {
		super();
	}

	//----- メソッド：コンピュータープレイヤー情報を表す文字列を返却する -----//
	/**
	 * 概要：	コンピュータープレイヤー情報を表す文字列を返却するメソッド。
	 * @return "player：Computer"
	 */
	@Override
	public String toString() {
		return "player：Computer";
	}

	//----- メソッド：じゃんけんで出す手の値を返却する -----//
	/**
	 * 概要：	コンピュータープレイヤーがじゃんけんで出す手の値を返却するメソッド。<BR>
	 * @return drawHand （0,1,2の3つの整数値のいずれかの乱数）
	 */
	public int drawHand() {
		//randに乱数を初期設定
		Random rand = new Random();
		//生成した乱数を変数に保存
		int drawHand = rand.nextInt(3);
		//handにdrawHandを設定
		this.hand = drawHand;
		//0,1,2の3つの整数値のいずれかの乱数を返却
		return drawHand;

	}
}

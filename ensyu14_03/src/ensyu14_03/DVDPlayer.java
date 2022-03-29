/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-2 p467
 * 	クラスDVDPlayerを利用するプログラム例を作成せよ。
 *
 * パッケージ名:ensyu14_02
 * 作成日:2022/03/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu14_03;

//===================== メインクラス：DVDPlayeを表すクラス =====================//
/**
* 概要：	ExPlayerインターフェースを持ったDVDを表すクラス
*/
public class DVDPlayer implements ExPlayer {

	//----- メソッド：再生メッセージを表示する -----//
	/**
	 * 概要：	再生インターフェースの実装。<BR>
	 * @see Player
	 */
	public void play() {
		System.out.println("■DVD再生開始！");
	}

	//----- メソッド：停止メッセージを表示する -----//
	/**
	 * 概要：	停止インターフェースの実装。<BR>
	 * @see Player
	 */
	public void stop() {
		System.out.println("■DVD再生終了！");
	}

	//----- メソッド：スロー再生するメッセージを表示する -----//
	/**
	 * 概要：	スロー再生インターフェースの実装。<BR>
	 * @see ExPlayer
	 */
	public void slow() {
		System.out.println("■DVDスロー再生開始！");
	}
}

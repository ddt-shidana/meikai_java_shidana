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

//===================== インターフェース：拡張プレイヤー =====================//
/**
* 概要：	スロウを実装するためのインターフェース。
* @see Player
*/
public interface ExPlayer extends Player {
	//スロー再生
	void slow();
}

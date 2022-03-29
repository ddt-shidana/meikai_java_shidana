/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-2 p463
 * 	ロボット型ペットクラスRobotPet（p.407）を拡張した、
 * 	着せかえ可能なロボット型ペットクラスを作成せよ。
 * 	インタフェースSkinnableを実装すること。
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
package ensyu14_02;

//===================== インターフェース：プレイヤー =====================//
/**
* 概要：	プレイ・ストップを実装するためのインターフェース。
*/
public interface Player {
	//再生
	void play();
	//停止
	void stop();
}

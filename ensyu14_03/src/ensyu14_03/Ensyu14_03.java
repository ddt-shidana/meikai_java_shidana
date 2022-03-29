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

import java.util.Scanner;

//===================== メインクラス：DVDPlayeクラスをテストするクラス =====================//
/**
* 概要：	DVDPlayeクラスをテストするクラス。
*/
public class Ensyu14_03 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- mainメソッド -----//
	public static void main(String[] args) {
		//DVDの読込み
		System.out.println("DVDを読み込みます。");
		//DVDPlayerのインスタンスを生成
		DVDPlayer dvd = new DVDPlayer();
		//プレイヤーインターフェース選択ナンバ用の変数を用意
		int playerN = 0;

		//1～3の間はメニューを表示し続けるかたまり
			do {
			//1～4を選んでもらうかたまり
			do {
				//プレイヤーインターフェースを表示
				System.out.println("DVDPlayerメニュー");
				System.out.print("\t1…再生／2…停止／3…スロー再生／4…DVDの取り出し：");
				//入力値をplayerNとして扱う
				playerN = stdIn.nextInt();
				//1～4以外が入力されたときのエラーメッセージ
				if (playerN < 1 || playerN > 4) {
					//エラーメッセージを表示
					System.out.println("1～4を選んでください。");
				}
			//1～4以外が入力されたら聞き直すループ
			} while (playerN < 1 || playerN > 4);
			//改行
			System.out.println();
			//メニューごとに分岐
			switch (playerN) {
				//1…再生
				case 1: {
					//playインタフェースを使用
					dvd.play();
					//改行
					System.out.println();
					//ここでスイッチ文を抜ける
					break;
				}
				//2…停止
				case 2: {
					//stopインターフェースを使用
					dvd.stop();
					//改行
					System.out.println();
					//ここでスイッチ文を抜ける
					break;
				}
				//3…スロー再生
				case 3: {
					//slowインターフェースを使用
					dvd.slow();
					//改行
					System.out.println();
					//ここでスイッチ文を抜ける
					break;
				}
				//4…DVDの取り出し
				case 4: {
					//取り出しのメッセージ
					System.out.println("DVDを取り出しました。");
					//ここでスイッチ文を抜ける
					break;
				}
			}
		//1～3の間はメニューを繰り返し行う
		} while (playerN >= 1 && playerN <= 3);
	}
}

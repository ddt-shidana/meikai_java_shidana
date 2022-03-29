/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-1 p489
 * 	文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu15_01
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_01;

//Scannerクラスを単純名で使用できるようにインポート
import java.util.Scanner;

//===================== メインクラス =====================//
/**
* 概要：	文字列を読み込んで、その文字列を逆順に表示するプログラム。
*/
public class Ensyu15_01 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- mainメソッド -----//
	public static void main(String[] args) {

		//文字列を読み込む
		System.out.print("文字列st：");
		//入力された文字列をst変数に格納
		String st = stdIn.next();

		//文字列の先頭から末尾まで繰り返すループ
		for (int sItr = st.length() - 1; sItr >= 0; sItr-- ) {
			//該当インデックスの文字を表示
			System.out.print(st.charAt(sItr));
		}
	}
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-2 p489
 * 	文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu15_02
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_02;

//Scannerクラスを単純名で使用できるようにインポート
import java.util.Scanner;

//===================== メインクラス =====================//
/**
* 概要：	文字列を読み込んで、その全文字の文字コードを表示するプログラム。
*/
public class Ensyu15_02 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- mainメソッド -----//
	public static void main(String[] args) {

		//文字列を読み込む
		System.out.print("文字列st：");
		//入力された文字列をst変数に格納
		String st = stdIn.next();
		//文字列を、文字配列として扱うために、文字配列を用意
		char[] ch= new char[st.length()];
		//文字列の先頭から末尾までのループ
		for(int sItr = 0; sItr < st.length(); sItr++) {
			//文字列の該当位置の文字を文字配列の対応する要素に格納（Unicode）
			ch[sItr] = st.charAt(sItr);
		    // 文字コードを表示（10進数）
		    System.out.println(sItr + "文字目(10)：" + (int)ch[sItr]);
		    // 文字コードを16進数で表示
		    System.out.println(sItr + "文字目(16)：" + Integer.toHexString((int)ch[sItr]));
		}
	}
}

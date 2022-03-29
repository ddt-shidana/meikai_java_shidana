/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-4 p489
 * 	浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ。
 * 		printDouble(double x,int p, int w)
 *
 * パッケージ名:ensyu15_04
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_04;

//Scannerクラスを単純名で使用できるようにインポート
import java.util.Scanner;

//===================== メインクラス =====================//
/**
* 概要：	文字列を読み込んで、その全文字の文字コードを表示するプログラム。
*/
public class Ensyu15_04 {


	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッド -----//
	/**
	 * 概要：	浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッド
	 * @param x 画面に表示する対象の浮動小数点、double型
	 * @param p 小数点以下で表示したい桁数、int型
	 * @param w 浮動小数点全体を少なくとも何桁で表示するかの桁数、int型
	 */
	static void printDouble(double x,int p, int w) {
		//表示したい桁数の形式を指定する文字列をformとして作成
		String form = String.format("%%%d.%df\n", w, p);
		//formを使って画面に表示
		System.out.printf(form, x);
	}

	//----- mainメソッド -----//
	/**
	 * 概要：	printDoubleメソッドのテスト
	 */
	public static void main(String[] args) {
		printDouble(10.259, 4, 8);
		printDouble(5, 4, 8);
		printDouble(100.2, 4, 8);
		printDouble(1000.25891, 4, 8);

	}
}

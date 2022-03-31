/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-6 p501
 * 	コマンドライン引数で与えられた半径をもつ円の演習の長さと面積を求めて表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu15_06
 * 作成日:2022/03/31
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_06;

//===================== メインクラス =====================//
/**
* 概要：	コマンドライン引数で与えられた半径をもつ円の演習の長さと面積を求めて表示する。<BR>
*/
public class Ensyu15_06 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//円周率を定数として宣言
		final double PI = 3.14;
		//コマンドラインから半径の数字を引数として受け取る
		double radius = Double.parseDouble(args[0]);

		//演習の長さを表示
		System.out.printf("円周の長さ：%.2f\n", (radius * 2 * PI) );
		//円の面積を表示
		System.out.printf("円の面積　：%.2f\n", (radius * radius * PI) );
	}
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-7 p501
 * 	List15-15のfor文を拡張for文で実現したプログラムを作成せよ。
 *
 * パッケージ名:ensyu15_07
 * 作成日:2022/03/31
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_07;

//===================== メインクラス =====================//
/**
* 概要：	List15-15のfor文を拡張for文で実現させる。<BR>
*/
public class Ensyu15_07 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//合計を格納する変数を用意
		double sum = 0.0;
		//コマンドラインから受け取った引数の個数回繰り返すループ
		for (String comandValue : args) {
			//受け取ったすべて文字列をdouble型にした数を足し合わせたものを、sumとする
			sum += Double.parseDouble(comandValue);
		}
		//sumを表示
		System.out.println("合計は" + sum + "です。");
	}
}

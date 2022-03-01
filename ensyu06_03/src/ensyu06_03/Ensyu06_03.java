/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-3 p185
 * 	要素型がdouble型で要素数が5の配列の要素に対して、
 * 	先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_03
 * クラス名:Ensyu06_03
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_03;

public class Ensyu06_03 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//要素数5のdouble型配列を用意
		double[] a = new double [5];

		//配列に1.1,2.2,3.3,4.4,5.5を代入
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + i + (1 + (double)i ) / 10;
			//配列の要素の値を表示
			System.out.println(a[i]);
		}

	//mainメソッドここまで
	}
//クラスの内容ここまで
}

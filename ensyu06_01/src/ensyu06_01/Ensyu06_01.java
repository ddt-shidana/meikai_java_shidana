/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-1 p183
 * 	要素型がdouble型で要素数が5の配列を生成して、
 * 	その全要素の値を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_01
 * クラス名:Ensyu06_01
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_01;

public class Ensyu06_01 {
//クラスの内容ここから
	public static void main(String[] args) {
	//ここからmainメソッド

		//double型の配列を用意、要素数：5
		double[] a = new double[5];

		//全要素の値を表示
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

	//mainメソッドここまで
	}
//クラスの内容ここまで
}

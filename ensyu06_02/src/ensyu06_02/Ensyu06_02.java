/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-2 p185
 * 	要素型がint型で要素数が5の配列の要素に対して、
 * 	先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_02
 * クラス名:Ensyu06_02
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_02;

public class Ensyu06_02 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//要素数5のint型配列を用意
		int[] a = new int [5];

		//配列に5～1まで1ずつ減らした値を順番に格納
		for (int i = 0; i < a.length; i++) {
			a[i] = 5 - i;
			//配列の要素の値を表示
			System.out.println(a[i]);
		}

	//mainメソッドここまで
	}
//クラスの内容ここまで
}

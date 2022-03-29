/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-7 p169
 * 	0.0から1.0まで0.001おきに、その値と、その値の２乗を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu05_07
 * クラス名:Ensyu05_07
 * 作成日:2022/02/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_07;

public class Ensyu05_07 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//表を表示
		System.out.println("  底      べき乗  ");
		System.out.println("--------------------");

		//1000倍した整数で繰り返しを記述
		for (int i = 0; i <= 1000; i++) {
			float x = (float)i / 1000;
			//べき乗の底を小数点以下3桁で表示
			System.out.printf("%1.3f  ", x);
			//べき数を小数点以下7桁で表示
			System.out.printf(" %2.7f\n", x * x);
		}

	//mainメソッドここまで
	}
//クラスの内容ここまで
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-2 p33
 * 	3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。

 * パッケージ名:ensyu2_01
 * クラス名:Ensyu2_01
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu2_02;

public class Ensyu2_02 {
//ここからクラスの内容

	public static void main(String[] args) {
	//ここからmainメソッド
		//x,y,zにそれぞれ任意の整数値を直書きで初期設定しておく。
		int x = 1, y = 2, z = 3;

		//xの値を画面表示させる。
		System.out.println("xの値は" + x + "です。");
		//yの値を画面表示させる。
		System.out.println("yの値は" + y + "です。");
		//zの値を画面表示させる。
		System.out.println("zの値は" + z + "です。");
		//x,y,zの合計値を画面表示させる。
		System.out.println("合計は" + (x + y + z) + "です。");
		//x,y,zの平均値を画面表示させる。
		System.out.println("平均は" + (x + y + z) / 3 + "です。");

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

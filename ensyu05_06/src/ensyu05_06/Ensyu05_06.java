/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-6 p169
 * 	List5-9のように、float型の変数を0.0から01.0まで0.001ずつ増やしていく様子と、
 * 	List5-10のように、int型の変数を0から1000までインクリメントした値を
 * 	1000で割った値を求める様子を、横に並べて表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu05_05
 * クラス名:Ensyu05_05
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_06;

public class Ensyu05_06 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//List5-9パターンで使用する合計用の変数
		float sumF = 0.0F;
		//List5-10パターンで使用する合計用の変数
		float sumI = 0.0F;

		//表を表示
		System.out.println("  float      int  ");
		System.out.println("--------------------");

		//List5-10パターンで使用する変数の初期値を設定
		int i = 0;

		for (float xF = 0.0F; xF <= 1.0F; xF +=0.001F) {
			System.out.printf("%1.7f", xF);
			sumF += xF;


			float xI = (float)i / 1000;
				System.out.printf("  %1.7f\n", xI);
				sumI += xI;
				i++;

		}

		System.out.println("-------合計値-------");
		System.out.println(sumF + "  " + sumI);
	}

}

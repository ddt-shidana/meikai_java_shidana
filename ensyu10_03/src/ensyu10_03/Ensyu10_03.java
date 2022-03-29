/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10-3 p353
 * 	二値/三値/配列の
 * 	最小値を求めるメソッドや最大値を求めるメソッドを集めた
 * 	ユーティリティクラスMinMaxを作成せよ。
 *
 * パッケージ名:ensyu10_03
 * クラス名:Ensyu10_03
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu10_03;

/***************************************ユーティリティクラスをテストするクラス***************************************
 * クラス名：Ensyu10_03
 */
public class Ensyu10_03 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//a,b,c,配列arrayを決める
		int a = -10;
		int b = 25;
		int c = 0;
		int[] array = {-10, 25, 0};

		//最小値を求めるメソッドmin3種をテスト
		System.out.println("最少値を求める。");
		System.out.println(MinMax.min(a, b));
		System.out.println(MinMax.min(a, b, c));
		System.out.println(MinMax.min(array));

		//最大値を求めるメソッドmax3種をテスト
		System.out.println("最大値を求める。");
		System.out.println(MinMax.max(a, b));
		System.out.println(MinMax.max(a, b, c));
		System.out.println(MinMax.max(array));
	}

}

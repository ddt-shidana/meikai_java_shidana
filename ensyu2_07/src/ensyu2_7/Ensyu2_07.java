/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-7 p44
 * 	以下に示すプログラムを作成せよ。
 * ・1桁の正の整数値をランダムに生成して表示
 * ・1桁の負の整数値をランダムに生成して表示
 * ・2桁の正の整数値をランダムに生成して表示
 *
 * パッケージ名:ensyu2_07
 * クラス名:Ensyu2_07
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu2_7;

//乱数を生成する準備のためimport
import java.util.Random;

public class Ensyu2_07 {

	public static void main(String[] args) {
	//ここからmainメソッド
		//randに乱数を初期設定
		Random rand = new Random();

		//整数型変数randNam1を用意し1桁の正の整数値を初期設定
		int randNum1 = rand.nextInt(10);
		//整数型変数randNam2を用意し1桁の負の整数値を初期設定
		int randNum2 = - rand.nextInt(10);
		//整数型変数randNam3を用意し2桁の正の整数値を初期設定
		int randNum3 = rand.nextInt(90) + 10;

		//生成した全3種類の整数値を画面表示させる
		System.out.println (randNum1);
		System.out.println (randNum2);
		System.out.println (randNum3);

	//mainメソッドここまで
	}

//クラス内容ここまで
}

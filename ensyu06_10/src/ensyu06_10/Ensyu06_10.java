/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-10 p199
 * 	連続する要素が同じ値をもつことのないように6-9のプログラムを改良したプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_10
 * クラス名:Ensyu06_10
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_10;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_10 {
//ここからクラス内容

	public static void main(String[] args) {
	//mainメソッドここから

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//配列を用意し、その要素数を入力値から取得する
			System.out.print("要素数：");
			int n = stdIn.nextInt();
			int[] a = new int[n];

			//配列の全要素の値に1～10の乱数を格納
			//a[0]の値を決めておく
			a[0] = 1 + rand.nextInt(10);
			//1つ前の要素と同じ値になってしまったら、異なる値になるまで乱数生成
			for (int i = 1; i < n; i++) {
				do {
					a[i] = 1 + rand.nextInt(10);
				} while (a[i - 1] == a[i]);
			}

			//配列aの全要素の値を表示
			System.out.print("配列aの全要素の値\n{ ");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("}");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);


		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}

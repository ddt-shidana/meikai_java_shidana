/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-12 p199
 * 	配列の要素の並びをシャッフルする（ランダムな順と、なるようにかき混ぜる）プログラムを作成せよ。
 *
 * パッケージ名:ensyu06_12
 * クラス名:Ensyu06_12
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_12;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_12 {
//クラスの内容ここから

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

			//配列の全要素の値に1～100の乱数を格納
			for (int i = 0; i < n; i++) {
				a[i] = 1 + rand.nextInt(100);
			}

			//配列aの全要素の値を表示
			System.out.print("配列aの全要素の値\n{ ");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("}");

			//配列aの全要素の値をシャッフル表示する
			//シャッフルする要素のインデックスを決める乱数を用意
			int shuffleNum = 1 + rand.nextInt(n - 1);

			//前から順番にランダムなインデックスの要素数と入れ替える
			for (int i = 0; i < n; i++) {
				int t = a[i];
				a[i] = a[shuffleNum];
				a[shuffleNum] = t;
			}
			System.out.print("配列aの全要素の値をシャッフルしました。\n{ ");
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
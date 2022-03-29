/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-11 p199
 * 	異なる要素が同じ値をもつことのないように6-9のプログラムを改良したプログラムを作成せよ。
 * 	配列の要素数は10以下とする。
 *
 * パッケージ名:ensyu06_10
 * クラス名:Ensyu06_10
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_11;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_11 {
//クラスの内容ここから

	public static void main(String[] args) {
	//mainメソッド

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {

			//要素数用の変数をあらかじめ用意
			int n;
			int[] a;

			//0以下、11以上の値が入力されたら聞き直す
			do {
				//配列を用意し、その要素数を入力値から取得する
				System.out.print("要素数(10以下)：");
				n = stdIn.nextInt();
				a = new int[n];
			} while (n <= 0 || n > 10);

			//配列の全要素の値に1～10の乱数を格納
			//a[0]の値を決めておく
			a[0]= 1 + rand.nextInt(10);

			//1～10の乱数を配列に格納する
			Outer:
			for (int i = 1; i < n; i++) {
				a[i] = 1 + rand.nextInt(10);

				//前までに格納した値と同じ場合取得し直す
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						--i;
						continue Outer;
					}
				}
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

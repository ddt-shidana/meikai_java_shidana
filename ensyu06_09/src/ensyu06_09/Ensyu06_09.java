/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-9 p199
 * 	要素型がint型である配列を作り、全要素を1〜10の乱数で埋め尽くす（1以上10以下の値を代入する）
 * 	プログラムを作成せよ。要素数はキーボードから読み込むこと。
 *
 * パッケージ名:ensyu06_09
 * クラス名:Ensyu06_09
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_09;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_09 {
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

			//配列の全要素の値に1～10の乱数を格納
			for (int i = 0; i < n; i++) {
				a[i] = 1 + rand.nextInt(10);
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
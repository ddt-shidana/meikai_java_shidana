/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-8 p197
 * 	double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 	要素数と全要素の値はキーボードから読み込むこと。
 *
 * パッケージ名:ensyu06_08
 * クラス名:Ensyu06_08
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_08;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_08 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//配列を用意し、その要素数を入力値から取得する
			System.out.print("要素数：");
			int n = stdIn.nextInt();
			double[] a = new double[n];

			//配列の各要素数に入力値を格納する
			for (int i = 0; i < n; i++) {
				System.out.print((i + 1) + "番目の値：");
				a[i] = stdIn.nextDouble();
			}

			//合計を求めて表示
			double sum = 0;
			for (double i : a)
				sum += i;
			System.out.println("全要素の合計値は" + sum + "です。");

			//平均を求めて表示
			System.out.print("全要素の平均値は");
			System.out.printf("%.2f", sum / n);
			System.out.println("です。");

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
};
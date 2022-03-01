/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-6 p191
 * 	テストの点数の合計点、平均点、最高点、最低点を表示するプログラムを作成せよ。
 * 	人数と点数はキーボードから読み込むこと。
 *
 * パッケージ名:ensyu06_05
 * クラス名:Ensyu06_05
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_06;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_06 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//int型配列を用意し、要素数は入力値を使用
			System.out.print("何人の点数を入力しますか？：");
			int n = stdIn.nextInt();
			int[] a = new int[n];

			//配列の各要素の値を入力値から読み込む
			/*	変数・・・i(初期値:0/終端値:n-1/更新値:++)
			 * 	処理内容・・・各要素の値を入力してもらい、入力値を取得
			 */
			for (int i = 0; i <= n-1; i++) {
				System.out.print((i + 1) + "番目の点数：");
				a[i] = stdIn.nextInt();
			}

			//合計点を求めて、表示
			//合計を表す変数sumを用意し、初期値0としておく
			int sum = 0;
			/*	変数・・・i(初期値:0/終端値:n-1/更新値:++)
			 * 	処理内容・・・加算
			 */
			for (int i = 0; i <= n-1; i++) {
				sum += a[i];
			}
			System.out.print("合計点は ");
			System.out.printf("%3d", sum);
			System.out.println("\tです。");

			//平均点を表示
			System.out.print("平均点は ");
			System.out.printf("%3.2f", (double)sum / a.length);
			System.out.println("\tです。");

			//最高点を表示
			//比較用にaMax変数を用意し、a[0]を初期値に設定する
			int aMax = a[0];
			/*	変数・・・i(初期値:1/終端値:n-1/更新値:++)
			 * 	処理内容・・・aMaxと比較し、aMaxの方が小さければ交換
			 */
			for (int i = 1; i <= n-1 ;i++) {
				if (aMax < a[i])
					aMax = a[i];
			}
			System.out.print("最高点は ");
			System.out.printf("%3d", aMax);
			System.out.println("\tです。");

			//最低点を表示
			//比較用にaMax変数を用意し、a[0]を初期値に設定する
			int aMin = a[0];
			/*	変数・・・i(初期値:1/終端値:n-1/更新値:++)
			 * 	処理内容・・・aMinと比較し、aMinの方が大きければ交換
			 */
			for (int i = 1; i <= n-1 ;i++) {
				if (aMin > a[i])
					aMin = a[i];
			}
			System.out.print("最低点は ");
			System.out.printf("%3d", aMin);
			System.out.println("\tです。");

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

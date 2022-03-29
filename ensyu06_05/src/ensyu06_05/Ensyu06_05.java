/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-5 p189
 * 	配列の要素数と、個々の要素の値を読み込んで、
 * 	各要素の値を表示するプログラムを作成せよ。
 * 	表示の形式は、初期化子を同じ形式、
 * 	すなわち、各要素の値をコンマで区切って{}で囲んだ形式とすること。
 *
 * パッケージ名:ensyu06_05
 * クラス名:Ensyu06_05
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_05;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_05 {
//ここからクラス内容

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//int型配列を用意し、要素数は入力値を使用
			System.out.print("要素数：");
			int n = stdIn.nextInt();
			int[] a = new int[n];

			//配列の各要素の値を入力値から読み込む
			/*	変数・・・i(初期値:0/終端値:n-1/更新値:++)
			 * 	処理内容・・・各要素の値を入力してもらい、入力値を取得
			 */
			for (int i = 0; i <= n-1; i++) {
				System.out.print("a[" + i + "] = ");
				a[i] = stdIn.nextInt();
			}

			//各要素の値を表示
			System.out.print("a = {");
			for (int i = 0; i <= n - 1; i++) {
				System.out.print(a[i]);
				if(i < n - 1)
					System.out.print(", ");
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

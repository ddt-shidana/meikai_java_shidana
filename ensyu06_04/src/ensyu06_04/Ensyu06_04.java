/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-4 p187
 * 	List6-5を書きかえて、縦向きの棒グラフで表示するプログラムを作成せよ。
 * 	最下段には、インデックスを10で割った剰余を表示すること。List6-5を書きかえて、
 * 	縦向きの棒グラフで表示するプログラムを作成せよ。
 * 	最下段には、インデックスを10で割った剰余を表示すること。
 *
 * パッケージ名:ensyu06_04
 * クラス名:Ensyu06_04
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_04;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_04 {
//クラスの内容ここから
	public static void main(String[] args) {
	//ここからmainメソッド

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

			//配列aの全要素中、取得したランダム数がMaxである値を求める
			int aMax = a[0];
			for (int i = 1; i < a.length; i++) {
				if (aMax < a[i])
					aMax = a[i];
			}

	//test//System.out.println(aMax);

			/*ここから表示する縦グラフのコード
			 * 	＜縦ループ＞
			 * 		変数・・・vertical(初期値:aMax/終端値:1/更新値:--)
			 * 		処理内容・・・横ループが終わったら改行
			 * 	＜横ループ＞
			 * 		変数・・・beside(初期値:0/終端値:n-1/更新値:++)
			 * 		処理内容・・・a[beside]< verticalの時、スペースを表示
			 * 				・・・a[beside]<=verticalの時、'*'を表示
			 */
			for (int vertical = aMax; vertical >= 1; vertical--) {
				for (int beside = 0; beside <= n-1; beside++) {
					if (a[beside] < vertical)
						System.out.print("   ");
					else
						System.out.print("*  ");
				}
				System.out.println("");
			}
			//横線の表示
			for (int i = 0; i <= n * 3 - 3; i++) {
				System.out.print('-');
			}
			System.out.println("");
			//表の最下段にインデックスを10で割った剰余を表示
			for (int i = 0; i <= n - 1; i++) {
				System.out.print(i % 10 + "  ");
			}

		System.out.println("");
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

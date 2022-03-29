/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-7 p195
 * 	list6-9は探索するキー値と同じ値の要素が複数個存在する場合、
 * 	最も先頭に位置する要素を見つけるプログラムである。
 * 	最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_07
 * クラス名:Ensyu06_07
 * 作成日:2022/03/01
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_07;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_07 {
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

			//配列aの全要素の値を表示
			System.out.print("配列aの全要素の値\n{ ");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("}");

			//探す数値
			System.out.print("探す数値：");
			int key = stdIn.nextInt();

			//末尾から探索
			int i;
			for (i = n - 1; i >= 0; i--) {
				if (a[i] == key)
					break;
			}

			//末尾までに見つかった場合
			if (i >= 0)
				System.out.println("それはa[" + i + "]にあります。");
			//末尾までに見つからなかった場合
			else
				System.out.println("それはありません");

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
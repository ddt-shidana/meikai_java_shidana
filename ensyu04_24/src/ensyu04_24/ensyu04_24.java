/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-24 p127
 * 	正の整数値を読み込み、
 * 	それが素数であるかどうかを判定するプログラムを作成せよ。
 * 	素数とは、2以上n未満のいずれの数でも割り切ることのできない整数nのことである。
 *
 * パッケージ名:ensyu04_24
 * クラス名:Ensyu04_24
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_24;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class ensyu04_24 {

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//素数判定プログラムの開始メッセージを画面表示させる
			System.out.println("正の整数nが素数であるかどうか判定します。");

			//正の整数n(n>0)変数を用意
			int n;

			//nは正の整数なので0未満の場合は聞き直す
			do {
				//正の整数nを聞く
				System.out.println("正の整数n:");
				n = stdIn.nextInt();
			} while (n < 0);

			//t(2<=t<n)でnを割り、余りが0になることがあれば素数ではない、
			//t(2<=t<n)でnを割り、余りが1以上であれば素数である
			for (int t = 2; t < n; t++) {
				if (n % t == 0) {
					System.out.println("素数ではありません");
					break;
				}
				else
					if (t == n - 1)
						System.out.println("素数です");
					else continue;
			}

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("素数判定プログラムを終了しました。");

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}

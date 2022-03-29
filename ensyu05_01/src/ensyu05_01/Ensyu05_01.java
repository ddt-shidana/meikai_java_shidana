/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-1 p149
 * 	10進数を読み込んで、その値を８進数と16進数で表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu05_01
 * クラス名:Ensyu05_01
 * 作成日:2022/02/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu05_01 {

	public static void main(String[] args) {
	//ここからmainメソッド

		//プログラム開始のメッセージを表示させる
		System.out.println("10進整数を8進数と16進数で表示します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//10進整数を入力してもらう
			System.out.print("整数：");
			//入力値をaに格納
			int a = stdIn.nextInt();

			System.out.printf(" 8進数では%6o です。\n", a);
			System.out.printf("16進数では%6x です。\n", a);

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}
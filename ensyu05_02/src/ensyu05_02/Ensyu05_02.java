/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-2 p153
 * 	float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu05_02
 * クラス名:Ensyu05_02
 * 作成日:2022/02/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_02;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu05_02 {

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
			//整数を入力してもらう
			System.out.print("整数a：");
			//入力値をaに格納
			float a = stdIn.nextFloat();

			//整数を入力してもらう
			System.out.print("整数b：");
			//入力値をbに格納
			double b = stdIn.nextDouble();

			System.out.println("a = " + a );
			System.out.println("b = " + b );

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
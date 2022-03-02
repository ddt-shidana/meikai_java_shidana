/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-3 p157
 * 	論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu05_03
 * クラス名:Ensyu05_03
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_03;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu05_03 {

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		boolean tfSt;

		//retryNumが1のとき繰り返す
		do {
				//プログラム開始のメッセージを表示させる
				System.out.println("true/falseを選択してください。");
				//TRUEかFALSEかを選択してもらう
				System.out.print("true/false:");
				//boolean型の変数tfStに入力値を代入
				tfSt = stdIn.nextBoolean();

			//代入した値を表示する
			System.out.println(tfSt);

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
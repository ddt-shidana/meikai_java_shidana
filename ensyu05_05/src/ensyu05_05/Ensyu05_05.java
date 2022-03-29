/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習5-5 p163
 * 	三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 	平均はキャスト演算子を利用して求め、実数として表示すること。
 *
 * パッケージ名:ensyu05_05
 * クラス名:Ensyu05_05
 * 作成日:2022/02/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu05_05;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu05_05 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
				//プログラム開始のメッセージを表示させる
				System.out.println("3つの整数値の合計と平均を計算し、実数値で表示します。");
				//整数値を格納する変数z1,z2,z3を用意し、入力値を初期設定
				System.out.print("整数a：");
				int z1 = stdIn.nextInt();
				System.out.print("整数b：");
				int z2 = stdIn.nextInt();
				System.out.print("整数c：");
				int z3 = stdIn.nextInt();

				//合計値を表示
				System.out.println("合計値は " + (z1 + z2 + z3) + " です。");
				//平均値を表示
				System.out.println("平均値は " + (double) (z1 + z2 + z3) / 3 + " です。");

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
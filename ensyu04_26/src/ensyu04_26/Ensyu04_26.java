/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-26 p129
 * 	合計だけでなく平均も求めるようにList4-19のプログラムを書きかえよ。
 * 	なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 *
 * パッケージ名:ensyu04_26
 * クラス名:Ensyu04_26
 * 作成日:2022/02/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_26;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_26 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//整数値の個数を格納する変数nを用意
			int n;

			//nは正の整数なので、0以下の場合聞き直す
			do {
				System.out.println("整数の合計値と平均値を求めます。");
				System.out.print("何個の整数値を使用しますか？：");
				//入力値を初期設定
				n = stdIn.nextInt();
			} while (n < 1);

			//n個の入力した整数値の合計値と平均値を求めます
			//合計値
			double sum = 0;
			//平均値
			double ave = 0;
			//加算する個数の格納する変数を用意し、初期値は1に設定
			int nAve = 0;

			//負の数は加算から除外して、n個の整数を加算し、その平均を求める
			for (int i = 1; i <= n; i++) {
				System.out.print("整数：");
				double t = stdIn.nextDouble();

				if (t < 0) {
					System.out.println("負の数は加算しません");
					continue;
				}
				sum += t;
				nAve++;
				ave = sum / nAve;
			}

			//合計値と平均値をメッセージで表示させる
			System.out.println("合計は" + sum + "、平均は" + ave + "です。");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("合計・平均計算プログラムを終了しました。");

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}
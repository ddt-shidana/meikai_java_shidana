/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-25 p129
 * 	合計だけなく平均も求めるようにList4-17およびList4-18のプログラムを書きかえよ。
 *
 * パッケージ名:ensyu04_25
 * クラス名:Ensyu04_25
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_25;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_25 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {

			//2通りのプログラムからどちらを実行するかを決めるための変数を用意
			int ensyuNum;

			//1か2を選択してもらい、実行するプログラムを決める
			//1と2以外が入力されたら、聞き直す
			do {
				System.out.println("どちらのプログラムを実行しますか？");
				System.out.println("List4-17・・・1/List4-18・・・2");
				ensyuNum = stdIn.nextInt();
			} while (ensyuNum < 1 || ensyuNum > 2);

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

			switch (ensyuNum) {
			//Lis-t4-17の書き換え
			case 1:
				//0が入力されるまで入力値を加算または平均を求め続ける
				for (int i = 1; i <= n; i++) {
					System.out.print("整数（0で終了）：");
					//入力値を変数tに取得
					double t = stdIn.nextDouble();
					//0が入力されたら終了
					if (t == 0)	break;
					//合計値を取得
					sum += t;
					//平均値を取得
					ave = sum / i;
				}	break;

			//Lis-t4-18の書き換え
			case 2:
				//合計が1000を超えない範囲で加算し続ける
				for (int i = 1; i <= n; i++) {
					System.out.print("整数：");
					//入力値を変数tに取得
					double t = stdIn.nextDouble();
					if (sum + t > 1000) {
						System.out.println("合計が1,000を超えました。");
						System.out.println("最後の数値は無視します。");
						break;
					}
					sum += t;
					ave = sum / i;
				}	break;

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

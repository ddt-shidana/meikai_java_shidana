/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-19 p217
 * 	クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラムを作成せよ。
 * 	合計点と平均点は、クラスごとのものと、全体のものとを表示すること。
 *
 * パッケージ名:ensyu06_19
 * クラス名:Ensyu06_19
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_19;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_19 {
//クラスの内容ここから

	public static void main(String[] args) {
	//mainメソッドここから
		//プログラム開始メッセージ
		System.out.println("各クラスの生徒の点数の合計点と平均点を求めます。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		/*全員の点数を格納する配列scoreを用意
		 * 	行・・・classNum（クラス数）
		 * 	列・・・peopleNum（各クラスの人数）
		 */
		int classNum = 0;
		int peopleNum = 0;
		int[][] score = new int[classNum][peopleNum];
		//全人数を数える為の変数を用意（平均を計算する時に使用）
		int peopleNumSum = 0;

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//配列の行数を決める
			System.out.print("クラス数：");
			classNum = stdIn.nextInt();
			score = new int[classNum][];
			System.out.println("");

			/* 各クラスごとの合計点と平均点を求める為、
			 * 点数を加算していく変数classScoreを用意
			 * 	行・・・classNum（クラス数）
			 * 	列・・・合計点(classScoreSum),平均点(classScoreAve)
			 */

			double[][] classScore = new double[classNum][2];

			//配列の列数を決める
			for (int lineItr = 0; lineItr < classNum; lineItr++) {
				System.out.print((lineItr + 1) + "クラス目の人数：");
				peopleNum = stdIn.nextInt();
				score[lineItr] = new int[peopleNum];

				//クラスの人数を格納
				peopleNumSum += peopleNum;

				//あらかじめ用意
				int classScoreSum = 0;

				//要素の値を入力してもらう
				for (int colItr = 0; colItr < peopleNum; colItr++) {
					System.out.print("\t" + (lineItr + 1) + "組"
											+ (colItr + 1) + "番の点数：");
					//入力値を取得
					int elementValue = stdIn.nextInt();
					//取得した入力値を、配列に格納
					score[lineItr][colItr] = elementValue;

					//合計点の変数に格納
					classScoreSum += score[lineItr][colItr];
				}

				//各クラスごとの合計点と平均点を配列に格納
				classScore[lineItr][0] = classScoreSum;
				classScore[lineItr][1] = (double)classScoreSum / peopleNum;
				System.out.println("");
			}

			//全体の合計点を求める
			int scoreSum = 0;
			for (int lineItr = 0; lineItr < classNum; lineItr++) {
				scoreSum += classScore[lineItr][0];
			}

			//各クラスの合計点と平均点・全体計を表示する
			//表カラム
			System.out.println("  組 |\t合計\t平均");
			System.out.println("-----+---------------");
			//各クラスの合計点と平均点の表示
			for (int lineItr = 0; lineItr < classNum; lineItr++) {
				System.out.print(" " + (lineItr + 1) + "組 |");
				for (int colItr = 0; colItr < 2; colItr++) {
					//小数点以下の桁数を指定する為、合計点と平均点でスイッチ
					switch (colItr) {
					case 0:
						System.out.printf("\t %.0f", classScore[lineItr][colItr]);
						break;
					case 1:
						System.out.printf("\t%.1f", classScore[lineItr][colItr]);
						break;
					}
				}
				System.out.println("");
			}
			System.out.println("-----+---------------");
			//計の表示
			System.out.print("  組 |");
			System.out.print("\t " + scoreSum);
			System.out.printf("\t%.1f\n", (double)scoreSum / peopleNumSum);


			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-17 p211
 * 	6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、
 * 	学生ごとの平均点を求めるプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_17
 * クラス名:Ensyu06_17
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_17;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_17 {
//クラスの内容ここから

	public static void main(String[] args) {
	//mainメソッドここから

		//プログラム開始メッセージ
		System.out.println("平均点を求めるプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		/*6人2科目(国語・算数)の点数を取得する
		 * 	配列score[][]に格納・・・6行2列
		 * 	以下のように格納していく
		 * 		1人目…国語の点数,算数の点数
		 * 		2人目…国語の点数,算数の点数
		 * 		3人目…国語の点数,算数の点数
		 * 		…
		 */
		//行・・・6人
		int i = 6;
		//列・・・2科目
		int j = 2;
		//6人2科目の点数を収納する配列
		int score[][] = new int[i][j];
		//科目ごとの平均を求めるときの単位配列
		int subjectU[][] = {{1, 1, 1, 1, 1, 1}};
		//学生ごとの平均を求めるときの単位配列
		int studentU[]	[] = {{1}, {1}};
		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {
			System.out.println("点数を入力してください。");
			//score配列に入力値を取得していく
			for (i = 0; i < 6; i++) {
				System.out.println(i + 1 +"人目の学生");
				for (j = 0; j < 2; j++) {
					if (j == 0)	System.out.print("国語：");
					else		System.out.print("算数：");
					score[i][j] = stdIn.nextInt();
				}
			}

			/*科目ごとの平均点を求める
			 * 	科目ごとの平均点の配列:subject
			 * 	科目用単位配列:subjectU
			 * 	6人2科目の点数の配列:score
			 * 		subject[1][j] = （subjectU[1][i] * score[i][j]）/6
			 */
			//平均点を表示するメッセージを出す
			System.out.println("●科目ごとの平均点は・・・");
			//科目ごとの平均点を格納する配列を用意
			double subject[][] = new double[1][2];
			/*score列のループ
			 * 	変数・・・j(初期値:0/終端値:＜2/更新値:++)
			 * 	処理内容・・・計算結果を表示させる
			 */
			for (j = 0; j < 2; j++) {
				if (j == 0)	System.out.print("\t国語：");
				else		System.out.print("\t算数：");
				/*score行のループ
				 * 	変数・・・i(初期値:0/終端値:＜6/更新値:++)
				 * 	処理内容・・・計算する
				 */
				//加算してゆく値を格納する変数を用意
				double subjectSum = 0;
				//かけ合わせたものをたしてゆく
				for (i = 0; i < 6; i++) {
					subjectSum += subjectU[0][i] * score[i][j];
//test
//System.out.print(subjectSum);
				}
				//6で割って平均を出す
				subject[0][j] = subjectSum / 6;
				//平均点を表示
				System.out.print(String.format("%4.2f\n", subject[0][j]));
			}

			/*学生ごとの平均点を求める
			 * 	学生ごとの平均点の配列:student
			 * 	科目用単位配列:studentU
			 * 	6人2科目の点数の配列:score
			 * 		student[i][1] = （score[i][j] * studentU[j][1]）/6
			 */
			//平均点を表示するメッセージを出す
			System.out.println("●学生ごとの平均点は・・・");
			//学生ごとの平均点を格納する配列を用意
			double student[][] = new double[6][1];
			/*score行のループ
			 * 	変数・・・i(初期値:0/終端値:＜6/更新値:++)
			 * 	処理内容・・・学生毎の平均点を表示
			 */
			for (i = 0; i < 6; i++) {
				/*score列のループ
				 * 	変数・・・j(初期値:0/終端値:＜2/更新値:++)
				 * 	処理内容・・・計算する
				 */
				//加算してゆく値を格納する変数を用意
				double studentSum = 0;
				//かけ合わせたものをたしてゆく
				for (j = 0; j < 2; j++) {
					studentSum += score[i][j] * studentU[j][0];
				}
				//2で割って平均を出す
				student[i][0] = studentSum / 2;
				//平均点を表示
				/*旧メソッドのため意味ない
				 * System.out.printf("%3.1f\n", student[i][0]);
				 */
				System.out.print(String.format("\t" + (i + 1) + "人目の学生：%4.1f\n", student[i][0]));
			}

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
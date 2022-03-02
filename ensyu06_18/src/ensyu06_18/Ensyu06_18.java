/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-18 p215
 * 	行数・各行の列数・各要素の値をキーボードから読み込むようにlist6-18を書き換えたプログラムを作成せよ。
 *
 * パッケージ名:ensyu06_18
 * クラス名:Ensyu06_18
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_18 {
//クラスの内容ここから

	public static void main(String[] args) {
	//mainメソッドここから

		//プログラム開始メッセージ
		System.out.println("二次元配列を作成します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//配列cを用意
		int[][] c;

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//配列の行数を決める
			System.out.print("行数：");
			int lineNum = stdIn.nextInt();
			c = new int[lineNum][];

			//配列の列数を決める
			int colNum;
			for (int lineItr = 0; lineItr < lineNum; lineItr++) {
				System.out.print((lineItr + 1) + "行目の列数：");
				colNum = stdIn.nextInt();
				c[lineItr] = new int[colNum];
				//要素の値を入力してもらう
				System.out.println("要素の値を入力してください。");
				for (int colItr = 0; colItr < colNum; colItr++) {
					System.out.print("\t" + (lineItr + 1) + "行"
											+ (colItr + 1) + "列目の値：");
					//入力値を取得
					int elementValue = stdIn.nextInt();
					//取得した入力値を、配列に格納
					c[lineItr][colItr] = elementValue;
				}
			}

			//配列cを表示
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					System.out.printf("%3d", c[i][j]);
				}
				System.out.println();
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
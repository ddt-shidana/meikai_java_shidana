/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-16 p211
 * 	4行3列の行列なと3行4列の行列の積を求めるプログラムを作成せよ。
 * 	各要素の値はキーボードから読み込むこと。
 *
 * パッケージ名:ensyu06_16
 * クラス名:Ensyu06_16
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu06_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu06_16 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド	// TODO 自動生成されたメソッド・スタブ

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//4行3列の配列a
		int[][] a = new int[4][3];
		//3行4列の配列b
		int[][] b = new int[3][4];
		//4行4例の配列c
		int[][] c = new int[4][4];

		//配列aの要素値を入力から取得して、画面表示
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = stdIn.nextInt();
			}
		}

		//配列bの要素値を入力から取得して、画面表示
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = stdIn.nextInt();
			}
		}

		//配列aを画面表示
		System.out.println("行列a:4行3列");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("");
		}

		//配列bを画面表示
		System.out.println("行列b:3行4列");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(b[i][j] + "  ");
			}
			System.out.println("");
		}


		//配列c=配列a*配列bで、配列cを画面表示
		System.out.println("行列c:4行4列");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] = a[i][k] * b[k][j] ;
					System.out.printf("%4d ", c[i][j]);
				}
			}
			System.out.println("");
		}

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}

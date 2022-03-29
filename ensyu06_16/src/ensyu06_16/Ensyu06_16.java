/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習6-16 p211
 * 	4行3列の行列なと3行4列の行列の積を求めるプログラムを作成せよ。
 * 	各要素の値はキーボードから読み込むこと。
 *
 * パッケージ名:ensyu06_16
 * クラス名:Ensyu06_16
 * 作成日:2022/03/02
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

		/*配列の積を求める為の準備
		 * 	配列a[i][k]×配列b[k][j]=配列c[i][j] とする
		 * 	今回は
		 * 		i=4, k=3, J=4とする
		 */

		//要素数を文字で置くため、変数を用意し、初期値を設定
		int i = 4;
		int k = 3;
		int j = 4;

		//配列a(左辺)
		int[][] a = new int[i][k];
		//配列b(右辺)
		int[][] b = new int[k][j];
		//配列c(a*b)
		int[][] c = new int[i][j];

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//配列aの要素値を入力から取得して、画面表示
			for (i = 0; i < 4; i++) {
				for (k = 0; k < 3; k++) {
					System.out.print("a[" + i + "][" + k + "] = ");
					a[i][k] = stdIn.nextInt();
				}
			}

			//配列bの要素値を入力から取得して、画面表示
			for (k = 0; k < 3; k++) {
				for (j = 0; j < 4; j++) {
					System.out.print("b[" + k + "][" + j + "] = ");
					b[k][j] = stdIn.nextInt();
				}
			}

			/*	表示する時に何桁揃えにするかを求める為に、
			 * 	配列aと配列bの要素値の最大桁数を求めます。
			 * 		配列aの全要素値の最大桁数：aMax
			 * 		配列bの全要素値の最大桁数：bMax
			 * 		配列cの全要素値の最大桁数：cMax
			 * 			aMax + bMax <= cMax
			 */
			//比較のための変数を用意し、初期値はa[0][0]Maxに設定
			int aMax = String.valueOf(a[0][0]).length();
			//a[0][1]からa[3][2]まで比較し、aMaxの桁数より大きければ入れ替える
			for (i = 0; i < 4; i++) {
				for(k = 0; k < 3; k++) {
					if(i == 0 && k == 0)
						break;
					int aLength = String.valueOf(a[i][k]).length();
					if(aMax < aLength)
						aMax = aLength;
				}
			}
			//比較のための変数を用意し、初期値はb[0][0]Maxに設定
			int bMax = String.valueOf(b[0][0]).length();
			//b[0][1]からa[2][3]まで比較し、bMaxの桁数より大きければ入れ替える
			for (k = 0; k < 3; k++) {
				for(j = 0; j < 4; j++) {
					if(k == 0 && j == 0)
						break;
					int bLength = String.valueOf(b[k][j]).length();
					if(bMax < bLength)
						bMax = bLength;
				}
			}
			//cMaxを求める
			int cMax = aMax + bMax;

			//配列aを画面表示
			System.out.println("行列a");
			for (i = 0; i < 4; i++) {
				for (k = 0; k < 3; k++) {
					System.out.printf("%" + aMax +"d ", a[i][k]);
				}
				System.out.println("");
			}

			//配列bを画面表示
			System.out.println("行列b");
			for (k = 0; k < 3; k++) {
				for (j = 0; j < 4; j++) {
					System.out.printf("%" + bMax +"d ", b[k][j]);
				}
				System.out.println("");
			}

//test
//System.out.println(cMax);

			//配列c=配列a*配列bで、配列cを画面表示
			System.out.println("行列c=abです");
			/*行のループ
			 * 	変数・・・i(初期値:0/終端値:＜4/更新値:++)
			 * 	処理内容・・・全ての表示が終わったのち、改行
			 */
			for (i = 0; i < 4; i++) {
				/*列のループ
				 * 	変数・・・j(初期値:0/終端値:＜4/更新値:++)
				 * 	処理内容・・・計算結果をcMax桁揃えで表示させる
				 */
				for (j = 0; j < 4; j++) {
					/*計算内容のループ
					 * 	変数・・・k(初期値:0/終端値:3/更新値:++)
					 * 	処理内容・・・c=abを計算する
					 * 			・・・c[i][k]の各要素値は、kを動かしながら得られる
					 * 			・・・a[i][k]*b[k][j]の総和である
					 */
					int cSum = 0;
					for (k = 0; k < 3; k++) {
						cSum += a[i][k] * b[k][j];
					}
					c[i][j] = cSum;
					System.out.printf("%" + cMax +"d ", c[i][j]);
				}
				System.out.println("");
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

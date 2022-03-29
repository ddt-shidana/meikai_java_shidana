/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-27 p259
 * 	List7-20のプログラムを三つの配列の要素数が
 * 	等しければ加算を行ってtrueを返し、
 * 	等しくなければ加算を行わずにfalseを返すメソッドに書き換えよ。
 *
 * パッケージ名:ensyu07_27
 * クラス名:Ensyu07_27
 * 作成日:2022/03/09
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_27;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_27 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//----------------------------続行の確認を行うメソッド----------------------------//
	/*メソッド名：confirmRetry
	 *	入力値が1のとき繰り返す、0のとき終了
	 */
	static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		return retryNum == 1;
	}
	//--------------------------------------------------------------------------------//

	//------------任意の2つの2次元配列の行数と列数が同一か確認するメソッド------------//
	/*メソッド名：equalElement
	 */
	static boolean equalElement(int[][] p, int[][] q) {
		int equalNum = -1;
		//行数一致の確認
		if (p.length == q.length) {
			//各行の
			for (int lItr = 0; lItr < p.length; lItr++) {
				//列数一致の確認
				if (p[lItr].length != q[lItr].length) {
					//一致していなかったら0
					equalNum = 0;
					break;
				}
				//一致していたら1
				else {
					equalNum = 1;
				}
			}
		}
		//行数が一致していなかったら0
		else {
			equalNum = 0;
		}
		//行数列数全てが一致している場合（1）にtrueを返す
		return equalNum == 1;
	}
	//-------------------------------------------------------------------------------//

	//------------任意の3つの2次元配列の行数と列数が同一か確認するメソッド------------//
	/*メソッド名：equalElement
	 */
	static boolean equalElement3(int[][] p, int[][] q, int[][] r) {
		int equalNum3;
		if (equalElement(p, q) && equalElement(q, r) && equalElement(r, p)) {
			equalNum3 = 1;
		}
		else {
			equalNum3 = 0;
		}
		//行数列数全てが一致している場合（1）にtrueを返す
		return equalNum3 == 1;
	}
	//-------------------------------------------------------------------------------//

	//------------------------行列xとyの和をzに代入するメソッド-----------------------//
	/*メソッド名：addMatrix
	 *
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if (equalElement3(x, y, z)) {
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}
		//x,y,zの行列が全て一致している時true
		return (equalElement3(x, y, z));
	}
	//-------------------------------------------------------------------------------//

	//-------------------------行列mの全要素を表示するメソッド-----------------------//
	/*メソッド名：printMatrix
	 */
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {

		//配列a,bを決める
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };

		//配列a,bの表示
		System.out.println("行列a");	printMatrix(a);
		System.out.println("行列b");	printMatrix(b);

		//配列cを用意
		int[][] c = new int[2] [3];

		//3つの配列の行列が一致したら
		if (addMatrix(a, b, c) == true) {
			//一致したメッセージを表示
			System.out.println("3つの配列の行列が一致しました。");
			//a+bをcとし、cを表示
			System.out.println("行列c");	printMatrix(c);
		}
		//3つの配列の行列が一致しなかったら
		else {
			//一致しないメッセージを表示
			System.out.println("3つの配列の行列が一致しません。");
		}

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-29 p259
 * 	2次元配列aと同じ配列(要素数が同じで、
 * 	すべての要素の値が同じ配列)を生成して返却するメソッドaryClone2を作成せよ。
 *
 * パッケージ名:ensyu07_29
 * クラス名:Ensyu07_29
 * 作成日:2022/03/09
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_29;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_29 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//----------------------------続行の確認を行うメソッド----------------------------//
	/*メソッド名：confirmRetry
	 *	入力値が1のとき繰り返す、0のとき終了
	 */
	static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：\n");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		return retryNum == 1;
	}
	//--------------------------------------------------------------------------------//

	//---------------------配列の中身がすべて0か確認するメソッド----------------------//
	/*メソッド名：isNullAll
	 *	全要素が0の時、isNullAllはtrue・・・judgeNum=1
	 *	1つでも1以上があるなら。isNullAllはfalse・・・judgeNum=0
	 */
	static boolean isNullAll (int[] x) {
		//判定用の値を格納するための変数を、あらかじめ用意しておく
		int judgeNum = -1;
		//受け取った配列の要素の値を順番に見てゆくループ
		for (int i : x) {
			//値が1以上なら0を返して終わり
			if (i > 0) {
				judgeNum = 0;
				break;
			}
			//すべて0なら1を返す
			if (i == 0) {
				judgeNum = 1;
			}
		}
		return judgeNum == 1;
	}
	//--------------------------------------------------------------------------------//

	//----------------二次元配列の要素の値を入力によって決めるメソッド----------------//
	/*メソッド名：scanArray
	 */
	static void scanArray (int[][] x) {
		//要素の値を聞く
		System.out.println("各要素の値を入力してください。");
		//各行
		for (int lineItr = 0; lineItr < x.length; lineItr++) {
			//もし列数が0なら飛ばす
			if (x[lineItr].length > 0) {
				//各列
				for (int colItr = 0; colItr < x[lineItr].length; colItr++) {
					//聞く行列数目の表示
					System.out.print("\t" + lineItr + "行" + colItr + "列目：");
					//入力値を現在聞いているインデックスに要素数として格納
					x[lineItr][colItr] = stdIn.nextInt();
				}
			}
			else {
				;
			}
		}
	}
	//--------------------------------------------------------------------------------//

	//----------------2次元配列aと同じ配列を生成して返却するメソッド------------------//
	/*メソッド名：aryClone2
	 */
	static int[][] aryClone2 (int[][] a) {
		//クローン配列を新たに用意し、行数をクローン
		int[][] aClone = new int[a.length][];
		//要素を各行・各列の小さいインデックス順にクローンしていくループ
		//行のループ
		for (int lineItr = 0; lineItr < a.length; lineItr++) {
			//現在の行の列数をクローン配列に定義
			aClone[lineItr] = new int[a[lineItr].length];
			//列のループ
			for (int colItr = 0; colItr < a[lineItr].length; colItr++) {
				//中身をクローン
				aClone[lineItr][colItr] = a[lineItr][colItr];
			}
		}
		//返却値はクローン↓配列
		return aClone;
	}
	//--------------------------------------------------------------------------------//

	//-------------------------行列mの全要素を表示するメソッド-----------------------//
	/*メソッド名：printMatrix
	 */
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			//見やすいようにタブ
			System.out.print("\t");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
	//--------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {

		//プログラム開始のメッセージ
		System.out.println("行列aとbを足した行列cを求めるプログラムです。\n");

		//もう一度プログラムを実行する場合のかたまり
		do {
			/*配列a,bを決めるルール
			 * 	配列a,bの行数・列数は一緒
			 * 	行数(lLength)は1以上、
			 * 	列数(cLength[])は全行がNULLの場合不適切
			 */
			//----------行数を決める-----------------------------------------------//
			//先に変数だけ用意：lLength・・・配列a,bの行数
			int lLength;
			//行数は1以上なので、0以下の場合聞き直すためのループ
			do {
				//a,bの行数を聞く
				System.out.print("行数：");
				//今の入力値を行数として格納する
				lLength = stdIn.nextInt();
				//入力値が0以下の時エラーメッセージを表示
				if (lLength < 1) {
					System.out.println("正の整数を入力してください。");
				}
			//0以下でループ
			} while (lLength < 1);

			//----------配列a,bを宣言する------------------------------------------//
			int[][] a = new int[lLength][];
			int[][] b = new int[lLength][];

			//----------列数を決める-----------------------------------------------//
			//先に変数だけ用意：cLength[]・・・配列a,bの各行の列数を格納する配列(要素数は行数lLength)
			int[] cLength = new int[lLength];

			//全行の入力が終わり、全ての行の列数がNULLだと成り立たないので聞き直す
			do {
				//a,bの各行の列数を聞くため、行数分ループ
				for (int lineItr = 0; lineItr < lLength; lineItr++) {
					//列数に0未満が入力されたら聞き直す
					do {
						//現在の行の列数を聞く
						System.out.print(lineItr + "行目の列数：");
						//今の入力値を現在の行数の列数として格納する
						cLength[lineItr] = stdIn.nextInt();
						//配列a,bの各行の列数を宣言
						a[lineItr] = new int[cLength[lineItr]];
						b[lineItr] = new int[cLength[lineItr]];
						//入力値が0未満の時エラーメッセージを表示
						if (cLength[lineItr] < 0) {
							System.out.println("0以上の整数を入力してください。");
						}
					//列数に0未満が入力されたら聞き直す
					} while (cLength[lineItr] < 0);
				}
				//cLengthがisNullAllの時のエラーメッセージ
				if (isNullAll(cLength)) {
					System.out.println("少なくとも1行は1以上を入力してください。");
				}
			//cLengthがisNullAll(メソッド呼び出す)の場合ループ
			} while (isNullAll(cLength));

			//----------要素の値を決める--------------------------------------------//
			//配列a
			System.out.println("＜配列a＞");
			//配列aの各要素の値を入力値から得る：scanArrayメソッド呼び出し
			scanArray(a);

			//----------結果を表示する---------------------------------------------//
			System.out.println("\n配列aを配列bにクローンしました。結果を表示します。");
			//配列a
			System.out.println("＜配列a＞");
			printMatrix(a);
			//配列b
			System.out.println("＜配列b＞");
			printMatrix(aryClone2(a));

		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());

	}
	//------------------------------------------------------------------------------//

}
/**************************************************************************************/

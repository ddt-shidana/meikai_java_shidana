/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-30 p263
 * 	二つのint型整数a,bの最小値、
 * 	三つのint型整数a,b,cの最小値、
 * 	配列aの要素の最小値
 * 		を求める多重定義されたメソッド群を作成せよ。
 *
 * パッケージ名:ensyu07_30
 * クラス名:Ensyu07_30
 * 作成日:2022/03/11
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_30;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_30 {

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

	//----------------------------整数値xをきめるメソッド-----------------------------//
	/*メソッド名：determinX
	 */
	static int determinX (int x, String xSt) {
		//返却値を格納する変数を用意
		int determinX;
		//整数を入力してもらうメッセージ
		System.out.print("整数" + xSt + "：");
		//入力値をdeterminXとして扱う
		determinX = stdIn.nextInt();
		//返却値
		return determinX;
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

	//----------------一次元配列の要素の値を入力によって決めるメソッド----------------//
	/*メソッド名：scanArray
	 */
	static int[] scanArray (String xSt) {
		//要素数（列数）を格納する変数を用意
		int cLength = 0;
		//列数は1以上
		do {
			//列数を聞く
			System.out.print("配列" + xSt + "の列数：");
			//入力値を列数として扱う
			cLength = stdIn.nextInt();
			//0以下の値が入力されたらエラーメッセージを表示
			if (cLength < 1) {
				System.out.println("正の整数を入力してください。");
			}
		//1未満が入力されたらループ
		} while (cLength < 1);

		//配列xを用意
		int[] x = new int[cLength];

		//一次元配列xの要素数を定義
		x = new int[cLength];

		//要素の値を入力してもらう
		//メッセージ
		System.out.println("配列" + xSt + "の各要素の値を入力してください。");
		//xのインデックスを順番に動いて要素を入力値から取得する
		for (int idxItr = 0; idxItr < cLength; idxItr++) {
			//入力してもらうインデックスの見出し
			System.out.print("\t" + xSt + "[" + idxItr + "] = ");
			//入力値を該当要素の値として設定
			x[idxItr] = stdIn.nextInt();
		}
		//配列xを表示する
		//配列x
		System.out.println("＜配列" + xSt + "＞");
		printMatrix(x);

		//返却値は配列
		return x;
	}
	//--------------------------------------------------------------------------------//

	//----------------二次元配列の要素の値を入力によって決めるメソッド----------------//
	/*メソッド名：scanArray
	 */
	static void scanArray (int[][] x, String xSt) {
		//----------行数を決める-----------------------------------------------
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

		//配列xの行要素数を定義
		x = new int[lLength][];

		//----------列数を決める-----------------------------------------------
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
					x[lineItr] = new int[cLength[lineItr]];
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

		//----------要素の値を決める--------------------------------------------
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

		//----------配列xを表示する---------------------------------------------
		//配列x
		System.out.println("＜配列" + xSt + "＞");
		printMatrix(x);
	}

	//--------------------------------------------------------------------------------//

	//------------------二つのint型整数a,bの最小値を求めるメソッド--------------------//
	/*メソッド名：min※多重定義
	 */
	static int min(int a, int b) {
		//aとbで小さい方を返却値とする
		return a < b ? a : b;
	}
	//--------------------------------------------------------------------------------//

	//------------------三つのint型整数a,b,cの最小値を求めるメソッド------------------//
	/*メソッド名：min※多重定義
	 */
	static int min(int a, int b, int c) {
		//比較用に変数を用意し、初期値aを設定
		int min = a;
		//minが比較対象より大きい場合、比較対象をminに入れなおす
		if (min > b) min = b;
		if (min > c) min = c;
		//返却値は比較し終わったmin
		return min;
	}
	//--------------------------------------------------------------------------------//

	//-----------------------配列aの要素の最小値を求めるメソッド----------------------//
	/*メソッド名：min※多重定義
	 */
	static int min(int[] a) {
		//比較用に変数を用意し、初期値a[0]を設定
		int min = a[0];
		//インデックスの小さい要素から順に比較していく
		for (int idxItr = 1; idxItr < a.length; idxItr++) {
			//もしminより比較対象の方が小さかったらminを比較対象に置き換える
			if (min > a[idxItr]) {
				min = a[idxItr];
			}
		}
		//返却値は比較し終わったmin
		return min;
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

	//-------------------------配列mの全要素を表示するメソッド-----------------------//
	/*メソッド名：printMatrix
	 */
	static void printMatrix(int[] m) {
		//見やすいようにタブ
		System.out.print("\t");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "  ");
		}
		System.out.println();
	}
	//--------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {

		//もう一度プログラムを実行する場合のかたまり
		do {
			//プログラム開始のメッセージ
			System.out.println("3種類の実行プログラムがあります。");

			//-----3種類の実行プログラムからどれを実行するかを選んでもらう--------//
			//3種類のプログラムの案内
			System.out.println("\t①2つの整数値a,bから最小値を求めるプログラム");
			System.out.println("\t②3つの整数値a,b,cから最小値を求めるプログラム");
			System.out.println("\t③配列aの要素中の最小値を求めるプログラム");
			//選択用№を格納する変数を用意
			int selectPNum = 0;
			//1～3以外が入力されたら聞き直す
			do {
				//1～3を入力してもらう
				System.out.print("どれを実行しますか？(1～3）：");
				//入力された№を変数に格納する
				selectPNum = stdIn.nextInt();
				//0～3以外が入力された場合のエラーメッセージ
				if (selectPNum < 0 || selectPNum > 3) {
					System.out.println("1～3を入力してください。");
				}
			//0～3以外が入力されたらdoメソッドの頭に戻る
			} while (selectPNum < 0 || selectPNum > 3);

			//-----各プログラムの実行----------------------------------------------//
			switch (selectPNum) {
				//①2つの整数値a,bから最小値を求めるプログラム
				case 1: {
					//整数値aを決める
					int a = 0;
					a = determinX(a,"a");
					//整数値bを決める
					int b = 0;
					b = determinX(b,"b");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a, b) + " です。");
					break;
				}

				//②3つの整数値a,b,cから最小値を求めるプログラム
				case 2: {
					//整数値aを決める
					int a = 0;
					a = determinX(a,"a");
					//整数値bを決める
					int b = 0;
					b = determinX(b,"b");
					//整数値cを決める
					int c = 0;
					c = determinX(c,"c");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a, b, c) + " です。");
					break;
				}

				//③配列aの要素中の最小値を求めるプログラム
				case 3: {
					//配列aを決める
					int[] a = scanArray("a");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a) + " です。");
					break;
				}

			}
			//-----各プログラムの実行ここまで----------------------------------------//


		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());

	}
	//------------------------------------------------------------------------------//

}
/**************************************************************************************/
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-33 p263
 * 	int型の1次元配列とint型の2次元配列の全要素の値を表示する、
 * 	多重定義されたメソッド群を作成せよ。
 * 	なお、1次元配列の表示では、各要素の間には1文字分のスペースを空けること。
 * 	また、2次元配列の表示では、各列の数値の戦闘が揃うように、最低限のスペースを空けること。
 *
 * パッケージ名:ensyu07_33
 * クラス名:Ensyu07_33
 * 作成日:2022/03/14
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_33;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_33 {

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
		//返却値は配列
		return x;
	}
	//--------------------------------------------------------------------------------//

	//-----------------------一次元配列の要素を表示するメソッド-----------------------//
	/*メソッド名：printArray
	 */
	static void printArray (int[] a) {
		System.out.println("1次元配列を表示します。");
		//見やすいようにタブ
		System.out.print("\t");
		for (int i = 0; i < a.length; i++) {
			//要素間は1文字あける
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	//--------------------------------------------------------------------------------//

	//----------------二次元配列の要素の値を入力によって決めるメソッド----------------//
	/*メソッド名：scanArray
	 */
	static int[][] scanArray2 (String xSt) {
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
		int[][] x = new int[lLength][];

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
		//返却値は各列の要素値の最大桁数の配列
		return x;
	}
	//--------------------------------------------------------------------------------//

	//----------------二次元配列の任意の要素の桁数を獲得するメソッド------------------//
	/*メソッド名：valOfLength
	 */
	static int valOfLength (int[][] a, int l, int c) {
		int valOfLength = -1;
		if (a[l].length <= c) {
			valOfLength = 0;
		}
		else {
			valOfLength = String.valueOf(a[l][c]).length();
		}
		return valOfLength;
	}
	//--------------------------------------------------------------------------------//

	//------------------二次元配列の各列の最大桁数を求めるメソッド--------------------//
	/*メソッド名：printValArray
	 */
	static int[] valOfMaxLength (int[][] a) {
		//各行の列数を格納する配列を取得
		int[] cLength = new int[a.length];
		//各行で
		for(int lItr = 0; lItr < a.length; lItr++) {

			//列数を格納
			cLength[lItr] = a[lItr].length;
		}

		//----------最大列数を求める--------------------------------------------
		//最大列数を格納する変数を用意
		int cMaxLength = cLength[0];
		//順番に比較し、新たな最大とぶつかったら上書き
		for (int idxItr = 1; idxItr < cLength.length; idxItr++) {
			if (cMaxLength < cLength[idxItr]) {
				cMaxLength = cLength[idxItr];
			}
		}

		//----------各列の要素値の最大桁数を求める-------------------------------
		//各列の要素値の最大桁数を格納するための1次元配列を用意
		int[] valMaxArray = new int[cMaxLength];
		//列のループ
		for (int cItr = 0; cItr < cMaxLength; cItr++) {
			//比較用に仮のマックス桁数としてa[cItr][0]の桁数を初期設定
			valMaxArray[cItr] = valOfLength(a, 0, cItr);
			//行のループ
			for (int lItr = 1; lItr < a.length; lItr++) {
				if (valMaxArray[cItr] < valOfLength(a, lItr, cItr)) {
					valMaxArray[cItr] = valOfLength(a,lItr , cItr);
				}
			}
		}
		return valMaxArray;
	}
	//--------------------------------------------------------------------------------//

	//--------二次元配列の要素を各列の数値の先頭が揃うように表示するメソッド----------//
	/*メソッド名：printValArray
	 */
	static void printValArray (int[][] a) {
		//各行
		for (int lItr = 0; lItr < a.length; lItr++) {
			//見やすいようにタブ
			System.out.print("\t");
			//各列
			for (int cItr = 0; cItr< a[lItr].length; cItr++) {
				//各列の最大桁数で表示桁数をそろえる
				System.out.printf("%-" + valOfMaxLength(a)[cItr] + "d ", a[lItr][cItr]);
			}
			//次の行へいくため改行
			System.out.println();
		}
	}
	//--------------------------------------------------------------------------------//

	//-----------------------二次元配列の要素を表示するメソッド-----------------------//
	/*メソッド名：printArray
	 */
	static void printArray (int[][] a) {
		System.out.println("二次元配列を表示します。");
		printValArray(a);
	}
	//--------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {


		//もう一度プログラムを実行する場合のかたまり
		do {
			//プログラム開始のメッセージ
			System.out.println("一次元配列か二次元配列を表示します。");

			//-----4種類の実行プログラムからどれを実行するかを選んでもらう--------//
			//4種類のプログラムの案内
			System.out.println("\t(1)一次元配列で表示する");
			System.out.println("\t(2)二次元配列で表示する");
			//選択用№を格納する変数を用意
			int selectPNum = 0;
			//1～4以外が入力されたら聞き直す
			do {
				//1～4を入力してもらう
				System.out.print("どちらを実行しますか？(1 or 2)：");
				//入力された№を変数に格納する
				selectPNum = stdIn.nextInt();
				//0～4以外が入力された場合のエラーメッセージ
				if (selectPNum < 1 || selectPNum > 2) {
					System.out.println("1か2を入力してください。");
				}
			//0～4以外が入力されたらdoメソッドの頭に戻る
			} while (selectPNum < 1 || selectPNum > 2);

			//-----各プログラムの実行----------------------------------------------//
			switch (selectPNum) {
				//(1)一次元配列で表示
				case 1: {
					int[] a = scanArray("a");
					printArray(a);
					break;

				}

				//(2)二次元配列で表示
				case 2: {
					int[][] a = scanArray2("a");
					printArray(a);
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
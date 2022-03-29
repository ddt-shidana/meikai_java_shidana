/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-25 p257
 * 	配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッドarrayRmvOfNを作成せよ。
 *
 * パッケージ名:ensyu07_25
 * クラス名:Ensyu07_25
 * 作成日:2022/03/08
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_25;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_25 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//---------------------------続行の確認を行うメソッド---------------------------//
	/*メソッド名：confirmRetry
	 *	入力値が1のとき繰り返す、0のとき終了
	 */
	static boolean confirmRetry() {
		int retryNum;
		//0と1以外が入力されたら聞き直す
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		//返却値（1のときTrueになるように）
		return retryNum == 1;
	}
	//------------------------------------------------------------------------------//

	//-----------------------------配列を表示するメソッド---------------------------//
	/*メソッド名：printArray
	 */
	static void printArray(int[] a) {
		//ヘッダを表示
		System.out.print(" = {");
		//中身を表示させるループ
		for (int indexItr = 0; indexItr < a.length; indexItr++) {
			System.out.print(a[indexItr]);
			//要素間はコンマで区切る
			if(indexItr < a.length - 1)
				System.out.print(", ");
		}
		//フッダを表示
		System.out.println("}");
	}
	//------------------------------------------------------------------------------//

	//-------配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却する-------//
	/*メソッド名：arrayRmvOf
	 */
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		//求める配列、要素数は引数の長さから削除するnを引いた数
		int[] arrayRmvOfN = new int[a.length - n];
		//idxが0より大きい時
		if (idx > 0) {
			//idxより前のインデックスの要素を求める配列に格納
			for (int placeItr = 0; placeItr < idx; placeItr++) {
				arrayRmvOfN[placeItr] = a[placeItr];
			}
		}
		//idx+nがaの要素の長さより小さい時
		if (idx + n < a.length) {
			//削除した要素より後ろにある要素を求める配列に格納
			//times回数分繰り返す
			int times = a.length - idx - n;
			//idxを起点にして格納していく
			for (int placeItr = idx; placeItr < idx + times; placeItr++) {
				arrayRmvOfN[placeItr] = a[placeItr + n];
			}
		}
		//返却値は配列
		return arrayRmvOfN;
	}
	//-------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aから要素a[idx]を先頭とするn個の要素を削除した配列を求めるプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int elementA;
			//要素数n(>0)を入力してもらう
			do {
				System.out.print("\n配列aの要素数：");
				elementA = stdIn.nextInt();
				//n<=0だったときのエラーメッセージを表示
				if (elementA <= 0) {
					System.out.println("正の整数を入力してください。");
				}
			} while (elementA <= 0);

			//配列aを設定
			int[] array = new int[elementA];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < elementA; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//配列aから削除する要素のインデックスを入力してもらう
			//0<=idx<eIn-1なので、それ以外は聞き直す
			int idxIn;
			do {
				System.out.print("配列aから削除の起点となるインデックス値：");
				idxIn = stdIn.nextInt();
				//0より小さい時のエラーメッセージの表示
				if (idxIn < 0) {
					System.out.println("インデックスは0以上を入力してください。");
				}
				//最終インデックス値以上の時のエラーメッセージの表示
				else if (idxIn >= elementA-1) {
					System.out.println("インデックスは要素数-1より小さい値を入力してください。");
				}
			} while (idxIn < 0 || idxIn >= elementA-1);

			//削除する要素の個数0<nIn<eIn-idxInを入力してもらう
			int nIn;
			do {
				System.out.print("配列aから削除する要素の個数：");
				nIn = stdIn.nextInt();
				//0未満の時エラーメッセージの表示
				if (nIn <= 0) {
					System.out.println("インデックスは0より大きい値を入力してください。");
				}
				//要素数-起点 の値以上の時エラーメッセージの表示
				else if (nIn >= elementA - idxIn) {
					System.out.println("（要素数-起点となるインデックス値）より小さい値を入力してください。");
				}
			} while (nIn <= 0 || nIn >= elementA - idxIn);

			//各要素の値を表示
			//ヘッダを表示
			System.out.print("a");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(array);

			//結果を表示
			System.out.println("配列を求めました。");
			//ヘッダを表示
			System.out.print("b");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(arrayRmvOfN(array, idxIn, nIn));

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

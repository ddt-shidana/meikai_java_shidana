/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-18 p251
 * 	配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ。
 *
 * パッケージ名:ensyu07_18
 * クラス名:Ensyu07_18
 * 作成日:2022/03/08
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_18 {

	//------------Scannerメソッド(stdInにキーボードからの入力値を初期設定)------------//
	static Scanner stdIn = new Scanner (System.in);

	//---------------------------続行の確認を行うメソッド---------------------------//
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
	//------------------------------------------------------------------------------//

	//---------------------配列aから要素a[idx]を削除するメソッド--------------------//
	/*メソッド名：aryRmv
	 */
	static int aryRmv(int[] a, int idx) {
		//a[idx]より後ろに要素がある場合
		if (idx < a.length - 1) {
			for (int placeItr = idx; placeItr < a.length - 1; placeItr++) {
				a[placeItr] = a[placeItr + 1];
			}
		}
		//a[idx]が最終インデックス要素の場合
		else if (idx == a.length - 1){
			a[a.length - 1] = 0;
		}
		return 1;
	}

	//------------------------------------------------------------------------------//

	//-----------------------------配列を表示するメソッド---------------------------//
	/*メソッド名：printArray
	 */
	static void printArray(int[] a) {
		System.out.print(" = {");
		for (int indexItr = 0; indexItr < a.length; indexItr++) {
			System.out.print(a[indexItr]);
			if(indexItr < a.length - 1)
				System.out.print(", ");
		}
		System.out.println("}");
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aから要素a[idx]を削除するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int nIn;
			//要素数n(>0)を入力してもらう
			do {
				System.out.print("\n要素数：");
				nIn = stdIn.nextInt();
				//n<=0だったときのエラーメッセージを表示
				if (nIn <= 0) {
					System.out.println("正の整数を入力してください。");
				}
			} while (nIn <= 0);

			//配列aを設定
			int[] array = new int[nIn];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < nIn; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//各要素の値を表示
			System.out.print("a");
			printArray(array);

			//配列aから削除する要素のインデックスを入力してもらう
			//0<=idx<array.lengthなので、それ以外は聞き直す
			int idxIn;
			do {
				System.out.print("配列aから削除するインデックス値：");
				idxIn = stdIn.nextInt();
				//エラーメッセージの表示
				if (idxIn < 0) {
					System.out.println("インデックスは0以上を入力してください。");
				}
				else if (idxIn >= array.length) {
					System.out.println("インデックスは要素数より小さい値を入力してください。");
				}
			} while (idxIn < 0 || idxIn >= array.length);

			//削除後の配列を表示
			aryRmv(array, idxIn);
			System.out.print("削除後a");
			printArray(array);

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

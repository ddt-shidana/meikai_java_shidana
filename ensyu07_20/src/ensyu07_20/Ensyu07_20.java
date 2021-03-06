/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-20 p251
 * 	配列の要素a[idx]にxを挿入するメソッドaryInsを作成せよ。
 *
 * パッケージ名:ensyu07_20
 * クラス名:Ensyu07_20
 * 作成日:2022/03/08
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_20;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_20 {

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

	//---------------------配列の要素a[idx]にxを挿入するメソッド--------------------//
	/*メソッド名：aryIns
	 */
	static int aryIns(int[] a, int idx, int x) {
		int aLength = a.length;
		for (int placeItr = aLength - 1; placeItr > idx; placeItr--) {
			a[placeItr] = a[placeItr - 1];
		}
		a[idx] = x;
		return 1;
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

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列要素a[idx]にxを挿入するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int eIn;
			//要素数e(>0)を入力してもらう
			do {
				System.out.print("\n要素数：");
				eIn = stdIn.nextInt();
				//e<=0だったときのエラーメッセージを表示
				if (eIn < 0) {
					System.out.println("0以上の整数を入力してください。");
				}
			} while (eIn < 0);

			//配列aを設定
			int[] array = new int[eIn];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < eIn; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//配列a要素を挿入するインデックスを入力してもらう
			int idxIn;
			//0<=idx<=eInなので、それ以外は聞き直す
			do {
				System.out.print("配列aに要素を挿入するインデックス値：");
				idxIn = stdIn.nextInt();
				//0より小さい場合のエラーメッセージの表示
				if (idxIn < 0) {
					System.out.println("インデックスは0以上を入力してください。");
				}
				//最終インデックス+1(要素数)より大きい場合のエラーメッセージを表示
				else if (idxIn > eIn) {
					System.out.println("インデックスは要素数以下の値を入力してください。");
				}
			} while (idxIn < 0 || idxIn > eIn);

			//挿入する要素の値x
			System.out.print("配列aに挿入する要素の値：");
			int xIn = stdIn.nextInt();


			//各要素の値を表示
			//ヘッダを表示
			System.out.print("a");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(array);

			//挿入後の配列を表示
			aryIns(array, idxIn, xIn);
			System.out.print("挿入後a");
			printArray(array);


		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

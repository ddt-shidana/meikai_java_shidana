/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-22 p257
 * 	配列aと同じ配列(要素数が同じで、すべての要素の値が同じ配列)を生成して返却するメソッドarrayCloneを作成せよ。
 *
 * パッケージ名:ensyu07_22
 * クラス名:Ensyu07_22
 * 作成日:2022/03/08
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_22;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_22 {

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

	//-----------------------------配列をクローンするメソッド---------------------------//
	/*メソッド名：printArray
	 */
	static int[] arrayClone(int[] a) {
		int[] arrayClone = new int[a.length];
		for (int idxItr = 0; idxItr < arrayClone.length; idxItr++) {
			arrayClone[idxItr] = a[idxItr];
		}
		return arrayClone;
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aを配列bにクローンするプログラムです。");

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

			//各要素の値を表示
			System.out.print("a");
			printArray(array);

			//クローン後の配列を表示
			System.out.println("クローンしました。");
			System.out.print("b");
			printArray(arrayClone(array));

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

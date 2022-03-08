/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-17 p251
 * 	探索するキーと同じ値の要素が複数個存在する場合、
 * 	最も末尾側に位置する要素を見つけるメソッドlinearSearchRを作成せよ。
 *
 * パッケージ名:ensyu07_17
 * クラス名:Ensyu07_17
 * 作成日:2022/03/07
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_17;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_17 {

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

	//-------配列aの要素からkeyと一致する最も末尾の要素を線形探索するメソッド-------//
	/*メソッド名：linearSearch
	 */
	static int linearSearchR(int[] a, int key) {
		//末尾から先頭に向かって線形探索
		for (int index = a.length - 1; index >= 0; index--) {
			//見つかったら
			if (a[index] == key) {
				//現在のインデックスを返却値とする
				return index;
			}
		}
			//最後まで走らせて見つからなかったら、-1を返却値とする
			return -1;
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aの全要素の合計を求めるプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int nIn;
			//要素数n(>0)を入力してもらう
			do {
				System.out.print("要素数：");
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
			System.out.print("a = {");
			for (int indexItr = 0; indexItr < nIn; indexItr++) {
				System.out.print(array[indexItr]);
				if(indexItr < nIn - 1)
					System.out.print(", ");
			}
			System.out.println("}");

			//探索するキーを入力してもらう
			System.out.print("探索値：");
			int keyInt = stdIn.nextInt();

			//キーが配列に無かった場合、linearSearchRは-1が返っているので、メッセージを表示
			if (linearSearchR(array, keyInt) == -1) {
				System.out.println("\tその値の要素は存在しません。");
			}
			else {
				System.out.println("\tその値は a[" + linearSearchR(array, keyInt) + "] にあります。");
			}

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/

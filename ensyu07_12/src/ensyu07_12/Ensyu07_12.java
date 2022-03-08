/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-12 p247
 * 	整数xを右にnビット回転した値を返すメソッドrRotateと、
 * 	左にnビット回転した値を返すメソッドlrotateを作成せよ。
 *
 * パッケージ名:ensyu07_12
 * クラス名:Ensyu07_12
 * 作成日:2022/03/07
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_12;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_12 {

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

	//-----------------------任意の値の配列を取得するメソッド-----------------------//
	/*メソッド名：getBitArray
	 */
	static int[] getBitArray(int x) {
		//要素数32のビット配列を格納する変数
		int[] getBitArray = new int[32];
		//画面に表示する場合左側から要素の値を格納していく
		for (int placeItr = 31; placeItr >= 0; placeItr--) {
			if ((x >>> placeItr & 1) == 1) {
				getBitArray[placeItr] = 1;
			}
			else if ((x >>> placeItr & 1) == 0) {
				getBitArray[placeItr] = 0;
			}
		}
		return getBitArray;
	}
	//------------------------------------------------------------------------------//

	//-----------------------ビット配列を値に変換するメソッド-----------------------//
	/*メソッド名：getBitArray
	 */
	static int arrayToValue(int[] xArray) {
		//ビット配列を値に変換
		int arrayToValue = 0;
		int exponent = 1;
		for (int placeItr = 0; placeItr <32; placeItr++) {
			if (xArray[placeItr] == 1) {
				arrayToValue += exponent;
		}
			exponent *= 2;
		}
		return arrayToValue;
	}
	//------------------------------------------------------------------------------//

	//------------------整数xを左にnビット回転した値を返すメソッド------------------//
	/*メソッド名：lRotate
	 */
	static int lRotate(int x, int n) {
		//xを左シフトした値を求める
		int lShiftX = x << n;
		//xを左シフトした値を配列に取得
		int[] lShiftBitX = getBitArray(lShiftX);
		//xの配列インデックス31～32-nの値を、xを左シフトした値の配列インデックスn-1～0の値に代入
		for (int placeItr = n - 1; placeItr >= 0; placeItr--) {
			lShiftBitX[placeItr] = getBitArray(x)[placeItr + 32 - n];
		}
		//ビット配列を値に変換したものを返却値とする。arrayToValueを呼び出して使用
		return arrayToValue(lShiftBitX);
	}
	//------------------------------------------------------------------------------//

	//------------------整数xを右にnビット回転した値を返すメソッド------------------//
	/*メソッド名：rRotate
	 */
	static int rRotate(int x, int n) {
		//xを右シフトした値を求める
		int rShiftX = x >>> n;
		//xを右シフトした値を配列に取得
		int[] rShiftBitX = getBitArray(rShiftX);
		//xの配列インデックスn-1～0の値を、xを右シフトした値の配列インデックス31～32-nの値に代入
		for (int placeItr = 31; placeItr >= 32 - n; placeItr--) {
			rShiftBitX[placeItr] = getBitArray(x)[placeItr - (32 - n)];
		}
		//ビット配列を値に変換したものを返却値とする。arrayToValueを呼び出して使用
		return arrayToValue(rShiftBitX);
	}
	//------------------------------------------------------------------------------//

	//--------------------2進数の頭を0埋めにして表示するメソッド--------------------//
	/*メソッド名：print02
	 */
	static void print02(int x) {
		for (int placeItr = 31; placeItr >= 0; placeItr--) {
			System.out.print(((x >>> placeItr & 1) == 1) ? '1' : '0');
		}
	}
	//------------------------------------------------------------------------------//

	//----------------------------------mainメソッド----------------------------------//
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("整数xを左右どちらかにnビットシフトさせた値と、");
		System.out.println("整数xを除算・乗算した値が等しいか確認するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			//指定する値を入力してもらう
			//シフトする整数値
			int xIn;
			//回転する方向
			int roundIn;

			System.out.print("\n整数x：");
			xIn = stdIn.nextInt();

			//回転する方向を入力してもらう（0と1以外は聞き直す）
			do {
				System.out.print("回転する方向は(左・・・0/右・・・1)：");
				roundIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示（0か1以外）
				if (roundIn != 0 && roundIn != 1) {
					System.out.println("0か1を入力してください。");
				}
			} while (roundIn != 0 && roundIn != 1);

			//回転するビット数n(n % 32 != 0 && n > 0)を入力してもらう
			int nIn;
			//（0以下は聞き直す）
			do {
				System.out.print("回転するビット数n(>0)：");
				nIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示(n>0)
				if (nIn <= 0) {
					System.out.println("正の値を入力してください。");
				}
			} while (nIn <= 0);

			//nInの値を32で割った剰余で取得
			int n = nIn % 32;

			//左回転か右回転かで分岐
			switch (roundIn) {
			//左回転
			case 0:
				System.out.println(xIn + "を" + nIn + "ビット左回転します。");
				System.out.println("\t入力値(10)で" + xIn);
				System.out.println("\t出力値(10)で" + lRotate(xIn, n) );
				System.out.print("\t入力値( 2)：");
				print02(xIn);
				System.out.print("\n\t出力値( 2)：");
				print02(lRotate(xIn, n));
				System.out.println("");
				break;
			//右回転
			case 1:
				System.out.println(xIn + "を" + nIn + "ビット右回転します。");
				System.out.println("\t入力値(10)：" + xIn);
				System.out.println("\t出力値(10)：" + rRotate(xIn, n) );
				System.out.print("\t入力値( 2)：");
				print02(xIn);
				System.out.print("\n\t出力値( 2)：");
				print02(rRotate(xIn, n));
				System.out.println("");
				break;
			}

		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/
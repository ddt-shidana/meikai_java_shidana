/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習7-14 p247
 * 	整数xのposビット目を最下位として連続するnビットを、
 * 	1にした値を返すメソッドsetN、
 * 	0にした値を返すメソッドresetN、
 * 	反転した値を返すメソッドinverseNを作成せよ。
 *
 * パッケージ名:ensyu07_14
 * クラス名:Ensyu07_14
 * 作成日:2022/03/07
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu07_14;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/***************************************クラス内容***************************************/
public class Ensyu07_14 {

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

	//------整数xのposビット目から連続したn個のビットを1にした値を返すメソッド------//
	/*メソッド名：setN
	 */
	static int setN(int x, int pos, int n) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int[] changeArray = getBitArray(x);
		//posビット目からn個のビットを1に変更
		for (int placeItr = pos; placeItr < pos + n; placeItr++) {
			changeArray[placeItr] = 1;
		}
		//変更後の配列を値になおす
		int setNX = arrayToValue(changeArray);
		return setNX;
	}
	//------------------------------------------------------------------------------//

	//------整数xのposビット目から連続したn個のビットを0にした値を返すメソッド------//
	/*メソッド名：reset
	 */
	static int resetN(int x, int pos, int n) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int[] changeArray = getBitArray(x);
		//posビット目からn個のビットを0に変更
		for (int placeItr = pos; placeItr < pos + n; placeItr++) {
			changeArray[placeItr] = 0;
		}
		//変更後の配列を値になおす
		int resetNX = arrayToValue(changeArray);
		return resetNX;
	}
	//------------------------------------------------------------------------------//

	//------整数xのposビット目から連続したn個のビットを反転した値を返すメソッド------//
	/*メソッド名：inverseN
	 */
	static int inverseN(int x, int pos, int n) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int[] changeArray = getBitArray(x);
		//posビット目からn個のビットを反転
		for (int placeItr = pos; placeItr < pos + n; placeItr++) {
			//posビット目が0の時
			if (changeArray[placeItr] == 0) {
				changeArray[placeItr] = 1;
			}
			//posビット目が1の時
			else {
				changeArray[placeItr] = 0;
			}
		}
		//変更後の配列を値になおす
		int inverseNX = arrayToValue(changeArray);
		return inverseNX;
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
		System.out.println("整数xのposビット目を最下位として連続するnビットを");
		System.out.println("0/1/反転した値を求めます。");

		//プログラムを再度実行するかの確認
		do {
			//使用する整数を入力してもらう
			int xIn;
			System.out.print("\n整数x：");
			xIn = stdIn.nextInt();

			//変更する要素のインデックス0<=pos<32の値を入力してもらう
			int posIn;
			//（0<=posIn<32外は聞き直す）
			do {
				System.out.print("pos（最下位から0,1,2…と数える）(0<=pos<32)：");
				posIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示(0<=posIn<32)
				if (posIn <= 0 || posIn >=32) {
					System.out.println("0<=pos<32の範囲の整数値を入力してください。");
				}
			} while (posIn < 0 || posIn >= 32);

			//変更する連続ビット数n(0<n<=32-pos)を入力してもらう
			int nIn;
			//（0<n<=32-pos外は聞き直す）
			do {
				System.out.print("変更する連続ビット数n(0<n<=32-pos)：");
				nIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示(0<n<=32-pos)
				if (nIn <= 0 || nIn > 32 - posIn) {
					System.out.println("0<n<=32-posの範囲の整数値を入力してください。");
				}
			} while (nIn <= 0 || nIn > 32 - posIn);

			//結果を表示
			System.out.println("変換結果です。");
			System.out.println("\t＜10進数で表示＞");
			System.out.println("\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを1にした値：  " + setN(xIn, posIn, nIn) + " です。");
			System.out.println("\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを0にした値：  " + resetN(xIn, posIn, nIn) + " です。");
			System.out.println("\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを反転した値： " + inverseN(xIn, posIn, nIn) + " です。");

			System.out.println("\t＜ 2進数で表示＞");
			System.out.print("\t " + xIn + "（入力値）：                              ");
			print02(xIn);
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを1にした値：  ");
			print02(setN(xIn, posIn, nIn));
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを1にした値：  ");
			print02(resetN(xIn, posIn, nIn));
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目から" + nIn + "個のビットを反転した値： ");
			print02(inverseN(xIn, posIn, nIn));
			System.out.println("");
		} while (confirmRetry());

	}
	//--------------------------------------------------------------------------------//

}
/**************************************************************************************/
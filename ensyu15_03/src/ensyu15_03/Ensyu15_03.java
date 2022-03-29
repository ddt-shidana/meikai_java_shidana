/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-3 p489
 * 	文字列探索のプログラムを書きかえて、右のように表示するプログラムを作成せよ。
 * 	一致する部分が上下で揃うように表示すること。
 *
 * パッケージ名:ensyu15_03
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_03;

//Scannerクラスを単純名で使用できるようにインポート
import java.util.Scanner;

//===================== メインクラス =====================//
/**
* 概要：	文字列を読み込んで、その全文字の文字コードを表示するプログラム。
*/
public class Ensyu15_03 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	/**
	 * 全角文字は２桁、半角文字は１桁として文字数をカウントする
	 * @param str 対象文字列
	 * @return ret 文字数
	 * @see https://blog.java-reference.com/common-get-zen2han1/
	 */
	public static boolean isHalfSize(char ch) {
	  //chの文字列表現のバイトシーケンスの長さが1以下のとき
	  if(String.valueOf(ch).getBytes().length <= 1){
		  //半角のときtrue
		  return true;
	  }
	  else{
		  //全角のときfalse
		  return false;
	  }
	}

	//----- mainメソッド -----//
	public static void main(String[] args) {
		//探索される側の文字列をきく
		System.out.print("文字列s1：");
		//入力された文字列を、変数s1に参照させる
		String s1 = stdIn.next();

		//探索するキーの文字列をきく
		System.out.print("文字列s2：");
		//入力された文字列を、変数s2に参照させる
		String s2 = stdIn.next();

		/* 以下の値を変数idxに代入
		 * s1にs2が含まれて
		 * 		いないときの返却値： -1
		 * 		いるときの返却値：	含まれている文字列の位置する先頭のインデックス
		 */
		int idx = s1.indexOf(s2);

		//含まれていないとき
		if (idx == -1) {
			//含まれていないことをメッセージ表示
			System.out.println("s1はs2に含まれていません。");
		}
		//含まれているとき
		else {
			//s1の表示
			System.out.println("s1：" + s1);
			//s2の表示
			//ヘッダ
			System.out.print("s2：" );
			//キーも文字列がある開始インデックスが1以上の場合
			if (idx > 0) {
				//idxのインデックス位置までスペース表示を繰り返す
				for (int skipTime = 0; skipTime < idx; skipTime++) {
					//該当インデックスの文字が半角のとき
					if(isHalfSize(s1.charAt(skipTime))) {
						//半角文字分のスペース：空白リテラルの表示
						System.out.print(' ');
					}
					//該当インデックスの文字が全角のとき
					else {
						//全角文字分のスペース：空白リテラル2つの文字列の表示
						System.out.print("  ");
					}
				}
				//キーの文字列の表示して、改行
				System.out.println(s2);
			}
		}
	}
}

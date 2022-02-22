package ensyu3_09;		//演習3-9　p71

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_09 {	//クラス宣言:Ensyu3_09

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数A:");		//コメント出力「整数A:」
		int a = stdIn.nextInt();		//int変数aにstdInを初期設定
		System.out.println ("整数B:");		//コメント出力「整数B:」
		int b = stdIn.nextInt();		//int変数aにstdInを初期設定

		//aとbを比較して、大きい方の値をコメント出力「大きい方の値は～です。」
		System.out.println("大きい方の値は" + (a > b ? a : b) + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

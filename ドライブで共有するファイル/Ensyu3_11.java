package ensyu3_11;		//演習3-11　p71

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_11 {	//クラス宣言:Ensyu3_11

	public static void main(String[] args) {
		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数A:");		//コメント出力「整数A:」
		int a = stdIn.nextInt();		//int変数aにstdInを初期設定
		System.out.println ("整数B:");		//コメント出力「整数B:」
		int b = stdIn.nextInt();		//int変数aにstdInを初期設定

		int max = (a < b ? b : a);		//int変数maxに整数AとBで大きい方の値を初期設定
		int min = (a < b ? a : b);		//int変数minに整数AとBで小さい方の値を初期設定

		//2数の差が10以下か11以上かを判定して、結果を表示させる
		/*2数の差が10以下の場合、
		 * 	コメント出力「それらの差は10以下です。」
		 */
		if ((max - min) <= 10)
			System.out.println("それらの差は10以下です。");
		/*2数の差が11以上の場合、
		 * 	コメント出力「それらの差は11以上です。」
		 */
		else //if ((max - min) >= 11)
			System.out.println("それらの差は11以上です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

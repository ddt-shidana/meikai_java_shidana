package ensyu3_10;		//演習3-10　p71

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_10 {	//クラス宣言:Ensyu3_10

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数A:");		//コメント出力「整数A:」
		int a = stdIn.nextInt();		//int変数aにstdInを初期設定
		System.out.println ("整数B:");		//コメント出力「整数B:」
		int b = stdIn.nextInt();		//int変数aにstdInを初期設定

		int max = (a < b ? b : a);		//int変数maxに整数AとBで大きい方の値を初期設定
		int min = (a < b ? a : b);		//int変数minに整数AとBで小さい方の値を初期設定

		//コメント出力「二数の差は～です。」
		System.out.println("二数の差は" + (max - min) + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

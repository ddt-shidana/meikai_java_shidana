package ensyu3_02;		//演習3-2　p59

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_02 {	//クラス宣言:Ensyu3_02

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数A:");		//コメント出力「整数A：」
		int a = stdIn.nextInt();				//int型変数aにstdInを初期設定
		System.out.println ("整数B:");		//コメント出力「整数B：」
		int b = stdIn.nextInt();				//int型変数bにstdInを初期設定

		//aがbで割り切れるかどうかで条件分岐
		/*aがbで割り切れるとき
		 	コメント出力「BはAの約数です。」*/
		if (a % b == 0)
			System.out.println("BはAの約数です。");
		/*aがbで割り切れないとき
	 		コメント出力「BはAの約数ではありません。」*/
		else
			System.out.println("BはAの約数ではありません。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

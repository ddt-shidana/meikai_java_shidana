package ensyu3_06;		//演習3-6　p61

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_06 {	//クラス宣言:Ensyu3_06

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("正の整数値n:");		//コメント出力「正の整数値n:」
		int n = stdIn.nextInt();		//int変数nにstdInを初期設定

		//nが10の倍数かどうかを調べて結果を表示させる
		if (n > 0)		//nが正のとき10の倍数かどうかを調べる
			/*nを10で割った剰余が0のとき
			 * 	コメント出力「その値は10の倍数です。」*/
			if (n % 10 == 0)
				System.out.println("その値は10の倍数です。");
			/*nを10で割った剰余が0のとき
			 * 	コメント出力「その値は10の倍数です。」*/
			else
				System.out.println("その値は10の倍数ではありません。");
		else		//nが負の時コメント出力「正ではない値が入力されました。」
			System.out.println("正ではない値が入力されました。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

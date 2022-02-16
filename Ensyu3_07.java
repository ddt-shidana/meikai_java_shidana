package ensyu3_07;		//演習3-7　p61

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_07 {	//クラス宣言:Ensyu3_07

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("正の整数値n:");		//コメント出力「正の整数値n:」
		int n = stdIn.nextInt();		//int変数nにstdInを初期設定

		//nを3で割ったとき、割り切れるか、余りはいくらかを調べて表示させる
		if (n > 0)		//nが正の場合のみ3で割る
			/*nが3で割り切れる（剰余0）のとき
			 * 	コメント出力「その値は3で割り切れます。」*/
			if (n % 3 == 0)
				System.out.println("その値は3で割り切れます。");
			/*nを3で割った剰余が1のとき
			 * 	コメント出力「その値を3で割った余りは1です。」*/
			else if (n % 3 ==1)
				System.out.println("その値を3で割った余りは1です。");
		/*nを3で割った剰余が2のとき
		 * 	コメント出力「その値を3で割った余りは2です。」*/
			else if (n % 3 ==2)
				System.out.println("その値を3で割った余りは2です。");
		else			//nが正ではないときコメント出力「正ではない値が入力されました。」
			System.out.println("正ではない値が入力されました。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

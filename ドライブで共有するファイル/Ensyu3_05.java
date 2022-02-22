package ensyu3_05;		//演習3-5　p61

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_05 {	//クラス宣言:Ensyu3_05

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("正の整数値n:");		//コメント出力「正の整数値n」
		int n = stdIn.nextInt();		//int変数nにstdInを初期設定

		//nが5で割り切れるかどうかを調べて結果を表示する
		if (n > 0)		//nが正のとき5で割り切れるかどうかを調べる
			/*nを5で割った剰余が0のとき
			 * 	コメント出力「その値は5で割り切れます。 */
			if (n % 5 == 0)
				System.out.println("その値は5で割り切れます。");
			/*nを5で割った剰余が0以外のとき
			 * 	コメント出力「その値は5で割り切れません。 */
			else
				System.out.println("その値は5で割り切れません。");
		else		//nが負の時コメント出力「正ではない値が入力されました。」
			System.out.println("正ではない値が入力されました。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

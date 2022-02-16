package ensyu3_04;		//演習3-4　p61

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_04 {	//クラス宣言:Ensyu3_04

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数a:");		//コメント出力「整数a：」
		int a = stdIn.nextInt();	//int変数aにstdInを初期設定
		System.out.println ("整数b:");		//コメント出力「整数b：」
		int b = stdIn.nextInt();	//int変数bにstdInを初期設定

		//とbの大小比較をして結果をメッセージで表示
		/*aがbより大きいとき、
		 * 	コメント出力「aの方が大きいです。」*/
		if (a > b)
			System.out.println("aの方が大きいです。");
		/*bがaより大きいとき、
		 * 	コメント出力「bの方が大きいです。」*/
		else if (a < b)
			System.out.println("bの方が大きいです。");
		/*aとbが同値のとき、
		 * 	コメント出力「aとbは同じ値です。」*/
		else if (a == b)
			System.out.println("aとbは同じ値です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

package ensyu2_3;	//演習2-3　p40

import java.util.Scanner;	//キーボードからの入力値取得準備

public class Ensyu2_3 {	//クラス宣言:Ensyu2_3

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner(System.in);	//stdInに入力値の取得

		System.out.println ("整数値:");		//コメント出力:整数値は～
		int z = stdIn.nextInt();	//int変数宣言：zの初期値に入力値を設定

		System.out.println (z + "と入力しましたね。");	//コメント出力：～と入力しましたね。

		stdIn.close();		//scannerのインスタンスをクローズ

	}

}

package ensyu2_4;	//演習2-4　p40

import java.util.Scanner;	//キーボードからの入力値取得準備

public class Ensyu2_04 {	//クラス宣言:Ensyu2_4

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);	//stdInに入力値の取得

		System.out.println ("整数値:");		//コメント出力:整数値は～
		int a = stdIn.nextInt();	//int変数宣言：aの初期値に入力値を設定

		//コメント出力:入力値に10を加えた値を表示
		System.out.println ("10を加えた値は" + (a + 10) + "です。");
		//コメント出力:入力値に10を減じた値を表示
		System.out.println ("10を減じた値は" + (a - 10) + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

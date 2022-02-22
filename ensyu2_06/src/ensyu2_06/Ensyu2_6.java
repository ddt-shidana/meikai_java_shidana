package ensyu2_06;	//演習2-6　p41

import java.util.Scanner;	//キーボードからの入力値取得準備

public class Ensyu2_6 {	//クラス宣言:Ensyu2_6

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);	//stdInに入力値の取得

		System.out.println ("三角形の面積を求めます。");	//コメント出力:三角形の面積を求めます。

		System.out.println ("底辺:");			//コメント出力:底辺～
		double buttom = stdIn.nextDouble();	//浮動小数点型buttomへ入力値を取得
		System.out.println ("高さ:");			//コメント出力:高さ～
		double height = stdIn.nextDouble();	//浮動小数点型heightへ入力値を取得

		//コメント出力:三角形の面積を計算して表示
		System.out.println ("面積は" + (buttom * height) / 2 + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

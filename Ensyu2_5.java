package ensyu2_5;	//演習2-5　p41

import java.util.Scanner;	//キーボードからの入力値取得準備

public class Ensyu2_5 {	//クラス宣言:Ensyu2_5

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);	//stdInに入力値の取得

		System.out.println ("xの値:");		//コメント出力:xの値は～
		double x = stdIn.nextDouble();		//浮動小数点型xへ入力値を取得
		System.out.println ("yの値:");		//コメント出力:yの値は～
		double y = stdIn.nextDouble();		//浮動小数点型yへ入力値を取得

		//コメント出力:xとyの合計値を表示
		System.out.println ("合計は" + (x + y) + "です。");
		//コメント出力:xとyの平均値を表示
		System.out.println ("平均は" + (x + y) / 2 + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

package ensyu2_08;	//演習2-8　p45

import java.util.Random;	//乱数取得準備
import java.util.Scanner;	//キーボードからの入力値取得準備

public class Ensyu2_08 {	//クラス宣言:Ensyu2_08

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner(System.in);	//stdInに入力値の取得
		Random rand = new Random();		//randに乱数の取得

		System.out.println ("整数値:");		//コメント出力：整数値は～

		//randnam4に入力値stdIn＋10の乱数を取得
		int randNum4 = rand.nextInt(stdIn.nextInt() + 10);

		//コメント出力：その値の±5の乱数を生成しました。それは (randNum4 - 5) です。
		System.out.println("その値の±5の乱数を生成しました。それは" + (randNum4 - 5) + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

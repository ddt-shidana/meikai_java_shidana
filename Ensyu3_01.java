package ensyu3_01;		//演習3-1　p59

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_01 {	//クラス宣言:Ensyu3_01

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("整数値:");		//コメント出力：整数値：
		int z = stdIn.nextInt();			//int変数zにstdInを設定

		//zが0未満か、0以上で条件分岐
		/*zが0未満のとき
			コメント出力「絶対値は-zです。」*/
		if (z < 0)
			System.out.println("その絶対値は" + (-z) + "です。");
		/*zが0以上のとき
			コメント出力「絶対値はzです。」*/
		else
			System.out.println("その絶対値は" + z + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}

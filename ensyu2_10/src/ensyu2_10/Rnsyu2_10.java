package ensyu2_10;		//演習2-10　p47

import java.util.Scanner;	//乱数取得準備

public class Rnsyu2_10 {	//クラス宣言:Ensyu2_10

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdSt = new Scanner (System.in);	//stStに入力値の取得

		System.out.println ("姓:");		//コメント出力：姓：～
		String s = stdSt.next();		//文字列sに入力値を設定

		System.out.println ("名:");		//コメント出力：名：～
		String m = stdSt.next();		//文字列mに入力値を設定

		//コメント出力：こんにちは～～さん。
		System.out.println ("こんにちは" + s + m + "さん。");

		stdSt.close();		//scannerのインスタンスをクローズ
	}

}
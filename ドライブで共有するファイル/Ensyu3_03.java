package ensyu3_03;		//演習3-3　p59

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_03 {	//クラス宣言:Ensyu3_03

	public static void main(String[] args) {		//ここからmainメソッド
		//list3-5の最後のelseをelse if(n==0)に変更
		Scanner stdIn = new Scanner (System.in);

		System.out.println ("整数値:");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");

		stdIn.close();		//scannerのインスタンスをクローズ
	}

}
//変更しても変わらないことを確認
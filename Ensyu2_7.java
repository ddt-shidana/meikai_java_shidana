package ensyu2_7;	//演習2-7　p44

import java.util.Random;	//乱数取得準備

public class Ensyu2_7 {	//クラス宣言:Ensyu2_7

	public static void main(String[] args) {		//ここからmainメソッド
		Random rand = new Random();			//randに乱数の取得

		int randNum1 = rand.nextInt(10);			//1桁の正の整数値で乱数作成
		int randNum2 = - rand.nextInt(10);			//1桁の負の整数値で乱数作成
		int randNum3 = rand.nextInt(90) + 10;		//2桁の正の整数値で乱数作成

		System.out.println (randNum1);		//コメント出力：randNam1
		System.out.println (randNum2);		//コメント出力：randNam2
		System.out.println (randNum3);		//コメント出力：randNam3
	}

}

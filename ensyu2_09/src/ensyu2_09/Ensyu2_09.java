package ensyu2_09;	//演習2-9　p45

import java.util.Random;	//乱数取得準備

public class Ensyu2_09 {	//クラス宣言:Ensyu2_09

	public static void main(String[] args) {		//ここからmainメソッド
		Random rand = new Random();

		double randNum5 = rand.nextDouble();				//randNum5に乱数取得：0.0以上1.0未満
		double randNum6 = rand.nextDouble() * 10;		//randNum6に乱数取得：0.0以上10.0未満
		double randNum7 = rand.nextDouble() * 2 - 1.0;		//randNum7に乱数取得：-1.0以上1.0未満

		System.out.println (randNum5);		//コメント出力：randNam5
		System.out.println (randNum6);		//コメント出力：randNam6
		System.out.println (randNum7);		//コメント出力：randNam7
	}

}

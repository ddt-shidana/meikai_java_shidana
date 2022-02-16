package ensyu3_08;		//演習3-8　p69

import java.util.Scanner;	//乱数取得準備

public class Ensyu3_08 {	//クラス宣言:Ensyu3_08

	public static void main(String[] args) {		//ここからmainメソッド
		Scanner stdIn = new Scanner (System.in);		//stdInに入力値の取得

		System.out.println ("点数:");		//コメント出力「点数:」
		int score = stdIn.nextInt();		//int変数scoreにstdInを初期設定

		//0～100点で優/良/可/不可を判定する

		/*入力した点数が0～100に収まっていない場合
		 * コメント出力「点数は0～100点で入力してください。」
		 */
		if (score < 0 || score > 100)
			System.out.println("点数は0～100点で入力してください。");

		//入力した点数が0～100の場合、4段階で判定
		else
			/*scoreが0～59のとき
			 * コメント出力「不可」
			 */
			if (score >=0 && score < 60)
				System.out.println ("不可");
			/*scoreが60～69のとき
			 * コメント出力「可」
			 */
			else if (score >=60 && score < 70)
				System.out.println ("可");
			/*scoreが70～79のとき
			 * コメント出力「良」
			 */
			else if (score >=70 && score < 80)
				System.out.println ("良");
			/*scoreが80～100のとき
			 * コメント出力「優」
			 */
			else
				System.out.println ("優");

			stdIn.close();		//scannerのインスタンスをクローズ
	}

}

package ensyu3_12;		//演習3-12　p73

import java.util.Scanner;	//クラスScannerをインポート

public class Ensyu3_12 {	//クラス宣言:Ensyu3_12

	public static void main(String[] args) {
		//ここからmainメソッド
		//Scannerクラスのインスタンス"stdIn"を作成
		Scanner stdIn = new Scanner (System.in);

		//「整数値を3つ入力してください」と画面表示させる
		System.out.println("整数値を3つ入力してください。");
		int z1 = stdIn.nextInt();		//int変数z1にstdInから取り出して、初期設定
		int z2 = stdIn.nextInt();		//int変数z2にstdInから取り出して、初期設定
		int z3 = stdIn.nextInt();		//int変数z3にstdInから取り出して、初期設定

		//3つの整数値から最小値を求める
		int min = z1;		//z1を最小値minに初期設定
		if (z2 < min) min = z2;		//現在のminよりz2が小さいならば、minにz2を代入
		if (z3 < min) min = z3;		//現在のminよりz3が小さいならば、minにz3を代入

		//「3つの整数値の最小値は minです。」と画面表示させる
		System.out.println("3つの整数値の最小値は" + min + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();
	}

}

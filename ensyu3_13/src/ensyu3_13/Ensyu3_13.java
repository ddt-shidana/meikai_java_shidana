/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-13 p73
 * 	キーボードから読み込んだ三つの整数値の中央値を求めて
 * 	表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_13
 * クラス名:Ensyu3_13
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu3_13;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu3_13 {
//ここからクラスの内容です。

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		////使用者がわかりやすいようにナビで
		//「整数値を3つ入力してください」と画面表示させる
		System.out.println("整数値を3つ入力してください。");

		//整数型変数z1,z2,z3を用意し、入力値(stdIn)を初期設定
		//入力値の型が整数型よりも大きい箱の場合、エラーになります。
		int z1 = stdIn.nextInt();
		int z2 = stdIn.nextInt();
		int z3 = stdIn.nextInt();

		//3つの整数値から最小値を求める
		//z1を最小値minに初期設定
		int min = z1;
		//現在のminよりz2が小さいならば、minにz2を代入
		if (z2 < min) min = z2;
		//現在のminよりz3が小さいならば、minにz3を代入
		if (z3 < min) min = z3;

		//3つの整数値から最大値を求める
		//z1を最大値maxに初期設定
		int max = z1;
		//現在のmaxよりz2が大きいならば、maxにz2を代入
		if (z2 > max) max = z2;
		//現在のmaxよりz3が大きいならば、maxにz3を代入
		if (z3 > max) max = z3;

		//3つの整数値でmin.maxと一致しない中央値mediumを求める

		/*没 ※push前の物です
		int medium = z1;		//int型変数mediumを用意
		if (z1 != min && z1 != max) medium = z1;
		if (z2 != min && z2 != max) medium = z2;
		if (z3 != min && z3 != max) medium = z3;
		*/

		//z1を中央値mediumに初期設定
		int medium = z1;
		//z1が最小値または最大値だった場合
			//z2が最小値または最大値だった時、中央値はz3
			//z2が最小値でも最大値でもない時、中央値はz2
		if (z1 == min || z1 == max)
			if (z2 == min || z2 == max) medium = z3;
			else medium = z2;
		//(z1は最小値でも最大値でもない時)
		//z2が最小値または最大値だった場合、中央値はz3
		else if (z2 == min || z2 == max) medium = z3;
		//(z1もz2も最小値でも最大値でもないとき)、中央値はz1
		else medium = z1;

		//3つの整数値の中央値(medium)を画面表示させる。
		System.out.println("3つの整数値の中央値は" + medium + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}
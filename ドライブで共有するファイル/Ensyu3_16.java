/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-16 p77
 * 	三つの整数値を読み込んで昇順にソートするプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_16
 * クラス名:Ensyu3_16
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu3_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu3_16 {
//ここからクラス内容
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

		//z1>z2のとき値入れ替え
		//z2>z3のとき値入れ替えをし、z1>z2かどうか再度比較しTRUEなら入れ替え
		//値の入れ替えをする時に使う変数tを、if文の中で用意し、
		//初期値t1,t2を設定しておく。
		if (z1 > z2) {
			int t1 = z1;
			z1 = z2;
			z2 = t1;
		}
		if (z2 > z3) {
			int t2 = z2;
			z2 = z3;
			z3 = t2;

			if (z1 > z2) {
				int t1 = z1;
				z1 = z2;
				z2 = t1;
			}
		}

		//入力した3つの整数値を昇順（z1<=z2<=z3）で画面表示させる
		System.out.println("昇順にソートしました。\n" + z1 + "\n" + z2 + "\n" + z3);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}

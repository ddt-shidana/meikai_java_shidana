/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-14 p77
 * 	二つの整数値を読み込んで、
 * 	小さい方の値と大きい方の値の両方を表示するプログラムを作成せよ。
 * 	ただし、二つの整数値が等しい場合は、
 * 「二つの値は同じです。」と表示すること。
 *
 * パッケージ名:ensyu3_14
 * クラス名:Ensyu3_14
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu3_14;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		////使用者がわかりやすいようにナビで
		//「整数a:」「整数b:」と画面表示させる
		//整数型変数zmax(整数a),zmin(整数b)を用意し、入力値(stdIn)を初期設定
		//入力値の型が整数型よりも大きい箱の場合、エラーになります。
		System.out.println("整数a:");	int zmax = stdIn.nextInt();
		System.out.println("整数b:");	int zmin = stdIn.nextInt();

		//zmax>zminになるように、値の大小比較をし、
		//zmax<zminになっていた場合は、値を入れ替える。
		//値の入れ替えをする時に使う変数tを、if文の中で用意し、
		//初期値tを設定しておく。
		if (zmax < zmin) {
			int t = zmax;
			zmax = zmin;
			zmin = t;
		}

		//二つの整数が同値の場合、「二つの値は同じです。」と画面表示させる
		if (zmax == zmin)
			System.out.println("二つの値は同じです。");
		//二つの整数値が異なる場合、最大値と最小値を画面表示させる。
		else
			System.out.println("小さい方の値は" + zmin +
							   "で、大きい方の値は" + zmax + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラス内容ここまで
}
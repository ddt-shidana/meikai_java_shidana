/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-15 p77
 * 	二つの整数値を読み込んで降順にソートするプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_15
 * クラス名:Ensyu3_15
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu3_15;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu3_15 {

	public static void main(String[] args) {
		//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		////使用者がわかりやすいようにナビで
		//「整数値を2つ入力してください」と画面表示させる
		System.out.println("整数値を2つ入力してください。");

		//整数型変数z1,z2を用意し、入力値(stdIn)を初期設定
		//入力値の型が整数型よりも大きい箱の場合、エラーになります。
		int z1 = stdIn.nextInt();
		int z2 = stdIn.nextInt();

		//z1>z2になるように、値の大小比較をし、
		//z1<z2になっていた場合は、値を入れ替える。
		//値の入れ替えをする時に使う変数tを、if文の中で用意し、
		//初期値tを設定しておく。
		if (z1 < z2) {
			int t = z1;
			z1 = z2;
			z2 = t;
		}

		//入力した2つの整数値を降順（z1>=z2）で画面表示させる
		System.out.println("降順にソートしました。\n" + z1 + "\n" + z2);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラス内容ここまで
}
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-8 p45
 * 	キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値を
 * 	ランダムに生成して表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu2_08
 * クラス名:Ensyu2_08
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu2_08;

//乱数を生成する準備のためimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu2_08 {
//ここからクラス内容

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//randに乱数を初期設定
		Random rand = new Random();

		////使用者がわかりやすいようにナビで
		//「整数値：」と画面表示させる
		System.out.println ("整数値:");

		//整数型変数randnam4を用意して、入力値(stdIn)＋10の乱数値を初期設定
		int randNum4 = rand.nextInt(stdIn.nextInt() + 10);

		//入力値±5(randNum4 - 5) の値を画面表示させる
		System.out.println("その値の±5の乱数を生成しました。それは" + (randNum4 - 5) + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}

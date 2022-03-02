/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-4 p40
 * 	キーボードから読み込んだ整数値に10を加えた値と10を減じた値を
 * 	出力するプログラムを作成せよ。
 *
 * パッケージ名:ensyu2_04
 * クラス名:Ensyu2_04
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu2_4;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu2_04 {
//ここからクラスの内容です。

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//使用者がわかりやすいようにナビで「整数値:」と画面表示させる
		System.out.println ("整数値:");

		//整数型変数aを用意し、stdInを初期設定
		//入力値が整数値よりも大きい箱の場合、エラーになります。
		int a = stdIn.nextInt();

		//キーボードから読み込んだ整数値(stdIn=z)に10を加えた値を画面表示させる
		System.out.println ("10を加えた値は" + (a + 10) + "です。");

		//キーボードから読み込んだ整数値(stdIn=z)に10を減じた値を画面表示させる
		System.out.println ("10を減じた値は" + (a - 10) + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

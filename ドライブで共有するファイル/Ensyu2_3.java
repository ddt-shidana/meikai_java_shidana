/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-3 p40
 * 	キーボードから読み込んだ整数値をそのまま反復して
 * 	表示するプログラムを作成せよ。

 * パッケージ名:ensyu2_03
 * クラス名:Ensyu2_03
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu2_3;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu2_3 {
//ここからクラスの内容です

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//使用者がわかりやすいようにナビで「整数値:」と画面表示させる
		System.out.println ("整数値:");

		//整数型変数zを用意し、stdInを初期設定
		//入力値が整数値よりも大きい箱の場合、エラーになります。
		int z = stdIn.nextInt();

		//キーボードから読み込んだ整数値(stdIn=z)を画面表示させる。
		System.out.println (z + "と入力しましたね。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-1 p95
 * 	読み込んだ整数値の符号を判定するList3-5のプログラムを好きなだけ何度でも
 * 	繰り返して入力・表示できるようにしたプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_01
 * クラス名:Ensyu04_01
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_01 {
//ここからクラス内容

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//doメソッドの処理を繰り返すかどうかの判定用に、整数型変数retryNumを用意
		int retryNum;

		do {
		//ここからdoメソッド
			//使用者がわかりやすいようにナビで「整数値:」と画面表示させる
			System.out.println ("\n整数値:");

			//整数型変数intを用意して、入力値を初期設定
			int n = stdIn.nextInt();

			//入力値nが正か負か0かを判定して、結果を画面表示させる。
			if ( n > 0 )
				System.out.println("その値は正です。");
			else if ( n < 0 )
				System.out.println("その値は負です。");
			else
				System.out.println("その値は0です。");

			//再度判定を行うかどうかの確認メッセージを画面表示させる
			//1:Yes 0:No
			System.out.println("\nもう一度判定しますか？");
			System.out.println("1・・・Yes/0・・・No");

			//用意しておいたretryNumに入力値を初期設定
			retryNum = stdIn.nextInt();

		//ここまでdoメソッド
		}
		//入力値が1の時、doメソッドを繰り返す
		while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでがmainメソッド
	}

//クラス内容ここまで
}

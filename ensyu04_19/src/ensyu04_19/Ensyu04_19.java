/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-19 p125
 * 	季節を求めるList4-1の月の読み込みにおいて、
 * 	1～12以外の値が入力された場合は、再入力させるように
 * 	修正したプログラムを作成せよ（do文の中にdo文が入る二重ループとなる）。
 *
 * パッケージ名:ensyu04_19
 * クラス名:Ensyu04_19
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_19;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_19 {

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//整数型変数retryNumを用意
		int retryNum;

		//ここからdoメソッド：一度判定を完了した時、再度判定するかどうかでループさせる
		do {
		//整数型変数monthを用意しておく（内部のdoと外部のdoで共通）
		int month;

			//ここからdoメソッド：入力値が1～12以外の場合再入力させる
			do {
				//季節を求めるプログラム開始のメッセージを画面表示させる
				System.out.println ("季節を求めます。\n何月ですか：");

				//monthに入力値を代入
				month  = stdIn.nextInt();

				if (month >= 3 && month <= 5)
					System.out.println("それは春です。");
				else if (month >=6  && month <= 8)
					System.out.println("それは夏です。");
				else if (month >=9  && month <= 11)
					System.out.println("それは秋です。");
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("それは冬です。");

			} while (month < 1 || month > 12);

			//再度判定を行うかどうかの確認メッセージを画面表示させる
			//1:Yes 0:No
			System.out.println("\nもう一度？");
			System.out.println("1・・・Yes/0・・・No");

			//retryNumに入力値を初期設定
			retryNum = stdIn.nextInt();

		//doメソッドここまで
		} while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでがmainメソッド
	}

//クラス内容ここまで
}

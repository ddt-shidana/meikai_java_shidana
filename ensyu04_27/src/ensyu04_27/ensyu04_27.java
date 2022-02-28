/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-27 p132
 * 	List4-3の数当てゲームのプレイヤーが入力できる回数に制限を設けたプログラムを作成せよ。
 * 	制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 *
 * パッケージ名:ensyu04_27
 * クラス名:Ensyu04_27
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_27;

//乱数取得準備のためimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class ensyu04_27 {

	public static void main(String[] args) {
	//ここからmainメソッド

		//ゲーム開始の合図
		System.out.println("数当てゲーム開始！！");

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//0～99の中から乱数を生成しておく
			int no = rand.nextInt(100);

			//ルール説明
			System.out.println("0～99のどれかの数を5回以内に当ててください");

			//入力値を格納する変数を用意
			int x;

			Outer:
				for (int i = 1; i <= 5; i++) {
					//数当て挑戦回数を表示させる
					System.out.print("いくつかな？(" + i + "回目）:");
					//xに入力値を代入する
					x = stdIn.nextInt();

					//入力値が小さかった場合
					if (x > no) {
						//5回以内に正解できなければ正解を表示させ、ゲーム終了
						if (i == 5) {
							System.out.println("残念！ 正解は・・・" + no + "でした。");
							break Outer;
						}
						System.out.println("もっと小さな数だよ。");
						continue Outer;
					}
					//入力値が大きかった場合
					else if (x < no) {
						//5回以内に正解できなければ正解を表示させ、ゲーム終了
						if (i == 5) {
							System.out.println("残念！ 正解は・・・" + no + "でした。");
							break Outer;
						}
						System.out.println("もっと大きな数だよ。");
						continue Outer;
					}

					//生成した乱数と入力値が同じだった場合
					System.out.println("正解です。");
					break Outer;
				}

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("数当てゲームを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}
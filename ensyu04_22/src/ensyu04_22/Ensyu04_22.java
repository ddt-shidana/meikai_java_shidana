/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-22 p125
 * 	n段のピラミッドを表示するプログラムを作成せよ。
 * 	第i行目には（i - 1）* 2 + 1個の'*'記号を表示して、
 * 	最終行である第n行目には（n - 1）* 2 + 1個の'*'記号を表示すること。
 *
 * パッケージ名:ensyu04_22
 * クラス名:Ensyu04_22
 * 作成日:2022/02/25
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_22;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_22 {

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//ピラミッド作成プログラムの開始メッセージを画面表示させる
		System.out.println("n段のピラミッドを作成します。");

		//段数n(n>0)変数を用意
		int n;

		//nが0以下のとき、図形が作成できない為、聞き直す
		do {
			//段数nを聞く
			System.out.println("正の整数n:");
			n = stdIn.nextInt();
		} while (n <= 0);

		//縦：改行させる
		//verticalを用意。初期値…1、ループ終わり…n、処理…1ずつ増やす
		for (int vertical = 1; vertical <= n; vertical++) {
			//横スペース左：スペースを設ける
			//besideSLを用意。初期値…1、ループ終わり…(n-vertical)。処理…1ずつ増やす
			for (int besideSL = 1; besideSL <= (n-vertical); besideSL++) {
				System.out.print("  ");
			}

			//横メイン：'*'を表示させる
			//besideを用意。初期値…1、ループ終わり(vertical-1)*2+1)、処理…1ずつ増やす
			for (int beside = 1; beside <= ((vertical-1)*2+1); beside++) {
				System.out.print('*');
				//ただし2文字以上並ぶとき、並べる感覚をそろえる為にスペースを追加する
				if (vertical >= 2)
					System.out.print(" ");
			}
			//横スペース右：スペースを設ける
			//besideSLを用意。初期値…1、ループ終わり…(n-vertical)。処理…1ずつ増やす
			for (int besideSL = 1; besideSL <= (n-vertical); besideSL++) {
				System.out.print("  ");
				//ただし2文字以上並ぶとき、並べる感覚をそろえる為にスペースを追加する
				if (vertical >= (n - 2))
					System.out.print(" ");
			}
			System.out.println();

		//doメソッドここまで
		}

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラスの内容ここまで
}

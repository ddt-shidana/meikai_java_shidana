/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-12 p121
 * 	0から正の整数値までカウントアップするプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_12
 * クラス名:Ensyu04_12
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_12;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;


public class Ensyu04_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントアップします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		for (int i = 0; i <= x; i++) {
			System.out.println(i);

		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
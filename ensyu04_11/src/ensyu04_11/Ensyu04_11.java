/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-11 p121
 * 	正の整数値を0までカウントするList4-4をfor文で実現せよ。
 *
 * パッケージ名:ensyu04_11
 * クラス名:Ensyu04_11
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_11;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		for (int i = x; i >= 0; i--) {
			System.out.println(i);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-13 p121
 * 	1からnまでの和をを求めるList4-10をfor文で実現せよ。
 *
 * パッケージ名:ensyu04_13
 * クラス名:Ensyu04_13
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_13;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1からnまでの和を求めます。");
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1から" + n + "までの和は" + sum + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
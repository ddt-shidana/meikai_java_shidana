/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-8 p113
 * 	1からnまでの和をを求めるList4-10をfor文で実現せよ。
 *
 * パッケージ名:ensyu04_08
 * クラス名:Ensyu04_08
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu4_08;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int x = n;
		int count = 0;
		do {
			x /= 10;
			count++;
		} while (x > 0);
		System.out.println("その値は" + count + "桁です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();
	}
}
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-18 p121
 * 	1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_18
 * クラス名:Ensyu04_18
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n < 1);
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "の2乗は" + (i * i));
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
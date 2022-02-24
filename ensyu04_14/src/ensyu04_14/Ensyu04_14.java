/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-14 p121
 * 	演習4-13を書きかえて、右のように式を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_14
 * クラス名:Ensyu04_14
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_14;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			System.out.print(i == n ? " = " : " + ");
		}
		System.out.println(sum);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
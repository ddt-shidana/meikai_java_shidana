/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-16 p121
 * 	読み込んだ個数だけ*を表示するList4-11を書きかえて、
 * 5個表示するごとに改行するプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_16
 * クラス名:Ensyu04_16
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("何個*を表示ししますか？：");
			n = stdIn.nextInt();
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			System.out.print('*');
			if (i % 5 == 0) {
				System.out.println();
			}
		}
    System.out.println();

	//newされているので、scannerのインスタンス(stdIn)をクローズ
	stdIn.close();

	}
}
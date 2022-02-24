/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-10 p121
 * 	読み込んだ値が1未満であれば改行文字を出力しないように
 * 	List4-11を書きかえたプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_10
 * クラス名:Ensyu04_10
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_17;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("整数値：");
			n = stdIn.nextInt();
		} while (n < 1);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("約数は" + count + "個です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
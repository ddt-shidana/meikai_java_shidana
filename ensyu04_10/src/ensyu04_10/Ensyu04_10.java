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


package ensyu04_10;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print('*');
			if (i == n) {
				System.out.println();
			}
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
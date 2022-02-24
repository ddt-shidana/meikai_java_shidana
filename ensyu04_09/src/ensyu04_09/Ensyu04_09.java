/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-9 p113
 * 	読み込んだ値が1未満であれば改行文字を出力しないように
 * 	List4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 *
 * パッケージ名:ensyu04_09
 * クラス名:Ensyu04_09
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_09;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int ans = 1;
		int i = 1;
		while (n > 0) {
			ans *= i;
			if (i == n) {
				break;
			}
			i++;
		}
		System.out.println("1から" + n + "までの積は" + ans + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}

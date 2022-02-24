/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-6 p109
 * 	読み込んだ値が1未満であれば改行文字を出力しないようにList4-7および
 * 	List4-8を書きかえたプログラムをそれぞれ作成せよ。
 *
 * パッケージ名:ensyu04_06
 * クラス名:Ensyu04_06
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_06;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
		}

		//1以上の時は改行をする
		if (n >= 1) {
			System.out.println();
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}

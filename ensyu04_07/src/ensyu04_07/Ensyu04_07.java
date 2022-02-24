/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-7 p109
 * 	読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 * 	表示は*と+を交互に行うこと。
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



package ensyu04_07;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("何個表示しますか：");
			n = stdIn.nextInt();
		} while (n < 1);
		int x = 0;
		while (x < n) {
			System.out.print(x % 2 == 0 ? "*" : "+");
			x++;
		}
    System.out.print("\n");

	//newされているので、scannerのインスタンス(stdIn)をクローズ
	stdIn.close();

	}
}
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-15 p121
 * 	身長と標準体重の対応表を表示するプログラムを作成せよ。
 * 	表示する身長の範囲（開始値/終了値/増分）整数値として読み込むこと。
 * 	※標準体重は（身長 - 100）× 0.9によって求められる。"

 *
 * パッケージ名:ensyu04_15
 * クラス名:Ensyu04_15
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_15;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int start;
		int end;
		int display;
		do {
			System.out.print("何cmから：");
			start = stdIn.nextInt();
			System.out.print("何cmまで：");
			end = stdIn.nextInt();
			System.out.print("何cmごと：");
			display = stdIn.nextInt();
		} while (start <= 100 || end <= 100 || display <= 0);
		System.out.println("身長 標準体重");
		for (int i = start; i <= end; i += display) {
			System.out.println(i + "  " + (i - 100) * 0.9);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
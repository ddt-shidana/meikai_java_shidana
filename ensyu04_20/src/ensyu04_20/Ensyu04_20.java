/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-20 p125
 * 	n段の正方形を表示するプログラムを作成せよ。
 * 	右に示すのは、nが3のときの実行結果である。
 *
 * パッケージ名:ensyu04_20
 * クラス名:Ensyu04_20
 * 作成日:2022/02/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_20;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_20 {

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//正方形を表示させるプログラムの開始メッセージを画面表示させる
		System.out.println ("縦横n個の*で正方形を表示させます。");

		//整数型変数nを設定し、入力値を初期値に設定
		int n;

		//1以上でないと図形が作成できない為、1未満の場合聞き直す
		do {
			//正の整数を入力してもらうため、メッセージを画面表示させる
			System.out.println ("正の整数n:");
			//nに入力値を初期設定
			n = stdIn.nextInt();
		} while (n < 1);


		//縦列：変数verticalを1からはじめて、1つずつ増やしながら、n回ループさせる
		//ループ内容・・・改行
		for (int vertical = 1; vertical <=n; vertical++) {
			//横列：変数besideを1からはじめて、1つずつ増やしながら、n回ループさせる
			//ループ内容・・・'*'を表示させる。
			for (int beside = 1; beside <= n; beside++) {
				System.out.print('*');
				//横列の'*'間と縦の行間を揃えるために、スペースを追加
				if (beside < n)
					System.out.print(" ");
			}
			System.out.println();
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

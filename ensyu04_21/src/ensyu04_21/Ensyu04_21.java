/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-21 p125
 * 	List4-16は左下側が直角の直角三角形を表示するプログラムであった。
 * 	直角が左上側、右下側、右上側の三角形を表示するプログラムを
 * 	それぞれ作成せよ。
 *
 * パッケージ名:ensyu04_21
 * クラス名:Ensyu04_21
 * 作成日:2022/02/25
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_21;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_21 {
//クラスの内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//整数型変数patternNumを用意。(0<=patternNum<=2)
		int patternNum;

		//0～2以外の整数が入力された場合、聞き直す。
		do {
			//3通りの直角三角形を表示させるプログラムの開始メッセージを画面表示させる
			System.out.println("3通りのうちの1通りの直角三角形を表示させます。");

			System.out.println("0・・・直角が左上");
			System.out.println("1・・・直角が右下");
			System.out.println("2・・・直角が右上");

			//patternNumに入力値を初期設定
			patternNum = stdIn.nextInt();

		} while (patternNum < 0 || patternNum > 2);


		//直角三角形の段数nはいくつにしますか？と聞く
		System.out.println("直角三角形の段数nはいくつにしますか？");

		//段数n(n>0)変数を用意
		int n;

		//nが0以下のとき、図形が作成できない為、聞き直す
		do {
			//段数nを聞く
			System.out.println("正の整数n:");
			n = stdIn.nextInt();
		} while (n <= 0);


		//patternNumで条件分岐
		switch (patternNum) {
		//直角が左上
		case 0:
			//縦列：変数verticalを1からはじめて、1つずつ増やしながら、n回ループさせる
			//ループ内容・・・改行
			for (int vertical = 1; vertical <=n; vertical++) {
				//横列：変数besideをnからはじめて、1つず減らしながら、(n-vertical+1)回ループさせる
				//ループ内容・・・'*'を表示させる。
				for (int beside = 1; beside <= (n-vertical+1); beside++) {
					System.out.print('*');
					//横列の'*'間と縦の行間を揃えるために、スペースを追加
					if (beside < (n-vertical+1))
						System.out.print(" ");
				}
				System.out.println();
			}	break;
		//直角が右下
		case 1:
			//縦・・・初期値:1、ループ回数:n、処理内容:verticalを増やす
			for (int vertical = 1; vertical <= n; vertical++) {
				//横スペース・・・初期値:n-1、ループ回数:n-vertical、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= (n -vertical); besideS++) {
					System.out.print("  ");
				}
				//横*文字・・・初期値:1、ループ回数:vertical、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= vertical; besideS++) {
					System.out.print('*');
					//ただし2文字以上並ぶとき、並べる感覚をそろえる為にスペースを追加する
					if (vertical >= 2)
						System.out.print(" ");
				}
				System.out.println();
			};	break;
		//直角が右上
		case 2:
			//縦・・・初期値:1、ループ回数:n、処理内容:verticalを増やす
			for (int vertical = 1; vertical <= n; vertical++) {
				//横スペース・・・初期値:1、ループ回数:vertical-1、処理内容:besideS増やす
				for (int besideS = 1; besideS <= (vertical-1); besideS++) {
					System.out.print("  ");
				}
				//横*文字・・・初期値:1、ループ回数:n -vertical + 1、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= (n -vertical + 1); besideS++) {
					System.out.print('*');
					//ただし2文字以上並ぶとき、並べる感覚をそろえる為にスペースを追加する
					if (vertical < n)
						System.out.print(" ");
				}
				System.out.println();
			};	break;

		//switchメソッドここまで
		}

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	//mainメソッドここまで
	}
//クラス内容ここまで
}

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-18 p83
 * 	月を1～12の整数値として読み込んで、
 * 	それに対応する季節を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_18
 * クラス名:Ensyu3_18
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 * 参考URL：https://eco.mtk.nao.ac.jp/koyomi/wiki/B5A8C0E1.html
 */


package ensyu3_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu3_18 {
//ここからクラス内容

	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		////使用者がわかりやすいようにナビで
		//「何月の季節が知りたいですが？整数値で入力してください。」と画面表示させる
		System.out.println ("何月の季節が知りたいですが？");
		System.out.println ("整数値で入力してください。");

		//整数型変数monthを用意して、入力値を初期設定
		int month = stdIn.nextInt();

		//入力した月の整数値(month)の該当季節を画面表示させる
		//3～5：気象学的季節「春」、天文学的季節「春分～夏至」
		//6～8：気象学的季節「夏」、天文学的季節「夏至～秋分」、
		//9～11：気象学的季節「秋」、天文学的季節「秋分～冬至」、
		//12,1,2:気象学的季節「冬」、天文学的季節「冬至～春分」。
		switch (month) {
		case 3 :
		case 4 :
		case 5 : 	System.out.println("気象学的季節「春」");
					System.out.println("天文学的季節「春分～夏至」");
					break;
		case 6 :
		case 7 :
		case 8 : 	System.out.println("気象学的季節「夏」");
					System.out.println("天文学的季節「夏至～秋分」");
					break;
		case 9 :
		case 10 :
		case 11 : 	System.out.println("気象学的季節「秋」");
					System.out.println("天文学的季節「秋分～冬至」");
					break;
		case 12 :
		case 1 :
		case 2 : 	System.out.println("気象学的季節「冬」");
					System.out.println("天文学的季節「冬至～春分」");
					break;
		}

	//mainメソッドここまで
	}

//クラス内容ここまで
}

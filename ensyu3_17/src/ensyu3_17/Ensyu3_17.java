/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-17 p83
 * 	0, 1, 2 のいずれかの値の乱数を生成し、
 * 	0であれば"グー"を、1であれば"チョキを"、2であれば"パー"を
 * 	表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_17
 * クラス名:Ensyu3_17
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu3_17;

//乱数を生成する準備のためimport
import java.util.Random;

public class Ensyu3_17 {
//ここからクラス内容

	public static void main(String[] args) {
	//ここからmainメソッド
		//randに乱数を初期設定
		Random rand = new Random();

		//整数型変数randHandNumを用意し0,1,2の3つの整数値のいずれかの乱数を初期設定
		int randHandNum = rand.nextInt(3);

		//0～2の乱数値によって、画面表示の文字列を分岐させる
		//0:グー 1:チョキ 2:パー
		switch (randHandNum) {
		case 0 : System.out.println("グー");	break;
		case 1 : System.out.println("チョキ");	break;
		case 2 : System.out.println("パー");	break;
		}

		/*没 pushする前のコードです
		 * 	メモ：randメソッドはもともとcloseメソッドを持たないため
		 * 		  呼び出すことが出来ない。
		 *
		//newされているので、Randomのインスタンス(rand)をクローズ
		rand.close();
		 *
		 */

	//mainメソッドここまで
	}

//クラス内容ここまで
}

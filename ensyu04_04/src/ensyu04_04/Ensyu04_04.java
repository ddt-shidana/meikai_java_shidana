/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-4 p101
 * 	List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ。
 *
 * パッケージ名:ensyu04_04
 * クラス名:Ensyu04_04
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_04;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_04 {
//クラスの内容ここから
	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//カウントダウン開始のメッセージを画面表示させる
		System.out.println("カウントダウンします。");

		//入力値から1ずつ減らして画面表示させるために、整数型変数xを用意
		int x;

		do {
		//ここからdoメソッド
			//正の整数値の入力を促すメッセージを画面表示させる
			System.out.print("正の整数値：");

			//xに入力値を代入
			x = stdIn.nextInt();

		//xが0以下である間、doメソッドを繰り返す
		} while (x <= 0);


		//xが0以上の間、
		//xを画面表示さた後、xの値を一つ減らす
		while (x >= 0) {
			System.out.println(x);
			x--;
		}

		//whileメソッドを抜けた後のxの値を画面表示させる
		//-1であればＯＫ
		System.out.println("xの値：" + x);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

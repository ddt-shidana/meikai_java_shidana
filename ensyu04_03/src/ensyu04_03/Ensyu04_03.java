/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-3 p99
 * 	二つの整数値を読み込んで、小さい方の数以上で大きい方の数以下の全整数を
 * 	小さい方から順に表示するプログラムを作成せよ。

 *
 * パッケージ名:ensyu04_03
 * クラス名:Ensyu04_03
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

package ensyu04_03;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_03 {
//クラスの内容ここから
	public static void main(String[] args) {
	//ここからmainメソッド
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//二つの整数値を入力してもらうため、メッセージを画面表示させる
		//整数型変数z1,z2を用意し、入力値(stdIn)を初期設定
		//入力値の型が整数型よりも大きい箱の場合、エラーになります。
		System.out.println("整数値A:");		int z1 = stdIn.nextInt();
		System.out.println("整数値B:");		int z2 = stdIn.nextInt();

		//z1>z2になるように、値の大小比較をし、
		//z1<z2になっていた場合は、値を入れ替える。
		//値の入れ替えをする時に使う変数tを、if文の中で用意し、
		//初期値tを設定しておく。
		if (z1 < z2) {
			int t = z1;
			z1 = z2;
			z2 = t;
		}

		//入力した整数値で大きいほうの値を画面表示させる
		System.out.println(z2 + "　");

		//z1とz2の間にある整数値を格納するため、整数型変数zを用意し、
		//z2(入力した2つの整数のうち小さいほうを初期設定
		int z = z2;

		do {
		//ここからdoメソッド
			//zを1つ減らす
			z = (z + 1);

			//z2の隣にzを画面表示させる
			System.out.println(z + "　");

		//z= z1にならない間、doメソッドを繰り返す
		//最後の画面表示はz1になる
		}	while (z != z1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}

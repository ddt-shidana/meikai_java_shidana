/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習11-1 p377
 * 	List10-12(p356)のクラスDateIdをパッケージidを所属させるように書きかえよ。
 * 	なお、クラスDateIdTesterは無名パッケージに所属させること。
 *
 * ディレクトリ：ensyu11_01
 * パッケージ名:id
 * クラス名:DateId
 * 作成日:2022/03/23
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージ宣言
package id;

import static java.util.Calendar.*;

//単一インポート宣言
//・・・utilパッケージのGregorianCalendarクラスに所属するメソッドを単純名で利用できるようにする
import java.util.GregorianCalendar;

/***************************************識別番号クラス***************************************
 * クラス名：DateId
 * List10-12(p356)の写し
 */
public class DateId {
	//----- フィールド -----//
	//何番までの識別番号を与えたか
	private static int couter;
	//識別番号
	private int id;

	//----- クラス初期化子 -----//
	static {
		//インポートしたGregorianCalendarクラスのインスタンスを生成
		GregorianCalendar today = new GregorianCalendar();
		//変数y,m,dにGregorianCalendarクラスのgetメソッドを使用し、年月日を設定
		//プログラム実行時の年
		int y = today.get(YEAR);
		//プログラム実行時の月（0～11なので+1する）
		int m = today.get(MONTH) + 1;
		//プログラム実行時の日
		int d = today.get(DATE);
		//プログラム実行時の年月日を表示する
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		//couterの初期値をプログラム実行時のyyyymmddに設定
		couter = (y * 1000000) + (m * 10000) + (d * 100);
	}

	//----- コンストラクタ※オーバーロード無し -----//
	public DateId() {
		//識別番号は、これまでの与えた数couter+1
		id = ++couter;
	}

	//-----ゲッタメソッド -----//
	public int getId() {
		return id;
	}

//クラスの終端
}
/**************************************************************************************/


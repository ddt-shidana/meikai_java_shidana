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


//パッケージ宣言なし→無名パッケージ→デフォルトパッケージへ格納される

//単一インポート宣言
//・・・idパッケージのDateIdクラスに所属するメソッドを単純名で利用できるようにする
import id.DateId;

/***************************************識別番号クラス***************************************
 * クラス名：DateIdTester
 * List10-12(p356)の写し
 */
public class DateIdTester {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//DateIdのインスタンスを3つ生成する
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		//各インスタンスの識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("aの識別番号：" + b.getId());
		System.out.println("aの識別番号：" + c.getId());
	}
}
/**************************************************************************************/


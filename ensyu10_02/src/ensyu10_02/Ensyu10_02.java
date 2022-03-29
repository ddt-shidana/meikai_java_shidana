/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10-2 p351
 * 	演習10-1で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
 * 		インスタンスを生成するたびに識別番号をnずつ増やして与える（nは正の整数）。
 * 		nの値は、指定されない限り1とするが、メソッドを通じて取得・変更できるようにする。
 *
 * パッケージ名:ensyu10_02
 * クラス名:Ensyu10_02
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu10_02;

/***************************************連番クラス***************************************
 * クラス名：ExId
 *	List10-3(p340)のうつし（追加★）
 */
class ExId {
	//----- フィールド -----//
	//クラス変数（静的フィールド）：何番までの識別番号を与えたか
	public static int counter = 0;
	//couterの増幅量（初期値は1）
	private static int n = 1;
	//インスタンス変数：識別番号
	private int id;

	//----- コンストラクタ -----//
	//多重定義なしでコンストラクタを用意
	public ExId() {
		//識別番号は、このIdクラス型インスタンスが生成されるたびに1増えていく
		counter = counter + n;
		this.id = counter;
	}

	//----- アクセッサ（ゲッタ）メソッド -----//
	//識別番号を取得
	public int getId() {
		return id;
	}
	//最後に与えた識別番号を取得
	public static int getMaxId() {
		return counter;
	}
	//couterの増幅量nを取得
	public int getN() {
		return n;
	}

	//----- couterの増幅量を変更するメソッド -----//
	public static void changeN(int afterN) {
		n = afterN;
	}
}
/**************************************************************************************/

/***************************************連番クラスのテスト***************************************
 * クラス名：Ensyu10_02
 * 	Ensyu10_01のうつしに追加
 */
public class Ensyu10_02 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//3つExIdクラス型オブジェクトを生成
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();

		//識別番号のカウント増幅量を4にする
		ExId.changeN(4);

		//さらに3つExIdクラス型オブジェクトを生成
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();


		//識別番号を表示
		System.out.print(a.getId());
		System.out.print(", " + b.getId());
		System.out.print(", " + c.getId());
		System.out.print(", " + d.getId());
		System.out.print(", " + e.getId());
		System.out.print(", " + f.getId());
	}

}
/**************************************************************************************/

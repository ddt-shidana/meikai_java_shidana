/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10-1 p351
 * 	List10-3に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ。
 *
 * パッケージ名:ensyu10_01
 * クラス名:Ensyu10_01
 * 作成日:2022/03/18
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu10_01;
/***************************************連番クラス***************************************
 * クラス名：Id
 *	List10-3(p340)のうつし（追加★）
 */
class Id {
	//----- フィールド -----//
	//クラス変数（静的フィールド）：何番までの識別番号を与えたか
	public static int counter = 0;
	//インスタンス変数：識別番号
	private int id;


	//----- コンストラクタ -----//
	//多重定義なしでコンストラクタを用意
	public Id() {
		//識別番号は、このIdクラス型インスタンスが生成されるたびに1増えていく
		this.id = ++counter;
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
}
/**************************************************************************************/

/***************************************連番クラスのテスト***************************************
 * クラス名：Ensyu10_01
 * 	List10-3(p340)のうつしに追加
 */
public class Ensyu10_01 {

	//----- mainメソッド-----//
	public static void main(String[] args) {
		//1つめのIdクラス型オブジェクトを生成
		Id a = new Id();
		//2つめのIdクラス型オブジェクトを生成
		Id b = new Id();

		//識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		//Idクラスのcouterフィールドを表示
		System.out.println("Id.counter = " + Id.counter);

		//このクラスの各Idクラス型インスタンスのcouterフィールドを表示
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);

		//最後に与えた識別番号を表示
		System.out.println("MaxId = " + Id.getMaxId());

		//3つめのIdクラス型オブジェクトを足してもう一度MaxIdを表示してみる
		Id c = new Id();
		System.out.println("MaxId = " + Id.getMaxId());
		System.out.println("cの識別番号：" + c.getId());
	}

}
/**************************************************************************************/

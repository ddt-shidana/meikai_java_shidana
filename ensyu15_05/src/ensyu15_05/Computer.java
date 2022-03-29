/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15-5 p497
 * 	3人で行うジャンケンプログラムを作成せよ。
 * 	プレーヤー3人のうち、コンピューターを2人として、人間を1人とすること。
 * 	また、演習13-3（p443）で作成した、プレーヤークラスを利用すること。
 *
 * パッケージ名:ensyu15_05
 * 作成日:2022/03/29
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu15_05;

//utilパッケージのRandomクラスを単一単純名で使用できるようにインポート宣言
import java.util.Random;

//===================== 具体クラス：コンピュータープレイヤーを表す =====================//
/**
* 概要：	コンピュータープレイヤーを表すクラス。<BR>
* 補足：	このクラスは、じゃんけんプレイヤーの概念を表す抽象クラスAbstRoPaScPlayerから派生したクラス。<BR>
* @see	Player
* @see	AbstRoPaScPlayer
*/
public class Computer extends AbstRoPaScPlayer {

	//----- フィールド -----//
	/**
	 * 概要：	何番までの識別番号を与えたか
	 */
	private static int counter;
	/**
	 * 概要：	識別番号
	 */
	private int id;

	//----- コンストラクタ -----//
	/**
	 * 概要：	コンピュータープレイヤーを生成するコンストラクタ。
	 */
	public Computer() {
		//スーパークラスのコンストラクタを使用
		super();
		//識別番号を付与
		id = ++counter;
	}

	//----- アクセッサ（ゲッタメソッド）：識別番号を取得 -----//
	/**
	 * 概要：	識別番号を取得する。
	 * @return	id 識別番号、int型
	 */
	public int getId() {
		return id;
	}

	//----- メソッド：コンピュータープレイヤー情報を表す文字列を返却する -----//
	/**
	 * 概要：	コンピュータープレイヤー情報を表す文字列を返却するメソッド。
	 * @return "player：Computer"
	 */
	@Override
	public String toString() {
		return "player：Computer" + id;
	}

	//----- メソッド：じゃんけんで出す手の値を返却する -----//
	/**
	 * 概要：	コンピュータープレイヤーがじゃんけんで出す手の値を返却するメソッド。<BR>
	 * @return drawHand （0,1,2の3つの整数値のいずれかの乱数）
	 */
	public int drawHand() {
		//randに乱数を初期設定
		Random rand = new Random();
		//生成した乱数を変数に保存
		int drawHand = rand.nextInt(3);
		//handにdrawHandを設定
		this.hand = drawHand;
		//0,1,2の3つの整数値のいずれかの乱数を返却
		return drawHand;

	}
}

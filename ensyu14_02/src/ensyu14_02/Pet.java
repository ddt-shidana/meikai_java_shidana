/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-2 p463
 * 	ロボット型ペットクラスRobotPet（p.407）を拡張した、
 * 	着せかえ可能なロボット型ペットクラスを作成せよ。
 * 	インタフェースSkinnableを実装すること。
 *
 * パッケージ名:ensyu14_02
 * 作成日:2022/03/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu14_02;

//===================== クラス：ペットを表す =====================//
/**
* 概要：	ペットの表す具体クラス。<BR>
* @see	Object
*/
public class Pet {

	//----- フィールド -----//
	/**
	 * 概要：	ペットの名前を表す文字列型のフィールド。
	 */
	private String name;
	/**
	 * 概要：	飼い主の名前を表す文字列型のフィールド。
	 */
	private String masterName;

	//----- コンストラクタ -----//
	/**
	 * 概要：	ペットを生成するコンストラクタ。
	 * @param name ペットの名前、String型
	 * @param masterName ペットの飼い主の名前、String型
	 */
	public Pet (String name, String masterName) {
		//ペットの名前
		this.name = name;
		//飼い主の名前
		this.masterName = masterName;
	}

	//----- アクセッサ：ゲッタメソッド -----//
	/**
	 * 概要：	ペットの名前を調べる。
	 */
	public String getName () {
		return name;
	}
	/**
	 * 概要：	飼い主の名前を調べる。
	 */
	public String getMasterName () {
		return masterName;
	}

	//----- メソッド：自己紹介をする -----//
	/**
	 * 概要：	ペットの名前と、飼い主の名前を表示するメソッド。<BR>
	 */
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！");
		System.out.println("■ご主人様は" + masterName + "です！");
	}

}

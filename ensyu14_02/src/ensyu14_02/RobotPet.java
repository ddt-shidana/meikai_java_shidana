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

//===================== クラス：着せ替え可能なロボット型ペットを表す =====================//
/**
* 概要：	ロボット型ペットの表す具体クラス。
* @see	Pet
*/
public class RobotPet extends Pet implements Player, Skinnable{

	//----- フィールド -----//
	/**
	 * 概要：	ロボット型ペットのスキンのフィールド。
	 * 初期値：	BLACK（= 0）
	 */
	private int skin = BLACK;

	//----- コンストラクタ -----//
	/**
	 * 概要：	ロボット型ペットを生成するコンストラクタ。
	 * @param name ペットの名前、String型
	 * @param masterName ペットの飼い主の名前、String型
	 */
	public RobotPet (String name, String masterName) {
		//スーパークラス（Pet）のコンストラクタを継承
		super(name, masterName);
	}

	//----- メソッド：Playerインターフェスの実装 -----//
	/**
	 * 概要：	ロボット型ペットの起動メッセージを表示するメソッド。<BR>
	 * @see Player
	 */
	//再生
	public void play() {
		System.out.println("〇起動〇");
	}
	/**
	 * 概要：	ロボット型ペットの停止メッセージを表示するメソッド。<BR>
	 * @see Player
	 */
	//再生
	public void stop() {
		System.out.println("●停止●");
	}

	//----- アクセッサ -----//
	/**
	 * 概要：	skinの番号を取得するゲッタメソッド。<BR>
	 * @see Skinnable
	 */
	public int getSkin () {
		return skin;
	}
	/**
	 * 概要：	skinの番号を設定するセッタメソッド。<BR>
	 * @see Skinnable
	 */
	public void setSkin (int skin) {
		this.skin = skin;
	}

	//----- メソッド：Skinnableインターフェスの実装 -----//
	/**
	 * 概要：	ロボット型ペットのスキンを変更するメソッド。<BR>
	 * @see Skinnable
	 */
	public void changeSkin (int skin) {
		//スキンを変更する
		this.setSkin(skin);
		//スキン変更メッセージのヘッダ
		System.out.print("スキンを");
		//仮引数の値で分岐
		switch (skin) {
			//0のとき
			case BLACK: {
				//漆黒色に変更
				System.out.print("漆黒");
				//ここでスイッチを脱出
				break;
			}
			//1のとき
			case RED: {
				//深紅色に変更
				System.out.print("深紅");
				//ここでスイッチを脱出
				break;
			}
			//2のとき
			case GREEN: {
				//柳葉色に変更
				System.out.print("柳葉");
				//ここでスイッチを脱出
				break;
			}
			//3のとき
			case BLUE: {
				//露草色に変更
				System.out.print("露草");
				//ここでスイッチを脱出
				break;
			}
			//4のとき
			case LEOPARD: {
				//豹柄に変更
				System.out.print("豹柄");
				//ここでスイッチを脱出
				break;
			}
			//それ以外のとき
			default: {
				//無地に変更
				System.out.print("無地");
				//ここでスイッチを脱出
				break;
			}
		}
		//スキン変更のフッタを表示
		System.out.println("に変更しました。");
	}

	//----- メソッド：Skinの色を表示する -----//
	/**
	 * 概要：	Skinの色を表示するメソッド。<BR>
	 * @see Skinnable
	 */
	public String skinSt (int skin) {
		//スキン文字列を格納する変数
		String skinSt;
		//仮引数の値で分岐
		switch (skin) {
			//0のとき
			case BLACK: {
				//漆黒色
				skinSt = "漆黒";
				//ここでスイッチを脱出
				break;
			}
			//1のとき
			case RED: {
				//深紅色
				skinSt = "深紅";
				//ここでスイッチを脱出
				break;
			}
			//2のとき
			case GREEN: {
				//柳葉色
				skinSt = "柳葉";
				//ここでスイッチを脱出
				break;
			}
			//3のとき
			case BLUE: {
				//露草色
				skinSt = "露草";
				//ここでスイッチを脱出
				break;
			}
			//4のとき
			case LEOPARD: {
				//豹柄
				skinSt = "豹柄";
				//ここでスイッチを脱出
				break;
			}
			//それ以外のとき
			default: {
				//無地
				skinSt = "無地";
				//ここでスイッチを脱出
				break;
			}
		}
		//返却値
		return skinSt;

	}

	//----- メソッド：自己紹介をする -----//
	/**
	 * 概要：	ロボット型ペットの名前と、飼い主の名前を表示するメソッド。<BR>
	 */
	@Override
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	//----- メソッド：家事をする -----//
	/**
	 * 概要：	掃除・洗濯・炊事をするメッセージを表示するメソッド。<BR>
	 */
	public void work (int sw) {
		//仮引数の値で分岐
		switch (sw) {
			//0の時
			case 0: {
				//掃除する
				System.out.println("掃除します。");
				//ここでスイッチを脱出
				break;
			}
			//1の時
			case 1: {
				//洗濯する
				System.out.println("洗濯します。");
				//ここでスイッチを脱出
				break;
			}
			//2の時
			case 2: {
				//炊事する
				System.out.println("炊事します。");
				//ここでスイッチを脱出
				break;
			}
		}
	}

}

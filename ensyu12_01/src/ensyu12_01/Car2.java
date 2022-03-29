/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-1 p405
 * 	走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。
 * 	自動車クラスCar第2版から派生すること。
 *
 * パッケージ名:ensyu12_01
 * クラス名:Car2
 * 作成日:2022/03/23
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu12_01;

/***************************************自動車クラス【第2版】***************************************
 * クラス名：Car2(サブクラス)
 * 自動車クラス【第2版】（p324）の写し
 */
public class Car2 extends Car {
	//----- フィールド -----//
	//総走行距離
	private double distAll;

	//----- コンストラクタ -----//
	Car2(	String name,
			int width,
			int height,
			int length,
			double fuel,
			Day purchaseDay,
			double distAll
		) {
		//新たな変数を用意せずに、superポインタを利用
		super(name, width, height, length, fuel, purchaseDay);
		//xとyは初期値0.0
		super.x = super.y = 0.0;
		this.distAll = distAll;
		}

	//----- ゲッタメソッド -----//
	//総走行距離を取得
	public double getDistAll() {
		return distAll;
	}


	//----- メソッド：スペックを表示 -----//
	@Override
	public void putSpec() {
		//スーパークラスのメソッドを上書き
		super.putSpec();
		//名前の表示
		System.out.println("\t総走行距離：" + distAll + "(km)");
	}

	//----- メソッド：X方向にdx・Y方向にdy移動 -----//
	@Override
	public boolean move(double dx, double dy) {
		//移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		//移動できない場合
		if (dist > fuel) {
			//燃料不足
			return false;
		}
		//移動できる
		else {
			//移動の分だけ燃料が減る
			fuel -= dist;
			x += dx;
			y += dy;
			//総走行距離に移動距離を加算
			distAll += dist;
			//移動完了
			return true;
		}
	}
//クラスの末尾
}
/**************************************************************************************/


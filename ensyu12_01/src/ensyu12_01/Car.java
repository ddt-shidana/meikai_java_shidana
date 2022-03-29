/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-1 p405
 * 	走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。
 * 	自動車クラスCar第2版から派生すること。
 *
 * パッケージ名:ensyu12_01
 * クラス名:Car
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
 * クラス名：Car(スーパークラス)
 * 自動車クラス【第2版】（p324）の写し
 */
public class Car {

	//----- フィールド -----//
	//名前
	private String name;
	//幅(mm)
	private int width;
	//高さ(mm)
	private int height;
	//長さ(mm)
	private int length;
	//現在位置x座標(km)
	protected double x;
	//現在位置y座標(km)
	protected double y;
	//残り燃料(L)
	protected double fuel;
	//購入日
	private Day purchaseDay;

	//----- コンストラクタ -----//
	Car(	String name,
			int width,
			int height,
			int length,
			double fuel,
			Day purchaseDay
		) {
		//新たな変数を用意せずに、thisポインタを利用
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		//xとyは初期値0.0
		x = y = 0.0;
		//purchaseDayはDayクラスの新しいインスタンスを設定
		this.purchaseDay = 	new Day(purchaseDay);
		}

	//----- ゲッタメソッド -----//
	//現在位置x座標を取得
	public double getX() {
		return x;
	}
	//現在位置y座標を取得
	public double getY() {
		return y;
	}
	//残り燃料を取得
	public double getFuel() {
		return fuel;
	}
	//購入日を取得
	public Day getPurchaseDay() {
		return new Day (purchaseDay);
	}

	//----- メソッド：スペックを表示 -----//
	public void putSpec() {
		//名前の表示
		System.out.println("\t名前：" + name);
		//車幅の表示（mm）
		System.out.println("\t車幅：" + width + " (mm)");
		//車高の表示（mm）
		System.out.println("\t車高：" + height + " (mm)");
		//車長の表示（mm）
		System.out.println("\t車長：" + length + " (mm)");
	}

	//----- メソッド：X方向にdx・Y方向にdy移動 -----//
	public boolean move(double dx, double dy) {
		//移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		//移動できない場合
		if (dist > fuel)
			//燃料不足
			return false;
		//移動できる
		else {
			//移動の分だけ燃料が減る
			fuel -= dist;
			x += dx;
			y += dy;
			//移動完了
			return true;
		}
	}
//クラスの末尾
}
/**************************************************************************************/

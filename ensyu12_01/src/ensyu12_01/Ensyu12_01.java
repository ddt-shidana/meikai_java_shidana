/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12-1 p405
 * 	走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。
 * 	自動車クラスCar第2版から派生すること。
 *
 * パッケージ名:ensyu12_01
 * クラス名:Ensyu12_01
 * 作成日:2022/03/23
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */

//パッケージの宣言
package ensyu12_01;

/***************************************自動車クラスのサブクラスをテストするクラス***************************************
 * クラス名：Ensyu12_01
 */
public class Ensyu12_01 {
	//----- mainメソッド-----//
	public static void main(String[] args) {
		//Carクラスのインスタンスを生成
		Car car1 = new Car("愛車", 1885, 1490, 5220, 90.0, new Day(2010, 10, 15));
		//Car2クラスのインスタンスを生成
		Car2 car2 = new Car2("中古車", 1800, 1400, 4500, 75.0, new Day(2000, 7, 1), 200000);

		//Carクラスの変数を用意
		Car carX;
		//まずはCarクラス型変数にCarクラスのインスタンスを代入
		carX = car1;
		//代入できているかのテスト>>>90.0
		System.out.println("Xの残り燃料：" + carX.getFuel());
		//次にCarクラス型変数にCar2クラスのインスタンスを代入
		carX = car2;
		//代入できているかのテスト>>>75.0
		System.out.println("Xの残り燃料：" + carX.getFuel());

		//Car2クラスの変数を用意
		Car2 carY;
		//Carクラス型変数にCarクラスのインスタンスを代入>>>エラー「型の不一致: Car から Car2 には変換できません」
		//carY = car1;
		//次にCar2クラス型変数にCar2クラスのインスタンスを代入
		carY = car2;
		//代入できているかのテスト>>>75.0
		System.out.println("Yの残り燃料：" + carY.getFuel());
		//getDistAllメソッドのテスト>>>200000
		System.out.println("Yの総走行距離：" + carY.getDistAll());

		//オーバーライドのテスト1
		//putSpec
		System.out.println("Carクラスのインスタンス");
		car1.putSpec();
		System.out.println("Car2クラスのインスタンス");
		car2.putSpec();

		//オーバーライドのテスト2
		System.out.println("Carクラスのインスタンス");
		//moveメソッドのテスト
		car1.move(1, 5);
		//座標の更新確認
		System.out.println("Car1の座標(x, y) = (" + car1.getX() + ", " + car1.getY() + ")");
		//残り燃料の更新確認
		System.out.println("Car1の残り燃料：" + car1.getFuel());

		System.out.println("Car2クラスのインスタンス");
		//moveメソッドのテスト
		car2.move(1, 5);
		//座標の更新確認
		System.out.println("Car2の座標(x, y) = (" + car2.getX() + ", " + car2.getY() + ")");
		//残り燃料の更新確認
		System.out.println("Car2の残り燃料：" + car2.getFuel());
		//総走行距離の更新確認
		System.out.println("Car2の総走行距離：" + car2.getDistAll());

	}
//クラスの末尾
}
/**************************************************************************************/


/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-1 p293
 * 	名前・身長・体重などをメンバとしてもつ《人間クラス》を作成せよ。
 * 	（フィールドやメソッドなどは自分で自由に設計すること）
 *
 * パッケージ名:ensyu08_01
 * クラス名:Ensyu08_01
 * 作成日:2022/03/15
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu08_01;

/***************************************Humanクラス***************************************
 * クラス名：Human
 * 人間クラス
 */
class Human {
	//----- フィールド -----//
	//名前
	private String name;
	//身長
	private int height;
	//体重
	private int weight;

	//----- コンストラクタ -----//
	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	//----- メソッド：氏名を調べる -----//
	String getName() {
		return name;
	}

	//----- メソッド：身長を調べる -----//
	int getHeight() {
		return height;
	}

	//----- メソッド：体重を調べる -----//
	int getWeight() {
		return weight;
	}

	//----- メソッド：BMIを調べる -----//
	float getBMI(){
		//BMI＝体重(小数点)÷身長[cm]（小数点）÷身長[cm]（小数点）
		float bmi = (float)weight / ((float)height / 100) / ((float)height / 100);
		return bmi;
	}

	//----- メソッド：プロフィールを表示 -----//
	void getProf() {
		//名前の表示
		System.out.println(" 名前：" + name);
		//身長の表示（m）
		System.out.println(" 身長：" + height + "m");
		//体重の表示（kg）
		System.out.println(" 体重：" + weight + "kg");
		//BMIの表示 ※小数点第2位まで
		System.out.printf("  BMI：" + "%.2f\n", getBMI());
	}

}
/**************************************************************************************/

/***************************Humanクラスをテストするクラス内容**************************
 * クラス名：Ensyu08_01
 * 人間クラスをテストする
 */
class Ensyu08_01 {

	//----- mainメソッド-----//
	public static void main(String[] args) {

		//安倍晋三のプロフィールを登録
		Human abeshinzou = new Human("安倍晋三", 174, 73);

		//安倍晋三の身長・体重とBMIを表示
		abeshinzou.getProf();
	}
}
/**************************************************************************************/

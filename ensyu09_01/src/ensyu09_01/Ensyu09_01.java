/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-1 p313
 * 	演習8-1で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 * 	生成時に要素を初期化するもの、生成後の要素に値を代入するものなど、
 * 	複数のパターンを作ること。
 *
 * パッケージ名:ensyu09_01
 * クラス名:Ensyu09_01
 * 作成日:2022/03/16
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_01;

import java.util.Scanner;

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
		System.out.println("■" + name + " のプロフィール");
		//身長の表示（m）
		System.out.println("  身長：" + height + "m");
		//体重の表示（kg）
		System.out.println("  体重：" + weight + "kg");
		//BMIの表示 ※小数点第2位まで
		System.out.printf("  BMI ：" + "%.2f\n", getBMI());
	}

}
/**************************************************************************************/

/**************************************************************************************
 * クラス名：Ensyu09_01
 * 人間クラス型配列を生成し表示する
 */
public class Ensyu09_01 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);


	//----- 一次元配列の要素の値を入力によって決めるメソッド -----//
	/*メソッド名：getArray
	 */
	static Human[] getHuman (String xSt) {
		//要素数（列数）を格納する変数を用意
		int cLength = 0;
		//要素数は1以上
		do {
			//要素数を聞く
			System.out.print("登録する人数：");
			//入力値を列数として扱う
			cLength = stdIn.nextInt();
			//0以下の値が入力されたらエラーメッセージを表示
			if (cLength < 1) {
				System.out.println("1人以上の人数を指定してください。");
			}
		//1未満が入力されたらループ
		} while (cLength < 1);

		//配列xを用意
		Human[] x = new Human[cLength];

		//一次元配列xの要素数を定義
		x = new Human[cLength];

		//要素の値を入力してもらう
		//xのインデックスを順番に動いて要素を入力値から取得する
		for (int idxItr = 0; idxItr < cLength; idxItr++) {
			System.out.println("＜" + (idxItr + 1) + "人目＞");
			System.out.print("    名前：");		String name = stdIn.next();
			System.out.print("身長(cm)：");		int height = stdIn.nextInt();
			System.out.print("体重(kg)：");		int weight = stdIn.nextInt();
			//入力値を該当要素の値として設定
			x[idxItr] = new Human(name, height, weight);
			System.out.println("");
		}
		//返却値は配列；
		return x;
	}

	//----- 一次元配列の要素を表示するメソッド -----//
	/*メソッド名：printArray
	 */
	static void printArray (Human[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i].getProf();
			//要素間は改行
			System.out.println("");
		}
	}

	//----- mainメソッド -----//
	public static void main(String[] args) {

		//歴代内閣総理大臣を配列に格納・・・生成時に初期化
		Human[] premier = {
				new Human ("安倍 晋三", 174, 73),
				new Human ("菅 義偉", 164, 74),
				new Human ("岸田 文雄", 174, 65)
				};
		//歴代内閣総理大臣のプロフィールを表示
		System.out.println("歴代内閣総理大臣のプロフィールです。");
		printArray(premier);

		//独自でHumanを登録する
		System.out.println("プロフィールを登録します。");
		//Humanクラスを先に生成後、要素に値を代入する
		Human[] humanIn = getHuman("Human");
		printArray(humanIn);

	}
}
/**************************************************************************************/

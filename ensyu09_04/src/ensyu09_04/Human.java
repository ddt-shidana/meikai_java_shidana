package ensyu09_04;

/***************************************Humanクラス***************************************
 * クラス名：Human
 * 演習8-1(p293)で作成したHumanクラスを使用（追加★）
 */
public class Human {
	//----- フィールド -----//
	//名前
	private String name;
	//身長
	private int height;
	//体重
	private int weight;
	//誕生日・・・★
	private Day birthday;

	//----- コンストラクタ -----//
	public Human(String name, int height, int weight, Day birthday) {
		//Humanクラスのnameフィールドに、引数nameを設定する
		this.name = name;
		//Humanクラスのheightフィールドに、引数heightを設定する
		this.height = height;
		//Humanクラスのweightフィールドに、引数weightを設定する
		this.weight = weight;
		//Humanクラスのbirthdayフィールドに、引数birthdayのDayクラスインスタンスを設定する
		this.birthday = new Day(birthday);
	}

	//----- 各フィールド値を取得（ゲッタメソッド※返却値を得る） -----//
	//氏名を調べる
	public String getName() {
		return name;
	}
	//身長を調べる
	public int getHeight() {
		return height;
	}
	//体重を調べる
	public int getWeight() {
		return weight;
	}
	//BMIを調べる
	public float getBMI(){
		//BMI＝体重(小数点)÷身長[cm]（小数点）÷身長[cm]（小数点）
		float bmi = (float)weight / ((float)height / 100) / ((float)height / 100);
		return bmi;
	}
	//誕生日を調べる・・・★
	public Day getBirthday() {
		return birthday;
	}

	//----- 文字列表現を返却 -----//
	public String toString() {
		//文字列表現の変数を用意
		String toString;
		//文字列表現を変数に保管・・・「xx 様(口座番号:xxxxx)  残高：￥x,xxx-」のフォーマット
		toString = String.format("■%s■ %dcm %dkg (BMI：%.2f)", name, height, weight, getBMI());
		//返却値
		return toString;
	}

	//----- メソッド：プロフィールを表示 -----//
	public void getProf() {
		//名前の表示
		System.out.println(" 名前：" + name);
		//身長の表示（m）
		System.out.println(" 身長：" + height + "cm");
		//体重の表示（kg）
		System.out.println(" 体重：" + weight + "kg");
		//BMIの表示 ※小数点第2位まで
		System.out.printf("  BMI：" + "%.2f\n", getBMI());
	}

}
/**************************************************************************************/

/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習8-2 p293
 * 	自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ。
 * 	・タンク容量を表すフィールドを追加する・・・fuelTank(L)
 * 	・ナンバーを表すフィールドを追加する・・・number
 * 	・燃費を表すフィールドを追加する・・・fuelEconomy(km/L) （= dist(km) / refuelingFuel(L)）
 * 	・移動による燃料残量の計算に燃費を反映させる・・・fuel(L) -= ( dist(km) / fuelEconomy(km/L) )
 * 	・給油のためのメソッドを追加する・・・メソッド：refuelingFuel（ fuel(L) += refuelingFuel(L) ）
 *
 * パッケージ名:ensyu08_02
 * クラス名:Ensyu08_02
 * 作成日:2022/03/16
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu08_02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/***************************************Carクラス***************************************
 * クラス名：Car
 * 	List8-4を参照にインスタンスメソッドを定義
 */
class Car {

	//----- Scannerメソッド：stdInにキーボードからの入力値を初期設定 -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- フィールド -----//
	//名前
	private String name;
	//ナンバー			・・・★追加
	private int number;
	//幅(mm)
	private int width;
	//高さ(mm)
	private int height;
	//長さ(mm)
	private int length;
	//タンク容量(L)		・・・★追加
	private double fuelTank;
	//燃費(km/L)		・・・★追加
	private double fuelEconomy;
	//現在位置x座標(km)
	private double x;
	//現在位置y座標(km)
	private double y;
	//残り燃料(L)
	private double fuel;

	//----- コンストラクタ -----//
	Car(	String name,
			int number,					//★追加
			int width,
			int height,
			int length,
			double fuelTank,			//★追加
			double fuelEconomy,			//★追加
			double fuel
		) {
		//新たな変数を用意せずに、thisポインタを利用
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.fuelTank = fuelTank;			//★追加
		this.number = number;				//★追加
		this.fuelEconomy = fuelEconomy;		//★追加
		//xとyは初期値0.0
		x = y = 0.0;
	}

	//----- メソッド：現在位置x座標を取得 -----//
	double getX() {
		return x;
	}

	//----- メソッド：現在位置y座標を取得 -----//
	double getY() {
		return y;
	}

	//----- メソッド：残り燃料を取得 -----//
	double getFuel() {
		return fuel;
	}

	//----- メソッド：燃費を取得 -----//・・・★追加
	double getFuelEconomy() {
		return fuelEconomy;
	}

	//----- メソッド：スペックを表示 -----//
	void putSpec() {
		//ヘッダ
		System.out.println("■この車について");
		//名前の表示
		System.out.println("\t      登録名称：" + name);
		//自動車登録番号の表示・・・★追加
		System.out.println("\t      ナンバー：" + number);
		//車幅の表示（mm）
		System.out.println("\t          車幅：" + width + " (mm)");
		//車高の表示（mm）
		System.out.println("\t          車高：" + height + " (mm)");
		//車長の表示（mm）
		System.out.println("\t          車長：" + length + " (mm)");
		//燃料タンク容量の表示（L）・・・★追加
		System.out.println("\t燃料タンク容量：" + fuelTank + " (L)");
		//燃費の表示（km/L）・・・★追加
		System.out.println("\t          燃費：" + fuelEconomy + " (km/L)");
		//改行
		System.out.println("");
	}

	//----- メソッド：ステータスを表示 -----//
	void putStatus() {
		//ヘッダ
		System.out.println(" --- 現在のステータス ------------------------------");
		//現在の座標(x, y)の表示
		System.out.printf("\t現在地(x[km], y[km]) = (%.2f, %.2f)\n", x, y);
		//燃料残量[L] / タンク容量[L]を表示
		System.out.printf("\t燃料[L] / タンク容量[L] = %.2f / ", fuel);
		System.out.printf("%.2f\n", fuelTank);
		//フッダ
		System.out.println(" ---------------------------------------------------");
	}

	//----- メソッド：小数第二位で四捨五入する -----//・・・★追加
	static double roundHalfUp2(double a) {
		//1.引数の値に100を掛ける
		//2.roundメソッドを使用して小数点以下（第1位）で四捨五入
		//3.対象の値をdouble型にキャストして再度100で割る
		double b = ((double)Math.round(a * 100))/100;
		//返却値は、aを四捨五入した値b
        return b;
	}

	//----- メソッド：足し算 -----//・・・★追加
	static double add(double a, double b) {
		//情報を失わない計算をするため、BigDecimal型に一度変換
		BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        //BigDecimal型で足し算を計算したものをdouble型で返す
        double addVal = bigA.add(bigB).doubleValue();
        //返却値は足し算した結果double型の値を四捨五入したもの
        return roundHalfUp2(addVal);
	}

	//----- メソッド：引き算 -----//・・・★追加
	static double subtractVal(double a, double b) {
		//情報を失わない計算をするため、BigDecimal型に一度変換
		BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        //BigDecimal型で引き算を計算したものをdouble型で返す
        double subtractVal = bigA.subtract(bigB).doubleValue();
        //返却値は引き算した結果double型の値を四捨五入したもの
        return roundHalfUp2(subtractVal);
	}

	//----- メソッド：掛け算 -----//・・・★追加
	static double multiply(double a, double b) {
		//情報を失わない計算をするため、BigDecimal型に一度変換
		BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        //BigDecimal型で掛け算を計算したものをdouble型で返す
        double multiplyVal = bigA.multiply(bigB).doubleValue();
        //返却値は掛け算した結果double型の値を四捨五入したもの
        return roundHalfUp2(multiplyVal);
	}

	//----- メソッド：割り算 -----//・・・★追加
	static double divide(double a, double b) {
		//情報を失わない計算をするため、BigDecimal型に一度変換
		BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        //BigDecimal型で割り算を計算したものをdouble型で返す
        //無限小数防止のため小数点以下第3位を四捨五入のこと
        ////java9以降では非推奨だったのでコメントアウト
        ////        double divideVal = bigA.divide(bigB, 4, BigDecimal.ROUND_HALF_UP).doubleValue();
        double divideVal = bigA.divide(bigB, 3, RoundingMode.HALF_UP).doubleValue();
        //返却値は割り算した結果double型の値を四捨五入したもの
        return roundHalfUp2(divideVal);
	}

	//----- メソッド：平方根を求める -----//・・・★追加
    static double sqrt(double a){
    	//元のaと平方根を区別するために格納
        double x = a;
        //繰り返すと精度が上がるため、とりあえず5回繰り返す
        for(int i = 0; i < 5; ++i){
        	//ニュートン法で平方根を求める
            x = x - (x * x - a) / (2 * x);
        }
        return x;
    }

	//----- メソッド：X方向にdx・Y方向にdy移動した時の移動距離を取得 -----//・・・★追加
	static double getDist(double dx, double dy) {
		//dist：移動距離（スカラー）
		//dx：X方向の移動距離（スカラー）
		//dy：Y方向の移動距離（スカラー）
		//dist = (dx^2 + dy^2)^(1/2)
		//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
		double dist = sqrt(add(multiply(dx, dx), multiply(dy, dy)));
		return dist;
	}

	//----- メソッド：dist移動するのに必要な燃料量を取得 -----//・・・★追加
	double getReqFuel(double dist) {
		//dist移動するのに必要な燃料量reqFuel(L) -= ( dist(km) / fuelEconomy(km/L)
		//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
		double reqFuel = divide(dist, fuelEconomy);
		return reqFuel;
	}

	//----- メソッド：dist移動するのに、燃料残量が足りるかを判定 -----//・・・★追加
	boolean canMove(double dist) {
		//燃料が足りる場合
		if (fuel >= getReqFuel(dist)) {
			return true;
		}
		//燃料が足りない場合
		else {
			return false;
		}
	}

	//----- メソッド：X方向にdx・Y方向にdy移動 -----//・・・★追加
	/*	燃料が足りたら移動
	 * 		移動距離の反映
	 * 		燃料の反映
	 */
	void move(double bx, double by, double dx, double dy) {
		//移動距離の表示
		System.out.printf("\t▶直線距離 %.2f (km) の移動になります。\n", getDist(dx, dy));
		//X方向にdx・Y方向にdy移動する燃料が燃費から計算して可能な場合、移動
		if (canMove(getDist(dx, dy))) {
			//座標を更新
			//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
			x = add(x, bx);
			y = add(y, by);
			//消費燃料をナビゲーション
			System.out.printf("\t▶▶%.2f (L) 消費し、移動しました。\n", getReqFuel(getDist(dx, dy)));
			//燃料を更新
			fuel = subtractVal(fuel, getReqFuel(getDist(dx, dy)));
		}
		//移動できないときは給油を促す
		else {
			//必要燃料の表示
			System.out.printf("\t▶▶%.2f (L) 移動に必要です。\n", getReqFuel(getDist(dx, dy)));
			//足りない燃料容量を求める
			//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
			double enoughFuel = subtractVal(getReqFuel(getDist(dx, dy)), fuel);
			//給油したとしたら、給油後の燃料はタンク容量を基準にどれくらい余裕があるか（-だとオーバーしている）
			//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
			double fuelDifference = subtractVal(fuelTank, getReqFuel(getDist(dx, dy)));
			//燃料が足りない場合給油を促す
			if (enoughFuel > 0) {
				System.out.printf("\t▶▶▶%.2f (L) 燃料が足りないため移動できません。給油してください。\n", enoughFuel);
			}
			//必要燃料がタンク容量を超える場合警告
			if (fuelDifference < 0) {
				System.out.printf("\t   ※必要燃料がタンク容量を %.2f (L) オーバーします。注意してください。\n", - fuelDifference);
			}
		}
		System.out.println("移動プログラム終了。");
		//改行
		System.out.println("");
	}

	//----- メソッド：給油 -----//・・・★追加
	void refueling() {
		//給油を続行するかどうかのセレクトナンバ
		//-1:初期値,0:給油プログラム終了,1:給油プログラム続行
		int againNum = -1;

		//途中で給油プログラムを終了できるようにラベルを設定
		loup1 :
		//満タンになるか、給油完了を選択するまで、再度給油するかを尋ねるためのかたまり
		do {
			//満タンまでの容量を求める
			//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換し、最後に小数点第二位を四捨五入している
			double fuelFullDifference = subtractVal(fuelTank, fuel);

			//満タンの場合給油終了
			if (fuelFullDifference <= 0.00) {
				System.out.println("\t▶既に満タンです！");
				break loup1;
			}
			//満タンじゃない場合給油開始
			else {
				//給与可能容量をナビゲーション
				System.out.printf("\t▶満タンまであと %.2f (L) です。\n", (fuelFullDifference));
				//給油量（自然数）
				double refuelingFuel = 0.00;
				//くりかえしのかたまり
				do {
					//給油量を聞く(自然数）
					System.out.print("\t\t給油量[L]：");
					//refuelingFuelに入力された給油量を格納
					refuelingFuel = stdIn.nextDouble();
					//給油量が0と言われた
					if (refuelingFuel == 0.00) {
						//給油しないのかの確認をするためのかたまり
						do {
							//0か1で給油するかしないかを決める
							System.out.print("\t給油しませんか？（しない・・・0/する・・・1）");
							//給油を続行するかどうかのセレクトナンバ変数（初期値:-1）に、入力値を格納
							againNum = stdIn.nextInt();
							//改行
							System.out.println("");
							//0のとき
							if (againNum == 0) {
								//給油プログラムを終わる
								break loup1;
							}
							//1のとき
							else if (againNum == 1) {
								//給油プログラム最初から
								continue loup1;
							}
						//0と1以外が入力されたら聞き直す
						} while (againNum != 0 || againNum != 1);
					}
				} while (refuelingFuel < 0.00);

				//改行
				System.out.println("");

				//給油後の燃料
				//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換、最後に小数点第二位を四捨五入している
				double fuelAfter = add(fuel, refuelingFuel);
				//給油後の燃料がタンク容量を基準とした時、どれくらい余裕があるか（-だとオーバーしている）
				//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換、最後に小数点第二位を四捨五入している
				double fuelAfterDifference = subtractVal(fuelTank, fuelAfter);

				//給油後の燃料合計が、燃料タンク容量をオーバーする場合、給油不可
				if (fuelAfter > fuelTank) {
					//オーバー量をナビゲーション
					System.out.printf("\t▶▶%.2f (L) 給油オーバーです。\n", (- fuelAfterDifference));
				}
				//給油してもタンク容量を超えない場合、給油可能
				else {
					//燃料残量を更新
					//実際の計算は、浮動小数点型同時の計算の為、一度BigDecimal型に変換、最後に小数点第二位を四捨五入している
					fuel = add(fuel, refuelingFuel);
					//タンクの空き容量をナビゲーション
					//満タンの場合
					if (fuel == fuelTank) {
						System.out.println("\t▶▶給油完了。満タンです！");
						break loup1;
					}
					//満タンではない場合
					else {
						System.out.printf("\t▶▶あと %.2f (L) 給油できます。\n", fuelAfterDifference);
					}
				}
			}
			//再度給油を行うかを聞くかたまり
			do {
				//0か1で給油続行するかを判断する
				System.out.print("\t給油を続けますか？（No・・・0/Yes・・・1）");
				//給油を続行するかどうかのセレクトナンバ変数（初期値:-1）に、入力値を格納
				//途中で0Lの給油入力があり、給油を続けている場合againNumは1になっている
				againNum = stdIn.nextInt();
				//改行
				System.out.println("");
				//0のとき
				if (againNum == 0) {
					//給油プログラム終了
					break loup1;
				}
				//1のとき
				else if (againNum == 1) {
					//給油プログラム最初から
					continue loup1;
				}
			//0と1以外なら聞き直す
			} while (againNum != 0 || againNum!= 1);

		//まだ満タンではない、もしくは給油続行変数が1である間はループＯＫ
		} while (fuel != fuelTank || againNum == 1);

		//給油プログラム終了のメッセージ
		System.out.println("給油プログラム終了。");
		//改行
		System.out.println("");
	}
}
/**************************************************************************************/

/***************************Carクラスをテストするクラス内容****************************
 * クラス名：Ensyu08_02
 * 自分の車を登録して、実行メニューを表示
 * メニュー1～4を選択肢、各プログラムを実行する
 */
public class Ensyu08_02 {

	//----- Scannerメソッド：stdInにキーボードからの入力値を初期設定 -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- double型xを入力してもらい、xの絶対値を返却するメソッド -----//
	static double getAbsolute (double x) {
		//絶対値を格納する変数を用意
		double absolutedouble;
		//xが正の値（0も含む）なら絶対値はx
		if (x >= 0) {
			absolutedouble = x;
		}
		//負の値なら絶対値は-x
		else {
			absolutedouble = -1 * x;
		}
		//返却値
		return absolutedouble;
	}

	//----- mainメソッド -----//
	public static void main(String[] args) {
		//車のデータを入力させる(名前・ナンバー・車幅・車高・車長・燃料タンク容量・燃費・燃料残量)
		System.out.println("▼車のデータを登録してください。");
		System.out.print("             名前：");		String name = stdIn.next();
		System.out.print("         ナンバー：");		int number = stdIn.nextInt();
		System.out.print("         車幅[mm]：");		int width = stdIn.nextInt();
		System.out.print("         車高[mm]：");		int height = stdIn.nextInt();
		System.out.print("         車長[mm]：");		int length = stdIn.nextInt();
		System.out.print("燃料タンク容量[L]：");		double fuelTank = stdIn.nextDouble();
		System.out.print("       燃費[km/L]：");		double fuelEconomy = stdIn.nextDouble();
		System.out.print("      燃料残量[L]：");		double fuel = stdIn.nextDouble();
		//改行
		System.out.println("");

		//現在の入力値で、myCarとして、Carオブジェクトを作成
		Car myCar = new Car (name, number, width, height, length, fuelTank, fuelEconomy, fuel);

		//メニュー選択ナンバ
		int selectNum = 0;
		//終了するまで続ける
		do {
			//現在のステータスを表示
			myCar.putStatus();

			//メニュー1～4を選択してもらうためのかたまり
			do {
				//メニュー4種類表示
				System.out.println("(1)この車について");
				System.out.println("(2)移動する");
				System.out.println("(3)給油する");
				System.out.println("(4)終了");
				//1～4を入力してもらう
				System.out.print("\tSelect：");
				//入力された値をメニュー選択ナンバ（初期値:0）に保管
				selectNum = stdIn.nextInt();
				//設定されていないメニューナンバが選ばれたときエラーメッセージ
				if (selectNum < 1 || selectNum > 4) {
					System.out.println("1～4を入力してください。");
				}
				//改行
				System.out.println("");
			//1～4以外が入力されたら聞き直す
			} while (selectNum < 1 || selectNum > 4);

			//各プログラムの実行
			switch (selectNum) {
				//----- (1)この車について -----
				case 1: {
					//システムに登録してある以下を表示
					//登録名称・ナンバー・車幅(mm)・車高(mm)・車長(mm)・燃料タンク容量(L)・燃費(km/L)
					myCar.putSpec();
				break; }

				//----- (2)移動する -----
				case 2: {
					//移動の登録を行う
					//x,yは変位なので、ベクトル量（方向を含む）、そのため負も入力可能
					System.out.print("X方向の変位量[km]：");		double x = stdIn.nextDouble();
					System.out.print("Y方向の変位量[km]：");		double y = stdIn.nextDouble();
					//x,yそれぞれの移動距離（スカラー）を求める→絶対値を求める
					double dx = getAbsolute(x);
					double dy = getAbsolute(y);
					//x,yそれぞれの変位量から、移動距離と必要燃料をステータスに反映させる
					//もし燃料残量が足りずに移動できない場合は移動登録を行わない
					myCar.move(x, y, dx ,dy);
				break; }

				//----- (3)給油する -----
				case 3: {
					//給油を行う
					//給油量を聞き、タンク容量を超えなければ給油可
					myCar.refueling();
				break; }

				//----- (4)終了 -----
				case 4: {
				break; }
			}
		//1～3が入力されていれば車のメニューを表示し続ける
		}while (selectNum != 4);
	}
}
/**************************************************************************************/


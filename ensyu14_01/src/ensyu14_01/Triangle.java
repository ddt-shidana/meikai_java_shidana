/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-1 p463
 * 	ここに示した図形クラス群を利用するプログラム例を作成せよ。
 *
 * パッケージ名:ensyu14_01
 * 作成日:2022/03/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu14_01;

/**
 * 概要：	三角形の図形を表す抽象クラス。<BR>
 * 補足：<BR>
 * 			このクラスは、2次元の図形を表す抽象クラスDimension_2から派生したクラス。<BR>
 * 			本クラスのインスタンスを生成することはできない。<BR>
 * 			具体的な四角形のクラスは、このクラスから派生させる。<BR>
 * 	@see Shape
 * 	@see Dimension_2
 */
public abstract class Triangle  extends Dimension_2 implements Plane2DF {

	//----- フィールド -----//
	/**
	 * 概要：	三角形の底辺を表すint型のフィールド。
	 */
	protected int width;

	/**
	 * 概要：	三角形の高さを表すint型のフィールド。
	 */
	protected int height;

	//----- コンストラクタ -----//
	/**
	 * 概要：	三角形を生成するコンストラクタ。
	 * @param width 三角形の幅、int型
	 * @param height 三角形の高さ、int型
	 */
	public Triangle(int width, int height) {
		//このクラスの各フィールドに、各引数を設定
		this.width = width;
		this.height = height;
	}

	//----- アクセッサ（ゲッタメソッド）：各長さを取得 -----//
	/**
	 * 概要：	三角形の底辺の長さを取得する。
	 * @return	width 三角形の底辺の長さ、int型
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * 概要：	三角形の高さの長さを取得する。
	 * @return	height 三角形の高さの長さ、int型
	 */
	public int getHeight() {
		return height;
	}

	//----- アクセッサ（セッタメソッド）：各長さを設定 -----//
	/**
	 * 概要：	三角形の底辺の長さを設定する。
	 * @param width 三角形の底辺の長さ、int型
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * 概要：	三角形の高さの長さを設定する。
	 * @param width 三角形の底辺の高さ、int型
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	//----- メソッド：2次元の図形の面積を求める -----//
	/**
	 * 概要：	三角形の図形の面積を求めるメソッド。<BR>
	 * 補足：<BR>
	 * 			このメソッドの本体は、クラスDimension_2から派生するクラスで実装する。<BR>
	 */
	@Override
	public double getArea2() {
		return (double)(width * height) / 2;
	}

	//----- メソッド：図形情報の表示と、図形の描画を行う -----//
	/**
	 * 概要：<BR>
	 * 			以下の2つのステップを順次行うメソッド。<BR>
	 * 			Step 1.	メソッドtoStringが返却する文字列を表示して改行。<BR>
	 * 			Step 2.	メソッドdrawを呼び出しての図形の描画。<BR>
	 * 			Step 3. メソッドgetArea()を呼び出して、面積を表示。<BR>・・・★オーバーライド分
	 * 補足：	このクラスの派生クラス全共通のメソッド。
	 */
	@Override
	public void print() {
		//抽象メソッドtoStringを表示
		System.out.println(toString());
		//抽象メソッドdrawを呼び出し
		draw();
		//2次元図形の面積を表示
		//小数点以下が0の場合
		if(getArea2() == (int) getArea2()) {
			//整数部のみで表示
			System.out.printf("\t面積：%d", (int)getArea2());
		}
		//小数点以下がある場合
		else {
			//小数部も表示
			System.out.printf("\t面積：%s",getArea2());
		}
		//改行
		System.out.println("");
	}
}

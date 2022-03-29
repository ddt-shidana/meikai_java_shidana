/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13-2 p415
 * 	図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
 * 	左下が直角のもの、右下が直角のもの、右上が直角のもの追加すること。
 * 	直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること。
 *
 * パッケージ名:ensyu13_02
 * 作成日:2022/03/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package ensyu14_01;

import java.util.Scanner;

//===================== メインクラス：図形クラス群をテストするクラス =====================//
/**
 * 概要：	図形クラス群（Shapeとその派生クラス）をテストするクラス。
 */
public class Ensyu14_01 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- 続行の確認を行うメソッド -----//
	/**
	 * 概要：	続行の確認を入力値（0か1）で決めるメソッド。
	 * @return retryNum == 1 （入力値が1の時true）
	 */
	static boolean confirmRetry() {
		//繰り返すかどうかの選択ナンバを格納する変数を用意
		int retryNum;
		//繰り返すか繰り返さないか（1か0か）をきくかたまり
		do {
			//繰り返すかどうかを聞く
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			//入力された値をretryNumとして扱う
			retryNum = stdIn.nextInt();
			//0と1以外が入力された場合のエラーメッセージ
			if (retryNum < 0 || retryNum > 1) {
				System.out.println("0か1を入力してください。");
			}
		//0と1以外が入力されている間はループ
		} while (retryNum < 0 || retryNum > 1);
		//1が入力されている間はtrue
		return retryNum == 1;
	}

	//----- 長さを聞くメソッド -----//
	/**
	 * 概要：	テストで描画する図形の大きさ（長さ、幅、高さ）を入力値から得るメソッド。
	 * @param caseSt （決めたい図形の長さの部位名称文字列）
	 * @return longInt （決めたい図形の長さ、int型）
	 */
	static int longInt(String caseSt) {
		//長さを格納する変数を用意
		int longInt;
		//長さが1未満のとき聞き直すためのかたまり
		do {
			//長さを聞く
			System.out.print(caseSt + "：");
			//入力値を長さとして扱う
			longInt = stdIn.nextInt();
			//1未満のときエラーメッセージ
			if (longInt < 1) {
				System.out.print("1以上を入力してください。");
			}
		//1未満の時ループ
		} while(longInt < 1);
		//返却値は入力値から得た長さ
		return longInt;
	}


	//----- mainメソッド -----//
	/**
	 * 概要： メインメソッド。<br>
	 * 詳細：<br>
	 * Step 1. 表示する図形の個数を入力値で決める。<br>
	 * Step 2. 表示する図形の種類（点・水平直線・垂直直線・長方形）を入力値から決める。<br>
	 * Step 3. 表示する各図形描画に必要な値（直線の長さ or 長方形の幅・高さ）をキーボードの入力値から決める。<br>
	 * Step 4. 1～3で決めた表示する図形を、順番に表示する。表示方法は「図形情報」「図形描画」「1行空白行」とする。<br>
	 */
	public static void main(String[] args) {

		//プログラム開始のメッセージ
		System.out.println("図形クラス群をテストするプログラムを開始します。");
		//見やすいように改行
		System.out.println("");

		//テストを繰り返しできるように、プログラムのかたまりをdoでかこう
		do {
			//----- 表示する図形の個数を決める -----//
			//図形の個数（Shapeクラス型配列の要素数となる）を保存する変数を用意
			int artN;
			//artN >= 1となるまで聞き直す為のかたまり
			do {
				//表示する図形の個数を決める
				System.out.print("図形は何個：");
				//入力値を図形の個数（Shapeクラス型配列の要素数）として扱う
				artN = stdIn.nextInt();
				//artN < 1 の場合のエラーメッセージ
				if (artN < 1) {
					System.out.println("1個以上を指定してください。");
				}
			//artNが1未満の間ループ
			} while(artN < 1);

			//表示する図形情報を保存する為、先にスーパークラスであるShape型配列を用意
			Shape[] shape = new Shape[artN];

			//----- 表示する図形の種類を決める -----//
			//1～artN番目の図形の種類を決めるループ
			for (int nItr = 0; nItr < artN; nItr++) {
				//図形の種類ナンバを保存する変数を用意（初期値0/範囲1～4）
				int selectShapeN = 0;
				//1 <= selectShapeN <= 6 となるまで聞き直すかたまり
				do {
					//ヘッダと、選択できる図形の種類を表示
					System.out.print((nItr + 1) + "番の図形の種類（1…点／2…水平線分／3…垂直線分／4…長方形／5…平行四辺形／6…直角二等辺三角形）：");
					//入力値をselectShapeNとして扱う
					selectShapeN = stdIn.nextInt();
					//1～6以外が入力された場合のエラーメッセージ
					if (selectShapeN < 1 || selectShapeN > 6) {
						System.out.println("1～6を選択してください。");
					}
				//1～6以外が入力されている間はループ
				} while(selectShapeN < 1 || selectShapeN > 6);
				//表示する図形情報を作成し、shapeに格納
				//表示する図形の種類で分岐
				switch (selectShapeN) {
				//1…点
				case 1: {
					//スーパークラスShape型の変数に、点を表示するサブクラスのインスタンス(実引数なし）を参照させる
					shape[nItr] = new Point();
					//ここでswitchを抜ける
					break;
				}
				//2…水平直線
				case 2: {
					//スーパークラスShape型の変数に、長さを実引数にもつサブクラス(水平直線)のインスタンスを参照させる
					shape[nItr] = new HorzLine(longInt("長さ"));
					//ここでswitchを抜ける
					break;
				}
				//3…垂直直線
				case 3: {
					//スーパークラスShape型の変数に、長さを実引数にもつサブクラス(垂直直線)のインスタンスを参照させる
					shape[nItr] = new VirtLine(longInt("長さ"));
					//ここでswitchを抜ける
					break;
				}
				//4…長方形
				case 4: {
					//スーパークラスShape型の変数に、幅・高さを実引数にもつサブクラス(長方形)のインスタンスを参照させる
					shape[nItr] = new Rectangle(longInt("幅"), longInt("高さ"));
					//ここでswitchを抜ける
					break;
				}
				//5…平行四辺形
				case 5: {
					//スーパークラスShape型の変数に、底辺・高さを実引数にもつサブクラス(平行四辺形)のインスタンスを参照させる
					shape[nItr] = new Parallelogram(longInt("底辺"), longInt("高さ"));
					//ここでswitchを抜ける
					break;
				}
				//6…直角二等辺三角形
				case 6: {
					//直角の位置4パターンのどれにするかを決めるためのセレクトナンバ変数を用意(初期値0/1～4)
					int rightAngSelectN = 0;
					//4パターンのどれにするか決めるかたまり
					do {
						//質問内容と選択肢を表示
						System.out.print("直角二等辺三角形の直角の位置（1…左下／2…左上／3…右下／4…右上）：");
						//入力値をrightAngSelectNとして扱う
						rightAngSelectN = stdIn.nextInt();
						//1～4以外入力された場合のエラーメッセージ
						if (rightAngSelectN < 1 || rightAngSelectN > 4) {
							System.out.println("1～4を入力してください。");
						}
					//1～4以外が入力されている間はループ
					} while(rightAngSelectN < 1 || rightAngSelectN > 4);
					//1～4で分岐
					switch (rightAngSelectN) {
					//1…左下
					case 1: {
						//スーパークラスShape型の変数に、辺の長さを実引数にもつサブクラス(左下直角二等辺三角形)のインスタンスを参照させる
						shape[nItr] = new IsoRTriangle_LD(longInt("辺の長さ"));
						//ここでswitchを抜ける
						break;
					}
					//2…左上
					case 2: {
						//スーパークラスShape型の変数に、辺の長さを実引数にもつサブクラス(左上直角二等辺三角形)のインスタンスを参照させる
						shape[nItr] = new IsoRTriangle_LU(longInt("辺の長さ"));
						//ここでswitchを抜ける
						break;
					}
					//3…右下
					case 3: {
						//スーパークラスShape型の変数に、辺の長さを実引数にもつサブクラス(右下直角二等辺三角形)のインスタンスを参照させる
						shape[nItr] = new IsoRTriangle_RD(longInt("辺の長さ"));
						//ここでswitchを抜ける
						break;
					}
					//4…右上
					case 4: {
						//スーパークラスShape型の変数に、辺の長さを実引数にもつサブクラス(右上直角二等辺三角形)のインスタンスを参照させる
						shape[nItr] = new IsoRTriangle_RU(longInt("辺の長さ"));
						//ここでswitchを抜ける
						break;
					}
					}
				}
				}
			}

			//見やすいように改行
			System.out.println("");

			//1～artN番目の図形を表示するループ
			//shape配列の中身を順番に表示させる
			for (Shape sValue : shape) {
				//表示する図形の説明を表示し、その下に図形を描画する
				sValue.print();
				//図形が描画し終わったら改行
				System.out.println("");
			}
		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());

		//見やすいように改行
		System.out.println("");
		//プログラム終了のメッセージ
		System.out.println("プログラムを終了しました。");
	}
}
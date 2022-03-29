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

import java.util.Scanner;

//===================== メインクラス：着せ替え可能なロボットペットクラスをテストするクラス =====================//
/**
* 概要：	図形クラス群（Shapeとその派生クラス）をテストするクラス。
*/
public class Ensyu14_02 {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- mainメソッド -----//
	public static void main(String[] args) {
		//ペット型クラス変数にペットクラスまたはその派生クラスのインスタンス参照を初期設定
		RobotPet[] petArray = { new RobotPet("ヨルハ二号B型", "マスター"),
							new RobotPet("ヨルハ九号S型", "マスター"),
							new RobotPet("ドラえもん", "のび太")
						  };


		//petArrayの各要素を順番に処理
		for (RobotPet pValue : petArray) {
			//起動させる
			pValue.play();
			//ペットに自己紹介をさせる
			pValue.introduce();
			//メニューセレクトナンバ
			int menuN = 0;

			//1～2が選択されている間は繰り返す
			do {
				//1～3を選択するまでループ
				do {
					//メニューを表示
					System.out.print("何をしますか？（1…着せ替え／2…お仕事／3…終了）：");
					//入力値をメニューセレクトナンバとして使用
					menuN = stdIn.nextInt();
					//1～3以外は入力されたときのエラーメッセージ
					if (menuN < 1 || menuN > 3) {
						System.out.println("1～3を指定してください。");
					}
				//1～3以外が入力されている間は聞き直すループ
				} while (menuN < 1 || menuN > 3);
				//改行
				System.out.println();
				//メニューごとに分岐
				switch (menuN) {
					//着せ替え
					case 1: {
						//現在のスキンを表示
						System.out.println("■現在のスキン：" + pValue.skinSt(pValue.getSkin()));
						//変更の案内
						System.out.println("変更後のスキンを選んでください。");
						System.out.print(" (0…漆黒／1…深紅／2…柳葉／3…露草／4…豹柄／それ以外…無地)：");
						//入力値をskinNumとして扱う
						int skinNum = stdIn.nextInt();
						//変更する
						pValue.changeSkin(skinNum);
						//改行
						System.out.println();
						//ここでスイッチ分脱出
						break;
					}
					//お仕事
					case 2: {
						//お仕事セレクトナンバを用意
						int workNum = -1;
						//0～2以外が入力されたらききなおすかたまり
						do {
							//お仕事の案内
							System.out.print("どのお仕事にいたしますか？ (0…掃除／1…洗濯／2…炊事)：");
							//入力値をworkNumとして扱う
							workNum = stdIn.nextInt();
							//0～2以外が入力されたらエラーメッセージ
							if(workNum < 0 || workNum > 2) {
								System.out.println("0～2で指定してください。");
							}
						//0～2以外が入力されたら聞き直すループ
						} while (workNum < 0 || workNum > 2);
						//お仕事する
						pValue.work(workNum);
						//改行
						System.out.println();
						//ここでスイッチ分脱出
						break;
					}
					//終了
					case 3: {
						pValue.stop();
						//改行
						System.out.println();
						break;
					}
				}
			//menuNが0または1の間はループ
			} while (menuN == 1 || menuN == 2);
		}
	}

}

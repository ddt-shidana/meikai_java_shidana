/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習9-2 p323
 * 	日付クラス第3版を利用するプログラムを作成せよ。
 * 	すべてのコンストラクタの働きを確認できるようにすること。
 *
 * パッケージ名:ensyu09_02
 * クラス名:Ensyu09_02
 * 作成日:2022/03/17
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu09_02;

import static java.util.Calendar.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/***************************************日付クラス【第3版】を利用する***************************************
 * クラス名：Ensyu09_02
 */
public class Ensyu09_02 {

	//----- Scannerメソッド：stdInにキーボードからの入力値を初期設定 -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- 日付タイトル(日付クラスのインスタンス名)を決めるメソッド -----//
	/*	引数e		:既に登録してある日付の個数
	 * 	引数list	:既に登録してある日付のタイトルが登録順に保存してある配列リスト
	 */
	static void determinName(List<String> nameList) {
		//登録する日付タイトルを聞く
		System.out.print("\t登録名：");
		//日付タイトルを文字列で受け取る
		String title = stdIn.next();
		//新たに登録する日付タイトルをリストに追加
		nameList.add(title);
		//改行
		System.out.println();
	}

	//----- 日付を決める(日付クラスのインスタンスを作成する）メソッド1 -----//
	/*	引数e		:既に登録してある日付の個数
	 * 	引数list	:既に登録してある日付クラスのインスタンスが登録順に保存してある配列リスト
	 */
	static void determinDay(List<Day> dayList) {
		//新たに登録する日付クラスのインスタンスをリスト最後尾に追加
		dayList.add(new Day());
	}

	//----- 日付を決める(日付クラスのインスタンスを作成する）メソッド2 -----//
	/*	引数e		:既に登録してある日付の個数
	 * 	引数array	:既に登録してある日付クラスのインスタンスが登録順に保存してある配列
	 * 	引数year	:登録する年数
	 */
	static void determinDay(List<Day> dayList, int year) {
		//新たに登録する日付クラスのインスタンスをリスト最後尾に追加
		dayList.add(new Day(year));
	}

	//----- 日付を決める(日付クラスのインスタンスを作成する）メソッド3 -----//
	/*	引数e		:既に登録してある日付の個数
	 * 	引数array	:既に登録してある日付クラスのインスタンスが登録順に保存してある配列
	 * 	引数year	:登録する年数
	 * 	引数month	:登録する月数
	 */
	static void determinDay(List<Day> dayList, int year, int month) {
		//新たに登録する日付クラスのインスタンスをリスト最後尾に追加
		dayList.add(new Day(year, month));
	}

	//----- 日付を決める(日付クラスのインスタンスを作成する）メソッド4 -----//
	/*	引数e		:既に登録してある日付の個数
	 * 	引数array	:既に登録してある日付クラスのインスタンスが登録順に保存してある配列
	 * 	引数year	:登録する年数
	 * 	引数month	:登録する月数
	 *  引数date	:登録する日数
	 */
	static void determinDay(List<Day> dayList, int year, int month, int date) {
		//新たに登録する日付クラスのインスタンスをリスト最後尾に追加
		dayList.add(new Day(year, month, date));
	}

	//----- 登録済みの日付を表示するメソッド -----//
	static void printDayAll(List<String> nameList, List<Day> dayList) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //登録済みの日付を表示する
	    for(int i = 0; i < dayArray.length; i++) {
	    	//登録ナンバー
			System.out.print("\tNo." + i);
			//登録名
			System.out.print(" " + nameArray[i]);
			//日付
			System.out.print(" " + dayArray[i] + "\n");
	    }
		//改行
		System.out.println();
	}

	//----- 日付を複製する(日付クラスのインスタンスを作成する）メソッド5 -----//
	static void determinDay(List<String> nameList, List<Day> dayList) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
    	//どの日付を複製するかを聞く
    	System.out.println("以下から、複製する日付Noを選んでください。：");
	    //登録済みの日付を表示する
    	printDayAll(nameList, dayList);
	    //選択用変数(初期値:-1)
	    int selectIdx = -1;
	    //どの日付を複製するかきめるかたまり
	    do {
	    	//番号を選んでもらう
			System.out.print("\t\tSelectNo.:");
	    	//入力値を選択用変数に受け取る
	    	selectIdx = stdIn.nextInt();
	    	//0～登録済み件数外の値が入力された時のエラーメッセージ
	    	if(selectIdx < 0 || selectIdx >= dayArray.length) {
				System.out.println("0～" + (dayArray.length - 1) + "の中から選択してください。");
	    	}
	    //0～登録済み件数外の値が入力されたら聞き直す
	    } while (selectIdx < 0 || selectIdx >= dayArray.length);
	    //選択した日付を複製したものを、日付クラスの配列リストに追加
		dayList.add(dayArray[selectIdx]);
		//改行
		System.out.println();
	}

	//----- 登録した日付を表示するメソッド -----//
	static void printSetDay(List<String> nameList, List<Day> dayList) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //配列の最後尾が最新の登録データなので、それを表示
		System.out.print("\tNo." + dayArray.length + " " + nameArray[nameArray.length - 1]);
		System.out.println(" " + dayArray[dayArray.length - 1]);
	}

	//----- 日付No.を選択するメソッド -----//
	static int selectDayNum(List<String> nameList, List<Day> dayList) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //選択用変数(初期値:-1)
	    int selectIdx = -1;
	    //どの日付を表示するかきめるかたまり
	    do {
	    	//どの日付にするか聞く
	    	System.out.println("日付Noを選んでください。（0～" + (dayArray.length - 1) + ")：");
	    	//番号を選んでもらう
			System.out.print("\tSelectNo.:");
	    	//入力値を選択用変数に受け取る
	    	selectIdx = stdIn.nextInt();
	    	//0～登録済み件数外の値が入力された時のエラーメッセージ
	    	if(selectIdx < 0 || selectIdx >= dayArray.length) {
				System.out.println("0～" + (dayArray.length - 1) + "の中から選択してください。");
	    	}
			//改行
			System.out.println();
	    //0～登録済み件数外の値が入力されたら聞き直す
	    } while (selectIdx < 0 || selectIdx >= dayArray.length);
	    return selectIdx;
	}

	//----- 選択した日付No.の登録日付データを表示するメソッド -----//
	static void printSelectDay(List<String> nameList, List<Day> dayList) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    int selectIdx = selectDayNum(nameList, dayList);
	    //配列のインデックスがselectIdxの要素データが欲しい情報なので、それを表示
		System.out.print("\tNo." + selectIdx + " " + nameArray[selectIdx]);
		System.out.println(" " + dayArray[selectIdx]);
		//改行
		System.out.println();
	}

	//----- 日付No.を指定して登録日付データを表示するメソッド -----//
	static void printSelectDay(List<String> nameList, List<Day> dayList, int selectIdx) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //配列のインデックスがselectIdxの要素データが欲しい情報なので、それを表示
		System.out.print("\tNo." + selectIdx + " " + nameArray[selectIdx]);
		System.out.println(" " + dayArray[selectIdx]);
		//改行
		System.out.println();
	}

	//----- 0か1で閲覧ymdを判定するメソッド -----//
	static boolean is1(int num) {
		do {
			//0か1以外の時エラーメッセージ
			if(num < 0 || num > 1) {
				System.out.println("0か1を入力してください。");
				break;
			}
		} while (num < 0 || num > 1);
		return (num < 0 || num > 1) ;
	}

	//----- 選択した日付No.の登録日付データの指定ymdを閲覧するメソッド -----//
	static void getSelectDay(List<String> nameList, List<Day> dayList, int selectIdx) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //年月日それぞれをを入力するかしないかの判定用変数（0か1）
	    int isGetY = -1;
	    int isGetM = -1;
	    int isGetD = -1;
		//閲覧したい場合1を、閲覧しない場合は0を入力してもらう
		System.out.println("各年月日の閲覧を・・・する→1/しない→0 で入力してください。");
	    do {
			//年の取得
			System.out.print("\t年：");
			//年を見るか見ないか
			isGetY = stdIn.nextInt();
	    } while (is1(isGetY));
	    do {
			//月の取得
			System.out.print("\t月：");
			//月を見るか見ないか
			isGetM = stdIn.nextInt();
	    } while (is1(isGetM));
	    do {
			//日の取得
			System.out.print("\t日：");
			//日を見るか見ないか
			isGetD = stdIn.nextInt();
	    } while (is1(isGetD));
		//年月日少なくとも一つが1の場合
		if (isGetY == 1 || isGetM == 1 || isGetD == 1) {
			//年月日すべてを閲覧したい場合はyyyy/mm/dd(aaa)で表示
			if (isGetY == 1 && isGetM == 1 && isGetD == 1) {
			    //配列のインデックスがselectIdxの要素データが欲しい情報なので、それを表示
				System.out.print("\tNo." + selectIdx + " " + nameArray[selectIdx]);
				System.out.println(" " + dayArray[selectIdx]);
				//改行
				System.out.println();
			}
		//年月日全て表示しない場合は、年・月・日にわけて欲しい情報を表示
			else {
			    //ヘッダを表示
				System.out.println("\tNo." + selectIdx + " " + nameArray[selectIdx]);
				//Yを表示したいとき
				if (isGetY == 1) {
					System.out.println("\t 年：" + dayArray[selectIdx].getYear());
				}
				//Mを表示したいとき
				if (isGetM == 1) {
					System.out.println("\t 月：" + dayArray[selectIdx].getMonth());
				}
				//Dを表示したいとき
				if (isGetD == 1) {
					System.out.println("\t 日：" + dayArray[selectIdx].getDate());
				}
				//改行
				System.out.println();
			}
		}
	//メソッド終了
	}

	//----- 選択した日付No.の登録日付データの指定ymdを変更するメソッド -----//
	static void setSelectDay(List<String> nameList, List<Day> dayList, int selectIdx) {
		//各リストを配列に変換
		String[] nameArray = new String[ nameList.size() ];
	    Day[] dayArray = new Day[ dayList.size() ];
	    nameList.toArray(nameArray);
	    dayList.toArray(dayArray);
	    //配列のインデックスがselectIdxの要素データを変更しようとしているので、変更データを表示
		System.out.println(" 以下のデータを変更します。");
		System.out.print("\tNo." + selectIdx + " " + nameArray[selectIdx]);
		System.out.println(" " + dayArray[selectIdx]);
	    //年月日それぞれをを入力するかしないかの判定用変数（0か1）
	    int isSetY = -1;
	    int isSetM = -1;
	    int isSetD = -1;
		//閲覧したい場合1を、閲覧しない場合は0を入力してもらう
		System.out.println("各年月日の変更を・・・する→1/しない→0 で入力してください。");
	    do {
			//年の取得
			System.out.print("\t年：");
			//年を見るか見ないか
			isSetY = stdIn.nextInt();
	    } while (is1(isSetY));
	    do {
			//月の取得
			System.out.print("\t月：");
			//月を見るか見ないか
			isSetM = stdIn.nextInt();
	    } while (is1(isSetM));
	    do {
			//日の取得
			System.out.print("\t日：");
			//日を見るか見ないか
			isSetD = stdIn.nextInt();
	    } while (is1(isSetD));

		//年月日少なくとも一つが1の場合
		if (isSetY == 1 || isSetM == 1 || isSetD == 1) {
			//年月日すべてを閲覧したい場合はyyyy/mm/dd(aaa)で表示
			if (isSetY == 1 && isSetM == 1 && isSetD == 1) {
				//年の変更
				System.out.print("\t年（変更後）：");
				//変更後の値を入力値から得る
				int afterY = stdIn.nextInt();
				//月の変更
				System.out.print("\t月（変更後）：");
				//変更後の値を入力値から得る
				int afterM = stdIn.nextInt();
				//日の変更
				System.out.print("\t日（変更後）：");
				//変更後の値を入力値から得る
				int afterD = stdIn.nextInt();
				//変更する
				dayArray[selectIdx].set(afterY, afterM, afterD);
			}
		//年月日全て表示しない場合は、年・月・日にわけて欲しい情報を表示
			else {
			    //ヘッダを表示
				System.out.println("\tNo." + selectIdx + " " + nameArray[selectIdx]);
				//Yを変更したいとき
				if (isSetY == 1) {
					//年の変更
					System.out.print("\t年（変更後）：");
					//変更後の値を入力値から得る
					int afterY = stdIn.nextInt();
					//変更する
					dayArray[selectIdx].setYear(afterY);
				}
				//Mを変更したいとき
				if (isSetM == 1) {
					//月の変更
					System.out.print("\t月（変更後）：");
					//変更後の値を入力値から得る
					int afterM = stdIn.nextInt();
					//変更する
					dayArray[selectIdx].setMonth(afterM);
				}
				//Dを変更したいとき
				if (isSetD == 1) {
					//日の変更
					System.out.print("\t日（変更後）：");
					//変更後の値を入力値から得る
					int afterD = stdIn.nextInt();
					//変更する
					dayArray[selectIdx].setDate(afterD);
				}
				//改行
				System.out.println();
			}
		    //配列のインデックスがselectIdxの要素データを変更しようとしているので、変更データを表示
			System.out.println(" 変更後の日付は以下の通りです。");
			System.out.print("\tNo." + selectIdx + " " + nameArray[selectIdx]);
			System.out.println(" " + dayArray[selectIdx]);
		}
	//メソッド終了
	}

	//----- mainメソッド -----//
	public static void main(String[] args) {

	//日付プログラムに今日の日付を初期設定しておく--------------------------
		//日付タイトル(日付クラスのインスタンス名)を保存しておく配列リストを用意
		List<String> dayName = new ArrayList<String>();
		//初期値は「today」
		dayName.add("today");
		//日付インスタンスのリスト配列を生成(初期値に今日の日付を格納）
		List<Day> day = new ArrayList<Day>();
		//初期値に入れる今日の日付を取得
		GregorianCalendar today = new GregorianCalendar();
		//初期値は今日の日付
		day.add(new Day(today.get(YEAR), today.get(MONTH) + 1, today.get(DATE)));
	//-----------------------------------------------------------------------
		//日付クラスを確認するメニュー3つを選択する
		int menuSelectNum = 0;
		//日付プログラム自体にラベルをつける
		Menu:
		//日付プログラムのかたまり
		do {
			//メニュー選択のかたまり
			do {
				//どのメニューを実行するか聞く
				System.out.println(" --- メニュー ------------------------------");
				System.out.println("  ①日付の登録");
				System.out.println("  ②日付の閲覧");
				System.out.println("  ③日付の変更");
				System.out.println("  ④終了");
				System.out.println("--------------------------------------------");
				System.out.print("\tSelectMenu：");
				//入力値をmenuSelectNumに受け取る
				menuSelectNum = stdIn.nextInt();
				//1～4以外が入力されたときのエラーメッセージ
				if(menuSelectNum < 1 || menuSelectNum > 4) {
					System.out.println("メニューは1～4の中から選んでください。");
					//改行
					System.out.println();
				}
				//④終了が選択されたら、日付プログラムを終了させる
				if (menuSelectNum == 4) {
					//改行
					System.out.println();
					break Menu;
				}
			//1～4以外が入力されたら聞き直す
			} while(menuSelectNum < 1 || menuSelectNum > 4);
			//改行
			System.out.println();

			//各メニューの実行
			switch (menuSelectNum) {
			//(1)日付の登録--------------------------------------------------------------------------------
			case 1: {
				//日付登録スタートのナビ----------------------
				System.out.println("日付登録をはじめます。");
				//登録の続行をするかのセレクトナンバ変数
				int determinConNum = -1;
				//連続登録をする時のプログラムのかたまり
				do {
					//1.登録開始-----------------------------------
					//日付クラスに用意されているコンストラクタ5パターンで登録可能
					/*	各日付の登録方法は
					 * 	日付タイトルを決め、必要引数をもらう
					 */
					//日付タイトル(日付クラスのインスタンス名)を決める（リストが更新される）
					determinName(dayName);

					//5種類のコンストラクタが用意されているので、どれで日付を登録するかを決めるセレクトナンバを用意
					int selectSetNum = 0;
					//どのパターンで登録するかを決めるかたまり（1～5）
					do {
						//1～5のどれで登録するか聞く
						System.out.println("登録方法を1～5で選んでください。");
				 		//(1)引数無し（初期値を呼び出し）
						System.out.println(" (1)1年1月1日を登録");
				 		//(2)int型引数 × 1つ
						System.out.println(" (2)yyyy年1月1日を登録(yyyyを指定)");
				 		//(3)int型引数 × 2つ
						System.out.println(" (3)yyyy年mm月1日を登録(yyyyとmmを指定)");
				 		//(4)int型引数 × 3つ
						System.out.println(" (4)yyyy年mm月dd日を登録(yyyyとmmとddを指定)");
				 		//(5)自分自身のクラス型引数 × 1つ
						System.out.println(" (5)既に登録してある日付を指定して登録");
						//選択入力ナビ
						System.out.print("\tSelect：");
						//入力値をセレクトナンバとして受け取る
						selectSetNum = stdIn.nextInt();
						//1～5以外が入力されたら聞き直す
						if(selectSetNum < 1 || selectSetNum > 5) {
							System.out.println("1～4の中から選択してください。");
						}
					//1～5以外が入力されたら聞き直す
					} while(selectSetNum < 1 || selectSetNum > 5);
					//改行
					System.out.println();
					//1～5で分岐
					switch (selectSetNum) {
			 			//(1)引数無し（初期値を呼び出し）
						case 1: {
							determinDay(day);
						break;
						}
				 		//(2)int型引数 × 1つ
						case 2: {
							//年数を聞く
							System.out.print("\t年：");
							//int型引数 × 1つを受け取る
							int yearInt = stdIn.nextInt();
							//dayリストに新規登録
							determinDay(day, yearInt);
						break;
						}
				 		//(3)int型引数 × 2つ
						case 3: {
							//年数を聞く
							System.out.print("\t年：");
							//int型引数 1つ目を受け取る
							int yearInt = stdIn.nextInt();
							//月数を聞く
							System.out.print("\t月：");
							//int型引数 2つ目を受け取る
							int monthInt = stdIn.nextInt();
							//dayリストに新規登録
							determinDay(day, yearInt, monthInt);
						break;
						}
				 		//(4)int型引数 × 3つ
						case 4: {
							//年数を聞く
							System.out.print("\t年：");
							//int型引数 1つ目を受け取る
							int yearInt = stdIn.nextInt();
							//月数を聞く
							System.out.print("\t月：");
							//int型引数 2つ目を受け取る
							int monthInt = stdIn.nextInt();
							//日数を聞く
							System.out.print("\t日：");
							//int型引数 3つ目を受け取る
							int dateInt = stdIn.nextInt();
							//dayリストに新規登録
							determinDay(day, yearInt, monthInt, dateInt);
						break;
						}
				 		//(5)自分自身のクラス型引数 × 1つ
						case 5: {
							//dayリストに既存の日付を複製したものを登録
							determinDay(dayName, day);
						}
					//switchの終了
					}
					//改行
					System.out.println();
					//2.登録完了---------------------------------------
					System.out.println("以下の内容で登録が完了しました。");
					//登録内容を表示
					printSetDay(dayName, day);
					//改行
					System.out.println();
					//3.登録続行確認-------------
					do {
						//登録をつづけるかどうかを聞く
						System.out.print("登録を続けますか？(続ける・・・1/終わる・・・0)：");
						//入力値をdeterminConNumとして受け取る
						determinConNum = stdIn.nextInt();
						//0と1以外の時エラーメッセージ
						if (determinConNum != 0 && determinConNum != 1) {
							System.out.println("\t0か1を選択してください。");
						}
					//0と1以外なら聞き直す
					} while (determinConNum != 0 && determinConNum != 1);
				//determinConNumが1(続行)の間ループする
				} while (determinConNum == 1);

				//4..登録終了
				System.out.println("日付登録を終了しました。");
				//改行
				System.out.println();
			//case1をブレイク
			break;
			//(1)日付の登録ここまで------------------------------------------------------------------------
			}

			//(2)日付の閲覧--------------------------------------------------------------------------------
			case 2: {
				//日付閲覧スタートのナビ----------------------
				System.out.println("日付の閲覧を行います。");
				//閲覧の続行をするかのセレクトナンバ変数
				int determinConNum = -1;
				//連続閲覧をする時のプログラムのかたまり
				do {
					//3種類の閲覧方法から選ぶためのセレクトナンバ
					int selectGetNum = 0;
					//1～3を選ぶかたまり
					do {						//1～5のどれで登録するか聞く
						System.out.println("閲覧方法を1～3で選んでください。");
				 		//(1)引数無し（初期値を呼び出し）
						System.out.println(" (1)登録済みの全日付一覧を閲覧");
				 		//(2)int型引数 × 1つ
						System.out.println(" (2)本日の日付から必要情報を閲覧");
				 		//(3)int型引数 × 2つ
						System.out.println(" (3)登録済みの日付から必要情報を閲覧");
						//選択入力ナビ
						System.out.print("\tSelect：");
						//入力値をセレクトナンバとして受け取る
						selectGetNum = stdIn.nextInt();
						//1～3以外が入力されたら聞き直す
						if(selectGetNum < 1 || selectGetNum > 3) {
							System.out.println("1～3の中から選択してください。");
						}
					//1～3以外が入力されたら聞き直す
					} while (selectGetNum < 1 || selectGetNum > 3);
					//改行
					System.out.println();
					//1～3で分岐
					switch (selectGetNum) {
					//(1)登録済みの全日付一覧を表示
					case 1: {
						printDayAll(dayName, day);
					break;
					}
					//(2)本日の日付を表示
					case 2: {
						getSelectDay(dayName, day, 0);
					break;
					}
					//(3)登録済みの日付から表示する日付を選ぶ
					case 3: {
						getSelectDay(dayName, day, selectDayNum(dayName, day));
					break;
					}
					}

					//閲覧続行確認-------------
					do {
						//閲覧をつづけるかどうかを聞く
						System.out.print("閲覧を続けますか？(続ける・・・1/終わる・・・0)：");
						//入力値をdeterminConNumとして受け取る
						determinConNum = stdIn.nextInt();
						//0と1以外の時エラーメッセージ
						if (determinConNum != 0 && determinConNum != 1) {
							System.out.println("\t0か1を選択してください。");
						}
					//0と1以外なら聞き直す
					} while (determinConNum != 0 && determinConNum != 1);
				//determinConNumが1(続行)の間ループする
				} while (determinConNum == 1);

			//4..登録終了
			System.out.println("日付の閲覧を終了しました。");
			//改行
			System.out.println();
			//case2のをブレイク
			break;
			//(2)日付の閲覧ここまで---------------------------------------------------------------------
			}

			//(3)日付の変更--------------------------------------------------------------------------------
			case 3: {
				//日付変更スタートのナビ----------------------
				System.out.println("日付の変更を行います。");
				//閲覧の続行をするかのセレクトナンバ変数
				int changeConNum = -1;
				//連続閲覧をする時のプログラムのかたまり
				do {
					setSelectDay(dayName, day, selectDayNum(dayName, day));

					//閲覧続行確認-------------
					do {
						//変更をつづけるかどうかを聞く
						System.out.print("変更を続けますか？(続ける・・・1/終わる・・・0)：");
						//入力値をdeterminConNumとして受け取る
						changeConNum = stdIn.nextInt();
						//0と1以外の時エラーメッセージ
						if (changeConNum != 0 && changeConNum != 1) {
							System.out.println("\t0か1を選択してください。");
						}
					//0と1以外なら聞き直す
					} while (changeConNum != 0 && changeConNum != 1);
				//determinConNumが1(続行)の間ループする
				} while (changeConNum == 1);

			//変更終了
			System.out.println("日付の変更を終了しました。");
			//改行
			System.out.println();
			//case3をブレイク
			break;
			//(3)日付の変更ここまで---------------------------------------------------------------------
			}

			//メニュースイッチここまで
			}
		//menuSelectNumが1～3の間は日付プログラムを起動し続ける
		} while (menuSelectNum >= 1 && menuSelectNum <= 3);

		//終了メッセージ
		System.out.println("日付プログラムを終了しました。");
	}
//クラスの内容ここまで
}
/**************************************************************************************/


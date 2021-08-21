/*
 * 日付クラス第4版を以下のように改良せよ。
 * ・引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦1年1月1日で初期化するのではなく、プログラム実行時の日付で初期化する。
 * ・引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する。
 * 
 * さらに、以下に示すメソッドを追加すること
 * ・年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド
 * ・年内の残り日数を求めるメソッド
 * ・他の日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
 * ・二つの日付の前後関係を判定するクラスメソッド
 * ・日付を一つ後ろに進めるメソッド（日付が2012年12月31日であれば、2013年1月1日に更新する）
 * ・次の日の日付を返却するメソッド
 * ・日付を一つ前に戻すメソッド
 * ・前の日の日付を返却するメソッド
 * ・日付をn日後ろに進めるメソッド
 * ・n日後の日付を返却するメソッド
 * ・日付をn日前に戻すメソッド
 * ・n日前の日付を返却するメソッド
 * etc…
 * 
 * 作成者：山下
 * 作成日：2021/08/21
 * 
 * 
 */

package E_10_04;

import java.util.Scanner;

public class E_10_04 {

	// Scannerクラスをインスタンス化
	static Scanner standardInput = new Scanner(System.in);

	/**
	 * 日付の情報を出力するメソッド
	 * 
	 * @param day：Dayクラスの値を取得
	 */
	static void dateInfomation(Day day) {

		// 引数として取得したDayクラスの値の各情報を出力する
		System.out.println("--------------------------------------");
		System.out.println(day + " の日付に関する情報");
		System.out.println("閏年" + (day.leapYear() ? "です。" : "ではありません。"));
		System.out.println("年内経過日数：" + day.dayOfYearPrgress() + "日");
		System.out.println("年内残り日数：" + day.dayLeftOfYear() + "日");
		System.out.println("--------------------------------------");

	}

	/**
	 * 日付を変更するメソッド
	 * 
	 * @param day：Dayクラスの年月日値を取得
	 */
	static void changeDays(Day day) {

		int inputChange= 0;
		
		System.out.println("【1】年月日を変更   【2】年を変更");
		System.out.println("【3】月を変更      【4】日を変更");
		System.out.println("【5】1日進める      【6】1日戻す");
		System.out.println("【7】入力値日進める  【8】入力値日戻す");

		do {
			System.out.print("入力値：");
			// 変更する入力値を変数に代入させる
			inputChange = standardInput.nextInt();
		} while(inputChange <= 0 || inputChange > 8);
		
		// 年月日をint型変数で定義する
		int year = 0;
		int month = 0;
		int date = 0;

		// 読み込んだ値の分日を進めるor戻すためのint型変数を定義する
		int inputDate = 0;

		// 入力を促す文言を出力し、年月日それぞれの変数に入力値を代入させる

		// 入力値が1または2の場合
		if (inputChange == 1 || inputChange == 2) {
			// 年数の入力を促す文言を出力し、入力値を変数に代入させる
			System.out.print("年：");
			year = standardInput.nextInt();
		}

		// 入力値が1または3の場合
		if (inputChange == 1 || inputChange == 3) {
			// 月の入力を促す文言を出力し、入力値を変数に代入させる
			// 1～12の値が入力されるまで繰り返す
			do {
				System.out.print("月：");
				month = standardInput.nextInt();
			} while (month <= 0 || month > 12);

		}

		// 入力値が1または4の場合
		if (inputChange == 1 || inputChange == 4) {
			// 日の入力を促す文言を出力し、入力値を変数に代入させる
			// 1～31の値が入力されるまで繰り返す
			do {
				System.out.print("日：");
				date = standardInput.nextInt();
			} while (date <= 0 || date > 31);

		}

		// 入力値が7または8の場合
		if (inputChange == 7 || inputChange == 8) {
			System.out.print("何日：");
			inputDate = standardInput.nextInt();
		}

		// 変更する内容を読み込んだ値によって分けるため、switch文を定義する
		switch (inputChange) {
		case 1:
			day.set(year, month, date);
			break;
		case 2:
			day.setYear(year);
			break;
		case 3:
			day.setMonth(month);
			break;
		case 4:
			day.setDate(date);
			break;
		case 5:
			day.laterDay();
			break;
		case 6:
			day.beforeDay();
			break;
		case 7:
			day.laterDays(inputDate);
			break;
		case 8:
			day.beforeDays(inputDate);
			break;
		}

		// 選択された結果で更新された文言を出力する
		System.out.println("【" + day + "】に変更されました。");

	}

	/**
	 * 他の日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
	 * 
	 * @param day：日付クラスの取得値
	 */
	static void dayCompare(Day day) {
		// 比較対象日付の入力を促す文言を出力する
		System.out.println("比較する日付を入力してください。");
		// 入力を促す文言を出力し、年月日それぞれの変数に入力値を代入させる
		System.out.print("年：");
		int year = standardInput.nextInt();

		System.out.print("月：");
		int month = standardInput.nextInt();

		System.out.print("日：");
		int date = standardInput.nextInt();

		// 比較対象の日付を生成するため、Dayクラスの引数に入力値を定義し、インスタンス化する
		Day dayTarget = new Day(year, month, date);

		// 比較結果を返却するメソッドを呼び出し、結果を代入させる
		int compareResult = day.daySituatiionTo(dayTarget);
		
		System.out.print("現在の日付情報：");
		
		// 比較結果を出力させるため、引数で取得したdayを出力させる
		System.out.println(day);

		// 比較結果を出力させるため、daySituatiionToメソッドで返却された-1,0,1の値によって出力文言をswitch文で分ける
		switch (compareResult) {
		case -1:
			System.out.println("が前の日付です。");
			break;
		case 1:
			System.out.println("が後の日付です。");
			break;
		case 0:
			System.out.println("と同じ日付です。");
			break;
		}

	}

	/**
	 * 前後の日付けを求めるメソッド
	 * 
	 * @param day：日付クラスの取得値
	 */
	static void beforeAfterDay(Day day) {

		// 選択肢の入力値を保持するため、int型変数を定義する
		int inputType = 0;

		// 選択肢となる1～4の値が入力されるまで繰り返す
		do {
			System.out.println(day + "　の前後の日付けを求めます。下記から数字を選択してください。");
			System.out.print("【1】翌日  【2】前日  【3】(入力値)日後  【4】(入力値)日前\n入力値：");
			// 入力値から、各4つのパターンを分けるためint型変数に代入させる
			inputType = standardInput.nextInt();
		} while (inputType <= 0 || inputType > 4);

		// 入力値分前後の日付け求めるため、int型変数を定義する
		int inputDate = 0;

		// inputTypeの値が3 もしくは 4の場合
		if (inputType == 3 || inputType == 4) {
			System.out.print("何日：");
			inputDate = standardInput.nextInt();
		}

		System.out.print("変更結果：");
		// 選択肢によって処理を分けるため、switch文を定義する
		switch (inputType) {
		// 翌日の日付けをgetNextDayメソッドで呼び出す
		case 1:
			System.out.println(day.getNextDay());
			break;
		// 前日の日付けをgetBeforeDayメソッドで呼び出す
		case 2:
			System.out.println(day.getBeforeDay());
			break;
		// 入力値分の日にちを進めた年月日をafterDayメソッドで呼び出す
		case 3:
			System.out.println(day.afterDay(inputDate));
			break;
		// 入力値分の日にちを戻した年月日をbeforeDayメソッドで呼び出す
		case 4:
			System.out.println(day.beforeDay(inputDate));
			break;
		}
	}

	public static void main(String[] args) {

		//　月と日の入力値を代入させるため、変数を定義する
		int inputMonth = 0;
		int inputDate = 0;

		//年月日の入力を促す文言を出力する
		System.out.println("日付を入力してください。");

		System.out.print("年：");
		int inputYear = standardInput.nextInt();

		// 1～12の値が入力されるまで繰り返す処理
		do {
			System.out.print("月：");
			inputMonth = standardInput.nextInt();
		} while (inputMonth <= 0 || inputMonth > 12);

		// 1～31の値が入力されるまで繰り返す処理
		do {
			System.out.print("日：");
			inputDate = standardInput.nextInt();
		} while (inputDate <= 0 || inputDate > 31);

		// 読み込んだ年月日の値を引数としてDayクラスをインスタンス化する
		Day day = new Day(inputYear, inputMonth, inputDate);

		// 入力された値によって、処理を切り替えるため、int型変数を定義する
		int inputMenu = 0;

		//メニューの入力を終了するフラグ
		boolean menuFlg = false;

		// 終了の数字メニュー【5】が入力されるまで繰り返す処理
		do {

			// 実行するメニューの値を出力する
			System.out.print("\n【1】日付の情報 【2】日付を変更 【3】他日付との比較を行う\n【4】前後の日付を求める 【5】入力を終了 \n入力値：");

			// 入力された値によって、処理を切り替えるため、int型変数に代入させる
			inputMenu = standardInput.nextInt();

			// 入力された値によって処理を分けるため、switch文を定義する
			switch (inputMenu) {
			// 日付に関する情報を表示させる処理
			case 1:
				// 日付の情報を出力するメソッドの引数にdayを定義する
				dateInfomation(day);
				break;
			// 日付けを変更させる処理
			case 2:
				// 日付を変更させるメソッドの引数にdayを定義する
				changeDays(day);
				break;
			// 日付の比較を行う処理
			case 3:
				// 日付の比較を行うメソッドの引数にdayを定義する
				dayCompare(day);
				break;
			// 前後の日付を求める処理
			case 4:
				// 前後の日付を求めるメソッドの引数にdayを定義する
				beforeAfterDay(day);
				break;
			//入力を終了する処理
			case 5:
				//入力を終了するため、フラグをfalseからtrueにする
				menuFlg = true;
				System.out.println("入力を終了します。");
			}

		} while (menuFlg == false);

	}

}

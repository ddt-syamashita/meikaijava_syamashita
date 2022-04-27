package E_15_08;

public class CalendarView {

	// 各月の日付を表示させるため、配列int型で定義
	static int[] eachMonthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/**
	 * 曜日を求めるメソッド
	 * 
	 * @param year：年の取得値
	 * @param month：月の取得値
	 * @param day：日の取得値
	 * @return：取得した年月日の曜日をint型で返却
	 */
	static int dayOfWeek(int year, int month, int day) {
		// 引数monthの値が1または2の場合
		if (month == 1 || month == 2) {
			// 引数yearの値をデクリメント
			year--;
			month += 12;
		}
		// 取得した年月日の日曜日から土曜日まで0～6を返却するため、int型の値を返却
		return (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + day) % 7;
	}

	/**
	 * 閏年か調べるメソッド
	 * 
	 * @param year：年の取得値 
	 * @return：閏年の場合：1、それ以外の年：0 を返却
	 */
	static boolean isLeap(int year) {
		// 引数の年の取得値から閏年か判定し、結果を返却
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	/**
	 * 日数を返却するメソッド
	 * 
	 * @param year：年の取得値
	 * @param month：月の取得値
	 * @return：取得した年月の日数を返却
	 */
	static int monthDays(int year, int month) {

		// 引数monthの値が2月でないとき
		if (month-- != 2) {
			// 各月の日付を保持した配列の要素値を返却する
			return eachMonthDays[month];
		}
		// 引数monthの値が2月の場合、閏年か判定し、閏年の場合は、2月の日付けに対し1日プラスした値を返却
		return eachMonthDays[month] + (isLeap(year) ? 1 : 0);
	}

	/**
	 * カレンダーを表示するメソッド
	 * 
	 * @param year：年の取得値
	 * @param month：月の取得値
	 */
	void viewCalendar(int year, int month) {

		// 1日の曜日を特定するため、dayOfWeekメソッドから取得し、weekDaysに代入させる
		int weekDays = dayOfWeek(year, month, 1);

		// 引数で取得した年月の値からその月の日数を変数に代入
		int monthDaysValue = monthDays(year, month);

		// 日曜日～土曜日を出力
		System.out.println(" 日  月  火 水　木　金　土 ");

		// 1日が始まる曜日に表示を合わせるため、for文で繰り返し処理
		for (int i = 0; i < weekDays; i++) {
			// カレンダー表示させるためスペースを出力
			System.out.print("   ");
		}

		// 年月を取得してその月の日付けを出力するため、for文で日付分繰り返し処理
		for (int i = 1; i <= monthDaysValue; i++) {
			// 3桁表示とさせ、繰り返し変数に代入される値を出力
			System.out.printf("%3d", i);
			// 最後の曜日（土曜日）を表示させた場合、改行表示させる
			if (++weekDays % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}

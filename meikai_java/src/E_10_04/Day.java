package E_10_04;

import java.util.GregorianCalendar;

//日付クラス第4版
public class Day {
	// 年、月、日のフィールド値を定義する
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// 各月の日数を二次元配列で定義する
	private static int[][] monthDays = {
			// 令和の各月の日にち
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			// 閏年の各月の日にち
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	// 現在の日付を取得し、各フィールド値に年月日を代入させるコンストラクタ
	public Day() {
		// 現在の日付を取得するため、GregorianCalendarをインスタンス化する
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(year);
		this.month = today.get(month);
		this.date = today.get(date);
	}

	/**
	 * 年を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得
	 */
	public Day(int year) {
		this.year = year;
	}

	/**
	 * 年、月を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得
	 * @param month：月の値を取得
	 */
	public Day(int year, int month) {
		//フィールド値の年の値に引数のyearを代入させる
		this(year);
		//月のフィールド値に、引数monthの1～12として調整された値を代入させる
		this.month = adjustMonth(month);
	}

	/**
	 * 年、月、日を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得
	 * @param month：月の値を取得
	 * @param date：日の値を取得
	 */
	public Day(int year, int month, int date) {
		this(year, month);
		//引数のdateを日付の値を調整するため、adjustDayメソッドの引数に、年月日を定義する
		this.date = adjustDay(year, this.month, date);
	}

	/**
	 * 取得した値は閏年かを判定し返却するメソッド
	 * 
	 * @param i：年数を取得
	 * @return：閏年の判定結果を返却
	 */
	public static boolean leapYear(int year) {
		// 取得した整数の年の値が閏年ならtrueを返却させる
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	/**
	 * 引数として取得した年、月の日数を返却する
	 * 
	 * @param year：年としての値を取得
	 * @param month：月としての値を取得
	 * @return：取得した引数年月によってmonthDays配列の要素（日数）を返却する
	 */
	private static int dayOfMonth(int year, int month) {

		// 引数の年月値から、その月の日数としての要素を返却する
		return monthDays[leapYear(year) ? 1 : 0][month - 1];
	}

	/**
	 * int型の値を月の1～12の範囲として扱うため、調整するメソッド
	 * 
	 * @param month：int型の月として取得値
	 * @return：1～12の値を返却する
	 */
	private static int adjustMonth(int month) {
		// 取得したint型の月の値を1～12の値として調整し、返却する
		return month < 1 ? 1 : month > 12 ? 12 : month;
	}

	/**
	 * 年月の日付（1～31）を調整し、返却する。
	 * 
	 * @param getYear：年の値を取得
	 * @param getMonth：月の値を取得
	 * @param getDate：日の値を取得
	 * @return：取得した年月に合わせた、1～31の日にちを返却する。
	 */
	private static int adjustDay(int getYear, int getMonth, int getDate) {

		// 引数の値getDayが1よりも小さい場合
		if (getDate < 1) {
			// 初日となる1日として1を返却する
			return 1;
		}
		// 引数の値年月の日付をint型変数に代入させる
		int dateMax = dayOfMonth(getYear, getMonth);

		// 引数の値getDateが代入させたdateMaxよりも大きい場合、dateMaxの日にちを返却する。そうでない場合は、取得した引数値のgetDateを返却する。
		return getDate > dateMax ? dateMax : getDate;

	}

	/**
	 * 日付dを引数として取得するコンストラクタ
	 * 
	 * @param d：日付の取得値
	 */
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	/**
	 * 年の値を取得するメソッド
	 * 
	 * @return：フィールド値のyearを返却する
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 月の値を取得するメソッド
	 * 
	 * @return：フィールド値のmonthを返却する
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 日の値を取得するメソッド
	 * 
	 * @return：フィールド値のdateを返却する
	 */
	public int getDate() {
		return date;
	}

	/**
	 * 年の値を設定するメソッド
	 * 
	 * @param year；年を設定する値をint型引数として取得
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 月の値を設定するメソッド
	 * 
	 * @param month：月を設定する値をint型引数として取得
	 */
	public void setMonth(int month) {
		//月の値を調整する
		this.month = month;
	}

	/**
	 * 日の値を設定するメソッド
	 * 
	 * @param date：日を設定する値をint型引数として取得
	 */
	public void setDate(int date) {
		//日の値を調整する
		this.date = date;
	}

	/**
	 * 年月日をまとめて取得し、設定するメソッド
	 * 
	 * @param year：年を設定する値をint型引数として取得
	 * @param month：月を設定する値をint型引数として取得
	 * @param date：日を設定する値をint型引数として取得
	 */
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	/**
	 * 閏年かを判定するメソッド
	 * 
	 * @return：年を保持するフィールド値が、閏年かを判定するメソッド
	 */
	public boolean leapYear() {
		return leapYear(year);
	}

	/**
	 * 曜日を求めるメソッド
	 * 
	 * @return：曜日をint型で返却する
	 */
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	/**
	 * 引数として取得した値が、日付dと等しいかを判定するメソッド
	 * 
	 * @param d：日付の取得値
	 * @return：等しい場合、true。等しくない場合、falseを返却
	 */
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	/**
	 * 年月日、曜日の文字列表現を返却するメソッド
	 */
	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	/**
	 * 年内の経過日数を返却するメソッド
	 * 
	 * @return：経過日数を返却
	 */
	public int dayOfYearPrgress() {
		// 年内の経過日数を保持させるため、int型変数に日のフィールド値を代入させる
		int dayPrgress = date;

		// 1月～12月の日数を加えるためfor文を定義する
		for (int i = 1; i < month; i++) {
			// 経過日数を保持する変数に、dayOfMonthメソッドを使用し、経過日数を算出する
			dayPrgress += dayOfMonth(year, i);
		}
		// 経過日数を保持した変数を返却するため、return文を定義する
		return dayPrgress;
	}

	/**
	 * 年内の残り日数を返却するメソッド
	 * 
	 * @return：残り日数を返却
	 */
	public int dayLeftOfYear() {
		// 365日から経過日数（dayOfYearPrgress）と閏年であれば、1を引いた値をマイナスし、算出する
		return 365 + (leapYear(year) ? 1 : 0) - dayOfYearPrgress();
	}

	/**
	 * 二つの日付の前後関係を判定するメソッド
	 * 
	 * @param day1：1つ目の日付引数
	 * @param day2：2つ目の日付引数
	 * @return：1つ目の日付引数に対し、2つ目の日付引数が、前の場合：-1を返却。後の場合：1を返却、同日の場合：0を返却する
	 */
	public static int daySituation(Day day1, Day day2) {
		// 2つの引数のDayクラスの年が異なる場合
		if (day1.year > day2.year) {
			// 1を返却する
			return 1;
		}
		// 2つ目のDay引数のyearが大きい場合
		if (day1.year < day2.year) {
			// -1を返却する
			return -1;
		}

		// 2つの引数の年は等しいが、月が異なる場合
		if (day1.month > day2.month) {
			// 1を返却する
			return 1;
		}
		// 2つ目のDay引数のmonthが大きい場合
		if (day1.month < day2.month) {
			// -1を返却する
			return -1;
		}

		// 月も等しい場合、日にちの前後関係を調べるため、三項演算子で比較し、前日の場合は-1を、後日の場合は1を、同日の場合は0を返却する
		return day1.date > day2.date ? 1 : day1.date < day2.date ? -1 : 0;

	}

	/**
	 * 他の日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
	 * 
	 * @param day：前後関係を判定する日付
	 * @return：判定結果をdaySituationメソッドから返却する
	 */
	public int daySituatiionTo(Day day) {

		// 引数として取得した日付dayとの前後関係を判定する
		return daySituation(this, day);
	}

	/**
	 * 日付を一つ後ろに進めるメソッド（日付が2012年12月31日であれば、2013年1月1日に更新する）
	 */
	public void laterDay() {

		// 日付の値がdayOfMonthメソッドで算出した値よりも小さい場合
		if (date < dayOfMonth(year, month)) {
			// 日付を1日後ろに進める
			date++;
		} else {
			// 1日日付を進めた際、年をまたぐ場合
			if (++month > 12) {
				// 年をインクリメントする
				year++;
				// 月の値を1月として代入させる
				month = 1;
			}
			// 日にちの値を1日として代入させる
			date = 1;
		}
	}

	/**
	 * 次の日の日付を返却するメソッド
	 * 
	 * @return:次の日の日付を返却する
	 */
	public Day getNextDay() {
		// フィールド値の日付の値を保持したDayクラスをインスタンス化する
		Day getDay = new Day(this);
		// 現在保持している日にちの翌日を返却するため、dayLater()メソッドを定義する
		getDay.laterDay();

		// 翌日の日付を返却する
		return getDay;
	}

	/**
	 * 日付を一つ前に戻すメソッド
	 */
	public void beforeDay() {

		// 日付の値が1よりも大きい場合
		if (date > 1) {
			// 日付の値をデクリメントして、1つ前の日付に戻す
			date--;
		} else {
			// 1日日付を戻した際、年をまたぐ場合
			if (--month < 1) {
				// 年の値を前年に戻すため、デクリメントする
				year--;
				// 月の値を12月として代入させる
				month = 12;
			}

			// dayOfMonthを使用し、その年月の最終日を代入させる
			date = dayOfMonth(year, month);
		}
	}

	/**
	 * 前の日の日付を返却するメソッド
	 * 
	 * @return：前の日の日付を返却する
	 */
	public Day getBeforeDay() {
		// フィールド値の日付の値を保持したDayクラスをインスタンス化する
		Day getDay = new Day(this);
		// 現在保持している日にちの前日を返却するため、dayBefore()メソッドを定義する
		getDay.beforeDay();

		// 前日の日付を返却する
		return getDay;

	}

	
	/**
	 * 日付を引数の値分、後ろに進めるメソッド
	 * @param inputValue:日付を後ろに進める値
	 */
	public void laterDays(int inputValue) {

		// 引数の値が0よりも小さい場合
		if (inputValue < 0) {
			// 日にちを戻すメソッドを使用し、
			beforeDays(-inputValue);
			// 引数の値が0よりも大きい場合
		} else if (inputValue > 0) {
			// 日にちの値に対し、入力値を加算する
			date += inputValue;
			
			//dayOfMonthを引数として、年月を定義し、その年月の日付よりも大きい値が算出された場合の間、繰り返す処理
			while(date > dayOfMonth(year, month)) {
				//日付の値をdayOfMonthで取得した値分マイナスした値を代入させる
				date -= dayOfMonth(year, month);
				//monthの値が12よりも大きい場合
				if(++month > 12) {
					//年をまたぐため、年の値をインクリメントする
					year++;
					//最初の月（1月）を再定義するため、1を代入させる
					month = 1;
				}
			}			
		}
	}
	
	/**
	 * n日後の日付を返却するメソッド
	 * @param inputValue：何日後を指定する値を取得
	 * @return：取得した値日後の年月日を返却する
	 */
	public Day afterDay(int inputValue) {
		// フィールド値の日付の値を保持したDayクラスをインスタンス化する
		Day day = new Day(this);
		
		//引数の値をlaterDaysメソッドに定義し、後ろに進めた年月日を取得する
		day.laterDays(inputValue);
		//後ろに進められた年月日の値を返却する
		return day;
	}
	
	/**
	 * 日付を引数の値分、前に戻すメソッド
	 * @param inputValue：日付を前に戻す値
	 */
	public void beforeDays(int inputValue) {
		// 引数の値が0よりも小さい場合
		if (inputValue < 0) {
			// 日にちを戻すメソッドを使用し、
			laterDays(-inputValue);
			// 引数の値が0よりも大きい場合
		} else if (inputValue > 0) {
			// 日にちの値に対し、入力値を減算する
			date -= inputValue;
			
			//日付の値が1よりも小さい場合、繰り返す処理
			while(date < 1) {
				
				//monthの値が1よりも小さい場合
				if(--month < 1) {
					//年をまたぐため、年の値をデクリメントする
					year--;
					//最終月（12月）を再定義するため、monthに12を代入させる
					month = 12;
				}
				//日付の値に、前に戻した結果年月の日にちの値を代入させる
				date += dayOfMonth(year, month);
			}			
		}
	}
	
	
	/**
	 * n日前の日付を返却するメソッド
	 * @param inputValue:何日前を指定する値を取得
	 * @return：取得した値日前の年月日を返却する
	 */
	public Day beforeDay(int inputValue) {
		Day day = new Day(this);
		
		//引数の値をbeforeDaysメソッドに定義、前に戻した年月日を取得する
		day.beforeDays(inputValue);
		//前に戻された年月日の値を返却する
		return day;
	}

}

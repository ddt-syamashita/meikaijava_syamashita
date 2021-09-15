package E_9_03;

//日付クラス第3版
public class Day {
	// 年、月、日のフィールド値を定義する
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// 各コンストラクタを定義する
	public Day() {
	}

	/**
	 * 年を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得する
	 */
	public Day(int year) {
		this.year = year;
	}

	/**
	 * 年、月を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得する
	 * @param month：月の値を取得する
	 */
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	/**
	 * 年、月、日を引数として取得するコンストラクタ
	 * 
	 * @param year：年の値を取得する
	 * @param month：月の値を取得する
	 * @param date：日の値を取得する
	 */
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	/**
	 * 日付dを引数として取得するコンストラクタ
	 * 
	 * @param d：：日付の値を取得する
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
	 * @param year；年を設定する値をint型引数として取得する
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 月の値を設定するメソッド
	 * 
	 * @param month：月を設定する値をint型引数として取得する
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * 日の値を設定するメソッド
	 * 
	 * @param date：日を設定する値をint型引数として取得する
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * 年月日をまとめて取得し、設定するメソッド
	 * 
	 * @param year：年を設定する値をint型引数として取得する
	 * @param month：月を設定する値をint型引数として取得する
	 * @param date：日を設定する値をint型引数として取得する
	 */
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
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
	 * @param d：日付を取得する
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
}

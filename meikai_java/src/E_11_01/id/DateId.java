package E_11_01.id;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {

	// 何番までの識別番号を与えたかを判別するためのint型変数を定義する
	private static int counter;

	// 識別番号を定義する
	private int id;

	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);

		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);

		counter = y * 1000000 + m * 10000 + d * 100;
	}

	// コンストラクタ
	public DateId() {
		id += ++counter;
	}

	/**
	 * 識別番号を取得するメソッド
	 * 
	 * @return：識別番号を返却
	 */
	public int getId() {
		return id;
	}
}

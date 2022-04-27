
/**
 * コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。
 * コマンドラインから年のみが与えられた場合は、その年の1月から12月までのカレンダーを表示して、
 * 年と月が与えられた場合は、その月のカレンダーを表示して、年も月も与えられなかったら、現在のカレンダーを表示すること。
 * 
 * 作成者：山下
 * 作成日：2022/4/27
 * 
 */

package E_15_08;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class E_15_08 {

	public static void main(String[] args) {

		// 現在の年月を取得するため、CalendarViewクラスをインスタンス化する
		CalendarView calendar = new CalendarView();

		// 年の値を保持するyear変数を定義
		int year = 1;
		// 月の値を保持するmonth変数を定義
		int month = 1;

		// 引数に年月が与えられなかった場合
		if (args.length == 0) {
			// 現在の月カレンダーを表示するさせるため、GregorianCalendarをインスタンス化する
			GregorianCalendar today = new GregorianCalendar();
			// 現在の年を取得して、year変数に代入
			year = today.get(YEAR);
			// 現在の月を取得して、year変数に代入
			month = today.get(MONTH) + 1;
			
		// 引数に年月が与えられた場合
		} else {
			// 引数の数が1の場合（年の値まで取得した場合）
			if (args.length >= 1) {
				// 1つ目の引数の値をyear変数に代入させる
				year = Integer.parseInt(args[0]);
				// １つ目の引数の値が年の値として整数かどうかを判定
				if (year < 0) {
					// 0よりも小さい場合、不正を示す文字列を出力
					System.out.println("年の指定値が正しくありません引数の値を確認してください。：" + args[0]);
					// 処理を終了させるため、return文を定義
					return;
				}

			}
			// 引数の数が2以上の場合（年月の値まで取得した場合）
			if (args.length >= 2) {
				// 2つ目の引数の値をmonth変数に代入させる
				month = Integer.parseInt(args[1]);

				// 2つ目の引数の値が月の値として正しいか判定するためif文を定義
				if (month < 1 || month > 12) {
					// １～１２の値ではない場合、不正を警告する文字列を出力
					System.out.println("月の指定値が正しくありません。1~12の値が入力されているか引数の値を確認してください。：" + args[1]);
					// 処理を終了させるため、return文を定義
					return;
				}
			}
		}

		// 引数の値が0または、2以上の場合（年と月が与えられた場合）
		if (args.length == 0 || args.length >= 2) {

			// 年月として取得している引数の値を出力
			System.out.println("西暦" + year + "年" + month + "月のカレンダー");
			// 取得した引数値の年月をviewCalendarメソッドの引数に定義し、出力させる
			calendar.viewCalendar(year, month);
			// 年のみが引数として与えられた場合
		} else {
			// 年として取得している引数の値を出力
			System.out.println("西暦" + year + "年のカレンダー 1～12月分");

			// その年の１～１２月のカレンダーを出力させるためfor文を定義
			for (month = 1; month <= 12; month++) {
				// 出力する月の値month変数を出力
				System.out.println(month + "月 -----------------");
				// 取得した引数値の年に対して、１～１２月を繰り返し出力する
				calendar.viewCalendar(year, month);
				// 改行させるためprintlnを定義
				System.out.println();
			}
		}

	}

}

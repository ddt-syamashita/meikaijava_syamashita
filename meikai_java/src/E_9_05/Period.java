package E_9_05;

public class Period {

	// 開始日のフィールド値を定義する
	private Day from;
	// 終了日のフィールド値を定義する
	private Day to;

	/**
	 * 引数ありのコンストラクタを定義する
	 * 
	 * @param from：Day型の開始日として取得する
	 * @param to：Day型の終了日を取得する
	 */
	Period(Day from, Day to) {
		this.from = from;
		this.to = to;
	}


	/**
	 * 開始日を返却するメソッド
	 * 
	 * @return：フィールド値として保持している開始日を返却する
	 */
	public Day getFrom() {
		return from;
	}

	/**
	 * 終了日を返却するメソッド
	 * 
	 * @return：フィールド値として保持している終了日を返却する
	 */
	public Day getTo() {
		return to;
	}

	/**
	 * 文字列として結果を出力させる
	 */
	public String toString() {
		return String.format("【" + from + "～" + to + "】");
	}
}

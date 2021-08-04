package E_9_04;

public class Human {
	// 人間クラスの名前を定義する
	private String name;
	// 人間クラスの身長を定義する
	private int height;
	// 人間クラスの体重を定義する
	private int weight;
	// 人間クラスの誕生日を定義する
	private Day birthday;

	// 引数の値を各フィールドに値を代入させるコンストラクタを定義する
	Human(String name, int height, int weight, Day day) {
		// 各フィールド値に対し、引数の値を代入させる
		this.name = name;
		this.height = height;
		this.weight = weight;
		// Dayクラスをインスタンス化し、取得した値を引数として定義する
		this.birthday = new Day(day);
	}
	
	/**
	 * 人間クラスの名前の値を取得するメソッド
	 * 
	 * @return：フィールド値の名前を返却させる
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 誕生日の値を取得するメソッド
	 * 
	 * @return：フィールド値の誕生日の日付を返却させる
	 */
	public Day getBirthday() {
		return birthday;
	}
	
	/**
	 * 取得した人間クラスの情報を文字列として返却させるメソッド
	 */
	public String toString() {
		return "名前：" + name + "\n身長：" + height + "cm" + "\n体重：" + weight + "kg" + "\n誕生日：" + birthday + " 生まれ";
	}

}

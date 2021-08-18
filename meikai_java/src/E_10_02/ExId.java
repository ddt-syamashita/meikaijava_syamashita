package E_10_02;

public class ExId {

	// 何番までの識別番号を与えたかを保持するフィールド値
	static int counter = 0;

	// 識別番号を保持するフィールド値
	private int id;
	
	// 識別番号を取得した値分増やすフィールド値を定義する
	static int n = 1;

	// 識別番号をインクリメントさせるため、コンストラクタを定義する
	public ExId() {
		counter += n;
		id = counter;
	}
	
	/**
	 * 識別番号を返すメソッド
	 * 
	 * @return：識別番号を返却する
	 */
	public int getExId() {
		return id;
	}
	
	/**
	 * 最後に与えた識別番号を返すメソッド
	 * 
	 * @return：最終値の識別番号を返却する
	 */
	public static int getMaxExId() {
		return counter;
	}

	/**
	 * 識別番号を取得した値ずつ増やすための値を変更するメソッド
	 * 
	 * @param input：増やすための値を取得する
	 */
	static void changeN(int input) {
		n = input;
	}

}

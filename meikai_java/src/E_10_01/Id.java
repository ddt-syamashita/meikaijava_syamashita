package E_10_01;

public class Id {
	
	//何番までの識別番号を与えたかを保持するフィールド値
	static int counter = 0;
	
	//識別番号を保持するフィールド値
	private int id;
	
	//識別番号をインクリメントさせるため、コンストラクタを定義する
	public Id() {
		id = ++counter;
	}
	
	/**
	 * 識別番号を返すメソッド
	 * 
	 * @return：識別番号を返却する
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * 最後に与えた識別番号を返すメソッド
	 * 
	 * @return：最終値の識別番号を返却する
	 */
	public static int getMaxId() {
		return counter;
	}

}

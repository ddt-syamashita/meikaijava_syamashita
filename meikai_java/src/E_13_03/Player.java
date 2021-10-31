package E_13_03;

public abstract class Player {

	// ジャンケンの出す手を保持するint型hand変数を定義する
	int hand;

	/**
	 * 出した手をint型で返却する抽象メソッド
	 */
	public abstract int resultHand();

	/**
	 * 出した手をString型の文字列で返却する抽象メソッド
	 */
	public abstract String getHand();

}

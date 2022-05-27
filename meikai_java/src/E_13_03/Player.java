package E_13_03;

public abstract class Player {

	// ジャンケンの出す手を保持するint型hand変数を定義する（初期値は0～2以外とするため-1）
	int hand = -1;

	/**
	 * 出した手をint型で返却する抽象メソッド
	 */
	public abstract int resultHand();

}

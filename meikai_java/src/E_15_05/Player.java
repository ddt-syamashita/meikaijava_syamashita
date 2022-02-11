package E_15_05;

public abstract class Player {

	// ジャンケンの出す手を保持するint型hand変数を定義する
	int hand;

	/**
	 * 出した手をint型で返却する抽象メソッド
	 */
	public abstract int resultHand();

	/**
	 * 出した手の文言を出力するメソッド
	 * 
	 * @return：「0＝グー、1＝チョキ、2＝パー」 それぞれの文言を返却
	 */
	public String getHand() {

		// handの値が0だった場合
		if (hand == 0) {
			return "「グー」 を出しました。";
			// handの値が1だった場合
		} else if (hand == 1) {
			return "「チョキ」　を出しました。";
			// handの値が0と1以外だった場合
		} else {
			return "「パー」 を出しました。";
		}
	}

}

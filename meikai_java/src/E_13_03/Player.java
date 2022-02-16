package E_13_03;

public abstract class Player {

	// ジャンケンの出す手を保持するint型hand変数を定義する（初期値は0～2以外とするため-1）
	int hand = -1;

	/**
	 * 出した手をint型で返却する抽象メソッド
	 */
	public abstract int resultHand();

	/**
	 * 出した手をString型の文字列で返却する抽象メソッド
	 */
	public String getHand() {

		// hand変数の値がresultHand関数で取得されず-1だった場合
		if (hand == -1) {
			return "手が決められていません。0～２の値を入力してください";
			// handの値が0だった場合
		} else if (hand == 0) {
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

package E_13_03;

import java.util.Random;

public class ComputerPlayer extends Player {

	// Randomクラスをインスタンス化
	Random random = new Random();

	/**
	 * 出した手の結果をint型整数値として返却するメソッド
	 * 
	 * @return：乱数のint型の整数値を返却する
	 */
	public int resultHand() {
		// 0～2の値を乱数で生成し、hand変数に代入する
		hand = random.nextInt(3);
		// 乱数が代入されたhand変数を返却する
		return hand;
	}

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

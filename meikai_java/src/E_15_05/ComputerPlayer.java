package E_15_05;

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

}

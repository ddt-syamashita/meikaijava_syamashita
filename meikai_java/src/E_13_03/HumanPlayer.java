package E_13_03;

import java.util.Scanner;

public class HumanPlayer extends Player {

	// Scannerクラスをインスタンス化
	Scanner standardInput = new Scanner(System.in);

	/**
	 * 出した手の結果をint型整数値として返却するメソッド
	 * 
	 * @return：入力されたint型の整数値を返却する
	 */
	public int resultHand() {

		// 0～2の値が入力されるまで繰り返すため、do文を定義する
		do {
			// 人間プレーヤの出す手を代入させるため、入力を促す文言を出力
			System.out.print("人間プレーヤ　0：グー 1:チョキ 2：パー ：");
			hand = standardInput.nextInt();

			// 0～2以外の値が入力された場合、警告メッセージを出力する
			if (hand < 0 || hand > 2) {
				System.out.println("0～2の値を入力してください。\n");
			}

		} while (hand < 0 || hand > 2);

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

/**
 * 
 * ３人で行うジャンケンプログラムを作成せよ。プレーヤ３人のうち、コンピュータを2人として、人間を１人とすること。
 * また、問題13-3（p.443）で作成した、プレーヤクラスを利用すること。
 * 
 * 作成者：山下
 * 作成日：2022/2/11
 * 
 */

package E_15_05;

import java.util.Scanner;

public class E_15_05 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 人間プレーヤクラスをインスタンス化する。
		HumanPlayer human = new HumanPlayer();

		// 1人目のコンピュータをインスタンス化する
		ComputerPlayer computer1 = new ComputerPlayer();

		// 2人目のコンピュータをインスタンス化する
		ComputerPlayer computer2 = new ComputerPlayer();

		// もう一度ジャンケンするのか判定する変更を定義
		int retry;

		do {

			// 2人のコンピュータの手を生成する
			int computer1Hand = computer1.resultHand();
			int computer2Hand = computer2.resultHand();

			// 人間プレーヤの手を生成する
			int humanHand = human.resultHand();

			// ３人の出した手を出力する
			System.out.printf("それぞれ出した手は下記となります。\nコンピュータ１：" + computer1.getHand() + "\nコンピュータ2：" + computer2.getHand()
					+ "\nプレーヤ：" + human.getHand() + "\n");

			// 人間プレーヤとコンピュータ１のじゃんけんの結果判定
			int result1 = (humanHand - computer1Hand + 3) % 3;

			// 人間プレーヤとコンピュータ１のじゃんけんの結果判定
			int result2 = (humanHand - computer2Hand + 3) % 3;

			// プレーヤとが勝ちの場合
			if (result1 == 2 && result2 == 2) {
				System.out.println("プレーヤの勝ちです！");
				// コンピュータ1の勝ちの場合
			} else if (result1 == 1 && result2 == 0) {
				System.out.println("コンピュータ１の勝ちです。");
				// コンピュータ2の勝ちの場合
			} else if (result1 == 0 && result2 == 1) {
				System.out.println("コンピュータ2の勝ちです。");
				// プレーヤとコンピュータ１が勝ちの場合
			} else if (result1 == 0 && result2 == 2) {
				System.out.println("プレーヤとコンピュータ１の勝ちです。");
				// プレーヤとコンピュータ2が勝ちの場合
			} else if (result1 == 2 && result2 == 0) {
				System.out.println("プレーヤとコンピュータ2の勝ちです。");
				// コンピュータ1とコンピュータ2が勝ちの場合
			} else if (result1 == 1 && result2 == 1) {
				System.out.println("コンピュータ１とコンピュータ2の勝ちです。");
				// それ以外の場合で引き分けとなる文字列を出力する
			} else {
				System.out.println("引き分けです。");
			}
			
			//もう一度ジャンケンを行うか確認し、入力値によって繰り返すか終了させるためdo文を定義する
			do {
				System.out.print("もう一度？ 0：いいえ／1：はい　入力：");
				retry = standardInput.nextInt();
			} while (retry != 0 && retry != 1);

		// retryの値が1ではない場合繰り返す
		} while (retry == 1);

	}

}

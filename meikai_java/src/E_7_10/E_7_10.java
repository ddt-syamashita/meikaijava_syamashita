
/*
 * List 7-11 を拡張して、以下の四つの問題をランダムに出力するプログラムを作成せよ。
 *
 * x + y + z
 * x + y - z
 * x - y + z
 * x - y - z
 *
 * 作成者：山下
 * 作成日：2021/04/14
 */

package E_7_10;

import java.util.Random;
import java.util.Scanner;

public class E_7_10 {

	//Scannerクラスをインスタンス化する
	static Scanner standardInput = new Scanner(System.in);

	/**
	 * 入力値1が入力されるまで、入力を繰り返させるメソッド
	 * @return ：1の値が入力された場合trueを返却
	 */
	static boolean confirmRetry() {
		//もう一度繰り返す判定を行うため、int型変数を定義する
		int inputRetry;

		//入力値が1の場合まで繰り返す
		do {
			//入力を促す文言を出力させる。1の場合は、繰り返し入力させる
			System.out.println("もう一度？<Yes…１／No…0>：");
			//入力値をint型変数に代入させる
			inputRetry = standardInput.nextInt();
			//入力値変数が、0かつ1じゃない場合は、入力を繰り返す
		} while (inputRetry != 0 && inputRetry != 1);
		//入力値変数が1の場合、trueを返すため、return文を定義する
		return inputRetry == 1;
	}

	public static void main(String[] args) {

		//Randomクラスをインスタンス化する
		Random random = new Random();

		System.out.println("暗算力トレーニング！！");

		//入力値をint型変数に代入させる
		int inputAnswer;

		do {
			//各変数の値に生成した100～999までの乱数を代入させる
			int x = random.nextInt(900) + 100;
			int y = random.nextInt(900) + 100;
			int z = random.nextInt(900) + 100;

			//4つの問題をランダムに出力させるため、0～3の乱数を生成する
			int fourQuizNumber = random.nextInt(4);

			//正解が入力されるまで繰り返させるため、while文を定義する
			while (true) {

				//出題用の変数の乱数が0の場合
				if (fourQuizNumber == 0) {
					//一つ目の出題の計算式を出力させる
					System.out.print(x + " + " + y + " + " + z + " = ");
					//入力値を出題の解答と比較させるため、変数に代入させる
					inputAnswer = standardInput.nextInt();
					//入力値と、乱数によって出題された計算式の結果が同値の場合
					if (inputAnswer == (x + y + z)) {
						//繰り返し処理を終了させるため、breakを定義する
						break;
						//計算式の値に対し、入力値が異なる場合
					} else {
						//不正解を示す文言を出力させる
						System.out.println("違いますよ！");
					}
					//出題用の変数の乱数が1の場合
				} else if (fourQuizNumber == 1) {
					//二つ目出題の計算式を出力させる
					System.out.print(x + " + " + y + " - " + z + " = ");
					//入力値を出題の解答と比較させるため、変数に代入させる
					inputAnswer = standardInput.nextInt();
					//入力値と、乱数によって出題された計算式の結果が同値の場合
					if (inputAnswer == (x + y - z)) {
						//繰り返し処理を終了させるため、breakを定義する
						break;
						//計算式の値に対し、入力値が異なる場合
					} else {
						System.out.println("違いますよ！");
					}
					//出題用の変数の乱数が2の場合
				} else if (fourQuizNumber == 2) {
					//三つ目の出題の計算式を出力させる
					System.out.print(x + " - " + y + " + " + z + " = ");
					//入力値を出題の解答と比較させるため、変数に代入させる
					inputAnswer = standardInput.nextInt();
					//入力値と、乱数によって出題された計算式の結果が同値の場合
					if (inputAnswer == (x - y + z)) {
						//繰り返し処理を終了させるため、breakを定義する
						break;
						//計算式の値に対し、入力値が異なる場合
					} else {
						//不正解を示す文言を出力させる
						System.out.println("違いますよ！");
					}
					//出題用の変数の乱数が3の場合
				} else {
					//四つ目の出題の計算式を出力させる
					System.out.print(x + " - " + y + " - " + z + " = ");
					//入力値を出題の解答と比較させるため、変数に代入させる
					inputAnswer = standardInput.nextInt();
					//入力値と、乱数によって出題された計算式の結果が同値の場合
					if (inputAnswer == (x - y - z)) {
						//繰り返し処理を終了させるため、breakを定義する
						break;
						//計算式の値に対し、入力値が異なる場合
					} else {
						//不正解を示す文言を出力させる
						System.out.println("違いますよ！");
					}
				}
			}
			//入力値1が入力されるまで繰り返す処理を行う
		} while (confirmRetry());

	}

}

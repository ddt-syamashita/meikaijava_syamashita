
/*
 *
 * 1からnまでの全整数の和を求めて返却するメソッドを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/24
 *
 */

package E_7_04;

import java.util.Scanner;

public class E_7_04 {

	/**
	 *  引数の値までの全整数の和を求める
	 *  @param n：入力値を取得する
	 */
	static int sumUp(int n) {

		//和を求めるため、int型変数sumを定義する
		int sum = 0;

		//引数で取得された入力値までの値まで繰り返し処理を行うため、for文を定義する
		for (int i = 1; i <= n; i++) {
			//繰り返す度に和を求めるための変数に、繰り返し変数iの値を代入し、和を求める
			sum += i;
		}

		//繰り返し処理修正後、和を求めた変数を返すため、return文を定義する
		return sum;
	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//読み込んだ値を変数に代入するため、input変数を定義する
		int input = 0;

		//1以上の値が入力されるまで繰り返す
		do {

			//入力値を促す文言を出力させる
			System.out.print("整数：");

			//読み込んだ値をint型変数に代入する
			input = standardInput.nextInt();

		} while (0 >= input);

		//和を求めた関数を、出力結果の文言と共に出力させる。
		System.out.println("1から" + input + "までの全整数の和：" + sumUp(input));

	}

}

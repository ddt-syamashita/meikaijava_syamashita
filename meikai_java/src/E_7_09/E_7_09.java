
/*
 * 『正の整数値：』と表示してキーボードから正の整数値を読み込んで、その値を返却するメソッドreadPlusIntを作成せよ。
 * 0や負の値が入力されたら再入力させること。右の例であれば15を返却する。
 *   int readPlusInt()
 *
 * 作成者：山下
 * 作成日：2021/04/07
 */

package E_7_09;

import java.util.Scanner;

public class E_7_09 {

	/**
	 * 正の整数値を読み込み、その値を返却するメソッド
	 * @return：読み込んだ正の整数値を返却
	 */
	static int readPlusInt() {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力値を代入させる変数を定義する
		int input = 0;

		do {
			//入力を促す文言を出力させる
			System.out.print("正の整数値：");

			//入力された値を変数に代入させる
			input = standardInput.nextInt();

			//0と負の値が入力される場合は繰り返す処理
		} while (input <= 0);

		//正の値が入力値として代入された変数を返却させるため、return文を定義する
		return input;

	}

	public static void main(String[] args) {

		//正の整数値を返却するメソッドを定義する
		System.out.println(readPlusInt());
	}

}

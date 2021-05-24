/*
 * 配列a 全要素の合計を求めるメソッドsumOfを作成せよ。
 * 
 *   int sumOf(int[] a)
 * 
 * 作成者：山下
 * 作成日：2021/05/06
 */

package E_7_15;

import java.util.Scanner;

public class E_7_15 {

	/**
	 * 引数で取得した配列の全要素の合計を求めるメソッド
	 * @param a:配列を取得する
	 * @return:取得した配列要素の合計値を返却する
	 */
	static int sumOf(int[] a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		// 入力値をint型変数に代入させる
		int inputElement = 0;

		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {

			// 入力を促す文言を出力する
			System.out.print("要素数：");

			// 入力値をint型変数に代入させる
			inputElement = standardInput.nextInt();

		} while (inputElement <= 0);

		// 配列の合計を出力させるため、配列を生成する
		int arraySum[] = new int[inputElement];

		// 配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < arraySum.length; i++) {
			// 各要素に入力した値を代入させる
			System.out.print("arraySum[" + i + "] = ");
			arraySum[i] = standardInput.nextInt();
		}
		// 配列の要素合計を求めるsumOfメソッドを使用し、arraySumの合計出力させる
		System.out.print("arraySum合計：" + sumOf(arraySum));
	}
}

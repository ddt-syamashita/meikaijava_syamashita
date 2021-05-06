/*
 * 配列a　の要素の最小値を求めるメソッドminOfを作成せよ。
 *   int minOf(int[] a)
 * 
 * 作成者：山下
 * 作成日：2021/05/06
 * 
 */

package E_7_16;

import java.util.Scanner;

public class E_7_16 {

	/**
	 * 取得した配列の最小値の要素を求めるメソッド
	 * 
	 * @param a：配列を取得する
	 * @return：取得配列の最小値要素を返却する
	 */
	static int minOf(int[] a) {
		// 最小値を求めるため、int型変数を定義し、要素の先頭値を代入させる
		int minValue = a[0];

		// 引数aの全要素分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 最小値を求めるため、分岐を行う。配列要素の値が大きい場合
			if (a[i] < minValue) {
				// 最小値を求める変数に、配列aの要素を代入させる
				minValue = a[i];
			}
		}
		// 最小値を求めた変数を返却する
		return minValue;
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
		int arrayMin[] = new int[inputElement];

		// 配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < arrayMin.length; i++) {
			// 各要素に入力した値を代入させるため、入力を促す文言を出力し、各要素に入力値を代入させる
			System.out.print("arrayMin[" + i + "] = ");
			arrayMin[i] = standardInput.nextInt();
		}

		// 配列の要素合計を求めるminOfメソッドを使用し、arrayMinの合計出力させる
		System.out.print("arrayMin：" + minOf(arrayMin));
	}

}

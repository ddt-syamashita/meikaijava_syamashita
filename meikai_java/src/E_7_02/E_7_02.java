
/*
 * 	三つのint型引数 a, b, cの最小値を求めるメソッドminを作成せよ。
 *     int min(int a, int b, int c)
 *
 * 作成者：山下
 * 作成日：2021/03/22
 *
 */

package E_7_02;

import java.util.Scanner;

public class E_7_02 {

	/**
	 *  3つの引数から最小値を求める
	 *  @param a：1つ目のint型変数を取得する
	 *  @param b：2つ目のint型変数を取得する
	 *  @param c：3つ目のint型変数を取得する
	 */
	static int min(int a, int b, int c) {

		//最小値を求めるためint型変数を定義する
		int min = a;
		//1つ目の引数が2つ目の引数よりも大きい場合
		if (min > b) {
			//2つ目の引数が最小値となるため、min変数に代入させる
			min = b;
		}
		//3つ目の引数がmin変数よりも小さい場合
		if (min > c) {
			//3つ目の引数が最小値となるため、min変数に代入させる
			min = c;
		}
		//代入された最小値の値を戻り値としてreturn定義する
		return min;
	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//1つ目の引数値の入力を促す文言を出力させる
		System.out.print("a = ");

		//読みこんだ整数をint型変数に代入させる
		int inputA = standardInput.nextInt();

		//2つ目の引数値の入力を促す文言を出力させる
		System.out.print("b = ");

		//読みこんだ整数をint型変数に代入させる
		int inputB = standardInput.nextInt();

		//2つ目の引数値の入力を促す文言を出力させる
		System.out.print("c = ");

		//読みこんだ整数をint型変数に代入させる
		int inputC = standardInput.nextInt();

		//minメソッドの結果を出力させるため、printlnを定義する
		System.out.println("最小値：" + min(inputA, inputB, inputC));

	}

}

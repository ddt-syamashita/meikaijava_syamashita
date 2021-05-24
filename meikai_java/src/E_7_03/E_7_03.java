
/*
 * 三つのint型引数a, b, cの中央値を求めるメソッドmedを作成せよ。
 *    int med(int a, int b, int c)
 *
 * 作成者：山下
 * 作成日：2021/03/22
 *
 */

package E_7_03;

import java.util.Scanner;

public class E_7_03 {

	/**
	 *  3つの引数から中央値を求める
	 *  @param a：1つ目のint型変数を取得する
	 *  @param b：2つ目のint型変数を取得する
	 *  @param c：3つ目のint型変数を取得する
	 *  @return ：取得した3つの引数の中央値を返却する
	 */
	static int med(int a, int b, int c) {

		//中央値を求めるint型変数を定義し、1つ目の引数aを代入させる
		int median = a;

		//引数1つ目の値が引数2つ目の値以上の場合
		if (a >= b) {
			//引数2つ目の値が引数3つ目の値以上の場合
			if (b >= c) {
				//引数2つ目の値を代入
				median = b;
			//引数1つ目の値が引数3つ目の値以下の場合
			} else if (a <= c) {
				//引数1つ目の値を代入
				median = a;
			//上記パターン以外のは3つ目の値を代入
			} else {
				median = c;
			}
		//引数1つ目の値が引数2つ目の値以上ではなく、引数1つ目の値が引数3つ目の値よりも小さい場合
		} else if (a > c) {
			//引数1つ目の値を代入させる
			median = a;
		//引数2つ目の値が引数3つ目の値よりも小さい場合
		} else if (b > c) {
			//引数3つ目の値を代入させる
			median = c;
		//それ以外の場合は引数2つ目の値を代入させる
		} else {
			median = b;
		}

		//中央値を戻り値として返すため、returnで変数medianを定義する
		return median;

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す文言を出力させる
		System.out.print("1つ目の値：");

		//1つ目の引数として読み込ませるため、int型変数に読みこんだ値を代入させる
		int inputA = standardInput.nextInt();

		//整数の入力を促す文言を出力させる
		System.out.print("2つ目の値：");

		//2つ目の引数として読み込ませるため、int型変数に読みこんだ値を代入させる
		int inputB = standardInput.nextInt();

		//整数の入力を促す文言を出力させる
		System.out.print("3つ目の値：");

		//3つ目の引数として読み込ませるため、int型変数に読み込んだ値を代入させる
		int inputC = standardInput.nextInt();

		//medメソッドを使用し、中央値を出力させる
		System.out.println("入力した整数の中央値：" + med(inputA, inputB, inputC));

	}

}

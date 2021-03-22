
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
	 */
	static int med(int a, int b, int c) {

		//中央値を求めるint型変数を定義し、1つ目の引数aを代入させる
		int median = a;

		//1つ目と2つ目または、2つ目と3つ目の値が同値の場合
		if (a == b || b == c) {
			//2つ目の引数bを中央値を求める変数に代入させる
			median = b;
			//1つ目と3つ目の引数が同値の場合
		} else if (a == c) {
			//3つ目の引数を中央値結果変数に代入させる
			median = c;
			//2つ目の引数が中央値変数より大きいかつ3つ目の引数が2つ目の引数より大きい
			//または、2つ目の引数が中央値変数より小さい かつ3つ目の引数が2つ目の引数より小さい場合
		} else if ((b > median) && (c > b) || ((b < median) && (c < b))) {
			//中央値変数に2つ目の引数を代入させる
			median = b;
			//中央値を求めるため、上記elseif文の3つ目を引数を比較した分岐を定義する
		} else if ((c > median) && (b > c) || ((c < median) && (b < c))) {
			//中央値変数に3つ目の引数を代入させる
			median = c;
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

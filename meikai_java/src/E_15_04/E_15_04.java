/**
 * 浮動小数点値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ。
 * 
 * printDouble(double x, int p, int w)
 * 
 * 作成者：山下
 * 作成日：2022/2/11
 * 
 */

package E_15_04;

import java.util.Scanner;

public class E_15_04 {

	/**
	 * 三つの引数値を元に文字列を出力するメソッド
	 * @param x：浮動小数点の値を取得
	 * @param p：小数点以下の桁数の値を取得
	 * @param w：全体の桁数を取得
	 */
	public static void printDouble(double x, int p, int w) {

		// 各引数の値を元に、Stringのformatメソッドを使用し文字列を出力する
		System.out.printf(String.format("%%%d.%df", w, p), x);

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// printDoubleの第一引数に設定する値の入力を促す文言を出力し、変数に代入させる。
		System.out.print("実数値：");

		//入力値をdouble型変数に代入させるため、double変数を定義する
		double inputRealValue = standardInput.nextDouble();

		// 小数点以下の値を入力するため、文言を出力し、変数に代入させる
		System.out.print("小数点桁数：");
		
		int inputDecimal = standardInput.nextInt();
		
		// 表示桁数の値を入力するため、文言を出力し、変数に代入させる
		System.out.print("表示桁数：");
		
		//printDoubleの第三引数に設定する値の入力を促す文言を出力し、変数に代入させる。
		int inputDigit = standardInput.nextInt();
		
		//　入力値をprintDoubleメソッドの引数に定義し、文字列を出力させる
		printDouble(inputRealValue, inputDecimal, inputDigit);

	}

}

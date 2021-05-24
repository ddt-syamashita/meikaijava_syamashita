/*
 * 整数xのposビット目を最下位として連続するn個のビットを、
 * 1にした値を返すメソッドsetN、
 * 0にした値を返すメソッドresetN、
 * 反転した値を返すメソッドinverseNを作成せよ。
 * int setN( int x, int pos, int n)
 * int resetN( int x, int pos, int n)
 * int inverseN(int x, int pos, int n)
 * 
 * 作成者：山下
 * 作成日：2021/05/01
 * 
 */

package E_7_14;

import java.util.Scanner;

public class E_7_14 {

	/**
	 * int型のビットを表示するメソッド
	 * 
	 * @param x：ビットを出力させるため、整数値を取得する
	 */
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * 最下位として連続するn個のビットを1にした値を返すメソッド
	 * 
	 * @param x：整数を取得する
	 * @param pos：ビット目を取得する
	 * @param n：最下位として連続する整数値を取得する
	 * @return：ビットを1にした値を返す
	 */
	static int setN(int x, int pos, int n) {
		// 引数xの引数posビット目から引数nビットを1にした値を返すため、return文を定義する
		return x | (~(~0 << n) << pos);
	}

	/**
	 * 最下位として連続するn個のビットを0にした値を返すメソッド
	 * 
	 * @param x：整数を取得する
	 * @param pos：ビット目を取得する
	 * @param n：最下位として連続する整数値を取得する
	 * @return：ビットを0にした値を返す
	 */
	static int resetN(int x, int pos, int n) {
		// 引数xの引数posビット目から引数nビットを0にした値を返すため、return文を定義する
		return x & ~(~(~0 << n) << pos);
	}

	/**
	 * 最下位として連続するn個のビットを反転した値を返すメソッド
	 * 
	 * @param x：整数を取得する
	 * @param pos：ビット目を取得する
	 * @param n：最下位として連続する整数値を取得する
	 * @return：ビットを反転した値を返す
	 */
	static int inverseN(int x, int pos, int n) {
		// 引数xの引数posビット目から引数nビットを反転した値を返すため、return文を定義する
		return x ^ ~(~(~0 << n) << pos);
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 引数の値として使用するため、整数値xの入力を促し、int型変数に入力値を代入させる
		System.out.print("inputX：");
		int inputX = standardInput.nextInt();

		// 引数のposビット目を求めるため、整数値の入力を促し、int型変数に入力値を代入させる
		System.out.print("inputPos：");
		int inputPos = standardInput.nextInt();

		// 引数の最下位として連続するn個のビットを求めるため、整数値の入力を促し、int型変数に入力値を代入させる
		System.out.print("inputN：");
		int inputN = standardInput.nextInt();

		// 整数値xのビットを確認用として、出力させる
		System.out.print("inputX                     = ");
		printBits(inputX);

		// 入力された値に対し、setNメソッドの結果を出力させる
		System.out.print("\nsetN(inputX, inputPos)     = ");
		printBits(setN(inputX, inputPos, inputN));

		// 入力された値に対し、resetNメソッドの結果を出力させる
		System.out.print("\nresetN(inputX, inputPos)   = ");
		printBits(resetN(inputX, inputPos, inputN));

		// 入力された値に対し、resetNメソッドの結果を出力させる
		System.out.print("\ninverseN(inputX, inputPos) = ");
		printBits(inverseN(inputX, inputPos, inputN));

	}

}

/*
 * int型整数x の絶対値、long型整数x の絶対値、float型実数x の絶対値、double型実数x の絶対値を求める、
 * 以下に示す多重定義されたメソッド群を作成せよ。
 *   int absolute(int x)
 *   long absolute(int x)
 *   float absolute(int x)
 *   float absolute(int x)
 *
 * 作成者：山下
 * 作成日：2021/05/20
 *
 */

package E_7_31;

import java.util.Scanner;

public class E_7_31 {

	/**
	 * 引数int型の絶対値を求めるメソッド
	 * 
	 * @param x：int型の値を引数として取得する
	 * @return：絶対値を返却する
	 */
	static int absolute(int x) {

		// 引数xの値が0より小さい場合
		if (x < 0) {
			// 引数の値に対し、-1を掛けた値を返却するため代入させる
			x = (x * -1);
		}
		// 絶対値を返却する
		return x;

	}

	/**
	 * 引数long型の絶対値を求めるメソッド
	 * 
	 * @param x：long型の値を引数として取得する
	 * @return：絶対値を返却する
	 */
	static long absolute(long x) {

		// 引数xの値が0より小さい場合
		if (x < 0) {
			// 引数の値に対し、-1Lを掛けた値を返却するため代入させる
			x = (x * -1L);
		}
		// 絶対値を返却する
		return x;
	}

	/**
	 * 引数float型の絶対値を求めるメソッド
	 * 
	 * @param x：float型の値を引数として取得する
	 * @return：絶対値を返却する
	 */
	static float absolute(float x) {

		// 引数xの値が0より小さい場合
		if (x < 0) {
			// 引数の値に対し、-1.0fを掛けた値を返却するため代入させる
			x = (x * -1.0f);
		}
		// 絶対値を返却する
		return x;
	}

	/**
	 * 引数double型の絶対値を求めるメソッド
	 * 
	 * @param x：double型の値を引数として取得する
	 * @return：絶対値を返却する
	 */
	static double absolute(double x) {

		// 引数xの値が0より小さい場合
		if (x < 0) {
			// 引数の値に対し、-1.0を掛けた値を返却するため代入させる
			x = (x * -1.0);
		}
		// 絶対値を返却する
		return x;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 各型の入力を促す文言を出力し、変数に代入させる
		System.out.print("int型入力値：");
		int intValue = standardInput.nextInt();

		System.out.print("long型入力値：");
		long longValue = standardInput.nextLong();

		System.out.print("float型入力値：");
		float floatValue = standardInput.nextFloat();

		System.out.print("double型入力値：");
		double doubleValute = standardInput.nextDouble();

		// 各入力値のabsoluteメソッドを使用した値を出力させる
		System.out.println("入力された値の絶対値を出力します。\n");
		System.out.print("int型の絶対値：");
		System.out.println(absolute(intValue));

		System.out.print("long型の絶対値：");
		System.out.println(absolute(longValue));

		System.out.print("float型の絶対値：");
		System.out.println(absolute(floatValue));

		System.out.print("double型の絶対値：");
		System.out.println(absolute(doubleValute));

	}

}

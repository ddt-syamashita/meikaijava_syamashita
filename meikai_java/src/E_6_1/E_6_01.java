
/*
 * 要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/08
 *
 */

package E_6_1;

public class E_6_01 {

	public static void main(String[] args) {

		//要素数5つ持ったdouble型を生成するため、配列定義する

		double[] doubleArray = new double[5];

		//配列の1番目にコンソールに出力させるため、値を代入する
		doubleArray[0] = 23.5;

		//配列の2番目にコンソールに出力させるため、値を代入する
		doubleArray[1] = 100.0;

		//配列の3番目にコンソールに出力させるため、値を代入する
		doubleArray[2] = 0.95;

		//配列の4番目にコンソールに出力させるため、値を代入する
		doubleArray[3] = 15;

		//配列の5番目にコンソールに出力させるため、値を代入する
		doubleArray[4] = 2222.223;


		//生成した配列の1番目の要素をコンソールに出力させる
		System.out.println("doubleArray[" + 0 + "] = " + doubleArray[0]);

		//生成した配列の2番目の要素をコンソールに出力させる
		System.out.println("doubleArray[" + 1 + "] = " + doubleArray[1]);

		//生成した配列の3番目の要素をコンソールに出力させる
		System.out.println("doubleArray[" + 2 + "] = " + doubleArray[2]);

		//生成した配列の4番目の要素をコンソールに出力させる
		System.out.println("doubleArray[" + 3 + "] = " + doubleArray[3]);

		//生成した配列の5番目の要素をコンソールに出力させる
		System.out.println("doubleArray[" + 4 + "] = " + doubleArray[4]);

	}

}

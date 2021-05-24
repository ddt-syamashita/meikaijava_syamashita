
/*
 * 要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5 を代入して表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/08
 *
 */

package E_6_3;

public class E_6_03 {

	public static void main(String[] args) {

		//要素数5を持つdouble型を生成するため、配列を定義する
		double[] doubleArray = new double[5];

		//先頭から1.1～5.5を繰り返し代入させるため、for文で繰り返させる
		for (int i = 0; i < doubleArray.length; i++) {

			//小数点以下の値を算出するため、int型変数に繰り返されるたびにインクリメントされるi変数を加算させる
			int j = i + 1;
			//加算されたint型変数に対し、double型で11倍にする
			double doubleValue = (j * 11);

			//10倍にされた値を10分の1に変換し、配列に代入させる
			doubleArray[i] = (double)(doubleValue / 10);

			//配列の全要素をコンソールに出力させるため、printlnを定義する
			System.out.println("doubleArray[" + i + "] = " + doubleArray[i]);
		}
	}

}

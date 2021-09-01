
/*
 * 二つのint型整数a, bの最小値、三つのint型整数a, b, cの最小値、配列aの要素の最小値を求める、
 * いかに示す多重定義されたメソッド群を作成せよ。
 *   int min(int a, int b)
 *   int min(int a, int b, int c)
 *   int min(int [] a)
 *
 * 作成者：山下
 * 作成日：2021/05/16
 *
 */

package E_7_30;

public class E_7_30 {

	/**
	 * 二つの引数として取得した整数の最小値を求めるメソッド
	 * @param a：一つ目の引数を取得する
	 * @param b：二つ目の引数を取得する
	 * @return：最小値を返却する
	 */
	static int min(int a, int b) {

		//一つ目の引数値を返却用の変数に代入させる
		int minResult = a;

		//二つ目の引数より一つ目の引数が大きい場合
		if (b < a) {
			//二つ目の引数を返却用の変数に代入させる
			minResult = b;
		}
		//最小値を代入させた変数を返すため、return文を定義する
		return minResult;

	}

	/**
	 * 三つの引数として取得した整数の最小値を求めるメソッド
	 * @param a：一つ目の引数を取得する
	 * @param b：二つ目の引数を取得する
	 * @param c：三つ目の引数を取得する
	 * @return：最小値を返却する
	 */
	static int min(int a, int b, int c) {

		//一つ目の引数値を返却用の変数に代入させる
		int minResult = a;

		//二つ目の引数より一つ目の引数が大きい場合
		if (b < minResult) {
			//二つ目の引数を返却用の変数に代入させる
			minResult = b;
		}
		//三つ目の引数より二つ目の引数が大きい場合
		if (c < minResult) {
			//三つ目の引数を返却用の変数に代入させる
			minResult = c;
		}
		//最小値を代入させた変数を返すため、return文を定義する
		return minResult;
	}

	/**
	 * 配列の引数として取得した要素値の最小値を求めるメソッド
	 * @param a：配列を取得する
	 * @return：配列要素の最小値を返却する
	 */
	static int min(int[] a) {

		//一つ目の要素を返却する変数に代入させる
		int minResult = a[0];

		//取得した配列の要素数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < a.length; i++) {

			//返却する変数の値が配列の要素値より大きい場合
			if (a[i] < minResult) {
				//返却用変数に要素値を代入させる
				minResult = a[i];
			}
		}
		//最小値を代入した変数を返却させるため、return文を定義する
		return minResult;
	}

	public static void main(String[] args) {

		//二つの引数のminメソッドの結果を出力させる
		System.out.println("二つの引数関数：" + min(6, 2));

		//三つの引数のminメソッドの結果を出力させる
		System.out.println("三つの引数関数：" + min(3, 21, 10));

		//最小値を求めるメソッドの引数とするため、任意の値を保持した配列を生成する
		int array[] = { 3, 2, 11, 9};

		//配列の引数のminメソッドの結果を出力させる
		System.out.println("配列の引数関数：" + min(array));
	}
}

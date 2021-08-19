package E_10_03;

public class MinMax {

	/**
	 * 2つの引数を取得し、最小値を求めるメソッド
	 * 
	 * @param a：1つ目の取得値
	 * @param b：2つ目の取得値
	 * @return：取得した引数を比較し、最小値を返却する
	 */
	public static int min(int a, int b) {

		// 最小値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMin = a;

		// 2つ目の引数が代入された値よりも小さい場合
		if (b < resultMin) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMin = b;
		}

		// 最小値が格納された変数を返却する
		return resultMin;
	}

	/**
	 * 3つの引数を取得し、最小値を求めるメソッド
	 * 
	 * @param a：1つ目の取得値
	 * @param b：2つ目の取得値
	 * @param c：3つ目の取得値
	 * @return：取得した引数を比較し、最小値を返却する
	 */
	public static int min(int a, int b, int c) {

		// 最小値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMin = a;

		// 2つ目の引数が代入された値よりも小さい場合
		if (b < resultMin) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMin = b;
		}

		// 3つ目の引数が代入された値よりも小さい場合
		if (c < resultMin) {
			// 3つ目の引数地を返却する変数に代入させる
			resultMin = c;
		}

		// 最小値が格納された変数を返却する
		return resultMin;

	}

	/**
	 * 配列の引数として取得し、要素の最小値を求めるメソッド
	 * 
	 * @param a：配列を取得
	 * @return：取得した配列の各要素の最小値を返却する
	 */
	public static int minArray(int[] a) {

		// 最小値を返却させるため、取得した配列の先頭の要素値を返却用変数に代入させる
		int resultMin = a[0];

		// 取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 各要素と、返却用変数の値を繰り返し比較し、要素の値が小さい場合
			if (a[i] < resultMin) {
				// 要素の値を返却用変数に代入させる
				resultMin = a[i];
			}
		}
		// 最小値が格納された変数を返却する
		return resultMin;

	}

	/**
	 * 2つの引数を取得し、最大値を求めるメソッド
	 * 
	 * @param a：1つ目の取得値
	 * @param b：2つ目の取得値
	 * @return：取得した引数を比較し、最大値を返却する
	 */
	public static int max(int a, int b) {

		// 最大値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMax = a;

		// 2つ目の引数が代入された値よりも大きい場合
		if (b > resultMax) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMax = b;
		}
		// 最大値が格納された変数を返却する
		return resultMax;
	}

	/**
	 * 3つの引数を取得し、最大値を求めるメソッド
	 * 
	 * @param a：1つ目の取得値
	 * @param b：2つ目の取得値
	 * @param c：3つ目の取得値
	 * @return：取得した引数を比較し、最大値を返却する
	 */
	public static int max(int a, int b, int c) {

		// 最大値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMax = a;

		// 2つ目の引数が代入された値よりも大きい場合
		if (b > resultMax) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMax = b;
		}

		// 3つ目の引数が代入させた値よりも大きい場合
		if (c > resultMax) {
			// 3つ目の引数値を返却する変数に代入させる
			resultMax = c;
		}
		// 最大値が格納された変数を返却する
		return resultMax;
	}

	/**
	 * 配列の引数として取得し、要素の最小値を求めるメソッド
	 * 
	 * @param a：配列を取得
	 * @return：取得した配列の各要素の最小値を返却する
	 */
	public static int maxArray(int[] a) {

		// 最大値を求めるため、取得した配列の先頭の要素値を返却用変数に代入させる
		int resultMax = a[0];

		// 取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 各要素と代入された変数の値を繰り返し比較し、要素の値が大きい場合
			if (a[i] > resultMax) {
				// 要素の値を返却用変数に代入させる
				resultMax = a[i];
			}
		}
		// 最大値が格納された変数を返却する
		return resultMax;
	}

}

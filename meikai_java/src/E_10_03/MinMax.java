package E_10_03;

public class MinMax {

	/**
	 * 2つの引数を取得し、最小値を求めるメソッド
	 * 
	 * @param oneValue：1つ目の取得値
	 * @param twoValue：2つ目の取得値
	 * @return：取得した引数を比較し、最小値を返却する
	 */
	public static int min(int oneValue, int twoValue) {

		// 最小値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMin = oneValue;

		// 2つ目の引数が代入された値よりも小さい場合
		if (twoValue < resultMin) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMin = twoValue;
		}

		// 最小値が格納された変数を返却する
		return resultMin;
	}

	/**
	 * 3つの引数を取得し、最小値を求めるメソッド
	 * 
	 * @param oneValue：1つ目の取得値
	 * @param twoValue：2つ目の取得値
	 * @param threeValue：3つ目の取得値
	 * @return：取得した引数を比較し、最小値を返却する
	 */
	public static int min(int oneValue, int twoValue, int threeValue) {

		// 最小値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMin = oneValue;

		// 2つ目の引数が代入された値よりも小さい場合
		if (twoValue < resultMin) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMin = twoValue;
		}

		// 3つ目の引数が代入された値よりも小さい場合
		if (threeValue < resultMin) {
			// 3つ目の引数地を返却する変数に代入させる
			resultMin = threeValue;
		}

		// 最小値が格納された変数を返却する
		return resultMin;

	}

	/**
	 * 配列の引数として取得し、要素の最小値を求めるメソッド
	 * 
	 * @param array：配列を取得
	 * @return：取得した配列の各要素の最小値を返却する
	 */
	public static int minArray(int[] array) {

		// 最小値を返却させるため、取得した配列の先頭の要素値を返却用変数に代入させる
		int resultMin = array[0];

		// 取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			// 各要素と、返却用変数の値を繰り返し比較し、要素の値が小さい場合
			if (array[i] < resultMin) {
				// 要素の値を返却用変数に代入させる
				resultMin = array[i];
			}
		}
		// 最小値が格納された変数を返却する
		return resultMin;

	}

	/**
	 * 2つの引数を取得し、最大値を求めるメソッド
	 * 
	 * @param oneValue：1つ目の取得値
	 * @param towValue：2つ目の取得値
	 * @return：取得した引数を比較し、最大値を返却する
	 */
	public static int max(int oneValue, int towValue) {

		// 最大値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMax = oneValue;

		// 2つ目の引数が代入された値よりも大きい場合
		if (towValue > resultMax) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMax = towValue;
		}
		// 最大値が格納された変数を返却する
		return resultMax;
	}

	/**
	 * 3つの引数を取得し、最大値を求めるメソッド
	 * 
	 * @param oneValue：1つ目の取得値
	 * @param towValue：2つ目の取得値
	 * @param threeValue：3つ目の取得値
	 * @return：取得した引数を比較し、最大値を返却する
	 */
	public static int max(int oneValue, int towValue, int threeValue) {

		// 最大値を求めるため、変数を定義し、1つ目の引数を代入させる
		int resultMax = oneValue;

		// 2つ目の引数が代入された値よりも大きい場合
		if (towValue > resultMax) {
			// 2つ目の引数値を返却する変数に代入させる
			resultMax = towValue;
		}

		// 3つ目の引数が代入させた値よりも大きい場合
		if (threeValue > resultMax) {
			// 3つ目の引数値を返却する変数に代入させる
			resultMax = threeValue;
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
	public static int maxArray(int[] array) {

		// 最大値を求めるため、取得した配列の先頭の要素値を返却用変数に代入させる
		int resultMax = array[0];

		// 取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			// 各要素と代入された変数の値を繰り返し比較し、要素の値が大きい場合
			if (array[i] > resultMax) {
				// 要素の値を返却用変数に代入させる
				resultMax = array[i];
			}
		}
		// 最大値が格納された変数を返却する
		return resultMax;
	}

}

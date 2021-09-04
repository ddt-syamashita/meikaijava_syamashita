
/*
 * int型の1次元配列とint型の2次元配列（行によって列数が異なる可能性がある）の全要素の値を表示する、
 * 多重定義されたメソッド群を作成せよ。
 *   void printArray(int[] a)
 *   void printArray(int[][] a)
 * なお、1次元配列の表示では、各要素の間には1文字分のスペースを空けること。
 * また、2次元配列の表示では、各列の数値の先頭が揃うように、最低限のスペースを空けること。
 *
 * 作成者：山下
 * 作成日：201/05/27
 *
 */

package E_7_33;

public class E_7_33 {

	/**
	 * 1次元配列の全要素値を出力するメソッド
	 * 
	 * @param a:1次元配列を取得
	 */
	static void printArray(int[] a) {

		// 取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * 2次元配列の全要素値を出力するメソッド
	 * 
	 * @param a:2次元配列を取得
	 */
	static void printArray(int[][] a) {

		// 引数として取得した2次元配列の各行の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 2次元配列の各列の要素数分繰り返すため、for文を定義する
			for (int j = 0; j < a[i].length; j++) {

				// 各列の最大桁数を整数値で受け取り、出力結果の先頭を揃わせるため、printfで表示桁数を指定する
				System.out.printf("%" + -(maxColumDigit(a, j)) + "d" + " ", a[i][j]);
			}
			// 各列の表示が出力されたあと、改行させるため、printlnを定義する
			System.out.println();
		}
	}

	/**
	 * 各列の最大桁数を求めるメソッド
	 * 
	 * @param getArray：2次元配列を取得
	 * @param getColumPosition：繰り返し中、何列目の値として取得
	 * @return：2次元配列の最大桁数をint型整数値として返却する
	 */
	static int maxColumDigit(int[][] getArray, int getColumPosition) {

		// 桁数を求めるため、String型文字列変数を定義する
		String digitNumber = "";

		// 取得した2次元配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < getArray.length; i++) {

			// 2次元配列の各要素数分繰り返すため、for文を定義する
			for (int j = 0; j < getArray[i].length; j++) {

				// 繰り返し変数と、引数getColumPositionの値が一致している場合
				if (j == getColumPosition) {

					// 桁数を求めるString変数の桁数より、取得した2次元配列の桁数が大きい場合
					if (digitNumber.length() < Integer.toString(getArray[i][j]).length()) {
						// 桁数を求めるString変数に、取得した2次元配列の値をint型からString型に型変換し、代入させる
						digitNumber = Integer.toString(getArray[i][j]);
					}
				}
			}
		}

		// 取得した2次元配列の要素桁数を返却させるため、return文を定義する
		return digitNumber.length();
	}

	public static void main(String[] args) {

		// 1次元配列を生成する
		int[] array1D = { 2, 4, 55, 99, 332 };

		// 2次元配列を生成する
		int[][] array2D = { { 22, 3, 4, 8, 7, -2222 },
							{ 3, 99999, 8, 99, -7779, 5, 1234 },
							{ 255, 5 },
							{ 2, 555, 888 } };

		// 定義した1次元配列をprintArrayメソッドを使用し出力させる
		System.out.println("array1D：");
		printArray(array1D);

		// 定義した2次元配列をprintArrayメソッドを使用し出力させる
		System.out.println("\narray2D：");
		printArray(array2D);

	}

}


/*
 * 行列xとyの和を格納した2次元配列を返すメソッドを作成せよ（行数および列数が同一の配列をxとyに受け取ることを前提としてよい）。
 *   int[][] addMatrix(int[][] x, int[][] y)
 * 作成者：山下
 * 作成日：2021/05/15
 *
 */

package E_7_28;

public class E_7_28 {

	/**
	 * 取得した二つの二次元配列の行列の和を返すメソッド
	 * @param x：1つ目の二次元配列を取得する
	 * @param y：2つ目の二次元配列を取得する
	 * @return：取得した2つの二次元配列の和を格納した二次元配列を返却する
	 */
	static int[][] addMatrix(int[][] x, int[][] y) {

		//返却用の二次元配列を生成する
		int[][] resultArray = new int[x.length][];

		//取得した配列の要素数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < x.length; i++) {
			//返却用の二次元配列の列数を指定するため、引数で取得した値を要素数として定義する
			resultArray[i] = new int[x[i].length];
			//取得した配列の2行目の各要素分繰り返す処理を行うため、for文を定義する
			for (int j = 0; j < x[i].length; j++) {
				//結果返却用の配列に取得した配列の要素数の和を代入させる
				resultArray[i][j] = x[i][j] + y[i][j];
			}
		}
		//繰り返し終了後、取得した配列の和を格納した二次元配列を返すため、return文を定義する
		return resultArray;

	}

	/**
	 * 取得した引数を出力させるメソッド
	 * @param array：二次元配列を取得
	 */
	static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//メソッドの引数するため、二次元配列を2つ定義する
		int[][] arrayA = { { 2, 4, 5 }, { 5, 8, 9 } };
		int[][] arrayB = { { 4, 2, 6 }, { 1, 1, 3 } };

		//作成したメソッドを出力させるため、文言を出力させる
		System.out.println("arrayA と arrayB の行列の和を出力：");
		//出力させるメソッドに、和を求めるaddMatrixメソッドを引数として定義する
		printMatrix(addMatrix(arrayA, arrayB));

	}

}

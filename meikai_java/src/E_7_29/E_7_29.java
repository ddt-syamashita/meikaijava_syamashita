
/*
 * 2次元配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して返却するメソッドaryClone2を作成せよ。
 *   int[][] aryClone2(int[][] a)
 *
 * 作成者：山下
 * 作成日：2021/05/15
 */

package E_7_29;

public class E_7_29 {

	/**
	 * 取得した配列と同じ二次元配列生成し、返却するメソッド
	 * 
	 * @param a：二次元配列を取得する
	 * @return：取得した二次元配列と同様の配列を返す
	 */
	static int[][] aryClone2(int[][] a) {

		// 返却する二次元配列を取得した配列の要素数分生成する
		int[][] arrayClone = new int[a.length][];

		// 取得した配列の各要素を返却する二次元配列に代入させるため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 行の要素数を指定するため、取得した配列の要素数分生成する
			arrayClone[i] = new int[a[i].length];
			// 取得した配列の行分繰り返す処理を行うため、for文を定義する
			for (int j = 0; j < a[i].length; j++) {
				// 取得した配列の各要素を返却する配列に代入させる
				arrayClone[i][j] = a[i][j];
			}
		}
		// 生成、代入終了後、返却用二次元配列を返却するため、return文を定義する
		return arrayClone;
	}

	/**
	 * 取得した引数を出力させるメソッド
	 * 
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

		// 二次元配列を生成する
		int[][] array = { { 2, 2, 99, }, { 3, 3, 333, 444 } };

		// 複製メソッドを代入させた二次元配列を生成する
		int[][] cloneResult = aryClone2(array);

		// 生成した2次元配列をprintMatrix関数で出力する
		System.out.println("行列array");
		printMatrix(array);

		// 複製された2次元配列をprintMatrix関数で出力する
		System.out.println("2次元配列の複製");
		printMatrix(cloneResult);

	}

}


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
		int[][] arrayClone = new int[a.length][a[0].length];

		// 取得した配列の各要素を返却する二次元配列に代入させるため、for文を定義する
		for (int i = 0; i < arrayClone.length; i++) {
			// 取得した配列の行分繰り返す処理を行うため、for文を定義する
			for (int j = 0; j < arrayClone[i].length; j++) {
				// 取得した配列の各要素を返却する配列に代入させる
				arrayClone[i][j] = a[i][j];
			}
		}
		// 生成、代入終了後、返却用二次元配列を返却するため、return文を定義する
		return arrayClone;
	}

	public static void main(String[] args) {

		// 二次元配列を生成する
		int[][] array = { { 2, 2, 99 }, { 3, 3, 3 } };

		// 複製メソッドを代入させた二次元配列を生成する
		int[][] cloneResult = aryClone2(array);

		// 複製した配列の要素数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < cloneResult.length; i++) {
			// 生成した配列の行分繰り返す処理を行うため、for文を定義する
			for (int j = 0; j < array[i].length; j++) {
				// 各要素を出力させる
				System.out.print(cloneResult[i][j] + "  ");
			}
			// 行を出力後、改行表示させるため、printlnを定義する
			System.out.println();
		}
	}

}

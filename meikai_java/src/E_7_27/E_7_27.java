
/*
 * List 7-20 のプログラムは、三つの配列x, y, zの行数および列数が同一であることを前提としている。
 * 三つの配列の要素数が等しければ加算を行ってtrueを返し、等しくなければ加算を行わずに、
 * falseを返すメソッドに書き換えよ。
 *   boolean addMatrix(int[][] x, int[][] y, int[][] z)
 *
 * 作成者：山下
 * 作成日：2021/05/14
 */

package E_7_27;

public class E_7_27 {

	/**
	 * 取得した配列の要素数が同一か判定し、同一であれば引数x,yを加算するメソッド
	 * 
	 * @param x：一つ目の配列を取得する
	 * @param y：二つ目の配列を取得する
	 * @param z：三つ目の配列を取得する
	 * @return：取得した配列の要素数が同一の場合、true。等しくなければfalseを返却する
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {

		//配列の要素数が同一か判定を行うため、booleanフラグを定義する
		boolean arraySameFlg= true;

		//取得した引数の要素数が同一の場合
		if (x.length == y.length && y.length == z.length) {
			//一つ目に取得した引数の要素数分、繰り返す処理を行うため、for文を定義する
			for (int i = 0; i < x.length; i++) {
				//取得した配列の2行目要素数が同一の場合
				if (x[i].length == y[i].length) {
					//2行目の要素数文繰り返す処理を行うため、for文を定義する
					for (int j = 0; j < x[i].length; j++) {
						//取得した配列xとyの要素を加算した結果を
						z[i][j] = x[i][j] + y[i][j];
					}
					//取得した配列の要素数が同一ではない場合
				} else {
					//falseを返却するため、falseを代入させる
					arraySameFlg = false;
				}
			}
		//取得した引数の要素数が同一ではない場合
		} else {
			// falseを返却するため、falseを代入させる
			arraySameFlg = false;
		}
		//判定結果を返却するため、return文を定義する
		return arraySameFlg;
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

		//各3つの配列を定義する
		int[][] arrayA = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arrayB = { { 6, 3, 5 }, { 5, 1, 2 } };
		int[][] arrayC = new int[2][3];

		//メソッドで呼び出し、結果がtrueの場合
		if (addMatrix(arrayA, arrayB, arrayC) == true) {

			//一つ目の配列の文言と各要素を出力させる
			System.out.println("行列arrayA");
			printMatrix(arrayA);

			//二つ目の配列の文言と各要素を出力させる
			System.out.println("行列arrayB");
			printMatrix(arrayB);

			//三つ目の配列の文言と各要素を出力させる
			System.out.println("行列arrayC");
			printMatrix(arrayC);

			//メソッドで呼び出した結果を出力させる
			System.out.print("結果：");
			System.out.println(addMatrix(arrayA, arrayB, arrayC));
			//メソッドで呼び出し、結果がtrue以外だった場合
		} else {
			//メソッドで呼び出した結果を出力させる
			System.out.print("結果：");
			System.out.println(addMatrix(arrayA, arrayB, arrayC));
		}
	}
}

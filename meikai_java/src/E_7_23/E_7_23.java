
/*
 * 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarraySrchIdxを作成せよ。
 *   int[] arraySrchIdx(int[] a, int x)
 *
 * (例)配列aの要素が{1, 5, 4, 8, 5, 5, 7}でarraySrchIdx(a, 5)と呼び出された場合、
 * 返却する配列は{1, 4, 5}となる（値が5である要素のインデックスを並べたものとなる）。
 *
 * 作成者：山下
 * 作成日：2021/05/11
 */

package E_7_23;

import java.util.Scanner;

public class E_7_23 {

	/**
	 * 配列の要素値を探索し、要素のインデックスを返却するメソッド
	 * 
	 * @param a:配列を取得する
	 * @param x:探索要素の値を指定する
	 * @return :探索結果として生成した配列を返却する
	 */
	static int[] arraySrchIdx(int[] a, int x) {

		// 探索した値の数を算出するため、int型変数定義する
		int searchCount = 0;

		// 引数で取得した配列の各要素を探索するため、繰り返し処理を定義する
		for (int i = 0; i < a.length; i++) {
			// 探索の値と配列の要素値が同じだった場合
			if (x == a[i]) {
				// 探索結果の変数をカウントアップさせる
				searchCount++;
			}
		}

		// 探索結果として返却する配列を生成する
		int resultSearch[] = new int[searchCount];

		// 要素を順番に並べるための変数を定義する
		int elementNumber = 0;

		// 取得した配列a分繰り返す処理を定義する
		for (int i = 0; i < a.length; i++) {

			// 取得した配列と、探索値が同値の場合
			if (a[i] == x) {
				// 探索した値の要素位置を探索結果の配列に代入する
				resultSearch[elementNumber] = i;
				// 代入した後、次の要素へ順に代入させるため、インクリメントさせる
				elementNumber++;
			}
		}

		// 生成した探索結果の配列を返却するため、returnを定義する
		return resultSearch;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 配列を定義する
		int inputElement;

		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {

			// 入力を促す文言を出力する
			System.out.print("要素数：");

			// 入力値をint型変数に代入させる
			inputElement = standardInput.nextInt();

		} while (inputElement <= 0);

		// arraySrchIdxメソッドで検索させるため、配列を生成する
		int array[] = new int[inputElement];

		// 配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			// 各要素に入力した値を代入させるため、入力を促す文言を出力し、各要素に入力値を代入させる
			System.out.print("array[" + i + "] = ");
			array[i] = standardInput.nextInt();
		}

		// 検索する値を入力させる
		System.out.print("探索する要素値：");
		int inputSearch = standardInput.nextInt();

		// 引数を定義したメソッドを結果用の配列に代入させる
		int result[] = arraySrchIdx(array, inputSearch);

		// 一致する要素がない場合
		if (result.length == 0) {
			// 探索として入力された値に対し、一致する要素がない文言を出力させる
			System.out.println("一致する要素はありません。");
		// それ以外（一致する要素が存在する場合）
		} else {
			System.out.println("result配列の一致する要素の値：");
			// 代入させた配列の全要素を出力させるため、for文で繰り返す処理を定義
			for (int i = 0; i < result.length; i++) {
				// 繰り返し変数で、arraySrchIdxメソッドを使用した結果を出力させる
				System.out.println(result[i]);
			}
		}
	}

}

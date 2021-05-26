/*
 * 配列aからkeyと同じ値をもつ要素を探索するメソッドlinearSearch と linearSearchR を作成せよ。
 * キーと同じ値の要素が複数個存在する場合、linearSearch　は最も先頭に位置する要素を見つけ、
 * linearSearchRは最も末尾に位置する要素を見つけること。
 *   int linearSearch(int[] a, int key)    int linearSearchR(int[] a, int key)
 * 
 * 作成者：山下
 * 作成日：2021/05/06
 * 
 */

package E_7_17;

import java.util.Scanner;

public class E_7_17 {

	/**
	 * 入力された値の同じ値を持つ要素を先頭から探索するメソッド
	 * 
	 * @param a：配列を取得する
	 * @param key：探索する値を取得する
	 * @return：探索した値の位置を返却する
	 */
	static int linearSearch(int[] a, int key) {

		// 探索結果の位置を保持するため、int型変数を定義する
		int searchResult = 0;

		// 引数aで取得した配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < a.length; i++) {
			// 要素の値と取得した探索の値が一致した場合
			if (a[i] == key) {
				// 探索結果の変数に、繰り返し変数を代入させる
				searchResult = i;
				// 一致した場合は、繰り返し処理を終了させるため、breakを定義する
				break;
			}
		}
		// 探索結果の値を返却するため、return文を定義する
		return searchResult;
	}

	/**
	 * 入力された値の同じ値を持つ要素を末尾から探索するメソッド
	 * 
	 * @param a：配列を取得する
	 * @param key：探索する値を取得する
	 * @return：探索した値の位置を返却する
	 */
	static int linearSearchR(int[] a, int key) {

		// 探索結果の位置を保持するため、int型変数を定義する
		int searchReslut = 0;

		// 引数aで取得した配列の要素数分繰り返し、末尾から探索するため、配列の要素数をデクリメントさせるfor文を定義する
		for (int i = a.length - 1; i > 0; i--) {

			// 末尾から探索し、要素の値と取得した探索の値が一致した場合
			if (a[i] == key) {
				// 探索結果の変数に、繰り返し変数を代入させる
				searchReslut = i;
				// 一致した場合は、繰り返し処理を終了させるため、breakを定義する
				break;
			}
		}
		// 探索結果の値を返却するため、return文を定義する
		return searchReslut;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		// 配列の要素数を入力させるため、int型変数を定義する
		int inputElement = 0;

		// 要素数を生成するため、1以上の値が入力されるまで繰り返す
		do {
			// 要素の入力を促す文言を出力させ、変数に代入させる
			System.out.print("要素数：");
			inputElement = standardInput.nextInt();

		} while (inputElement <= 0);

		// 入力値分の要素を保持した配列を生成する
		int[] array = new int[inputElement];

		// 生成した要素数分繰り返すため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			// 各要素に入力値を代入させる
			System.out.print("要素[" + i + "]：");
			array[i] = standardInput.nextInt();
		}

		System.out.println("\n生成した配列にある、入力された値を探索します。");

		// 探索する値を入力を促す文言を出力し、変数に代入させる
		System.out.print("探索する整数：");
		int input = standardInput.nextInt();

		// 探索結果を探索メソッドを使用し、文言として出力させる
		System.out.println("【先頭探索】検索した値は、array配列要素の[" + linearSearch(array, input) + "]にあります");

		// 探索結果を探索メソッドを使用し、文言として出力させる
		System.out.println("【末尾探索】検索した値は、array配列要素の[" + linearSearchR(array, input) + "]にあります");
	}

}

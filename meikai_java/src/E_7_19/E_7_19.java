/*
 * 配列a から要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ。
 *   void aryRmvN(int[] a, int idx, int n)
 * 削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと。なお、移動されずにあまってしまう要素の値は変更しなくてよい。
 * 
 * 作成者：山下
 * 作成日：2021/05/08
 * 
 */
package E_7_19;

import java.util.Scanner;

public class E_7_19 {

	/**
	 * 取得した配列の要素位置と削除個数を指定し、要素を削除するメソッド
	 * 
	 * @param a：取得する配列
	 * @param idx：削除する要素位置
	 * @param n：削除する要素の個数
	 */
	static void aryRmvN(int[] a, int idx, int n) {
		// 削除位置から取得した削除個数を削除するため、削除する個数の配列要素数をマイナスした値分繰り返すfor文を定義する
		for (int i = idx; i < a.length - n; i++) {
			// 削除した要素に対して、次の位置にある要素の値を代入させる
			a[i] = a[i + n];
		}
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 要素数の値を保持させるint型変数を定義する
		int inputElement = 0;

		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す文言を出力し、int型変数に代入させる
			System.out.print("要素数：");
			inputElement = standardInput.nextInt();

		} while (inputElement <= 0);

		// 要素削除メソッドを使用するため、配列を生成する
		int[] array = new int[inputElement];

		// 生成した配列の各要素に対して、入力した値を代入させるため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] = ");
			array[i] = standardInput.nextInt();
		}

		// 削除する要素の値の入力を促す文言を出力し、要素削除メソッドで使用するため、入力値をint型変数に代入させる
		System.out.print("削除する要素：");
		int elementDelete = standardInput.nextInt();

		// 削除する要素の個数の入力を促す文言を出力し、要素削除メソッドで使用するため、入力値をint型変数に代入させる
		System.out.print("削除する要素の個数：");
		int elementDeleteNumber = standardInput.nextInt();

		// 指定要素を削除するため、要素削除メソッドに引数を指定して呼び出す
		aryRmvN(array, elementDelete, elementDeleteNumber);

		// 削除メソッド実行結果を出力させるため、for文を定義する
		for (int i = 0; i < inputElement - elementDeleteNumber; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}

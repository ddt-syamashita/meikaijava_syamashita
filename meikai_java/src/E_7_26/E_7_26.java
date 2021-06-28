
/*
 * 配列a の要素a[idx]にxを挿入した配列を返却するメソッド arrayInsOfを作成せよ。
 *   int[] arrayInsOf(int[] a, int idx, int x)
 * 挿入に伴って[idx]以降の全要素を一つ後方にずらすこと。
 * (例)たとえば配列a の要素が{1, 3, 4, 7, 9, 11}のときにarrayInsOf(a, 2, 99)と呼び出された場合、
 * 返却する配列の要素は{1, 3, 99, 4, 7, 9, 11}となる。
 *
 * 作成者：山下
 * 作成日：2021/05/13
 */

package E_7_26;

import java.util.Scanner;

public class E_7_26 {

	static int[] arrayInsOf(int[] a, int idx, int x) {

		// 第三引数の値を挿入させるため、取得した配列の要素数に1プラスした値を要素数として配列を生成する
		int[] result = new int[a.length + 1];

		// 挿入された配列の要素数を指定するため、int型変数を定義する
		int resultArrayIndex = 0;

		// 引数で取得した配列の要素数まで繰り返す処理
		for (int i = 0; i < a.length; i++) {

			// 繰り返し変数iが挿入位置の引数と同値の場合
			if (i == idx) {
				// 返却するresult配列に挿入値の引数を代入させる
				result[resultArrayIndex] = x;
				// 取得した配列の要素を、前置インクリメントさせて、次の要素位置に代入させる
				result[++resultArrayIndex] = a[i];
			} else {
				// 取得した配列の各要素を、返却する配列の要素に代入させる
				result[resultArrayIndex] = a[i];
			}
			// 指定する要素数の変数をインクリメントさせる
			resultArrayIndex++;
		}
		// 取得した値を挿入した配列を返却するため、return文を定義する
		return result;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		// 配列を生成させるため、入力値として扱う変数を定義する
		int inputElement = 0;

		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {
			// 入力を促す文言を出力させる
			System.out.print("要素数：");

			// 入力した値をint型変数に代入させる
			inputElement = standardInput.nextInt();
		} while (inputElement <= 0);

		// 入力した値の要素を保持する配列を生成する
		int[] array = new int[inputElement];

		// 生成した配列の各要素に入力値を代入させるため、要素分繰り返す処理を定義
		for (int i = 0; i < array.length; i++) {
			// 入力を促す文言を出力させる
			System.out.print("array[" + i + "] = ");
			// 入力した値を要素に代入させる
			array[i] = standardInput.nextInt();
		}

		// 挿入する要素の位置を指定するため、変数を定義する
		int inputPosition = 0;

		System.out.println("挿入する要素位置を入力して下さい。");

		// 生成した配列の要素数内の数値が入力されるまで繰り返すため、do文を定義する
		do {
			// 挿入位置を入力を促す文言を出力させる
			System.out.print("挿入位置：");

			// 入力した値をint型変数に代入させる
			inputPosition = standardInput.nextInt();

		} while (inputElement <= inputPosition);

		// 挿入する要素の個数を指定するため、変数を定義する
		int inputInsert = 0;

		System.out.println("挿入する値を入力して下さい。");

		// 挿入個数の入力を促す文言を出力させる
		System.out.print("挿入値：");

		// 入力した値をint型変数に代入させる
		inputInsert = standardInput.nextInt();

		// 各入力した値をメソッドの引数に定義し、実行結果用配列に代入させる
		int[] arrayResult = arrayInsOf(array, inputPosition, inputInsert);

		// 配列の各要素をそれぞれ出力させるため、for文で繰り返す処理を定義
		for (int i = 0; i < arrayResult.length; i++) {
			// 各要素ごとに全要素を出力させる
			System.out.println("arrayResult[" + i + "] = " + arrayResult[i]);
		}
	}

}


/*
 * 配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッドarrayInsOfを作成せよ。
 *   int[] arrayInsOfN(int[] a, int idx, int x)
 * 削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと。
 * (例)配列a の要素が{1, 3, 4, 7, 9, 11}のときに arrayRmvOfN(a, 1, 3)と呼び出された場合、
 * 返却する配列の要素は{1, 9. 11}となる。
 *
 * 作成者：山下
 * 作成日：2021/05/13
 */

package E_7_25;

import java.util.Scanner;

public class E_7_25 {

	/**
	 * 配列の指定した要素箇所から指定した値個分削除するメソッド
	 * 
	 * @param a：int型で生成された配列を取得する
	 * @param idx：削除する要素位置を指定する
	 * @param x：削除する要素数を指定する
	 * @return：取得した配列要素を削除した配列を返却
	 */
	static int[] arrayRmvOfN(int[] a, int idx, int x) {

		//削除位置の引数値に、削除要素の引数値を加算した値が、取得した配列要素よりも大きい場合
		if(idx + x > a.length) {
			//配列の要素数から、要素位置として取得した引数値をマイナスさせた値を削除する要素数として算出する
			x = a.length - idx;
		}
		
		// 結果用の配列を生成するため、削除要素の変数値を引いた値を要素数として定義する
		int result[] = new int[a.length - x];

		// 削除後の配列要素をずらすため、削除位置として取得した引数値を繰り返し変数として繰り返す処理を行う
		for (int i = idx; i < a.length - x; i++) {
			// 取得配列の削除位置値と削除個数値を足した値の要素を、削除位置の要素に代入させる
			a[i] = a[i + x];
		}

		// 削除結果配列の要素数分繰り返す処理を定義
		for (int i = 0; i < result.length; i++) {
			// 取得した引数配列の要素を、削除結果配列に代入させる
			result[i] = a[i];
		}

		// 削除結果配列を返却させるため、return文を定義する
		return result;

	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//配列を生成させるため、入力値として扱う変数を定義する
		int inputElement = 0;
		
		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {
			// 入力を促す文言を出力させる
			System.out.print("要素数：");

			// 入力した値をint型変数に代入させる
			inputElement = standardInput.nextInt();
		} while(inputElement <= 0);
		
		// 入力した値の要素を保持する配列を生成する
		int[] array = new int[inputElement];

		// 生成した配列の各要素に入力値を代入させるため、要素分繰り返す処理を定義
		for (int i = 0; i < array.length; i++) {
			// 入力を促す文言を出力させる
			System.out.print("array[" + i + "] = ");
			// 入力した値を要素に代入させる
			array[i] = standardInput.nextInt();
		}

		// 削除する要素の位置を指定するため、変数を定義する
		int inputPosition = 0;
		
		System.out.println("削除する要素位置を入力して下さい。");

		// 生成した配列の要素数内の数値が入力されるまで繰り返すため、do文を定義する
		do {
			// 削除位置を入力を促す文言を出力させる
			System.out.print("削除位置：");

			// 入力した値をint型変数に代入させる
			inputPosition = standardInput.nextInt();

		} while (inputElement <= inputPosition);

		//削除する要素の個数を指定するため、変数を定義する
		int inputDelete = 0;
		
		System.out.println("削除する要素個数を入力して下さい。");

		//入力された削除位置と、生成した配列の要素数内で削除する要素数が入力されるまで繰り返させるため、do文を定義する
		do {
			// 削除個数の入力を促す文言を出力させる
			System.out.print("削除個数：");
			
			// 入力した値をint型変数に代入させる
			inputDelete = standardInput.nextInt();

		} while ((array.length - inputPosition) < inputDelete);

		// 各入力した値をメソッドの引数に定義し、実行結果用配列に代入させる
		int[] arrayResult = arrayRmvOfN(array, inputPosition, inputDelete);
		
		// 配列の各要素をそれぞれ出力させるため、for文で繰り返す処理を定義
		for (int i = 0; i < arrayResult.length; i++) {
			// 各要素ごとに全要素を出力させる
			System.out.println("arrayResult[" + i + "] =" + arrayResult[i]);
		}
		
		//生成した配列の要素がすべて削除された場合、削除された文言を出力
		if(arrayResult.length == 0) {
			System.out.println("※配列の要素は全て削除されました。");
		}
	}

}

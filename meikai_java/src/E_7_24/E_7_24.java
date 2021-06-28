
/*
 * 配列aから要素[idx]を削除した配列を返却するメソッドarrayRmvOfを作成せよ。
 *    int[] arrayRmvOf(int[] a, int idx)
 * 削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。
 * (例)配列a の要素が{1, 3, 4, 7, 9, 11}のときに
 *     arrayRmvOf(a, 2)と呼び出された場合、返却する配列の要素は{1, 3, 7, 9, 11}となる。
 *
 * 作成者：山下
 * 作成日：2021/05/12
 */

package E_7_24;

import java.util.Scanner;

public class E_7_24 {

	/**
	 * 取得した配列の指定した要素を削除するメソッド
	 * @param a：int型で生成された配列を取得する
	 * @param idx：削除する要素を指定する
	 * @return：削除した配列を返却する
	 */
	static int[] arrayRmvOf(int[] a, int idx) {

		//削除後の配列を生成させるため、取得した配列の要素数マイナス1した要素を保持した配列を生成させる
		int[] arrayRemoveResult = new int[a.length - 1];

		//全要素を一つ前方にずらすためのint型を定義
		int change = 0;

		//削除後の要素分で繰り返し処理を行うため、for文を定義する
		for (int i = 0; i < arrayRemoveResult.length; i++) {

			//削除要素を指定する引数idxの値と繰り返し変数が同値の場合
			if (idx == i) {
				//次の要素の値を代入させるため、前置インクリメントして次要素の値を代入させる
				arrayRemoveResult[i] = a[++change];
				//それ以外の場合、順番に要素を削除結果配列に各要素を代入させる
			} else {
				//引数として取得した配列要素を返却用の配列各要素に順に代入させる
				arrayRemoveResult[i] = a[change];
			}
			//代入処理終了後、次の要素を代入させるためインクリメントさせる
			change++;
		}
		//繰り返し代入処理後、削除結果の配列を返却させるため、return文を定義する
		return arrayRemoveResult;
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 配列の要素を指定するint型変数を定義する
		int inputElement;

		// 要素数を指定するため、1以上の値が入力されるまで繰り返す
		do {

			// 入力を促す文言を出力する
			System.out.print("要素数：");

			// 入力値をint型変数に代入させる
			inputElement = standardInput.nextInt();

		} while (inputElement <= 0);

		// arrayRmvOfメソッドで検索させるため、配列を生成する
		int array[] = new int[inputElement];

		// 配列の要素数分繰り返すため、for文を定義する
		for (int i = 0; i < array.length; i++) {
			// 各要素に入力した値を代入させるため、入力を促す文言を出力し、各要素に入力値を代入させる
			System.out.print("array[" + i + "] = ");
			array[i] = standardInput.nextInt();
		}
		
		//削除する要素を指定するため、int型変数を定義する
		int inputRemove = 0;

		//配列の要素数以上の値が入力されることがないように、do文で入力処理を繰り返す
		do {
			// 削除する値を入力させる
			System.out.print("削除する要素値：");
			inputRemove = standardInput.nextInt();
		} while(inputRemove >= inputElement);
		
		//作成したarrayRmvOfメソッドの引数に生成した配列、要素の削除指定値を定義する
		int[] arrayResult = arrayRmvOf(array, inputRemove);

		//メソッド返却結果を各要素出力させるため、for文で繰り返し表示させる
		for (int i = 0; i < arrayResult.length; i++) {
			//各要素を出力させる
			System.out.println("arrayResult[" + i + "] =" + arrayResult[i]);
		}
	}

}

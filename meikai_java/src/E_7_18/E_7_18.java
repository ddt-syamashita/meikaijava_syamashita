/*
 * 配列a　から要素a[idx]を削除するメソッドaryRmv を作成せよ。
 *   void aryRmv(int[] a, int idx)
 * 削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。なお、移動されずにあまってしまう
 * 末尾要素 a[a.length -1]の値は変更しなくてよい。 
 * 
 * 作成者：山下
 * 作成日：2021/05/06
 * 
 */

package E_7_18;

import java.util.Scanner;

public class E_7_18 {

	/**
	 * 取得した配列の指定した要素位置を削除するメソッド
	 * 
	 * @param a：配列を取得する
	 * @param idx：取得した配列の削除する要素を取得する
	 */
	static void aryRmv(int[] a, int idx) {
		// 引数idxの値を繰り返し変数iに代入させ、配列の要素数マイナス1した値まで繰り返すため、for文を定義する
		for (int i = idx; i < a.length - 1; i++) {
			// 削除した要素に対して、次の位置にある要素の値を代入させる
			a[i] = a[i + 1];
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

		//削除する要素を決めるため、int型変数を定義する
		int elementDelete = 0;
		
		//配列の要素数より大きい値が入力された場合、繰り返し入力処理を行う
		do {
			//削除する要素の値の入力を促す文言を出力し、要素削除メソッドで使用するため、入力値をint型変数に代入させる
			System.out.print("削除する要素：");
			elementDelete = standardInput.nextInt();
			
			//要素数を知らせるため、最後尾要素数を出力する
			if(array.length-1 < elementDelete) {
				System.out.println("array配列の最後尾要素数は「" + (array.length -1) + "」です。");
			}

		} while(array.length-1 < elementDelete);

		// 指定要素を削除するため、要素削除メソッドに引数を指定して呼び出す
		aryRmv(array, elementDelete);

		// 削除メソッド実行結果を出力させるため、for文を定義する
		for (int i = 0; i < inputElement - 1; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}


/*
 * 配列aと同じ配列(要素数が同じで、すべての要素の値が同じ配列)を生成して返却するメソッド arrayClone を作成せよ。
 *    int[] arrayClone(int[] a)
 *
 * 作成者：山下
 * 作成日：2021/05/11
 */

package E_7_22;

import java.util.Scanner;

public class E_7_22 {

	/**
	 * 引数として取得した配列の同じ配列を生成し、返却するメソッド
	 *
	 * @param a:配列を取得させる
	 * @return :引数で取得した配列を返却する
	 */
	static int[] arrayClone(int[] a) {

		//戻り値として返却する配列を生成する
		int[] array = new int[a.length];

		//同じ配列を生成するため、取得した配列の要素数分繰り返す処理を定義
		for (int i = 0; i < array.length; i++) {
			//引数の配列要素を返却する配列要素に代入する
			array[i] = a[i];
		}
		//同じ配列要素を格納させたarray配列を返却させるため、returnを定義する
		return array;
	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("要素数：");

		//読み込んだ値をint型変数に代入する
		int input = standardInput.nextInt();

		//読み込んだ値の要素数の配列を生成する
		int[] inputArray = new int[input];

		//生成した配列の各要素に入力値を代入するため、要素分繰り返す処理を行う
		for (int i = 0; i < inputArray.length; i++) {
			//入力を促す文言を出力させる
			System.out.print("arrayInput[" + i + "] ：");
			//各要素に読み込んだ値を代入させる
			inputArray[i] = standardInput.nextInt();
		}
		
		//同じ配列を生成するarrayCloneメソッドに、入力して生成したinputArray配列を引数に定義する
		int[] clone = arrayClone(inputArray);

		//読み込んだ値で生成した配列の全要素の値を出力させる
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("arrayInput[" + i + "] = " + inputArray[i]);

		}

		//配列複製メソッドを使用して生成した配列の全要素の値を出力させる
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("clone[" + i + "] = " + clone[i]);
		}
	}
}

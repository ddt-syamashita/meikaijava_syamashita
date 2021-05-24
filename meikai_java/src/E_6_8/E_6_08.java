
/*
 * double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 要素数と全要素の値はキーボードから読み込むこと。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 */

package E_6_8;

import java.util.Scanner;

public class E_6_08 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力値を要素数として読み込むため、double型変数を定義する
		double element = 0;

		//1以上の値が入力されるまで繰り返させるため、do文で入力処理を行う
		do {
			//要素数の入力を促す文言を出力させる
			System.out.print("要素数：");
			element = standardInput.nextDouble();
		}while(element <= 0);


		//double型の配列を生成する。配列の要素数は、整数のint型に型変換する。
		double[] doubleArray = new double[(int) element];

		//double配列の全要素に入力値を代入する
		for (int i = 0; i < doubleArray.length; i++) {

			//各要素に入力値を代入する文言を出力させる
			System.out.print("doubleArray[" + i + "] = ");
			//各要素に対し、入力値を代入する
			doubleArray[i] = standardInput.nextDouble();
		}

		//合計値を求めるdouble型変数を定義する
		double sum = 0;

		//合計値を求めるため、各要素の値をsum変数に加算させる
		for (double i : doubleArray) {
			sum += i;
		}

		//合計値を出力させる
		System.out.println("合計値：" + sum);
		//平均値を出力させる。合計値と要素数を割り平均を求める。
		System.out.println("平均値：" + (sum / element));

	}

}

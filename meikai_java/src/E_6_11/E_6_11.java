
/*
 * 異なる要素の値をもつことのないように演習6-9 のプログラムを改良したプログラムを作成せよ。
 * たとえば{1, 3, 5, 6, 1, 2}とならないようにすること（配列の要素数は10以下とであるとする）。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 *
 */

package E_6_11;

import java.util.Random;
import java.util.Scanner;

public class E_6_11 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//乱数クラスをインスタンス化する
		Random random = new Random();

		//入力値を要素数にint型変数として代入する
		int input;

		//1以上10以下の値が入力されるまで繰り返し入力を促す
		do {
			//要素数を読み込ませる文言を出力させる
			System.out.print("要素数(1～10の範囲)：");
			//入力値を求めるため、要素数にint型変数を代入する
			input = standardInput.nextInt();

		} while (input < 1 || input > 10);

		//int型配列を生成する
		int[] intArray = new int[input];

		//intArray配列の読み込んだ要素数に代入するため、要素数分繰り返す処理を定義
		for (int i = 0; i < input; i++) {

			//各要素に乱数を代入させる
			intArray[i] = random.nextInt(10) + 1;

			//異なる要素が同値が持つことのないよう、前段繰り返し回数まで繰り返し探索処理を行う
			for (int j = 1; j <= i; j++) {
				//順にintArrayに代入された値を比較し、同じ要素の場合
				if (intArray[i] == intArray[j - 1]) {
					//前段の繰り返し変数iの値をデクリメントし、前段繰り返し処理をやり直す
					i--;
					//探索処理を抜け出し、前段のfor文へ移動する
					break;
				}
			}
		}
		//代入されたintArray配列の各要素を繰り返し出力させるため、for文を定義する
		for (int i = 0; i < input; i++) {
			//配列変数の表示と、格納された要素の値を出力
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
	}
}

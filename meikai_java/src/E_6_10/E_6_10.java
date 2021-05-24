
/*
 * 連続する要素が同じ値を持つことがないように演習6-9 のプログラムを改良したプログラムを作成せよ。
 * たとえば{1, 3, 5, 5, 3, 2}とならないよにすること。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 */

package E_6_10;

import java.util.Random;
import java.util.Scanner;

public class E_6_10 {

	public static void main(String[] args) {
		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//乱数クラスをインスタンス化する
		Random random = new Random();

		//入力値を要素数にint型変数として代入する
		int input;

		//1以上の値が入力されるまで繰り返し入力を促す
		do {
			//要素数を読み込ませる文言を出力させる
			System.out.print("要素数：");
			//入力値を求めるため、要素数にint型変数を代入する
			input = standardInput.nextInt();

		} while (input < 1);

		//int型配列を生成する
		int[] intArray = new int[input];

		int randomValue = 0;

		//intArray配列の要素数に代入するため、要素数分繰り返す処理を定義
		for (int i = 0; i < intArray.length; i++) {

			//繰り返し変数が0の場合はそのまま乱数を代入させる
			if (i == 0) {
				//int型の乱数1～10を生成する
				randomValue = random.nextInt(10) + 1;

				//int型配列の各要素に乱数を代入する
				intArray[i] = randomValue;
				//繰り返し変数が1以上になった場合
			} else {
				//1つ前の要素数が生成した乱数と一致している場合、繰り返し乱数を生成させ、一致していない乱数を代入させる
				do {
					//int型の乱数1～10を生成する
					randomValue = random.nextInt(10) + 1;

					//int型配列の各要素に乱数を代入する
					intArray[i] = randomValue;
				} while (intArray[i] == intArray[i - 1]);
			}

			//全要素の配列番号と、値を出力させる
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}

	}

}

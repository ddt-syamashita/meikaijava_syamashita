
/*
 * 要素型がint型である配列を作り、全要素を1～10の乱数で埋めつくす（1以上10以下の値を代入する）プログラムを作成せよ。
 * 要素数はキーボードから読み込むこと。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 */

package E_6_9;

import java.util.Random;
import java.util.Scanner;

public class E_6_09 {

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

		//intArray配列の要素数に代入するため、要素数分繰り返す処理を定義
		for (int i = 0; i < intArray.length; i++) {
			//int型の乱数1～10を生成する
			int randomValue = random.nextInt(10) + 1;

			//int型配列の各要素に乱数を代入する
			intArray[i] = randomValue;

			//全要素の配列番号と、値を出力させる
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}

	}

}

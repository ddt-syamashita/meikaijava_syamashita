
/*
 * 配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラムを作成せよ。
 *
 *
 * 作成者：山下
 * 作成日：2021/03/13
 *
 */

package E_6_12;

import java.util.Random;
import java.util.Scanner;

public class E_6_12 {

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

		//シャッフルする前のint型配列を生成する
		int[] beforeArray = new int[input];

		//intArray配列の読み込んだ要素数に代入するため、要素数分繰り返す処理を定義
		for (int i = 0; i < input; i++) {

			//各要素に乱数を代入させる
			beforeArray[i] = random.nextInt(10) + 1;

			//異なる要素が同値が持つことのないよう、前段繰り返し回数まで繰り返し探索処理を行う
			for (int j = 1; j <= i; j++) {
				//順にintArrayに代入された値を比較し、同じ要素の場合
				if (beforeArray[i] == beforeArray[j - 1]) {
					//前段の繰り返し変数iの値をデクリメントし、前段繰り返し処理をやり直す
					i--;
					//探索処理を抜け出し、前段のfor文へ移動する
					break;
				}
			}
		}

		//シャッフル後のint型配列を生成する
		int[] afterArray = new int[input];

		//ランダムシャッフルさせるための変数を定義
		int randomValue;

		//入力値までを繰り返し処理を定義
		for (int i = 0; i < input; i++) {

			//配列要素をシャッフルさせるため、入力値の範囲内で乱数を代入させる
			randomValue = random.nextInt(input);

			//シャッフル後の要素が0の場合
			if (afterArray[randomValue] == 0) {
				//乱数で指定された要素番号に、シャッフル前で定義された値を代入させる
				afterArray[randomValue] = beforeArray[i];
				//シャッフル後用の配列に値が代入されている場合
			} else {
				//繰り返し変数iをデクリメントし、代入されるまで繰り返させる
				i--;
			}
		}

		//シャッフル前の配列を出力するアナウンス文言を出力させる
		System.out.println("シャッフルする前の配列：beforeArray");
		for (int i = 0; i < input; i++) {
			//シャッフル前の配列変数の表示と、格納された要素の値を出力
			System.out.println("beforeArray[" + i + "] = " + beforeArray[i]);
		}

		//シャッフル後の配列を出力するアナウンス文言を出力させる
		System.out.println("シャッフルした後の配列：afterArray");
		for (int i = 0; i < input; i++) {
			//シャッフル後の配列変数の表示と、格納された要素の値を出力
			System.out.println("afterArray[" + i + "] = " + afterArray[i]);
		}

	}

}


/*
 * 配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
 * 表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って{}で囲んだ形式とすること。
 *
 * 作成者：山下
 * 作成日：2021/03/11
 *
 */

package E_6_5;

import java.util.Scanner;

public class E_6_05 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("要素数：");

		//入力した値を出力させるため、int型変数に代入する
		int inputValue = standardInput.nextInt();

		//入力値を配列に代入させるため、int型配列を生成する。
		int[] inputArray = new int[inputValue];

		//入力された値分繰り返し入力させるため、for文を定義
		for (int i = 0; i < inputArray.length; i++) {
			//入力値を要素に代入する文言を出力させる
			System.out.print("inputArray[" + i + "] = ");

			//入力された値を各要素に代入する
			inputArray[i] = standardInput.nextInt();
		}
		//初期化子形式として出力させるため、各要素直前までの式を出力させる
		System.out.print("inputArray = {");
		//全て配列に入力後、配列の値を出力させるため、for文を定義
		for (int i = 0; i < inputArray.length; i++) {

			//要素数に対し、1マイナスした値が繰り返し変数と同値になった場合、}で区切る表示を出力させる
			if (i == (inputArray.length - 1)) {
				//最後の要素値と、終了区切りを出力させる
				System.out.print(inputArray[i] + "}");
				//それ以外の場合、要素の値と、コンマ区切るを最後の配列まで繰り返し出力させる
			} else {
				//要素の値とコンマを出力させる
				System.out.print(inputArray[i] + ", ");
			}
		}

	}

}

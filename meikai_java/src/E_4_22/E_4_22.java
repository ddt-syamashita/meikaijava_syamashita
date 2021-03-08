
/*
 *
 * n段のピラミッドを表示するプログラムを作成せよ（右図は4段の例）。
 * 第i行目には（i - 1） * 2 + 1個の'*'記号を表示して、
 * 最終行である第n行目には（n - 1） * 2 +1個の'*'記号を表示すること。
 *
 *
 *
 * 作成者：山下
 * 作成日：2021/2/17
 */

package E_4_22;

import java.util.Scanner;

public class E_4_22 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数値：");

		//入力された値を出力させるため、int型変数に代入させる
		int inputNumber = standardInput.nextInt();

		//入力された値の段数分、ピラミッドを出力させるため、ループさせる
		for (int i = 1; i <= inputNumber; i++) {

			//入力された値に対し、行ループの値をマイナスした値まで繰り返させる
			for (int j = 1; j <= inputNumber - i; j++) {
				//半角スペースを出力させる
				System.out.print(" ");
			}
			//ピラミッド表示させるため、指定された計算式まで、繰り返し処理を行う
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				//入力された値の段数のピラミッドを出力させるため*を出力させる
				System.out.print("*");

			}
			//列ループ終了時、改行を出力させる
			System.out.println();
		}

	}

}

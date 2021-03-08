

/*
 *
 * n段の数字ピラミッドを表示するプログラムを作成せよ（右図は4段の例）。
 * 第i行目にはi % 10を表示すること。
 *
 * 作成者：山下
 * 作成日：2021/02/17
 *
 */


package E_4_23;

import java.util.Scanner;

public class E_4_23 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数値：");

		//入力された値を出力させるため、int型変数に代入する
		int inputNumber = standardInput.nextInt();

		//入力された値の段数のピラミッドを表示させるため、読み込んだ値の数だけ行を出力させる
		for(int i = 1; i <= inputNumber; i++) {

			//入力された値から行ループの値をマイナスした数まで列ループを繰り返す
			for(int j = 1; j <= inputNumber - i; j++) {
				//ピラミッドを出力させるため、半角スペースを出力させる
				System.out.print(" ");
			}
			//ピラミッドの形となるように、列ループを繰り返す
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				//ピラミッドの形になるように行数の値を出力させる
				System.out.print(i % 10);
			}
			//列ループ終了後、改行表示させる
			System.out.println();
		}

	}

}

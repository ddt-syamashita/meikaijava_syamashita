
/*
 *
 * 10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/02/2/28
 *
 */

package E_5_1;

import java.util.Scanner;

public class E_5_1 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数：");

		//読み込んだ値をコンソールに表示させるため、int型変数に代入する
		int inputNumber = standardInput.nextInt();

		//8進数の値を表示させるため、%oの値をprintfのメソッドで定義する
		System.out.printf("8進数では%oです。", inputNumber);

		//コンソール表示を改行させるため、printlnを定義する
		System.out.println();

		//16進数の値を表示させるため、%xの値をprintfのメソッドで定義する
		System.out.printf("16進数では%xです。", inputNumber);

	}

}

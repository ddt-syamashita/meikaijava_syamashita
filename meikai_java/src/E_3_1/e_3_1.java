
/*
 *
 * 右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_3_1;

import java.util.Scanner;

public class e_3_1 {

	public static void main(String[] args) {

		//整数値の入力を促す文言を出力
		System.out.print("整数値：");

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//読み込んだ値をint型に代入する
		int input = sc.nextInt();

		//読み込まれた値が、0未満の場合
		if (input < 0) {
			//読み込んだ値に絶対値を表示する
			input = -input;

			//読み込んだ値を出力させるため、計算したinput変数を定義する
			System.out.println("その絶対値は" + input + "です。");
		}
	}
}

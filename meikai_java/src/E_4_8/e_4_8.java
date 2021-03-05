
/*
 *
 *  右に示すように、正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_8;

import java.util.Scanner;

public class e_4_8 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		int input;

		do {
		//数値入力を促す文言を出力
		System.out.print("整数値：");

		//読み込んだ値を変数に代入する
		input = stdIn.nextInt();
		}while (input <= 0);

		//繰り返し回数用の変数を定義する
		int count = 0;

		//読み込んだ値
		do {
			input /= 10;
			count++;
		}while (0 < input);
		System.out.println("その値は" + count + "桁です。");
	}
}

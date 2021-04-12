
/*
 *
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/02/2/28
 *
 */

package E_5_2;

import java.util.Scanner;

public class E_5_2 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//説明文をコンソールに表示させる
		System.out.println("変数xはfloat型で、変数yはdouble型です。");

		//入力を促す文言を出力させる
		System.out.print("x：");

		//変数xをfloat型変数に代入する
		float x = standardInput.nextFloat();

		//入力を促す文言を出力させる
		System.out.print("y：");

		//変数yをdouble型変数に代入する
		double y = standardInput.nextDouble();

		//入力された結果をコンソールに出力させるため、変数xを出力定義
		System.out.println("x = " + x);

		//入力された結果をコンソールに出力させるため、変数yを出力定義
		System.out.println("y = " + y);
	}

}

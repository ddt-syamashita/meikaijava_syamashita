
/*
 *
 * 受け取ったint型引数の値nが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッドsignOFを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/17
 */

package E_7_01;

import java.util.Scanner;

public class E_7_01 {

	//int型引数を持つsingOfメソッドを定義する
	static int signOf(int n) {

		//引数の値が0の場合
		if (n == 0) {
			//0を返却する
			return 0;
			//引数の値が負の場合
		} else if (n < 0) {
			//-1の値を返却する
			return -1;
			//それ以外（引数の値が正）の場合
		} else {
			//1の値を返却する
			return 1;
		}

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力値を促す文言を出力させる
		System.out.print("整数：");

		//入力値をint型変数に代入させる
		int input = standardInput.nextInt();

		//入力された値に対し、signOfメソッドを出力させる
		System.out.println("n = " + input + "  →" + "返却された値は、" + signOf(input));

	}

}

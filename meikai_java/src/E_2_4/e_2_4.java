
/*
 *
 * 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_4;

import java.util.Scanner;

public class e_2_4 {

	public static void main(String[] args) {

		//改行なしで、指定文字列をコンソールに出力
		System.out.print("整数値：");

		//Scanner をインスタンス化 変数scとして定義。
		Scanner sc = new Scanner(System.in);

		//読み込んだ値をint型変数のxに代入する
		int x = sc.nextInt();

		//読み込んだ値に10を加えて出力する
		System.out.println("10を与えた値は" + (x + 10) + "です");

		//読み込んだ値に10を減じて出力する
		System.out.println("10を減じた値は" + (x - 10) + "です");
	}

}

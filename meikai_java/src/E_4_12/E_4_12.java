
/*
 *
 * 前問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/3
 */

package E_4_12;

import java.util.Scanner;

public class E_4_12 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//文言を出力
		System.out.println("カウントアップします");

		//文字入力を促す文言を出力
		System.out.print("整数値：");

		//読み込んだ値を変数に代入する
		int inputNumber = standardInput.nextInt();

		//読み込んだ値まで0から出力する
		for (int i = 0; i <= inputNumber; i++) {
			System.out.println(i);
		}
	}

}

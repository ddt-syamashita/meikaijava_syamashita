/**
 * 文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 * 
 * 作成者：山下
 * 作成日：2022/1/10
 * 
 */

package E_15_02;

import java.util.Scanner;

public class E_15_02 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 入力を促す文言を出力し、入力をString型変数に代入させる
		System.out.print("入力文字：");
		String input = standardInput.next();

		// 入力された文字列分繰り返すため、for文を定義する
		for (int i = 0; i < input.length(); i++) {
			// printfを使用し、各文字列を出力後に改行する。charAtメソッドを使用し、文字コードを出力する
			System.out.printf("s[%d] = %c →文字コード：%04X\n", i, input.charAt(i), (int) input.charAt(i));
		}
	}

}

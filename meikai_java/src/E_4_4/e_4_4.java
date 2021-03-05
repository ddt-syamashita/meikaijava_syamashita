
/*
 *
 *  List 4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_4;

import java.util.Scanner;

public class e_4_4 {

	public static void main(String[] args) {

		//List 4-4をコピー
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		int input;

		do {
			//入力を促す文言を出力させる
			System.out.print("正の整数値：");
			//値を出力させるため、入力値を変数に代入させる
			input = stdIn.nextInt();
		} while (input <= 0);

		//0以上の値の場合、繰り返させる処理
		while (input >= 0) {
			//繰り返す度にマイナス1された入力値を出力させる
			System.out.println(input);
			//繰り返す度にマイナス1させる
			input--;
		}

		//xの値を出力させる
		System.out.println("x = " + input);
	}
}

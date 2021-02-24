
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

		int x;

		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);

		//while文終了時にxの値が-1になるまで繰り返す
		while (x >= -1) {
			System.out.println(x);
			x--;
		}
	}
}

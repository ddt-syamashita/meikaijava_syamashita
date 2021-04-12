
/*
 *
 *  読み込んだ整数値の符号を判定するList 3-5のプログラム（p.58）を、好きなだけ何度でも繰り返して
 *  入力・表示できるようにしたプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_4_1;

import java.util.Scanner;

public class e_4_1 {

	public static void main(String[] args) {

		//p.58引用 Start
		Scanner stdIn = new Scanner(System.in);

		//何度でも繰り返して入力・表示させる
		do {
			System.out.print("整数値：");
			int n = stdIn.nextInt();

			if (n > 0)
				System.out.println("その値は正です。");
			else if (n < 0)
				System.out.println("その値は負です。");
			else
				System.out.println("その値は0です。");

		} while (true);
	}

}

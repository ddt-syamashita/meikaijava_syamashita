
/*
 *
 *  List 4-5(p.102)のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。
 * プログラムを作成して実行結果を確認すること。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_5;

import java.util.Scanner;

public class e_4_5 {

	public static void main(String[] args) {

		//List 4-5をコピー
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);

		//while文終了時にxの値が-1になるまで繰り返す
		while (x >= 0) {
			//「x--」を「--x」に修正。出力結果を確認
			System.out.println(--x);
		}
	}
}

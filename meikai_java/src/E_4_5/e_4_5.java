
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
		int input;
		do {
			System.out.print("正の整数値(問題文用 x--)：");
			x = stdIn.nextInt();
			System.out.print("正の整数値(比較用 --x）：");
			input = stdIn.nextInt();
		} while (input <= 0);

		System.out.println("x--の場合：");
		//入力値変数が0以上になるまで繰り返させるため、while文を定義
		while (x >= 0) {
			//問題文出力結果を確認
			System.out.println(x--);
		}

		System.out.println("--xの場合：");
		//入力値変数が0以上になるまで繰り返させるため、while文を定義
		while (input >= 0) {
			//「x--」を「--x」に修正。出力結果を確認
			System.out.println(--input);
		}
	}
}

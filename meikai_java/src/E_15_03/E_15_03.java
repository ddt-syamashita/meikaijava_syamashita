/**
 * 文字列探索のプログラムを書き換えて、右のように表示するプログラムを作成せよ。
 * 一致する部分が上下で揃うように表示すること。
 * 
 * 　下記例
 * 　文字列s1：ABCDEFGHI
 * 　文字列s2：EFG
 *  s1:ABCDEFGHI
 *  s2:    EFG
 * 
 * 作成者：山下
 * 作成日：2022/2/10
 */

package E_15_03;

import java.util.Scanner;

public class E_15_03 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 入力を促す文言を出力し、入力をString型変数に代入させる
		System.out.print("文字列1：");
		String inputString1 = standardInput.next();

		System.out.print("文字列2：");
		String inputString2 = standardInput.next();

		// inputString1にinputString2が含まれているか確認するため、indexOfを使用し、int型変数に代入させる
		int indexResult = inputString1.indexOf(inputString2);

		// 含まれていない場合
		if (indexResult == -1) {
			System.out.println("一致する文字列は含まれません。");
			// 入力値が含まれる場合
		} else {
			// 出力結果を確認するため、一つ目の入力された文字列を出力する
			System.out.println("inputString1：" + inputString1);

			// 出力結果を確認するため、二つ目の入力された文字列を出力する
			System.out.print("inputString2：");
			// 同じ文字の位置まで繰り返しスペースを出力させるため、for文を定義する
			for (int i = 0; i < indexResult; i++) {
				// 出力位置を調整するため、スペースを出力する
				System.out.print(' ');
			}
			// 一致する文字列部分を揃えるため、スペースを出力後に二つ目の入力された文字列を出力する
			System.out.print(inputString2);
		}

	}

}

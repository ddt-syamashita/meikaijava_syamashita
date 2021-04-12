
/*
 *
 *  読み込んだ値が1未満であれば改行文字を出力しないようにList 4-7およびList 4-8を書きかえたプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_6;

import java.util.Scanner;

public class e_4_6 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//値の入力を促す文言を出力
		System.out.print("何個*を表示しますか：");

		//読み込んだ値を変数に代入する
		int input = stdIn.nextInt();

		//繰り返し回数を保持する変数を定義
		int count = 0;

		//読み込んだ値が1未満であるか判定
		if (input < 1) {
			//読み込んだ数分繰り返す
			while (count < input) {
				//指定文字を出力する
				System.out.print('*');
				//繰り返し変数を後置インクリメントする
				count++;
			}
			//改行文字を出力する
			System.out.println();
		}
	}
}

/*
 *
 * 読み込んだ個数だけ*を表示するList 4-11（p.114）を書きかえて、5個表示するごとに改行するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_16;

import java.util.Scanner;

public class E_4_16 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("何個*を表示しますか：");

		//読み込まれた値を出力させるため、int型変数に代入する
		int inputNumber = standardInput.nextInt();

		//読み込まれた値まで*表示を繰り返させるため、for文で繰り返し処理を行う
		for (int i = 1; i <= inputNumber; i++) {

			//指定文字を繰り返し処理が行われる度に出力させる
			System.out.print("*");

			//処理回数が5の倍数の場合、コンソール表示を改行させるため、分岐処理を定義
			if (i % 5 == 0) {
				//コンソールを1行改行させる
				System.out.println();
			}
		}

	}

}

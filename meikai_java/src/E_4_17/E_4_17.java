
/*
 *
 * 読み込んだ整数値のすべての約数を表示するList 4-13（p.118）を書きかえて、
 * 約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_17;

import java.util.Scanner;

public class E_4_17 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("整数値：");

		//読み込まれた値を出力させるため、int型変数に代入する
		int inputNumber = standardInput.nextInt();

		//約数の個数を算出するための変数を定義する
		int count = 0;

		//読み込んだ整数値まで約数の表示を繰り返し処理するため、for文で繰り返し処理を行う
		for (int i = 1; i <= inputNumber; i++) {

			//読み込まれた値の約数を求めるため、分岐処理を行う
			if (inputNumber % i == 0) {
				//約数の値の場合、約数値を出力する
				System.out.println(i);
				//約数を出力させる度にカウント数を更新する
				count++;
			}

		}
		//約数の個数結果を出力する
		System.out.println("約数は" + count + "個です。");

	}

}

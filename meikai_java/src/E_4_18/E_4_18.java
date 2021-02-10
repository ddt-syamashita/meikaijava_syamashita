
/*
 *
 * 右に示すように、1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_18;

import java.util.Scanner;

public class E_4_18 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("nの値：");

		//読み込まれた値を出力させるため、int型変数に代入する
		int inputNumber = standardInput.nextInt();

		//読み込まれた値まで処理を繰り返すため、for文を定義
		for (int i = 1; i <= inputNumber; i++) {

			//繰り返す度に＋1される変数に対し、2乗の値を算出するため、更新される値同士を掛け算する
			System.out.println("1の2乗は" + (i * i));
		}

	}

}


/*
 *
 * 前問のプログラムを書きかえて、右のように"式”を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/3
 */

package E_4_14;

import java.util.Scanner;

public class E_4_14 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//数値入力を促す文言を出力
		System.out.print("nの値：");

		//読み込んだ値をコンソールに出力させるため代入
		int inputNumber = standardInput.nextInt();

		//合計値を格納する変数を定義する
		int total = 0;

		//繰り返した回数を格納する変数を定義
		int count = 1;

		//1から読み込んだ値まで繰り返す
		for (; count <= inputNumber; count++) {
			//読み込んだ値の直前まで繰り返した場合
			if (count < inputNumber) {
				//直前まで繰り返した値を式として出力させる
				System.out.print(count + " + ");
			}
			//和の合計を求めるため、total変数に繰り返した値を加算させる
			total += count;
		}
		//= の手前に出力させた繰り返した値と、和の合計を出力させる
		System.out.print((count - 1) + " = " + total);
	}

}

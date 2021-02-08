
/*
 *
 * 1からnまでの和を求めるList 4-10（p.112）をfor文で実現せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/3
 */

package E_4_13;

import java.util.Scanner;

public class E_4_13 {

	public static void main(String[] args) {

		//Sccanerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//数値入力を促す文言を出力
		System.out.print("nの値：");

		//読み込んだ値を変数に代入する
		int inputNumber = standardInput.nextInt();

		//合計値を格納する変数を定義する
		int total = 0;

		//1からnまでの繰り返す
		for(int i = 1;i <= inputNumber; i++) {
			//和の合計を求めるため、合計値格納変数に繰り返し回数の値を加算する
			total += i;
		}
		//1から読み込んだ値までの和を出力する
		System.out.println("1から"+ inputNumber + "までの和は" + total + "です。");
	}

}

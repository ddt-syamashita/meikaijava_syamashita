
/*
 * 配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 * なお、二つの配列の要素数は同一であると仮定してよい。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 *
 */

package E_6_13;

import java.util.Scanner;

public class E_6_13 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("要素数：");

		//要素数を定義するため、入力された値をint型変数に代入する
		int input = standardInput.nextInt();

		//配列aを定義する
		int[] a = new int[input];
		//配列bを定義する
		int[] b = new int[input];

		//配列aの各要素に値を代入するため、for文で繰り返し代入する
		for (int i = 0; i < input; i++) {
			//入力を促す文言を出力させる
			System.out.print("a[" + i + "] = ");
			a[i] = standardInput.nextInt();
		}

		//逆順にコピーさせるため、入力した値のマイナス1の値を定義する
		int reverse = input - 1;

		//配列aの全要素を逆順で配列bにコピーする
		for (int i = 0; i < input; i++) {
			//配列aの逆順の要素値を、配列bに要素0から順に代入する
			b[i] = a[reverse--];
		}

		//配列をコピーした文言を出力させる
		System.out.println("配列aの全要素を、逆順で配列bにコピーしました。");

		//配列bのコピー結果を出力させるため、繰り返し処理を行う
		for (int i = 0; i < input; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}

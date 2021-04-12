
/*
 *
 * 二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_10;

import java.util.Scanner;

public class e_3_10 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数値1：");

		//1つ目の読み込んだ値を変数input1に代入する
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数値2：");

		//2つ目の読み込んだ値を変数input2に代入する
		int input2 = sc.nextInt();

		//100 50 50, 200 150 50 150 200

		//入力した値を格納させるint型変数
		int data;

		//1つ目の値よりも2つ目の値が大きい場合
		if (input1 < input2) {
			//2つ目の値 -1つ目の値で差を計算し、出力する
			System.out.println("入力した値の差は" + (input2 - input1));
		} else {
			//1つ目の値-2つ目の値で差を計算し、出力する
			System.out.println("入力した値の差は" + (input1 - input2));
		}
	}

}

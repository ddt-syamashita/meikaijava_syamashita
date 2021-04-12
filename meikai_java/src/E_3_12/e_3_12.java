
/*
 *
 *  キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_12;

import java.util.Scanner;

public class e_3_12 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の整数値入力を促す文言を出力
		System.out.print("整数値A：");
		//1つ目の整数値を変数に代入
		int input1 = sc.nextInt();

		//2つ目の整数値入力を促す文言を出力
		System.out.print("整数値B：");
		//2つ目の整数値を変数に代入
		int input2 = sc.nextInt();

		//3つ目の整数値入力を促す文言を出力
		System.out.print("整数値C：");
		//3つ目の整数値を変数に代入
		int input3 = sc.nextInt();

		//最小値を求めるint型変数を定義
		int min;

		//1つ目の整数値を変数minに代入
		min = input1;

		//1つ目の値より2つ目の値が小さい場合、2つ目の値を最小値変数に代入
		if (min > input2) {
			min = input2;
		}

		//3つ目の値が1,2目よりも値が小さい場合、3つ目の値を最小値変数に代入
		if (min > input3) {
			min = input3;
		}

		//最小値を出力する
		System.out.println("最小値：" + min);
	}

}


/*
 *
 *  キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 *  ※たとえば2,3,2の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_13;

import java.util.Scanner;

public class e_3_13 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数値A：");
		//読み込んだ1つ目の値を変数input1に代入
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数値B：");
		//読み込んだ2つ目の値を変数input2に代入
		int input2 = sc.nextInt();

		//3つ目の値の入力を促す文言を出力
		System.out.print("整数値C：");
		//読み込んだ3つ目の値を変数input3に代入
		int input3 = sc.nextInt();

		//読み込んだ3つの値の中央値を出力させる
		//1つ目の値が2つ目の値以上の場合
		if (input1 >= input2) {
			//2つ目の値が3つ目の値以下の場合
			if (input2 <= input3) {
				//2つ目の値を出力
				System.out.println(input2);
				//1つ目の値が3つ目の値以下の場合
			} else if (input1 <= input3) {
				//1つ目の値を出力
				System.out.println(input1);
				//上記パターン以外のは3つ目の値を出力
			} else {
				System.out.println(input3);
			}
			//1つ目の値が2つ目の値以上ではなく、1つ目の値が3つ目の値よりも小さい場合
		} else if (input1 > input3) {
			//1つ目の値を出力させる
			System.out.println(input1);
			//2つ目の値が3つ目の値よりも小さい場合
		} else if (input2 > input3) {
			//3つ目の値を出力
			System.out.println(input3);
			//それ以外の場合は2つ目の値を出力させる
		} else {
			System.out.println(input2);
		}
	}
}

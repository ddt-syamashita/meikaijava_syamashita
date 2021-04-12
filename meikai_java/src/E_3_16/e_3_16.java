
/*
 *
 *  三つの整数値を読み込んで昇順（小さい順）にソートするプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_16;

import java.util.Scanner;

public class e_3_16 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数A：");
		//1つ目の値を変数に代入する
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数B：");
		//2つ目の値を変数に代入する
		int input2 = sc.nextInt();

		//3つ目の値の入力を促す文言を出力
		System.out.print("整数C：");
		//3つ目の値を変数に代入する
		int input3 = sc.nextInt();

		//データをソートするため、仮に格納する変数を定義
		int data;

		//1つ目の値より2つ目の値が小さい場合
		if (input1 > input2) {
			//データをソートするため、仮に格納する変数に、1つ目の値を代入する
			data = input1;
			//2つ目の値を1つ目の変数に代入する
			input1 = input2;
			//1つ目の値を2つ目の変数に代入する
			input2 = data;

			//2つ目の値より3つ目の値が小さい場合
			if (input2 > input3) {
				//2つ目の値を仮格納する変数に代入する
				data = input2;
				//2つ目の値を3つ目の値に代入する
				input2 = input3;
				//3つ目の値に格納していた2つ目の値を代入する
				input3 = data;
			}
			//最後に1つ目の値と2つ目の値を比較し、並べ替える
			if (input1 > input2) {
				//データをソートするため、仮に格納する変数に、1つ目の値を代入する
				data = input1;
				//2つ目の値を1つ目の変数に代入する
				input1 = input2;
				//1つ目の値を2つ目の変数に代入する
				input2 = data;
			}
		}
		//2つ目の値より3つ目の値が小さい場合
		if (input2 > input3) {
			//データをソートするため、仮に格納する変数に、2つ目の値を代入する
			data = input2;
			//3つ目の値を2つ目の変数に代入する
			input2 = input3;
			//2つ目の値を3つ目の変数に代入する
			input3 = data;

			//1つ目の値より2つ目の値が小さい場合
			if (input1 > input2) {
				//データをソートするため、仮に格納する変数に、1つ目の値を代入する
				data = input1;
				//2つ目の値を1つ目の変数に代入する
				input1 = input2;
				//1つ目の値を2つ目の変数に代入する
				input2 = data;
			}
		}

		//昇順にソートした値を出力する
		System.out.println(input1);
		System.out.println(input2);
		System.out.println(input3);
	}
}

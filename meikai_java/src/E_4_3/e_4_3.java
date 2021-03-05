
/*
 *
 *  右に示すように、二つの整数値を読み込んで、
 *  小さいほうの数以上で大きいほうの数以下の全整数を小さいほうから順に表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_3;

import java.util.Scanner;

public class e_4_3 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数A；");
		//1つ目の読み込んだ値を変数に代入する
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数B；");
		//2つ目の読み込んだ値を変数に代入する
		int input2 = sc.nextInt();

		//入力値を一時的に格納する変数を定義
		int data;

		//2つ目の値が1つ目の値より小さい場合、出力結果を昇順に並べ替える
		if (input2 < input1) {
			//1つ目の値を一時的に別変数に格納する
			data = input1;
			//2つ目の値を1つ目の値に代入する
			input1 = input2;
			//一時的に格納した1つ目の値を2つ目の値に代入する
			input2 = data;
		}

		//1つ目の値から2つ目の値までの整数を昇順で表示する
		do {
			//1つ目の値の値を2つ目の値まで繰り返し出力させる
			System.out.print(input1 + " ");

			//1つ目の値を出力後、インクリメントする
			input1++;
			//1つ目の値が2つ目の値まで繰り返させる
		} while (input1 <= input2);
	}

}

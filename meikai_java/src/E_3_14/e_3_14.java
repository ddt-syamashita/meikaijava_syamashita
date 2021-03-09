
/*
 *
 *  List 3-13と同様に、二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ。
 *  ただし、二つの値が等しい場合は、右に示すように『二つの値は同じです。』と表示すること。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_14;

import java.util.Scanner;

public class e_3_14 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数input1：");
		//読み込んだ1つ目の値を変数に代入
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数input2：");
		//読み込んだ2つ目の値を変数に代入
		int input2 = sc.nextInt();

		//小さいほうの値と大きいほうの値を保持させるためint型変数を定義する
		int min, max;

		//読み込んだ2つの値が同じ値の場合
		if (input1 == input2) {
			//判定結果を出力
			System.out.println("二つの値は同じです。");
		//読み込んだ2つの値が同じ値ではない場合
		} else {
			//1つ目の値が2つ目の値より大きい場合
			if (input1 > input2) {
				//1つ目に入力した値を最大値変数に代入する
				max = input1;
				//2つ目に入力した値を最小値変数に代入する
				min = input2;
			//それ以外の場合
			} else {
				//1つ目に入力した値を最小値変数に代入させる
				min = input1;
				//2つ目に入力した値を最大値変数に代入させる
				max = input2;
			}
			//入力値が小さい値を出力
			System.out.println("小さいほうの値は" + min + "です。");
			//入力値が大きい値をを出力
			System.out.println("大きいほうの値は" + max + "です。");
		}

	}
}

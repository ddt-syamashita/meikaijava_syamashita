
/*
 *
 * 二つの実数値を読み込んで、大きいほうの値を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_9;

import java.util.Scanner;

public class e_3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の整数値の読み込みを促す文言を出力
		System.out.print("整数値1：");

		//読み込んだ値をint型変数input1に代入する
		int input1 = sc.nextInt();

		//2つ目の整数値の読み込みを促す文言を出力
		System.out.print("整数値2：");

		//読み込んだ値をint型変数input2に代入する
		int input2 = sc.nextInt();

		//1つ目の値が大きい場合
		if(input1 > input2) {
			//判定結果の文言を出力
			System.out.println(input1);
		} else if(input1 < input2) {
			//判定結果の文言を出力
			System.out.println(input2);
		}

	}

}

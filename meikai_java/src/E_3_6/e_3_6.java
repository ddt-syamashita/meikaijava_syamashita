
/*
 *
 * 正の整数値を読み込んで、それが10の倍数であれば『その値は10の倍数です。』と表示し、
 * そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_6;

import java.util.Scanner;

public class e_3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//数値入力を促す文言を出力
		System.out.print("入力値：");

		//入力値をint型変数に代入する
		int input = sc.nextInt();

		//入力値が10の倍数の場合
		if(input < 0) {
			//10の倍数であることを出力
			System.out.println("正でない値が入力されました。");
		} else if(input % 10 == 0) {
			//正の値でないことを出力
			System.out.println("その値は10の倍数です。");
		} else {
			//10の倍数でないことを出力
			System.out.println("その値は10の倍数ではありません。");
		}
	}

}

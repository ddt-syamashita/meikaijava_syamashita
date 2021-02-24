
/*
 *
 * 二つの正の整数値を読み込んで、後者が前者の約数であれば『BはAの約数です。』と表示し、
 * そうでなければ『BはAの約数ではありません。』と表示する
 * プログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_3_2;

import java.util.Scanner;

public class e_3_2 {

	public static void main(String[] args) {

		//整数AのScannerクラスをインスタンス化する
		Scanner scA = new Scanner(System.in);

		//整数BのScannerクラスをインスタンス化する
		Scanner scB = new Scanner(System.in);

		//整数Aを入力を促す文言を出力
		System.out.print("整数A：");

		//読み込んだ値をint型に代入する
		int valA = scA.nextInt();

		//整数Bを入力を促す文言を出力
		System.out.print("整数B：");

		//読み込んだ値をint型に代入する
		int valB = scB.nextInt();

		//読み込んだ整数Aの値がBで割り切れる場合
		if (valA % valB == 0) {
			//約数であることの文言を出力させる
			System.out.println("BはAの約数です。");
		} else {
			//約数ではないことの文言を出力
			System.out.println("BはAの約数ではありません。");
		}

	}

}

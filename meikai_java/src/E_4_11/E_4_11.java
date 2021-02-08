
/*
 *
 * 正の整数値を0までカウントダウンするList 4-4（p.100）をfor文で実現せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/3
 */

package E_4_11;

import java.util.Scanner;

public class E_4_11 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//文言を出力
		System.out.println("カウントダウンします。");

		//文字を入力を促す文言を出力
		System.out.print("正の整数値：");

		//読み込んだ値を代入する変数を定義
		int input = stdIn.nextInt();

		//読み込んだ値が0になるまで繰り返す
		for (int i = 0; input >= 0; input--) {
			//読み込んだ値を出力する
			System.out.println(input);
		}
	}

}

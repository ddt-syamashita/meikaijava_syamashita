
/*
 *
 *  二つの整数値を読み込んで降順（大きい順）にソートするプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_15;

import java.util.Scanner;

public class e_3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数A：");
		//読み込んだ値を変数に代入する
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数B：");
		//読み込んだ値を変数に代入する
		int input2 = sc.nextInt();

		//2つ目の値が1つ目の値より大きい場合
		if(input1 < input2) {
			//仮に格納するint型変数にinput2を代入する
			int data = input1;
			//2つ目の値を降順表示させるため1つ目の値に代入する
			input1 = input2;
			//格納していたinput1の値をinput2に代入する
			input2 = data;
		}
		//読み込んだ値をソートした状態で、出力する
		System.out.println(input1);
		System.out.println(input2);
	}
}

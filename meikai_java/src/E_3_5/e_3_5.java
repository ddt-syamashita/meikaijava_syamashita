
/*
 *
 * 正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます。』と表示し、
 * そうでなければ『その値は5で割り切れません。』と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_3_5;

import java.util.Scanner;

public class e_3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//整数の入力を促す文言を出力
		System.out.print("入力値：");

		//読み込んだ値を変数inputに代入する
		int input = sc.nextInt();

		//読み込んだ値が5で割り切れる場合
		if(input < 0) {
			//割り切れる文言を出力
			System.out.println("正でない値が入力されました。");
			//読み込んだ値が正でない場合
		} else if (input % 5 == 0) {
				System.out.println("その値は5で割り切れます。");
		//読み込んだ値が5で割り切れない場合
		} else {
			//割り切れない文言を出力
			System.out.println("その値は5で割り切れません。");
		}

	}
}

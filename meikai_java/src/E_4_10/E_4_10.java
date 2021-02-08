
/*
 *
 * 読み込んだ値が1未満であれば改行文字を出力しないようにList 4-11（p.114）を書きかえたプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/3
 */

package E_4_10;

import java.util.Scanner;

public class E_4_10 {

	public static void main(String[] args) {

		//Scanneクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("何個*を表示しますか：");

		//読み込んだ値を変数に代入する
		int input = stdIn.nextInt();


		//読み込んだ値が1以上の場合
		if(input >= 1) {
			//読み込んだ値まで繰り返す
			for (int i = 0; i < input; i++)
				//指定した文字列を出力
				System.out.print("*");
			//1未満であれば改行文字を出力しない
			System.out.println();
		}
	}

}

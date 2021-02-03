
/*
 *
 *  右に示すように、正の整数値nを読みんで、1からnまでの積を求めるプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */


package E_4_9;

import java.util.Scanner;

public class e_4_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("nの値：");

		//読み込んだ値を変数に代入する
		int input = stdIn.nextInt();

		//積を求めるための合計変数を定義する
		int sum = 1;
		//1の値を変数valに代入
		int count = 1;

		//1から入力値までを繰り返す
		while(count <= input) {
			//合計に対し、繰り返し回数をかける。
			sum *= count;
			//繰り返し回数を後置インクリメントする
			count++;
		}
		//読み込んだ値に対し、1から積の値を出力する
		System.out.println("1から" + input + "までの積は" + sum + "です。");
	}
}

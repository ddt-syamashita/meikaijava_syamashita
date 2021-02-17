
/*
 *
 * 合計だけでなく平均も求めるようにList4-17（p.126）およびList 4-18（p.127）のプログラムを書き換えよ。
 *
 * 作成者：山下
 * 作成日：2021/02/17
 *
 */

package E_4_25;

import java.util.Scanner;

public class E4_25 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");

		int n = stdIn.nextInt();

		int sum = 0; //合計値
		//平均値を求めるため、int型変数を定義する
		int avg = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("整数(0で終了)：");
			int t = stdIn.nextInt();

			if (t == 0)
				break;
			if (sum + t > 1000) {
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");

				//入力された値の平均値を求めるため、合計値と入力された数を割り算する
				avg = sum / i;
				break;
			}
			sum += t;
		}

		System.out.println("合計は" + sum + "です");
		//平均値を求めた結果を出力させる
		System.out.println("平均は" + avg + "です");
	}

}

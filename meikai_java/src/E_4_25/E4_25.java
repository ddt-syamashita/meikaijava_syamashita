
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

		//加算個数を決めるため、読み込んだ値の数だけループさせる
		for (int i = 1; i <= n; i++) {

			//整数の入力を促す文言を出力させる
			System.out.print("整数(0で終了)：");
			//入力された値を数値として扱うため、int型変数に代入させる
			int t = stdIn.nextInt();

			//List 4-17と同様に0が入力された際の
			if (t == 0) {
				//0が入力された場合、ループを終了させる
				break;
			}
			//入力された整数値の合計が1000より大きくなった場合
			if (sum + t > 1000) {
				//ループ処理を終了の文言を出力させる
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");

				//ループ処理を終了させるため、breakを定義する
				break;
			}
			//合計を算出するため、ループ処理が行われるたびにsum変数に入力された値を加算させる
			sum += t;

			//入力された値の平均値を求めるため、合計値と入力された数を割り算する
			avg = sum / i;
		}

		//合計値を求めた結果を出力させる
		System.out.println("合計は" + sum + "です");
		//平均値を求めた結果を出力させる
		System.out.println("平均は" + avg + "です");
	}

}

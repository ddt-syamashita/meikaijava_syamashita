
/*
 *
 * 合計だけでなく平均も求めるようにList 4-19のプログラムを書き換えよ。なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 *
 * 作成者：山下
 * 作成日：2021/02/20
 *
 */

package E_4_26;

import java.util.Scanner;

public class E_4_26 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();

		int sum = 0;

		//平均値を求める変数を定義する
		double average = 0;

		//平均を求める際の母数の値を算出する変数を定義する
		int denominatorCount = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("負の数は加算しません。");
				continue;
			}
			sum += t;
			//負の数が入力された際の数を算出するため、カウント変数をインクリメントする
			denominatorCount++;
			//負の数の入力回数を除いた平均を求めるため、
			average = (double)sum / denominatorCount;
		}

		System.out.println("合計は" + sum + "です。");

		//負の数の個数を除いた分母から求めた平均を出力させる
		System.out.println("平均は" + average + "です。");
	}

}

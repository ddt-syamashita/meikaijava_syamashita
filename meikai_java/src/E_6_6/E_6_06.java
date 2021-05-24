
/*
 *
 * テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。
 * 人数と点数は、キーボードから読み込むこと
 *
 * 作成者：山下
 * 作成日：2021/03/11
 *
 */

package E_6_6;

import java.util.Scanner;

public class E_6_06 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//点数を求める人数の文言を出力させる
		System.out.print("点数を求める人数を入力してください。：");

		//入力値を人数の変数値として定義する
		final int peopleNumber = standardInput.nextInt();

		//入力された人数分点数として変数を保持するため、配列を生成する
		int[] score = new int[peopleNumber];

		//合計点を求めるため、int型変数を定義する
		int total = 0;

		//人数の入力を促す文言を出力させる
		System.out.println(peopleNumber + "人の点数を入力せよ。");

		//入力された人数分の各配列に点数を入力させるため、繰り返し定義する
		for (int i = 0; i < peopleNumber; i++) {
			//それぞれの人数に対して、点数を入力させる文言を出力させる
			System.out.print((i + 1) + "番目の点数：");
			//点数を代入させる
			score[i] = standardInput.nextInt();

			//合計点を求めるため、人数分の点数を加算させる
			total += score[i];
		}

		//平均点を求めるため、total変数をdouble型に型変換した結果をdouble型変数を代入するする
		double average = (double)total / peopleNumber;

		//最高点を求めるため、int型変数を定義する
		int max = score[0];

		//最低点を求めるため、int型変数を定義する
		int min = score[0];

		//最高点、最低点を算出するため、点数の要素分繰り返す処理
		for (int i = 0; i < score.length; i++) {
			//最高点を求めるため、分岐し結果をmax変数に代入する
			if (max < score[i]) {
				//最高点を算出する変数に入力値を代入する
				max = score[i];
			}

			//最低点を求めるため、分岐し結果をmin変数に代入する
			if (min > score[i]) {
				//最低点を算出する変数に入力値を代入する
				min = score[i];
			}
		}

		//合計点の値を出力させる
		System.out.println("合計点：" + total);
		//平均点の値を出力させる
		System.out.println("平均点：" + average);
		//最高点の値を出力させる
		System.out.println("最高点：" + max);
		//最低点の値を出力させる
		System.out.println("最低点：" + min);
	}

}


/*
 * 引数mで指定された月の季節を表示するメソッドprintSeasonを表示せよ。
 * mが3, 4, 5であれば『春』、6, 7, 8であれば『夏』、9, 10, 11であれば『秋』、12, 1, 2であれば『冬』と表示し、
 * それ以外の値であれば何も表示しないこと。
 *   void printSeason(int m)
 *
 *
 */

package E_7_06;

import java.util.Scanner;

public class E_7_06 {

	/**
	 *  引数として取得した値に対し、該当する季節を出力させる
	 *  @param:入力値を取得する
	 */
	static void printSeason(int m) {

		//引数mの値が3～5の場合
		if (m >= 3 && m <= 5) {
			//春の季節文言を出力させる
			System.out.println("入力月の季節は『春』です");
			//引数mの値が6～8の場合
		} else if (m >= 6 && m <= 8) {
			//夏の季節文言を出力させる
			System.out.println("入力月の季節は『夏』です");
			//引数mの値が9～11の場合
		} else if (m >= 9 && m <= 11) {
			//秋の季節文言を出力させる
			System.out.println("入力月の季節は『秋』です");
			//引数mの値が12、1、2の場合
		} else if (m == 12 || m == 1 || m == 2) {
			//冬の季節文言を出力させる
			System.out.println("入力月の季節は『冬』です");
			//引数mの値が上記の値以外の場合
		} else {
			//何も表示させない
			return;
		}

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("入力月：");

		//入力された値をint型変数に代入する
		int input = standardInput.nextInt();

		//月の季節を表示するメソッドの引数に、読み込んだ値を代入したinput変数を定義する
		printSeason(input);
	}

}

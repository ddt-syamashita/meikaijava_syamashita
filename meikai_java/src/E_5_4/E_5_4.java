
/*
 *
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。平均は実数として表示すること。
 *
 * 作成者：山下
 * 作成日：2021/03/03
 */

package E_5_4;

import java.util.Scanner;

public class E_5_4 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数値1：");

		//1つ目の整数値を読み込ませるため、読み込んだ値をint型変数に代入させる
		int inputValue1 = standardInput.nextInt();

		//入力を促す文言を出力させる
		System.out.print("整数値2：");

		//2つ目の整数値を読み込ませるため、読み込んだ値をint型変数に代入させる
		int inputValue2 = standardInput.nextInt();

		//入力を促す文言を出力させる
		System.out.print("整数値3：");

		//3つ目の整数値を読み込ませるため、読み込んだ値をint型変数に代入させる
		int inputValue3 = standardInput.nextInt();

		//合計を求めるため、int型変数を定義し、入力した3つの整数値の合計を算出させる
		int totalValue = (inputValue1 + inputValue2 + inputValue3);

		//平均を実数として出力させるため、double変数を定義し、入力した3つの整数値の平均を算出させる
		double averageValue = totalValue / 3.0;

		//算出した合計値を出力させる
		System.out.println("合計値：" + totalValue);

		//算出した平均値を出力させる
		System.out.println("平均値：" + averageValue);

	}

}

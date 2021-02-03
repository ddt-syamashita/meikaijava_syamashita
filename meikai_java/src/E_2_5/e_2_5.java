
/*
 *
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_5;

import java.util.Scanner;

public class e_2_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scanner クラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//変数xの入力を促す文言を出力する
		System.out.print("xの値：");

		//変数xをDouble型で定義し、読み込んだ値を代入する
		double x = sc.nextDouble();

		//変数yの入力を促す文言を出力する
		System.out.print("yの値：");

		//変数yをDouble型で定義し、読み込んだ値を代入する
		double y = sc.nextDouble();

		//xとyの読み込んだ値の和を出力させる
		System.out.println("合計は" + (x + y) + "です。");

		//xとyの読み込んだ値の平均を出力させる
		System.out.println("平均は" + ((x + y) /2) + "です。");



	}

}

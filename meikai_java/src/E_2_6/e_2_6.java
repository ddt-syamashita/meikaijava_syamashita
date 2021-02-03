
/*
 *
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */


package E_2_6;

import java.util.Scanner;

public class e_2_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scanner クラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		System.out.println("三角形の面積を求めます。");

		//底辺の入力を促す文言を出力する
		System.out.print("底辺：");

		//底辺の読み込んだ値をdouble型変数に代入する
		double bottom = sc.nextDouble();

		//高さの入力を促す文言を出力する
		System.out.print("高さ：");

		//高さを読み込んだ値をdouble型変数に代入する
		double height = sc.nextDouble();

		//面積の合計を出力する
		System.out.println((bottom * height) /2);


	}

}

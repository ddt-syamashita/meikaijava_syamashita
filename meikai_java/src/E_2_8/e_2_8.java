
/*
 *
 * キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_8;

import java.util.Random;
import java.util.Scanner;

public class e_2_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//Randomクラスをインスタンス化する
		Random rand = new Random();

		//整数値の読み込みを促す文言を出力する
		System.out.print("整数値：");

		//乱数プラスマイナス5をint型に代入する
		int random = rand.nextInt(10) -5;

		//読み込んだ値をint型変数に代入する
		int input = sc.nextInt();

		//読み込んだ値に対し、乱数を加える
		System.out.println("その値の±5の乱数を生成しました。それは" + (input + random) + "です。");

	}

}

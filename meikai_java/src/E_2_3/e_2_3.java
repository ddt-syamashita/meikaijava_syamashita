
/*
 *
 * 右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_3;

import java.util.Scanner;

public class e_2_3 {

	public static void main(String[] args) {

		//（指摘修正）入力を促す文言を出力させる
		System.out.print("整数値：");

		//Scanner をインスタンス化 変数scとして定義。
		Scanner sc = new Scanner(System.in);

		//sc変数を整数型のintに代入する
		int input = sc.nextInt();

		//入力した値に対し反復して文字列を出力させる
		System.out.println(input + "と入力しましたね。");

	}

}


/*
 *
 * n段の正方形を表示するプログラムを作成せよ。右に示すのは、nが3のときの実行結果である。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_20;

import java.util.Scanner;

public class E_4_20 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("整数値：");

		//読み込んだ値を段数として代入するため、変数を定義する
		int inputNumber = standardInput.nextInt();

		//読み込んだ値分の段数を出力するため、列ループが終了した際、改行させる
		for (int i = 1; i <= inputNumber; i++) {
			//1段ごとに読み込んだ値分表示させるためのfor文を定義
			for (int j = 1; j <= inputNumber; j++) {
				//読み込んだ値の数だけ、指定文字を改行せずに出力する
				System.out.print('*');
			}
			//列ループが終了する度に、読み込んだ値まで改行させる
			System.out.println();
		}
	}

}

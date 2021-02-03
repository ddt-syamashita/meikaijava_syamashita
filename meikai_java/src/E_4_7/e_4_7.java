
/*
 *
 *  読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。表示は*と+を交互に行うこと。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_7;

import java.util.Scanner;

public class e_4_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//値の入力を促す文言を出力
		System.out.print("何個表示しますか：");

		//読み込んだ値を変数に代入する
		int input = stdIn.nextInt();

		//繰り返した数を変数に代入する
		int count = 1;

		//読み込んだ値の数だけ繰り返す
		while(count <= input) {

			//cout変数が偶数の場合
			if(count % 2 == 0) {
				//交互に表示させるため、「+」を表示させる。
				System.out.print("+");
			} else {
				//奇数のときは「*」を表示させる
				System.out.print("*");
			}
			//繰り返し回数用変数を後置インクリメントする
			count++;
		}
	}
}
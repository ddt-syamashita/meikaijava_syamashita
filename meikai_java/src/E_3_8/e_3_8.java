
/*
 *
 * キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するプログラムを作成せよ。判定は以下のように行うこと。
 * 0～59→ 不可 / 60～69 → 可 ／70～79 → 良 ／ 80～100 → 優
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_8;

import java.util.Scanner;

public class e_3_8 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("点数：");

		//読み込んだ値をint型変数に代入する
		int input = sc.nextInt();

		//入力された値が0～59の場合
		if (input >= 0 && input <= 59) {
			//不可の文言を出力
			System.out.println("不可");
			//入力された値が60～69の場合
		} else if (input >= 60 && input <= 69) {
			//可の文言を出力
			System.out.println("可");
			//入力された値が70～79の場合
		} else if (input >= 70 && input <= 79) {
			//良の文言を出力
			System.out.println("良");
			//入力された値が80～100の場合
		} else if (input >= 80 && input <= 100) {
			//優の文言を出力
			System.out.println("優");
		}
	}

}

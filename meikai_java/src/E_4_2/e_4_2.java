
/*
 *
 *  2桁の整数値（10～99）を当てさせる《数当てゲーム》を作成せよ。
 *
 * 作成者：山下
 * 作成日：2/3
 */

package E_4_2;

import java.util.Random;
import java.util.Scanner;

public class e_4_2 {

	public static void main(String[] args) {

		//Randamクラスをインスタンス化する
		Random rand = new Random();

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//ゲーム開始文言を出力
		System.out.println("数当てゲーム開始！");

		//乱数を代入する変数を定義し、10～99の乱数を生成する
		int randomNum = rand.nextInt(90) + 10;
		;

		//読み込んだ値を代入する変数を定義
		int input;

		//do文の開始
		do {

			//入力を促す文言を出力
			System.out.print("いくつかな：");

			//読み込んだ値をint型変数に代入する
			input = sc.nextInt();

			//乱数より入力値が大きい場合
			if (randomNum < input) {
				//分岐結果を出力
				System.out.println("もっと小さな数だよ。");
				//乱数よりも入力値が小さい場合
			} else if(randomNum > input){
				//分岐結果を出力
				System.out.println("もっと大きな数だよ。");
			}

			//乱数と入力値が異なっている場合、do文を繰り返す。
		} while (randomNum != input);

		//乱数と読み込んだ入力値が一致している場合正解の文言を出力させる
		System.out.println("正解です。");
	}
}
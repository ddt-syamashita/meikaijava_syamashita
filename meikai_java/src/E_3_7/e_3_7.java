
/*
 *
 * 正の整数値を読み込んで、それを3で割った値に応じて『その値は3で割り切れます。』『その値を3で割った余りは1です。』
 * 『その値を3で割った余りは2です。』のいずれかを表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_7;

import java.util.Scanner;

public class e_3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//値の入力を促す文言を出力
		System.out.print("入力値：");

		//読み込んだ値をint型変数に代入する
		int input = sc.nextInt();


		//読み込まれた値が正でない場合
		if(input < 0) {
			//正でない場合の文言を出力
			System.out.println("正でない値が入力されました。");
		//読み込まれた値が3で割り切れる場合
		} else if(input % 3 ==0) {
			//3で割り切れることを出力
			System.out.println("その値は3で割り切れます。");
		//3で割り1余る場合
		} else if(input % 3 == 1) {
			//分岐結果を出力
			System.out.println("その値を3で割った余りは1です。");
		//3で割り2余る場合
		} else if(input % 3 == 2) {
			//分岐結果を出力
			System.out.println("その値を3で割った余りは2です。");
		}
	}

}


/*
 *
 * 季節を求めるList4-1（p.95）の月の読み込みにおいて、1～12以外の値が入力された場合は、
 * 再入力させるように修正したプログラムを作成せよ。（do 文の中に do 文が入る二重ループとなる）。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_19;

import java.util.Scanner;

public class E_4_19 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner stdIn = new Scanner(System.in);

		//再入力を確認するためのretry変数を定義する
		int retry;

		//月入力を読み込むためのmonth変数を定義する
		int month;

		//retry変数に1以外の値が入力されるまで繰り返す
		do {
			//1～12の値が入力されるまで季節を求める入力を繰り返し出力する
			do {
				//入力を促す文言を出力
				System.out.print("季節を求めます。\n何月ですか：");
				//読み込んだ値を対象の季節を判定するため、month変数に代入する
				month = stdIn.nextInt();
			} while (month <= 0 || month > 12);

			//読み込んだ値が3～5の場合
			if (month >= 3 && month <= 5)
				//対象の季節を案内する文言を出力する
				System.out.println("それは春です。");
			//読み込んだ値が6～8の場合
			else if (month >= 6 && month <= 8)
				//対象の季節を案内する文言を出力する
				System.out.println("それは夏です。");
			//読み込んだ値が9～11の場合
			else if (month >= 9 && month <= 11)
				//対象の季節を案内する文言を出力する
				System.out.println("それは秋です。");
			//読み込んだ値が12、または1、または2の場合
			else if (month == 12 || month == 1 || month == 2)
				//対象の季節を案内する文言を出力する
				System.out.println("それは冬です。");
			//再入力を確認するための文言を出力
			System.out.println("もう一度？ 1…Yes／0…No：");
			//読み込んだ値によって、再入力するかを判定するため、読み込んだ値をretry変数に代入する
			retry = stdIn.nextInt();
			//retry変数に1以外が入力されるまで、入力を繰り返す
		} while (retry == 1);

	}

}

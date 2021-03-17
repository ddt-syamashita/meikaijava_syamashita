
/*
 * 月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する月の値は乱数で生成する。
 * ・学習者が望む限り、何度も繰り返せる。
 * ・同一月を連続して出題しない。
 * 文字列s1とs2が等しい（すべての文字が等しい）かどうかの判定は、s1.equals(s2)によって行える（p.490）。
 *
 * 作成者：山下
 * 作成日：2021/03/13
 */

package E_6_14;

import java.util.Random;
import java.util.Scanner;

public class E_6_14 {

	public static void main(String[] args) {

		//Randomクラスをインスタンス化する
		Random random = new Random();

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//Scannerクラスをインスタンス化する（繰り返し終了判別用Scanner）
		Scanner standardInput2 = new Scanner(System.in);

		//String型配列で各月を要素として定義する
		String[] monthString = {
				"January", "February", "March", "April", "May", "Jun", "July",
				"August", "Septenber", "October", "Novenber", "December" };

		//解答を続けるか続けないかのフラグを定義する
		int endFlg;
		//月の1～12の乱数をint型変数として定義する
		int monthRandom;
		//同一の月が出題されないよう、仮の乱数を代入する変数を定義する
		int temporaryRandom = 0;

		//入力者が何度でも繰り返し入力か、終了できるようにするためdo文で繰り返し処理を行う
		do {

			//同一の月が連続して出題されないようにさせるため、前回出題した値が同一であれば再度乱数を生成し、出題し直す
			do {
				//月の0～11の乱数を生成する。
				monthRandom = random.nextInt(12);
			} while (monthRandom == temporaryRandom);

			//問題の月を出題させるため、生成した乱数にプラス1をしてprintlnで出力する
			System.out.println((monthRandom + 1) + " 月の英語表記を入力してください(先頭は大文字)");

			//入力を促す文言を出力させる
			System.out.print("英語表現：");

			//解答をString型の読み込みさせる
			String input = standardInput.nextLine();

			//読み込んだ文字列と、出題されたmonthStringの文字列が同一である場合
			if (input.equals(monthString[monthRandom])) {

				//正解の文言を出力させる
				System.out.println("正解です！！");
				//再度解答するかの質問と、入力を促す文言を出力させる
				System.out.print("回答を続けますか？ Yes…1 / No…0： ");
				endFlg = standardInput2.nextInt();

			} else {
				System.out.println("不正解です。");
				System.out.print("回答を続けますか？ Yes…1 / No…0： ");
				endFlg = standardInput2.nextInt();

			}

			//同一の乱数を出題しないように比較させるため、仮乱数を出題された乱数に格納する
			temporaryRandom = monthRandom;
		//0の値が入力されない限り、繰り返し処理を行う
		} while (endFlg != 0);

		//解答を終了した文言を出力させる
		System.out.println("解答を終了します。");

	}

}

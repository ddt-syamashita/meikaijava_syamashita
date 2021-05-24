
/*
 * 曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する曜日は乱数で生成する。
 * ・学習者が望む限り、何度でも繰り返せる。
 * ・同一曜日を連続して出題しない。
 *
 * 作成者：山下
 * 作成日：2021/03/14
 *
 */

package E_6_15;

import java.util.Random;
import java.util.Scanner;

public class E_6_15 {

	public static void main(String[] args) {
		//Randomクラスをインスタンス化する
		Random random = new Random();

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//解答する曜日名を表示させるため、String型の変数を定義する
		String[] weekName = { "月", "火", "水", "木", "金", "土", "日" };

		//String型配列で各曜日を要素として定義する
		String[] weekString = { "monday", "tuesday", "wendnesday", "thrsday", "friday", "saturday", "sunday" };

		//解答を続けるか続けないかのフラグを定義する
		int endFlg;
		//曜日の0～6の乱数をint型変数として定義する
		int weekRandom;
		//同一の月が出題されないよう、仮の乱数を代入する変数を定義する
		int temporaryRandom = -1;

		//入力を促す文言を出力させる
		System.out.println("英語の曜日名を小文字で入力してください");

		//入力者が何度でも繰り返し入力か、終了できるようにするためdo文で繰り返し処理を行う
		do {

			//同一の曜日が連続して出題されないようにさせるため、前回出題した値が同一であれば再度乱数を生成し、出題し直す
			do {
				//曜日の要素としての0～6の乱数を生成する。
				weekRandom = random.nextInt(7);
			} while (weekRandom == temporaryRandom);

			//曜日名と入力を促す文言を出力させる
			System.out.print(weekName[weekRandom] + "曜日：");

			//解答をString型の読み込みさせる
			String input = standardInput.next();

			//読み込んだ文字列と、出題されたmonthStringの文字列が同一である場合
			if (input.equals(weekString[weekRandom])) {
				//正解の文言を出力させる
				System.out.println("正解です！！");
			} else {
				System.out.println("不正解です。");
			}
			System.out.print("回答を続けますか？ Yes…1 / No…0： ");
			endFlg = standardInput.nextInt();

			//同一の乱数を出題しないように比較させるため、仮乱数を出題された乱数に格納する
			temporaryRandom = weekRandom;
			//0の値が入力されない限り、繰り返し処理を行う
		} while (endFlg == 1);

		//解答を終了した文言を出力させる
		System.out.println("解答を終了します。");

	}

}

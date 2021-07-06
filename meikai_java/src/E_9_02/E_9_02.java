
/*
 * 日付クラス第3版を利用するプログラムを作成せよ。すべてのコンストラクタの働きを確認できるようにすること。
 * 
 * 作成者：山下
 * 作成日：2021/07/06
 * 
 */

package E_9_02;

import java.util.Scanner;

public class E_9_02 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 年の値の入力を促す文言を出力し、入力値をint型変数に代入させる
		System.out.print("年：");
		int inputYear = standardInput.nextInt();

		// 月の値の入力を促す文言を出力し、入力値をint型変数に代入させる
		System.out.print("月：");
		int inputMonth = standardInput.nextInt();

		// 日の値の入力を促す文言を出力し、入力値をint型変数に代入させる
		System.out.print("日：");
		int inputDate = standardInput.nextInt();

		// 引数なしコンストラクタのDayクラスをインスタンス化する
		Day testDay1 = new Day();

		// 引数yearのみのコンストラクタのDayクラスをインスタンス化する
		Day testDay2 = new Day(inputYear);

		// 引数year,monthのコンストラクタのDayクラスをインスタンス化する
		Day testDay3 = new Day(inputYear, inputMonth);

		// 引数year,month,dateのコンストラクタのDayクラスをインスタンス化する
		Day testDay4 = new Day(inputYear, inputMonth, inputDate);

		// 引数year,month,dateのコンストラクタのday1をインスタンス化する
		Day day1 = new Day(inputYear, inputMonth, inputDate);

		//インスタンス化したday1の値を出力する
		System.out.println("day1 = " + day1);

		//day1を引数としてday2をインスタンス化する
		Day day2 = new Day(day1);

		//作成した旨の文言を出力する
		System.out.println("day2をday1と同じ日付として作成しました。");

		//インスタンス化したday2の値を出力する
		System.out.println("day2 = " + day2);

		// インスタンス化したday1とday2の日付が一致している場合
		if (day1.equalTo(day2)) {
			System.out.println("day1とday2は等しいです。");
			// 日付が一致していない場合
		} else {
			System.out.println("day1とday2は等しくありません。");
		}

		// 各コンストラクタを使用したクラスの値を出力する
		System.out.println("testDay1：" + testDay1);

		System.out.println("testDay2：" + testDay2);

		System.out.println("testDay3：" + testDay3);

		System.out.println("testDay4：" + testDay4);

	}

}

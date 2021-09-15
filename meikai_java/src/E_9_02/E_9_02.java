
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
		Day withoutArgumentsDay = new Day();

		// 引数yearのみのコンストラクタのDayクラスをインスタンス化する
		Day yearArgumentsDay = new Day(inputYear);

		// 引数year,monthのコンストラクタのDayクラスをインスタンス化する
		Day yearMontthArgumentsDay = new Day(inputYear, inputMonth);

		// 引数year,month,dateのコンストラクタのDayクラスをインスタンス化する
		Day yearMonthDateArgumentsDay = new Day(inputYear, inputMonth, inputDate);

		// 引数year,month,dateのコンストラクタの比較用Day1つ目をインスタンス化する
		Day comparisonDay1 = new Day(inputYear, inputMonth, inputDate);

		//インスタンス化したday1の値を出力する
		System.out.println("comparisonDay1 = " + comparisonDay1);

		//day1を引数としてday2をインスタンス化する
		Day comparisonDay2 = new Day(comparisonDay1);

		//作成した旨の文言を出力する
		System.out.println("comparisonDay2をcomparisonDay1と同じ日付として作成しました。");

		//インスタンス化したday2の値を出力する
		System.out.println("comparisonDay2 = " + comparisonDay2);

		// インスタンス化したday1とday2の日付が一致している場合
		if (comparisonDay1.equalTo(comparisonDay2)) {
			System.out.println("comparisonDay1とcomparisonDay2は等しいです。");
			// 日付が一致していない場合
		} else {
			System.out.println("comparisonDay1とcomparisonDay2は等しくありません。");
		}

		// 各コンストラクタを使用したクラスの値を出力する
		System.out.println("引数なしコンストラクタ：" + withoutArgumentsDay);

		System.out.println("引数yearのみのコンストラクタ：" + yearArgumentsDay);

		System.out.println("引数year,monthのコンストラクタ：" + yearMontthArgumentsDay);

		System.out.println("引数year,month,dateのコンストラクタ：" + yearMonthDateArgumentsDay);

	}

}

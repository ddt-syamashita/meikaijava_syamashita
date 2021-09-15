/*
 * 開始日と終了日とから構成される≪期間≫を表すクラスPeriodを作成せよ。フィールドは以下のようになる。
 * class Period {
 *   private Day from;
 *   private Day to;
 * }
 * 
 * 作成者：山下
 * 作成日：2021/08/07
 */


package E_9_05;

import java.util.Scanner;

public class E_9_05 {

	public static void main(String[] args) {
		
		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);
		
		//開始年、月、日の入力を促す文言を出力し、入力値を代入させる
		System.out.print("開始年：");
		int inputYearStart = standardInput.nextInt();
		System.out.print("開始月：");
		int inputMonthStart = standardInput.nextInt();
		System.out.print("開始日：");
		int inputDateStart = standardInput.nextInt();
		
		//終了日となる年、月、日の入力を促す文言を出力し、入力値を代入させる
		System.out.print("終了年：");
		int inputYearEnd = standardInput.nextInt();
		System.out.print("終了月：");
		int inputMonthEnd = standardInput.nextInt();
		System.out.print("終了日：");
		int inputDateEnd = standardInput.nextInt();
		
		//開始日と終了日の値を引数としてインスタンス化したDayクラスを、Periodクラスの引数に定義しインスタンス化する
		Period testPeriod = new Period(new Day(inputYearStart, inputMonthStart, inputDateStart), new Day(inputYearEnd, inputMonthEnd, inputDateEnd));
		
		//開設日と終了日をゲッタメソッドを使用し、出力させる
		System.out.println("開始日：" + testPeriod.getFrom());
		System.out.println("終了日：" + testPeriod.getTo());
		
		//平成の期間を出力させるため、Periodクラスをインスタンス化する際、引数に平成の開始日と終了日を定義する
		Period heiseiDuration = new Period(new Day(1989, 1, 1), new Day(2019 , 4, 30));
		
		//平成の期間を出力させる
		System.out.println("平成の期間 = " + heiseiDuration);
				
	}

}

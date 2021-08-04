/*
 * 演習8-1（p.293）で作成した≪人間クラス≫に、誕生日のフィールドとtoStringメソッドを追加せよ。
 * ※コンストラクタを変更したり、誕生日ゲッタなどのメソッドを追加したりすること。
 * 
 * 作成者：山下
 * 作成日：2021/08/04
 * 
 */

package E_9_04;

import java.util.Scanner;

public class E_9_04 {

	public static void main(String[] args) {
		
		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);
		
		//各入力値を促す文言を出力し、入力値を変数に代入させる
		System.out.print("名前：");
		String inputName = standardInput.nextLine();
		
		System.out.print("身長：");
		int inputHeight = standardInput.nextInt();
		
		System.out.print("体重：");
		int inputWeight = standardInput.nextInt();
		
		System.out.print("誕生年：");
		int inputYear = standardInput.nextInt();
		
		System.out.print("誕生月：");
		int inputMonth = standardInput.nextInt();

		System.out.print("誕生日：");
		int inputDate = standardInput.nextInt();
		
		//人間クラスをインスタンス化し、引数に各入力値を定義する
		Human my = new Human(inputName, inputHeight, inputWeight, new Day(inputYear, inputMonth, inputDate));
		
		//入力した人間クラスの情報を出力する
		System.out.println(my);
		
	}

}

/**
 * 文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ。
 * 
 * 作成者：山下
 * 作成日：2022/1/10
 * 
 */


package E_15_01;

import java.util.Scanner;

public class E_15_01 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);
		
		//入力を促す文言を出力し、入力をString型変数に代入させる
		System.out.print("入力文字：");
		String input = standardInput.next();
		
		// 入力された文字列を逆順で出力させるため、繰り返し変数iをデクリメントさせたfor文を定義する
		for(int i = input.length() -1; i >= 0; i--) {
			//入力された文字を全て逆順で出力させる
			System.out.println("input[" + i + "] = " + input.charAt(i));
		}
	}

}

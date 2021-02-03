
/*
 *
 * List 3-5 の最後のelseを、else if( n == 0) に変更したらどうなるかを検証せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_3_3;

import java.util.Scanner;

public class e_3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//List 3-5を記述
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if( n > 0)
			System.out.println("その値は正です。");
		 else if(n < 0)
			System.out.println("その値は負です。");
		//elseから変更箇所を記述
		 else if(n == 0)
			 System.out.println("その値は０です。");

		//検証結果→else文と同様に、出力される
	}

}

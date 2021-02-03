
/*
 *
 *  List 3-13と同様に、二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ。
 *  ただし、二つの値が等しい場合は、右に示すように『二つの値は同じです。』と表示すること。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_14;

import java.util.Scanner;

public class e_3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の値の入力を促す文言を出力
		System.out.print("整数A：");
		//読み込んだ1つ目の値を変数に代入
		int input1 = sc.nextInt();

		//2つ目の値の入力を促す文言を出力
		System.out.print("整数B：");
		//読み込んだ2つ目の値を変数に代入
		int input2 = sc.nextInt();

		//読み込んだ2つの値が同じ値の場合
		if(input1 == input2) {
			//判定結果を出力
			System.out.println("二つの値は同じです。");
		//1つ目の値が2つ目の値より小さい場合
		} else if(input1 > input2) {
			//1つ目の値を仮のdata変数に代入する
			int data = input1;
			//2つ目の値を1つ目の値に代入する
			input1 = input2;
			//仮変数に格納していた1つ目の変数を2つ目の変数に代入する
			input2 = data;
			//コメントを出力
			System.out.println("a≦bとなるようにソートしました。");
			//計算結果を出力
			System.out.println("変数input1は" + input1 + "です。");
			//計算結果を出力
			System.out.println("変数input2は" + input2 + "です。");
		}
	}
}

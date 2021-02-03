
/*
 *
 * 右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば、
 * 『それらの差は10以下です。』と表示し、そうでなければ『それらの値は11以上です。』と表示されるプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_11;

import java.util.Scanner;

public class e_3_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//1つ目の整数値の入力を促す文言を出力
		System.out.print("整数値A：");
		//1つ目の値をint型変数input1に代入する
		int input1 = sc.nextInt();

		//2つ目の整数値の入力を促す文言を出力
		System.out.print("整数値B：");
		//2つ目の値をint型変数input2に代入する
		int input2 = sc.nextInt();

		//差を計算した後に判定するためのint型変数dataを定義する
		int data;

		//1つ目の値よりも2つ目の値が大きい場合
		if(input1 < input2) {
			//2つ目の値 -1つ目の値で差を計算し、結果を変数dataに代入する
			data = input2 - input1;
		} else {
			//1つ目の値-2つ目の値で差を計算し、結果を変数dataに代入する
			data = input1 - input2;
		}

		//読み込んだ値の差が10以下の場合
		if(data <= 10) {
			//判定結果を出力する
			System.out.println("それらの差は10以下です。");
		//読み込んだ値の差が11以上の場合
		} else if(data >= 11) {
			//判定結果を出力する
			System.out.println("それらの差は11以上です。");
		}

	}

}

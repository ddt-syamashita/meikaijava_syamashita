
/*
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。平均はキャスト演算子を利用して求め、実数として表示すること
 *
 * 作成者：山下
 * 作成日：2021/03/03
 *
 */

package E_5_5;

import java.util.Scanner;

public class E_5_5 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数値1：");

		//1つ目の整数値を読み込ませるため、int型変数に入力値を代入させる
		int inputValue1 = standardInput.nextInt();

		//入力を促す文言を出力させる
		System.out.print("整数値2：");

		//2つ目の整数値を読み込ませるため、int型変数に入力値を代入させる
		int inputValue2 = standardInput.nextInt();

		//入力を促す文言を出力させる
		System.out.print("整数値3：");

		//3つ目の整数値を読み込ませるため、int型変数に入力値を代入させる
		int inputValue3 = standardInput.nextInt();

		//入力された値の合計を算出するため、変数を定義し代入させる
		int totalValue = inputValue1 + inputValue2 + inputValue3;

		//入力された値の平均を算出するため、変数を定義し代入させる。int型からdouble型にキャストさせ代入させる
		double averageValue = (double) totalValue / 3;

		//入力された値の合計を算出し、出力させる
		System.out.println("合計：" + totalValue);

		//入力された値の平均の実数値を出力させるため、int型からdouble型にキャストさせ出力させる
		System.out.println("平均：" + averageValue);
	}

}

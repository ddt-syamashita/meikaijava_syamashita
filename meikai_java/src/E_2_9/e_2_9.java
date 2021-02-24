
/*
 *
 * 以下に示すプログラムを作成せよ（実数値の乱数を生成にはnextDluble()を使うこと：Column 2-3参照）。
 * ・0.0以上1.0未満の実数値をランダムに生成して表示。
 * ・0.0以上10.0未満の実数値をランダムに生成して表示。
 * ・-1.0以上1.0未満の実数値をランダムに生成して表示。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_9;

import java.util.Random;

public class e_2_9 {

	public static void main(String[] args) {

		//Random をインスタンス化する
		Random randOne = new Random();

		//Random をインスタンス化する
		Random randTwo = new Random();

		//Random をインスタンス化する
		Random randThree = new Random();

		//double型に乱数を代入する
		double lucky1 = randOne.nextDouble();
		double lucky2 = randTwo.nextDouble();
		double lucky3 = randThree.nextDouble();

		//乱数を代入した値を出力する
		System.out.println("0.0以上1.0未満：" + lucky1);
		//10未満の実数値を算出するため、乱数を10倍ささる
		System.out.println("0.0以上10.0未満：" + (lucky2 * 10));
		//1.0未満の数値を算出させるために、乱数を2倍する。その後、-1することにより、値を-1.0以上1.0未満の範囲で出力させる
		System.out.println("-1.0以上1.0未満：" + ((lucky3 * 2) - 1));

	}

}

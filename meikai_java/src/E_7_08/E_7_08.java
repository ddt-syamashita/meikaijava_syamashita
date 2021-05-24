
/*
 * a以上b未満の乱数を生成して、その値を返却するメソッド random を作成せよ。内部で乱数を生成する標準ライブラリ（p.45）を呼び出すこと。
 *   int random(int a, int b)
 * なお、bの値がaより小さい場合には、aの値をそのまま返却すること。
 *
 * 作成者：山下
 * 作成日：2021/04/07
 */

package E_7_08;

import java.util.Random;
import java.util.Scanner;

public class E_7_08 {

	/**
	 * 取得した第一引数下限値、第二引数上限値の乱数を生成するメソッド
	 * @param a：乱数を生成するための下限値を取得する
	 * @param b：乱数の上限を指定する値を取得する
	 * @return：引数bが引数aよりも小さい場合、引数aの値を返却
	 *           引数bの値がa以上の場合は生成した乱数を返却
	 */
	static int random(int a, int b) {

		//Randomクラスをインスタンス化する
		Random random = new Random();

		//返却する値をint型変数で定義する
		int returnValue = 0;

		//第二引数が第一引数よりも小さいか等しい場合
		if (b <= a) {
			//返却用変数に引数aの値を代入させる
			returnValue = a;
		//第二引数bの値が第一引数aよりも小さい場合
		} else {
			//上限引数bから下限引数aを引いた値にプラス1し、その値に引数aの値をプラスさせ乱数を生成する。。
			returnValue = a + random.nextInt(b - a + 1);

		}

		//返却用変数を返却するため、return文を定義する
		return returnValue;

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		System.out.println("乱数を生成します。");

		//入力を促す文言を出力させる
		System.out.print("下限の入力値：");

		//1つ目の入力値を変数に代入させる
		int input1 = standardInput.nextInt();

		//入力を促す文言を出力させる
		System.out.print("上限の入力値：");

		//2つ目の入力値を変数に代入させる
		int input2 = standardInput.nextInt();

		//メソッドで生成した乱数を出力させる
		System.out.println("乱数生成結果：" + random(input1, input2));

	}

}

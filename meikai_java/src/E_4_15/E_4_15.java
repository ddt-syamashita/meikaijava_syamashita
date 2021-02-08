
/*
 *
 * 身長と標準体重の対応表を表示するプログラムを作成せよ。
 * 表示する身長の範囲（開始値／終了値／増分）は整数値として読み込むこと。
 * ※標準体重は（身長ｰ100）×0.9によって求められる。
 *
 * 作成者：山下
 * 作成日：2021/2/8
 */

package E_4_15;

import java.util.Scanner;

public class E_4_15 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//開始値の入力を促す文言を出力
		System.out.print("何cmから：");

		//読み込んだ値を開始値の整数値として定義
		int startValue = standardInput.nextInt();

		//終了値の入力を促す文言を出力
		System.out.print("何cmまで：");

		//読み込んだ値を終了値の整数値として定義
		int endValue = standardInput.nextInt();

		//増分の入力を促す文言を出力
		System.out.print("何cmごと：");

		//読み込んだ値を増分の整数値として定義
		int incrementalValue = standardInput.nextInt();

		//身長と標準体重の文字列を出力
		System.out.println("身長  標準体重");

		//開始値が終了値以下までの間、処理を繰り返す。繰り返すごとに増分として読み込んだ整数値を開始値に加算する
		for (; startValue <= endValue; startValue += incrementalValue) {
			//身長の値と、標準体重の値を出力する
			System.out.println(startValue + "  " + ((startValue - 100) * 0.9));
		}

	}

}

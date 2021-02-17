
/*
 *
 * 正の整数値を読み込み、それが素数あるかどうかを判定するプログラムを作成せよ。
 * 素数とは、2以上n未満のいずれの数でも割り切ることのできない整数nのことである。
 *
 *
 * 作成者：山下
 * 作成日：2021/02/17
 *
 */

package E_4_24;

import java.util.Scanner;

public class E_4_24 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("整数値：");

		//入力された値を出力させるため、int型変数に代入
		int inputNumber = standardInput.nextInt();

		//素数の求め方の2以上n未満条件まで繰り返す処理を定義する
		for (int i = 2; i < inputNumber; i++) {
			//入力された値が素数か判定する。いずれの数でも割り切れる場合
			if (inputNumber % i == 0) {
				//素数ではない文言を出力させる
				System.out.println(inputNumber + "は素数ではありません");
				//出力した場合、ループ処理を終了させる
				break;
			//上記条件以外の場合。いずれの値でも割り切れない場合
			} else {
				System.out.println(inputNumber + "は素数です。");
				//出力した場合、ループ処理を終了させる
				break;
			}
		}

	}

}

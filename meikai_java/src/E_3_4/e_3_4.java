
/*
 *
 * 二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 『aのほうが大きいです。』『bのほうが大きいです。』『aとbは同じ値です。』
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_3_4;

import java.util.Scanner;

public class e_3_4 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		//整数Aを入力を促す文言を出力
		System.out.print("整数A：");

		//読み込んだ値を変数aに値を代入する
		int a = sc1.nextInt();

		//整数Aを入力を促す文言を出力
		System.out.print("整数B：");
		int b = sc2.nextInt();

		//変数aとbの値が一致している場合
		if (a == b) {
			//同じ値である文言を出力させる
			System.out.println("a と b は同じ値です。");
		//bより変換aの方が大きい場合
		}else if (b < a) {
			//aの値が大きい文言を出力させる
			System.out.println("a のほうが大きいです。");
		//それ以外の場合は、bの値が大きいものとして分岐させる
		} else {
			//bの値が大きい文言を出力させる
			System.out.println("b のほうが大きいです。");
		}
	}

}

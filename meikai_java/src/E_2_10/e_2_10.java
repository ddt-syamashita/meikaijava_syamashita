
/*
 *
 * 右に示すように、名前の姓と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/1
 */

package E_2_10;

import java.util.Scanner;

public class e_2_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//姓の入力を促す文言を出力
		System.out.print("姓：");

		//姓を読み込むためのScannerクラスをインスタンス化する
		Scanner sc1 = new Scanner(System.in);

		//読み込んだ値をString型に代入する
		String lastName = sc1.nextLine();

		//姓の入力を促す文言を出力
		System.out.print("名：");

		//名を読み込むためのScannerクラスをインスタンス化する
		Scanner sc2 = new Scanner(System.in);

		//読み込んだ値をString型に代入する
		String firstName = sc2.nextLine();


		//読み込んだ値を出力させる
		System.out.println("こんにちは" + lastName + firstName + "さん。");

	}

}

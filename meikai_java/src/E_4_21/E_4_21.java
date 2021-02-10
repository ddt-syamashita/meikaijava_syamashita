
/*
 *
 * List 4-16は左下側が直角の直角三角形を表示するプログラムであった。
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/2/10
 */

package E_4_21;

import java.util.Scanner;

public class E_4_21 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.println("左上直角の三角形を表示します。");
		System.out.print("段数は：");

		//直角三角形の段数を指定するため、読み込んだ値をint型変数に代入する
		int upperLeft = standardInput.nextInt();

		//読み込んだ値の数だけ行ループを行い、三角形に出力する
		for (int i = 1; i <= upperLeft; i++) {
			//左上を直角にするため、読み込んだ値分繰り返す。最後尾の値を繰り返す度にデクリメントする。
			for (int j = upperLeft; i <= j; j--) {
				//繰り返す度に改行なしで指定文字を出力する
				System.out.print("*");
			}
			//列ループ終了後、出力行を改行する
			System.out.println();
		}

		//入力を促す文言を出力
				System.out.println("右下直角の三角形を表示します。");
				System.out.print("段数は：");

				//直角三角形の段数を指定するため、読み込んだ値をint型変数に代入する
				int underRight = standardInput.nextInt();

				for (int i = 1; i <= underRight; i++) {
					for (int j = underRight; i <= j; j--) {
						System.out.print("*");
					}
					System.out.println();
				}

	}

}

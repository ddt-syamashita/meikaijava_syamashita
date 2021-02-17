
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

		//三角形を出力させるため、読み込んだ値の数だけ行ループを行い、
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

		//三角形を出力させるため、読み込んだ値の数だけ行ループを行う
		for (int i = 1; i <= underRight; i++) {
			//列ループの数を保持するint型を定義
			int j = 0;
			//右下直角三角形を表示させるため、読み込んだ数値から行ループ数をマイナスした数分、列ループさせる
			for (; j < underRight - i; j++) {
				//半角スペースを出力させる
				System.out.print(" ");
			}

			//半角スペースの出力ループが終了した際、*を表示させて右下直角三角形を表示させる
			for (; j < underRight; j++) {
				//*を出力させる
				System.out.print("*");
			}
			//列ループ終了後、出力行を改行させる
			System.out.println();
		}

		//入力を促す文言を出力
		System.out.println("右上直角の三角形を表示します。");
		System.out.print("段数は：");

		//直角三角形の段数を指定するため、読み込んだ値をint型変数に代入する
		int upperRight = standardInput.nextInt();

		//三角形を表示させるため、読み込んだ値の数だけ行ループを行う
		for (int i = 1; i <= upperRight; i++) {
			//右上が直角になるよう、列ループを入力した値の数だけ繰り返す
			for (int j = 1; j <= upperRight; j++) {

				//行ループの値が列ループの値より小さい場合、三角形となる*を繰り返し出力する。
				if (i <= j) {
					//三角形を表示させるため、*を出力させる
					System.out.print("*");
					//それ以外の場合、右下直角となるように、半角スペースを出力させる
				} else {
					//三角形を表示させるため、半角スペースを出力させる
					System.out.print(" ");
				}
			}
			//列ループ終了後、出力行を改行させる
			System.out.println();
		}

	}

}

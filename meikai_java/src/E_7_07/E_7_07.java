
/*
 * List7-7 に示したn個の '*'を連続表示するメソッドputStarsを、
 * 内部でList 7-8 のメソッドputChars を呼び出すことによって表示を行うように書きかえよ。
 *
 * 作成者：山下
 * 作成日：2021/03/24
 *
 */

package E_7_07;

import java.util.Scanner;

public class E_7_07 {

	/**
	 *  引数として取得した値に対し、任意のchar型1文字を出力させるメソッド
	 *  @param c:引数として、任意の1文字を取得する
	 *  @param n:指定した値分、引数c（任意の1文字）を出力させる
	 */
	static void putChars(char c, int n) {
		//nとして取得した値が0より大きい場合、繰り返し引数cの文字を出力させる
		while (n-- > 0) {
			//指定した文字列を出力させる
			System.out.print(c);
		}
	}

	/**
	 *  引数として取得した値に対し、値文*を出力させ右下直角の三角形を表示させるメソッド
	 *  @param n:出力させる個数を値として取得する
	 */
	static void putStars(int n) {
		//取得した引数の値分、値を出力させるため、for文を定義し繰り返す処理を行う
		for (int i = 1; i <= n; i++) {
			//右下直角の三角形を表示させるため、引数の値から繰り返し変数の値を引いた値分、半角スペースを出力させる
			putChars(' ', n - i);
			//右下直角の三角形を表示させるため、*を繰り返し変数i分出力させる
			putChars('*', i);
			//次の行に改行させるため、printlnを定義する
			System.out.println();
		}

	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		System.out.println("右下直角の三角形を表示します。");

		//入力を促す文言を出力させる
		System.out.print("段数は：");

		//入力値をint型変数に代入させる
		int input = standardInput.nextInt();

		//読み込んだ値の段数分、直角の三角形を表示させるため、読み込んだ値をメソッドの引数に定義する
		putStars(input);
	}

}

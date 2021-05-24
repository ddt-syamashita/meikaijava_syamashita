
/*
 *
 * 整数xを右にnビット回転した値を返すメソッドrRotateと、左にnビット回転した値を返すメソッドlRotateを作成せよ。
 *    int rRotate(int x, int n)
 *    int lRotate(int x, int n)
 * ※回転とは、最下位ビットと最上位ビットがつながっているとみなしてシフトすることである。
 *   たとえば、右に5ビット回転した場合は、シフトによってはじき出されることになる下位5ビットを上位にもってこなければならない。
 *
 */

package E_7_12;

import java.util.Scanner;

public class E_7_12 {

	/**
	 * int型のビットを表示するメソッド
	 * @param x：ビットを出力させるため、整数値を取得する
	 */
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * 整数引数xを右に引数nビット回転した値を返すメソッド
	 * @param x：整数値を取得する
	 * @param n：右回転させるための整数値を取得する
	 * @return：シフトさせた結果を返却する
	 */
	static int rRotate(int x, int n) {

		//シフトさせた値を保持するため、int型変数を定義する
		int shift = 0;

		//shift変数に右シフトさせた値を代入させる
		shift = x >>> n;

		//引数xの値として、逆側の左回転させるため、32から引数nの値をマイナスした値を代入させる
		x = x << 32 - n;

		//シフトさせた結果、shift,xどちらかの値が1であれば、その値をxに代入させる
		x = shift | x;

		//論理和の結果が代入された値を返却するため、return文を定義する
		return x;
	}

	/**
	 * 整数引数xを左に引数nビット回転した値を返すメソッド
	 * @param x：整数値を取得する
	 * @param n：左に回転させるための整数値を取得する
	 * @return：シフトさせた結果を返却する
	 */
	static int lRotate(int x, int n) {

		int shift = 0;

		//shift変数に左シフトさせた値を代入させる
		shift = x << n;

		//引数xの値として、逆側の右回転させるため、32から引数nの値をマイナスした値を代入させる
		x = x >>> 32 - n;

		//シフトさせた結果、shift,xどちらかの値が1であれば、その値をxに代入させる
		x = shift | x;

		//論理和の結果が代入された値を返却するため、return文を定義する
		return x;
	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//右に回転させるための文言を出力
		System.out.println("整数xを右にnビット回転します。");

		//整数値の入力を促すため文言を出力させる
		System.out.print("整数x：");
		int inputX = standardInput.nextInt();

		//ビット回転の整数値の入力を促すため、文言を出力させる
		System.out.print("nビット入力：");
		int inputNRight = standardInput.nextInt();

		//入力値のビットを表示するため結果をprintBitsメソッドで出力させる
		System.out.print("回転前の値        = ");
		printBits(inputX);
		//右に回転させた結果を表示させるためprintBitsメソッドで出力させる
		System.out.print("\n右にビット回転させた値 = ");
		printBits(rRotate(inputX, inputNRight));

		//左に回転させるための文言を出力させる
		System.out.println("\n整数yを左にnビット回転します。");

		//整数値の入力を促すため文言を出力させる
		System.out.print("整数y：");
		int inputY = standardInput.nextInt();

		//ビット回転の整数値の入力を促すため、文言を出力させる
		System.out.print("nビット入力：");
		int inputNLeft = standardInput.nextInt();

		//入力値のビットを表示するため結果をprintBitsメソッドで出力させる
		System.out.print("回転前の値        = ");
		printBits(inputY);

		//左に回転させた結果を表示させるためprintBitsメソッドで出力させる
		System.out.print("\n左にビット回転させた値 = ");
		printBits(lRotate(inputY, inputNLeft));

	}

}

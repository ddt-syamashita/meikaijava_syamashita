
/*
 * 整数xのposビット目（最下位から 0, 1, 2, …と数える）を、1にした値を返すメソッドset、
 * 0にした値を返すメソッドreset、反転した値を返すメソッドinverseNを作成せよ。
 *    int set(    int x. int pos)
 *    int reset(  int x, int pos)
 *    int inverseN(int x, int pos)
 *
 * 作成者：山下
 * 作成日：2021/04/26
 */


package E_7_13;

import java.util.Scanner;

public class E_7_13 {

	/**
	 * int型のビットを表示するメソッド
	 * @param x：ビットを出力させるため、整数値を取得する
	 */
	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}


	/**
	 * 第二引数posの指定したビット目を1にした値を返すメソッド
	 * @param x：整数値を取得する
	 * @param pos：ビット目を取得する
	 * @return：1にした値を返却する
	 */
	static int set(int x, int pos) {

		//引数xに対し、引数posビット目を1にした値を返すため、return文を定義する
		return x | (1 << pos);
	}


	/**
	 * 第二引数posの指定したビット目を0にした値を返すメソッド
	 * @param x：整数値を取得する
	 * @param pos：ビット目を取得する
	 * @return：0にした値を返却する
	 */
	static int reset(int x, int pos) {

		//引数xに対し、引数posビット目を0にさせるため補数を扱い、return文を定義する
		return x & ~(1 << pos);
	}

	/**
	 * 第二引数posの指定したビット目を反転させた値を返すメソッド
	 * @param x：整数値を取得する
	 * @param pos：ビット目を取得する
	 * @return：反転させたビット目を返却する
	 */
	static int inveresN(int x, int pos) {

		//引数xに対し、引数posビット目を反転させるため排他的論理和を扱い、return文を定義する
		return x ^ (1 << pos);
	}



	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//整数値xの入力を促す文言を出力させ、int型変数に代入させる
		System.out.print("整数値x：");
		int inputX = standardInput.nextInt();

		//posビット目の入力を促す文言を出力させ、int型変数に代入させる
		System.out.print("posビット：");
		int inputPos = standardInput.nextInt();

		//整数値xをprintBitsメソッドから出力させる
		System.out.print("整数値x                    = ");
		printBits(inputX);

		//入力された値に対し、setメソッドの結果を出力させる
		System.out.print("\nset(inputX, inputPos)      = ");
		printBits(set(inputX, inputPos));

		//入力された値に対し、resetメソッドの結果を出力させる
		System.out.print("\nreset(inputX, inputPos)    = ");
		printBits(reset(inputX, inputPos));

		//入力された値に対し、inversesNメソッドの結果を出力させる
		System.out.print("\ninveresN(inputX, inputPos) = ");
		printBits(reset(inputX, inputPos));
	}

}

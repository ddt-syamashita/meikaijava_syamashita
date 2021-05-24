/*
 * List 7-12 (p.241)のメソッドprintBits は、int型整数値の内部のビットを表示するものであった。
 * 他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。
 *   void printBits(byte x)
 *   void printBits(short x)
 *   void printBits(int x)
 *   void printBits(long x)
 *
 * 作成者：山下
 * 作成日：2021/05/21
 */

package E_7_32;

import java.util.Scanner;

public class E_7_32 {

	/**
	 * byte型の整数としてビット構成を表示するメソッド
	 * 
	 * @param x：byte型の値を取得する
	 */
	static void printBits(byte x) {
		// ビット構成を表示させるため、繰り返す処理を行う
		for (int i = 31; i >= 0; i--) {
			// 第iビットが1であるかを調査し、結果1であれば、1と表示し、0であれば、0と表示させる
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 使用されたメソッドの型をコンソールに出力する
		System.out.print("\nbyte型のメソッド");
	}

	/**
	 * shorr型の整数としてビット構成を表示するメソッド
	 * 
	 * @param x：short型の値を取得する
	 */
	static void printBits(short x) {
		// ビット構成を表示させるため、繰り返す処理を行う
		for (int i = 31; i >= 0; i--) {
			// 第iビットが1であるかを調査し、結果1であれば、1と表示し、0であれば、0と表示させる
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 使用されたメソッドの型をコンソールに出力する
		System.out.print("\nshort型のメソッド");
	}

	/**
	 * int型の整数としてビット構成を表示するメソッド
	 * 
	 * @param x：int型の値を取得する
	 */
	static void printBits(int x) {
		// ビット構成を表示させるため、繰り返す処理を行う
		for (int i = 31; i >= 0; i--) {
			// 第iビットが1であるかを調査し、結果1であれば、1と表示し、0であれば、0と表示させる
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 使用されたメソッドの型をコンソールに出力する
		System.out.print("\nint型のメソッド");
	}

	/**
	 * long型の整数としてビット構成を表示するメソッド
	 * 
	 * @param x：long型の値を取得する
	 */
	static void printBits(long x) {
		// ビット構成を表示させるため、繰り返す処理を行う
		for (int i = 31; i >= 0; i--) {
			// 第iビットが1であるかを調査し、結果1であれば、1と表示し、0であれば、0と表示させる
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 使用されたメソッドの型をコンソールに出力する
		System.out.print("\nlong型のメソッド");
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// メソッドの引数として使用するため、入力を促す文言を出力し、入力値をbyte型変数を定義する
		System.out.print("byte整数：");
		byte inputByte = standardInput.nextByte();

		// メソッドの引数として使用するため、入力を促す文言を出力し、入力値をshort型変数を定義する
		System.out.print("short整数：");
		short inputShort = standardInput.nextShort();

		// メソッドの引数として使用するため、入力を促す文言を出力し、入力値をint型変数を定義する
		System.out.print("int整数：");
		int inputInt = standardInput.nextInt();

		// メソッドの引数として使用するため、入力を促す文言を出力し、入力値をlong型変数を定義する
		System.out.print("long整数：");
		long inputLong = standardInput.nextLong();

		// 定義された変数をメソッド引数に定義する
		printBits(inputByte);
		System.out.println();
		printBits(inputShort);
		System.out.println();
		printBits(inputInt);
		System.out.println();
		printBits(inputLong);
	}

}

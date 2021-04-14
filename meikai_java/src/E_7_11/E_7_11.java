
/*
 *
 * 整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/04/14
 *
 */

package E_7_11;

import java.util.Scanner;

public class E_7_11 {

	/**
	 * 引数で取得した値分、2の(引数値)乗を求めるメソッド
	 * @param value：取得した値を乗数として定義する
	 * @return：引数で取得した値を2乗した値を返却する
	 */
	static int squareCreate(int value) {

		//2乗した値を返却させるため、1の値を保持させた変数を定義する
		int squareValue = 1;

		//引数として取得した値が0より大きい場合繰り返す処理を行う
		while (value-- > 0) {
			//2のべき乗を求めるため、2を掛ける
			squareValue *= 2;
		}
		//求められた結果を返却させるため、return分を定義する
		return squareValue;
	}

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		System.out.println("整数inputAをinputB分ビットシフトします");

		System.out.print("整数inputA：");
		int inputA = standardInput.nextInt();

		System.out.print("入力inputB：");

		int inputB = standardInput.nextInt();

		//2のinputB乗を掛けた値
		int multipliedValue = inputA * squareCreate(inputB);

		//2のinputB乗を割った値
		int dividedValue = inputA / squareCreate(inputB);

		//左にinputBビット分シフトした値を求める
		int leftShift = inputA << inputB;

		//右にinputBビット分シフトした値
		int rightShift = inputA >> inputB;

		//乗算した値を出力させる
		System.out.println("乗算した値：" + multipliedValue);
		//除算した値を出力させる
		System.out.println("除算した値：" + dividedValue);

		//inputBビット左にシフトした値
		System.out.println("左にシフトした値：" + leftShift);
		//inputBビット右にシフトした値
		System.out.println("右にシフトした値：" + rightShift);

		//左右にシフトさせた値が等しくなることを確認するため、三項演算子で出力結果を変更させる
		System.out.println("\n2のinputB乗掛けた値と、\n整数分左ビットシフトした値は一致" +
				((multipliedValue == leftShift) ? "します。" : "しません。"));

		System.out.println("2のinputB乗割った値と、\n整数分右ビットシフトした値は一致" +
				((dividedValue == rightShift) ? "します。" : "しません。"));

	}

}

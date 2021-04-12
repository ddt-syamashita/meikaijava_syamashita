
/*
 *
 * 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 *
 *
 * 作成者：山下
 * 作成日：2021/03/03
 *
 */

package E_5_7;

public class E_5_7 {

	public static void main(String[] args) {

		//算出結果と、2乗の結果を文言として出力させる
		System.out.println("  float         floatの2乗");
		//区切り文字を出力させる
		System.out.println("------------------------------");

		//求める値としてfloat型変数resultValueを定義する。0.0から1.0まで0.001おきにインクリメントさせるループ処理を定義する
		for (float resultValue = 0.0F; resultValue <= 1.0F; resultValue += 0.001F) {
			//resultValueの値と、resultValueの値を2乗として算出した値をコンソールに出力させるため、System.outを定義する
			System.out.printf("%.7f       %.7f%n", resultValue, (resultValue * resultValue));
		}
	}
}

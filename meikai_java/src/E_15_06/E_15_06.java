/*
 * コマンドライン引数で与えられた半径をもつ円の円周の長さと面積を求めて表示するプログラムを作成せよ。
 * 
 * 作成者：山下
 * 作成日：2022/02/13
 * 
 * 
 */

package E_15_06;

public class E_15_06 {

	public static void main(String[] args) {

		// コマンドライン引数から半径となる値を取得
		double radiusValue = Double.parseDouble(args[0]);

		// コマンドライン引数から取得した半径の値をもとに円周の長さをdouble型変数に代入させる
		double circumferenceValue = 2 * Math.PI * radiusValue;

		// コマンドライン引数から取得した半径の値をもとに面積をdouble型変数に代入させる
		double areaValue = Math.PI * radiusValue * radiusValue;

		// 結果を出力する
		System.out.println("半径：" + radiusValue);
		System.out.println("円周：" + circumferenceValue);
		System.out.println("面積：" + areaValue);
	}

}

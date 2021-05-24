
/*
 *
 * 要素型がint型で要素数が5の配列の要素に対して、先頭から順位5, 4, 3, 2, 1を代入して表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/08
 *
 */

package E_6_2;

public class E_6_02 {

	public static void main(String[] args) {

		//要素数が5つのint型配列を生成するため、配列を定義する
		int[] intArray = new int[5];

		//5から1まで順位表示させるため、デクリメントして繰り返させる処理を定義
		for (int i = 0; i < intArray.length; i++) {
			//要素数5に対して大きい値順に各配列に代入させるため、要素数に対し、後置デクリメントを繰り返す度に行う
			intArray[i] = (intArray.length - i);
			//配列番号に対し、代入した配列を出力させる
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}

	}

}

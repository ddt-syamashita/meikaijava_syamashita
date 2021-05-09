
/*
 *
 * 配列aと配列bの全要素の値を交換するメソッドaryExchngを作成せよ。
 *    void aryExchng(int[] a, int[] b)
 * 二つの配列の要素数が等しくない場合は、小さいほうの要素数分の要素を交換すること。
 * 例 配列aの要素が{1, 2. 3. 4. 5, 6, 7}で、配列bの要素が{5, 4, 3, 2, 1}のときに、
 * aryExchng(a, b)と呼び出した後で、配列aは{5, 4, 3, 2, 1, 6, 7}となり、配列bは{1, 2, 3, 4, 5}とならなければならない。
 *
 * 作成者：山下
 * 作成日：2021/05/09
 */

package E_7_21;

public class E_7_21 {

	/**
	 * 取得した2つの配列の要素数が等しくない場合、小さい要素数分の全要素値を交換する。
	 * 
	 * @param a：1つ目の配列を取得する
	 * @param b：2つ目の配列を取得する
	 */
	static void aryExchng(int[] a, int[] b) {

		// 交換した要素から2つの引数から取得した配列の小さい配列の要素数を代入させる
		int change = 0;

		// 2つの配列の要素数を比較するため、取得した配列aの要素数をint型変数に代入する
		int length = a.length;

		// 1つ目の要素数が2つ目の要素数より大きい場合
		if (length > b.length) {
			// 小さいほうの要素数分の要素を交換させるため、2つ目の要素数をlength変数に代入させる
			length = b.length;
		}
		// 小さいほうの要素分を繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < length; i++) {
			// 交換させるため、要素の値を変数changeに代入させる
			change = b[i];
			// 大きい要素数側の値を、小さいほうの配列要素に代入させる
			b[i] = a[i];
			// 交換用変数に代入させていた値を、もう片方の配列要素に代入させる
			a[i] = change;
		}
	}

	public static void main(String[] args) {

		// 1つ目のint型配列を生成する
		int[] arrayA = {1, 2, 3, 4, 5, 6, 7};

		// 2つ目のint型配列を生成する
		int[] arrayB = {5, 4, 3, 2, 1};

		// 要素数が異なる場合、要素数を交換するメソッドを生成した配列を引数に定義する
		aryExchng(arrayA, arrayB);

		// 1つ目の配列を出力させる
		System.out.print("int[] a = {");
		// 要素数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < arrayA.length; i++) {
			// 最終要素の場合
			if (i + 1 == arrayA.length) {
				// 要素の値と閉じる}を出力させる
				System.out.println(arrayA[i] + "} ");
				// 最終要素以外の場合
			} else {
				// 各要素とカンマ区切りを出力させる
				System.out.print(arrayA[i] + ",");
			}
		}

		// 2つ目の配列を出力させる
		System.out.print("int[] b = {");
		// 要素数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < arrayB.length; i++) {
			// 最終要素の場合
			if (i + 1 == arrayB.length) {
				// 要素の値と閉じる}を出力させる
				System.out.print(arrayB[i] + "}");
				// 最終要素以外の場合
			} else {
				// 各要素とカンマ区切りを出力させる
				System.out.print(arrayB[i] + ",");
			}
		}

	}

}


/*
 * 配列aの要素a[idx]に xを挿入するメソッドaryInsを作成せよ。
 *    void aryIns(int[] a, int idx, int x)
 * 挿入に伴って a[idx]～ a[a.length -2]を一つの後方にずらさなければならない。
 * 例 配列aの要素が {1, 3, 4, 7, 9, 11}のときにaryIns(a, 2, 99)と呼び出した後の配列aの要素は{1, 3, 99, 4, 7, 9}となる。
 *
 * 作成者：山下
 * 作成日：
 */

package E_7_20;

public class E_7_20 {

	/**
	 * 指定した配列の要素箇所に指定された値を挿入する
	 * 
	 * @param a：配列を指定する
	 * @param idx：挿入する要素の値
	 * @param x：挿入する値
	 */
	static void aryIns(int[] a, int idx, int x) {

		// 挿入する要素を特定するため配列の要素数からマイナス2した変数を定義する。
		int insert = a.length - 2;

		// 挿入された要素箇所に対して、一つずつ後方にずらすため、変数を定義する
		int shift = a.length - 1;

		// 配列の要素数に対し、指定した配列の要素数から挿入する要素箇所の値をマイナスした値まで繰り返す処理
		for (int i = 1; i < a.length - idx; i++) {

			// 指定された配列の要素位置をずらすため、挿入用の変数の値をずらした要素位置に代入させる
			a[shift] = a[insert];

			// 繰り返すごとに一つずつずらすため、insert変数、shift変数をデクリメントする
			insert--;
			shift--;
		}

		// 各要素の値をずらした後、引数idxの挿入する要素数に、挿入する値を代入させる
		a[idx] = x;

	}

	public static void main(String[] args) {

		// aryInsメソッドで使用するため、配列arrayAを生成する
		int[] arrayA = { 1, 3, 4, 7, 9, 11 };

		// 配列arrayAを指定し、要素数2の位置に値99を挿入するため、各引数に定義する
		aryIns(arrayA, 4, 99);

		// 例題のように配列を出力される
		System.out.print("arrayA = {");
		// 配列の全要素を出力させるため、for文で全要素を一つずつ出力させる
		for (int i = 0; i < arrayA.length; i++) {

			// 繰り返し変数にプラス1とした値と、要素数が一致している場合
			if (arrayA.length == i + 1) {
				// 最終要素と、閉じる文言を出力さｓる
				System.out.print(arrayA[i] + "}");
				// 最終要素以外の場合
			} else {
				// 要素の値と、カンマ区切りを出力させる
				System.out.print(arrayA[i] + " ,");
			}
		}
	}

}

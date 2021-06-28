
/*
 * 配列aの要素a[idx]に xを挿入するメソッドaryInsを作成せよ。
 *    void aryIns(int[] a, int idx, int x)
 * 挿入に伴って a[idx]～ a[a.length -2]を一つの後方にずらさなければならない。
 * 例 配列aの要素が {1, 3, 4, 7, 9, 11}のときにaryIns(a, 2, 99)と呼び出した後の配列aの要素は{1, 3, 99, 4, 7, 9}となる。
 *
 * 作成者：山下
 * 作成日：2021/05/08
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

		//引数の挿入する要素位置の値がが0以上かつ、配列の要素より小さい場合
		if(idx >= 0 && idx < a.length) {
			//挿入値を格納後、要素値を後方にシフトさせるため、、繰り返し変数に配列の要素値からマイナス1した値を代入し、デクリメントで繰り返させる
			for(int i = a.length -1; i > idx; i--) {
				//後方の要素に後方にシフトさせ、要素値を代入させる
				a[i] = a[i - 1];
			}
			//挿入する値を要素に代入させるため、指定挿入要素位置に、挿入する値を代入させる
			a[idx] = x;
		}
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

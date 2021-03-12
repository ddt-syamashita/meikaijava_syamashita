
/*
 * List 6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである。
 * 最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/12
 *
 */

package E_6_7;

import java.util.Random;
import java.util.Scanner;

public class E_6_07 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//乱数を生成するため、Randomクラスをインスタンス化する
		Random randValue = new Random();

		//要素数を定義する
		final int elementCount = 12;

		//配列を宣言する
		int[] array = new int[elementCount];

		//0～9までの乱数を各要素に代入する
		for(int j = 0; j < elementCount; j++) {
			array[j] = randValue.nextInt(10);
		}

		//配列用の表示文言を出力させる
		System.out.print("配列arrayの全要素の値\n{");
		//配列要素をコンソールに出力させるため、繰り返し処理を定義
		for(int j = 0; j < elementCount; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println("}");

		//探索する数値入力を促す文言を出力させる
		System.out.print("探す数値：");

		//keyとなる値をint型変数に入力値を代入する
		int key = standardInput.nextInt();

		//末尾側に位置する要素を見つけるためint型変数を定義し、要素数を代入する
		int endSide;

		//要素数分キーを探すため、for文で繰り返し処理を行う
		for(endSide = elementCount - 1; endSide >= 0; endSide-- ) {

			//要素数からデクリメントされた配列からキーを探索し、入力されたkey値と一致していた場合
			if(array[endSide] == key) {
				//探索する入力keyを発見時、繰り返し処理を終了させる
				break;
			}

		}

		//末尾側変数が0よりも大きい場合
		if(endSide >= 0) {
			//探索成功の文言を出力させる
			System.out.println("それはarray[" + endSide + "]にあります。");
		//探索繰り返し処理で、末尾側変数がデクリメントによって、0よりも小さくなり探索失敗した場合
		} else {
			//探索失敗の文言を出力させる
			System.out.println("それはありません。");
		}


	}

}

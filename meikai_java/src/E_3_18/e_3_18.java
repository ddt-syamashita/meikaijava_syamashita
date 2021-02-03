
/*
 *
 *  月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_18;

import java.util.Scanner;

public class e_3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Scannerクラスをインスタンス化する
		Scanner sc = new Scanner(System.in);

		//入力を促す文言を出力
		System.out.print("月入力：");
		//読み込んだ値を変数に代入する
		int input = sc.nextInt();

		//読み込んだ値をswitch文で分岐させる
		switch(input) {

			//3が入力された場合
			case 3:
			//4が入力された場合
			case 4:
			//5が入力された場合
			case 5:
				//判定結果を出力
				System.out.println("春");
				//処理から抜け出させるためbreak文を定義
				break;
			//6が入力された場合
			case 6:
			//7が入力された場合
			case 7:
			//8が入力された場合
			case 8:
				//判定結果を出力
				System.out.println("夏");
				//処理から抜け出させるためbreak文を定義
				break;
			//9が入力された場合
			case 9:
			//10が入力された場合
			case 10:
			//11が入力された場合
			case 11:
				//判定結果を出力
				System.out.println("秋");
				//処理から抜け出させるためbreak文を定義
				break;
			//12が入力された場合
			case 12:
			//1が入力された場合
			case 1:
			//2が入力された場合
			case 2:
				//判定結果を出力
				System.out.println("冬");
				//処理から抜け出させるためbreak文を定義
				break;
		}
	}
}
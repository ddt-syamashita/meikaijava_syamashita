

/*
 * 行数・各行の列数・各要素の値をキーボードから読み込むようにList 6-18 を書き換えたプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/15
 */

package E_6_18;

import java.util.Scanner;

public class E_6_18 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);


		//2次元配列を定義する
		int [][] arrayC;

		//行数を読み込んだ値として変数に代入させるためint型変数を定義する
		int inputColumn = 0;

		//1以上の値が入力されるまで繰り返させるため、do文で入力処理を行う
		do {
			//行数の入力を促す文言を出力させる
			System.out.print("行数：");
			inputColumn = standardInput.nextInt();
		}while(inputColumn <= 0);

		//入力された数値を配列の行数として代入する
		arrayC = new int[inputColumn][];

		//列数を読み込んだ値として変数に代入させるためint型変数を定義する
		int inputLine = 0;

		//配列arrayまでの要素数分繰り返す処理をfor文で行う
		for(int i = 0; i < arrayC.length; i++) {

			//1以上の値が入力されるまで繰り返させるため、do文で入力処理を行う
			do {
				//各列に対しての入力を促す文言を出力させる
				System.out.print("列数指定：arrayC[" + i + "] = ");
				inputLine = standardInput.nextInt();
			}while(inputLine <= 0);

			//各行に対して、入力された値を列数に代入する
			arrayC[i] = new int[inputLine];
		}

		//変数arrayの各行分繰り返す処理を行わせるため、for文を定義する
		for(int i = 0; i < arrayC.length; i++) {
			//変数arrayの各列分繰り返す処理を行わせるため、for文を定義する
			for(int j = 0; j < arrayC[i].length; j++) {
				//3桁分の均一表示させるため、printfを定義し、変数arrayの各要素を表示させる
				System.out.printf("%3d", arrayC[i][j]);
			}
			//1列表示後、改行させるため、printlnを定義する
			System.out.println();
		}



	}

}

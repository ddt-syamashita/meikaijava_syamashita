
/*
 * 4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ。
 * 各要素の値はキーボードから読み込むこと。
 *
 *
 * 作成者：山下
 * 作成日：2021/03/14
 *
 */

package E_6_16;

import java.util.Scanner;

public class E_6_16 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//4行3列の配列を生成する
		int[][] arrayA = new int[4][3];
		//計算結果用に同様の要素数の配列を生成する
		int[][] arrayAResult = new int[4][3];

		//3行4列の配列を生成する
		int[][] arrayB = new int[3][4];
		//計算結果用に同様の要素数の配列を生成する
		int[][] arrayBResult = new int[3][4];

		//4行3列の各要素の入力を促す文言を出力させる
		System.out.println("4行3列の要素を入力する");
		//指定された4行分の各要素を入力させるまでfor文で処理を繰り返し行う
		for (int i = 0; i < 4; i++) {
			//指定された3列分の各要素を入力させるまでfor文で繰り返し処理を行う
			for (int j = 0; j < 3; j++) {
				//入力を促す文言を出力させる
				System.out.print("arrayA[" + i + "][" + j + "] =");
				//入力値を各要素に代入する
				arrayA[i][j] = standardInput.nextInt();
			}
		}

		//指定された4行分をfor文で処理を繰り返し行う
		for (int i = 0; i < 4; i++) {
			//指定された3列分のfor文で処理を繰り返し行う
			for (int j = 0; j < 3; j++) {
				//配列要素の積を求めるため、計算結果用の配列に掛け算結果を代入する
				arrayAResult[i][j] = arrayA[i][j] * arrayA[i][j];
			}
		}

		//3行4列の各要素の入力を促す文言を出力させる
		System.out.println("3行4列の要素を入力する");
		//指定された3行分の各要素を入力させるまでfor文で繰り返し処理を行う
		for (int i = 0; i < 3; i++) {
			//指定された4列分の各要素を入力させるまでfor文で繰り返し処理を行う
			for (int j = 0; j < 4; j++) {
				//入力を促す文言を出力させる
				System.out.print("arrayB[" + i + "][" + j + "] =");
				//要素の値に読み込んだ値を代入する
				arrayB[i][j] = standardInput.nextInt();
			}
		}

		//指定された3行分をfor文で処理を繰り返し行う
		for (int i = 0; i < 3; i++) {
			//指定された4列分をfor文で処理を繰り返し行う
			for (int j = 0; j < 4; j++) {
				//配列要素の積を求めるため、計算結果用の配列に掛け算結果を代入する
				arrayBResult[i][j] = arrayB[i][j] * arrayB[i][j];
			}
		}

		//入力結果を明確にするため確認として各要素を出力させる
		System.out.println("4行3列の入力結果");
		//指定された4行分の各要素を入力させるまでfor文で処理を繰り返し行う
		for (int i = 0; i < 4; i++) {
			//指定された3列分の各要素を入力させるまでfor文で処理を繰り返し行う
			for (int j = 0; j < 3; j++) {
				//5桁分の表示を揃えて出力させるため、printfを定義
				System.out.printf("%5d", arrayA[i][j]);
			}
			//すべて列を出力後、改行表示させる
			System.out.println();
		}

		//計算結果を明確にするため確認として各要素を出力させる
		System.out.println("4行3列の積を求めた結果");
		//指定された4行分の各要素を入力させるまでfor文で処理を繰り返し行う
		for (int i = 0; i < 4; i++) {
			//指定された3列分の各要素を入力させるまでfor文で処理を繰り返し行う
			for (int j = 0; j < 3; j++) {
				//5桁分の表示を揃えて出力させるため、printfを定義
				System.out.printf("%5d", arrayAResult[i][j]);
			}
			//すべて列を出力後、改行表示させる
			System.out.println();
		}

		System.out.println();

		//入力結果を明確にするため確認として各要素を出力させる
		System.out.println("3行4列の入力結果");
		//指定された3行分をfor文で処理を繰り返し行う
		for (int i = 0; i < 3; i++) {
			//指定された4列分をfor文で処理を繰り返し行う
			for (int j = 0; j < 4; j++) {
				//5桁分の表示を揃えて出力させるため、printfを定義
				System.out.printf("%5d", arrayB[i][j]);
			}
			//すべて列を出力後、改行表示させる
			System.out.println();
		}

		//計算結果を明確にするため確認として各要素を出力させる
		System.out.println("3行4列の積を求めた結果");
		//指定された3行分をfor文で処理を繰り返し行う
		for (int i = 0; i < 3; i++) {
			//指定された4列分をfor文で処理を繰り返し行う
			for (int j = 0; j < 4; j++) {
				//5桁分の表示を揃えて出力させるため、printfを定義
				System.out.printf("%5d", arrayBResult[i][j]);
			}
			//すべて列を出力後、改行表示させる
			System.out.println();
		}

	}

}

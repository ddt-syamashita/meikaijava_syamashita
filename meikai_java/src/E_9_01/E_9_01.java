/*
 * 演習 8-1(p.293)で作成した≪人間クラス≫の配列を生成するプログラムを作成せよ。
 * 生成時に要素を初期化するもの、生成後の要素に値を代入するものなど、複数パターンを作ること。
 * 
 * 作成者：山下
 * 作成日：
 * 
 */

package E_9_01;

import java.util.Scanner;

public class E_9_01 {

	/**
	 * 人間クラス配列の要素を出力するメソッド
	 * 
	 * @param a：Human配列を取得する
	 */
	static void printHumanArray(Human[] a) {
		// 入力された値を全て出力させるため、human配列の要素分繰り返すfor文を定義する
		for (int i = 0; i < a.length; i++) {
			// 配列の要素として生成されたhuman要素の各値を出力させる
			System.out.println((i + 1) + "人目の情報");
			System.out.println("名前：" + a[i].name);
			System.out.println("身長：" + a[i].height + " cm");
			System.out.println("体重：" + a[i].weight + " kg\n");
		}
	}

	static class Human {
		// 人間クラスの名前を定義する
		String name = "";
		// 人間クラスの身長を定義する
		int height = 0;
		// 人間クラスの体重を定義する
		int weight = 0;

		// 名前の変数に代入させるため、引数ありのコンストラクタを定義する
		Human(String name, int height, int weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
	}

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 要素の入力を促す文言を出力し、int型変数に代入させる
		int inputHumanElement = 0;

		// 要素数を入力値から指定するため、1以上の値が入力されるまで繰り返させる
		do {

			// 生成する配列の要素の入力を促す文言を出力し、inputHumanElement変数に代入させる
			System.out.print("humanArray1配列の要素数：");
			inputHumanElement = standardInput.nextInt();
		} while (inputHumanElement <= 0);

		// 生成時に要素を初期化するHuman配列を生成する
		Human humanArray1[] = new Human[inputHumanElement];

		// humanArray1配列の要素数分、繰り返させるため、for文を定義する
		for (int i = 0; i < humanArray1.length; i++) {

			// 氏名の入力を促す文言を出力し、入力値をString型変数に代入させる
			System.out.print((i + 1) + "人目の氏名：");
			String inputName = standardInput.next();

			// 身長の入力を促す文言を出力し、入力値をint型変数に代入させる
			System.out.print((i + 1) + "人目の身長：");
			int inputHeight = standardInput.nextInt();

			// 体重の入力を促す文言を出力し、入力値をint型変数に代入させる
			System.out.print((i + 1) + "人目の体重：");
			int inputWeight = standardInput.nextInt();

			// 入力された各変数を、Humanクラスの引数として定義する
			humanArray1[i] = new Human(inputName, inputHeight, inputWeight);

			System.out.println();
		}

		// 生成時に各要素を初期化するhumanArray2配列を生成する
		Human humanArray2[] = { new Human("田中達也", 179, 65), new Human("高橋和也", 168, 64) };

		// 生成したhumanArray1をメソッドを使用して出力する
		System.out.println("humanArray1を出力します。");
		printHumanArray(humanArray1);

		// 生成したhumanArray2をメソッドを使用して出力する
		System.out.println("humanArray2を出力します。");
		printHumanArray(humanArray2);
	}

}

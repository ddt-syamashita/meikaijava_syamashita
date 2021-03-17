
/*
 * クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計と平均点を求めるプログラムを作成せよ。
 * 合計点と平均点は、クラスごとのものと全体のものとを表示すること。
 *
 * 作成者：山下
 * 作成日：2021/03/15
 *
 */

package E_6_19;

import java.util.Scanner;

public class E_6_19 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//クラス数の入力を促す文言を出力させる
		System.out.print("クラス数：");

		//入力値をクラス数として定義するため、int型変数に代入する
		int classNumber = standardInput.nextInt();

		//クラス数の配列を生成し、第一配列に入力したクラス数を定義
		int[][] classArray = new int[classNumber][];

		//改行させるため、ptrintlnを定義
		System.out.println();

		//合計、平均値を求めるため、学生の人数を保持するための変数を定義する
		int studentCount = 0;

		//クラス数分繰り返す処理を行うため、for文を定義する
		for (int i = 0; i < classArray.length; i++) {
			//クラスに対しての人数の入力を促す文言を出力させる
			System.out.print((i + 1) + "組の人数：");
			//入力値をint型変数に代入させる
			int studentNumber = standardInput.nextInt();
			//合計、平均値を求めるための変数に入力値を代入させる
			studentCount += studentNumber;

			//入力値を第二配列の要素数とさせるため、生成させる際に定義する
			classArray[i] = new int[studentNumber];
			//人数として入力値分繰り返す処理のfor文を定義する
			for (int j = 0; j < classArray[i].length; j++) {
				//各要素のクラスの何番目の入力を促す文言を出力させる
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				//各クラスの生徒に対して、入力値をclassArray配列の各要素に代入させる
				classArray[i][j] = standardInput.nextInt();
			}

		}

		//合計を求めるため、配列を生成する。要素数はクラスの数
		int[] totalArray = new int[classArray.length];
		//平均を求めるため、配列を生成する。要素数はクラスの数
		double[] averageArray = new double[classArray.length];

		//算出する結果を出力させる
		System.out.println("  組｜    合計    平均");
		System.out.println("-----+------------------------");
		//クラスの数だけ繰り返すため、for文を定義する
		for (int i = 0; i < classArray.length; i++) {
			//クラスの学生の人数に対して繰り返し処理を行うため、for文を定義する
			for (int j = 0; j < classArray[i].length; j++) {
				//合計配列に各要素の入力結果の合計結果を代入させる
				totalArray[i] += classArray[i][j];
				//平均配列に各要素の入力結果の合計結果を代入させる
				averageArray[i] += totalArray[i] / (double) classArray[i].length;
			}
			//printfを定義し、組と、合計、平均値を出力させる
			System.out.printf("%2d組 | %6d %5.1f  \n", i + 1, totalArray[i], averageArray[i]);
		}

		//合計の変数を定義する
		int total = 0;
		//totalArray配列の全要素を合計変数に加算させるため、拡張for文で加算させる
		for (int i : totalArray) {
			//全要素をtotal変数に代入させる
			total += i;
		}

		//総合計に対し、平均を求めるため、double型変数を定義し、合計に対し、学生数を割って算出する
		double average = (double) total / studentCount;
		//printfを定義し、組と、合計、平均値を出力させる
		System.out.println("-----+------------------------");
		System.out.printf("  計｜ %6d  %6.1f ", total, average);
	}

}


/*
 * 6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/15
 *
 */

package E_6_17;

import java.util.Scanner;

public class E_6_17 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//学生の人数をint型変数として定義する
		int students = 6;

		//科目数の値をint型変数として定義する
		int subject = 2;

		//6行2列の配列を生成する
		int[][] subjectArray = new int[students][subject];

		//国語の平均点を求めるため、合計点として代入用のdouble型変数を定義する
		double totalNationallanguage = 0;

		//数学の平均点を求めるため、合計点として代入用のdouble型変数を定義する
		double totalMath = 0;

		//学生ごとの平均点を求めるため、double型配列変数を定義する
		double[] studentsAverage = new double[students];

		//6行分（6人の学生）の繰り返し処理を行うため、for文を定義する
		for (int i = 0; i < students; i++) {
			//学生ごとに2科目の入力が完了されるたびに、学生ごとの入力を促す文言を出力させる
			System.out.println((i + 1) + "人目の学生の成績を入力してください。");
			//2科目分の繰り返し処理を行うため、for文を定義する
			for (int j = 0; j < subject; j++) {

				//繰り返し変数が0の場合、国語の科目のため、入力表示を切り替える
				if (j == 0) {
					//0～100の値が入力されるまで繰り返し入力させる
					do {
						//国語科目の入力を促す文言を出力させる
						System.out.print("国語：");
						//入力された数値をそれぞれの要素に代入させるため、2重配列に繰り返し変数を指定し、入力値を代入させる
						subjectArray[i][j] = standardInput.nextInt();
					} while (subjectArray[i][j] < 0 || subjectArray[i][j] > 100);
					//入力値を平均を求める変数に代入させる
					totalNationallanguage += subjectArray[i][j];
					//繰り返し変数が国語以外の場合
				} else {
					//0～100の値が入力されるまで繰り返し入力させる
					do {
						//数学科目の入力を促す文言を出力させる
						System.out.print("数学：");
						//入力された数値をそれぞれの要素に代入させるため、2重配列に繰り返し変数を指定し、入力値を代入させる
						subjectArray[i][j] = standardInput.nextInt();
					} while (subjectArray[i][j] < 0 || subjectArray[i][j] > 100);
					//入力値を平均を求める変数に代入させる
					totalMath += subjectArray[i][j];
				}
				//学生ごとの平均を求めるため、入力された国語と数学のどちらの値を変数に代入させる
				studentsAverage[i] += subjectArray[i][j];
			}
		}

		//国語の平均を入力値を代入させた変数の値と学生の数を割り、平均点として小数点2以下までを出力させる
		System.out.print("国語の平均点：");
		System.out.printf("%.2f", totalNationallanguage / students);
		System.out.println("点");
		//数学の平均を入力値を代入させた変数の値と学生の数を割り、平均点として小数点2以下までを出力させる
		System.out.print("数学の平均点：");
		System.out.printf("%.2f", totalMath / students);
		System.out.println("点");

		//出力結果の合計と平均点を区切るため、改行させる
		System.out.println();

		//学生ごとに平均を求めるため、学生の数分繰り返す処理をfor文で行う
		for (int i = 0; i < students; i++) {
			//学生ごとの平均を小数点2以下までを出力させる
			System.out.print("学生" + (i + 1) + "の平均点：");
			System.out.printf("%.2f", (studentsAverage[i] / subject));
			System.out.println("点");
		}

	}

}

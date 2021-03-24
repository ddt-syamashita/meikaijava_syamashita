
/*
 * List 5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 * List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、横に並べて表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2021/03/03
 */

package E_5_6;

public class E_5_6 {

	public static void main(String[] args) {

		//floatとintを並べて表示させる
		System.out.println("   float         int   ");
		//区切るため-を出力させる
		System.out.println("------------------------");

		float countFloat = 0.0F;

		//int型変数を0から1000まで繰り返す処理を行うため、for文を定義する
		for (int i = 0; i <= 1000; i++) {
			//0から1000までインクリメントした値を算出させる
			System.out.printf(" %1.7f    ", countFloat);

			//float型の変数を0.001ずつ繰り返すたびに加算させる
			countFloat += 0.001F;

			//繰り返し変数のiをfloat型に型変換し1000で割った値をfloat型変数に代入させる
			float countInt = (float) i / 1000;

			//int型の繰り返し変数を出力させる
			System.out.printf("%1.7f%n", countInt);
		}

	}

}

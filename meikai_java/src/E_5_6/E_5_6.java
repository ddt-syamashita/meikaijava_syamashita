
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
		System.out.println("   float       int   ");
		//区切るため-を出力させる
		System.out.println("-------------------------");

		//float型の変数ｘを0.0から1.0までループさせる。int型として表示させるため、float型yを定義する
		for (float x = 0.0F, intValue1 = 0.0F; x <= 1.0F; x += 0.001F, intValue1++) {
			//0から1000までインクリメントした値を算出させる
			float intValue2 = (float) intValue1 / 1000;
			//増加させる変数を桁数を揃えるため、printfを定義し出力させる。出力後、\nで改行表示させる。
			System.out.printf("%.7f     %.7f\n", x, intValue2);
		}

	}

}

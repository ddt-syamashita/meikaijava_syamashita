
/*
 *
 * 以下に示すプログラムを作成せよ。
 * ・1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 * ・1桁の負の整数値（すなわち-9以上-1の値）をランダムに生成して表示。
 * ・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 *
 * 作成者：山下
 * 作成日：2/1
 */


package E_2_7;

import java.util.Random;

public class e_2_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//乱数を生成するRandomをインスタンス化
		Random rand = new Random();

		//int型x変数に1以上9以下のランダム変数を代入する
		int x = rand.nextInt(9) + 1;

		//int型y変数に-9以上ｰ1以下のランダム変数を代入する
		int y = rand.nextInt(9) - 9;

		//int型z変数に10以上99以下のランダム変数を代入する
		int z = rand.nextInt(89) +10;

		//乱数が代入されたxを出力する
		System.out.println("変数xの値：" + x);

		//乱数が代入されたyを出力する
		System.out.println("変数xの値：" + y);

		//乱数が代入されたzを出力する
		System.out.println("変数xの値：" + z);
	}

}

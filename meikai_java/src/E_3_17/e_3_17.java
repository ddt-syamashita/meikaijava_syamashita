
/*
 *
 *  0,1,2のいずれかの値の乱数を生成し、0であれば"グー”を、1であれば"チョキ"を、2であれば"パー"を表示するプログラムを作成せよ。
 *
 * 作成者：山下
 * 作成日：2/2
 */

package E_3_17;

import java.util.Random;

public class e_3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Randomクラスをインスタンス化する
		Random rand = new Random();

		//0～2の値を乱数をint型変数に代入する
		int randData = rand.nextInt(3);

		//randData変数の値に対してswitch文で分岐させる
		switch(randData) {

			//乱数が0の場合
			case 0:
				//判定結果を出力
				System.out.println("グー");
				//処理から抜け出させるためbreak文を定義
				break;

			//乱数が1の場合
			case 1:
				//判定結果を出力
				System.out.println("チョキ");
				//処理から抜け出させるためbreak文を定義
				break;

			//乱数が2の場合
			case 2:
				//判定結果を出力
				System.out.println("パー");
				//処理から抜け出させるためbreak文を定義
				break;
		};
	}

}

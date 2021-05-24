
/*
 * List 6-5を書き換えて、右に示すように立て向きの棒グラフで表示するプログラムを作成せよ。
 * 最下段には、インデックスを10で割った余剰を表示すること。
 *
 * 作成者；山下
 * 作成日：2021/03/08
 *
 */

package E_6_4;

import java.util.Random;
import java.util.Scanner;

public class E_6_04 {

	public static void main(String[] args) {

		//乱数を取得するため、Randomクラスをインスタンス化する
		Random randomValue = new Random();

		//Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文言を出力させる
		System.out.print("要素数：");

		//読み込んだ値をint型変数に代入させる
		int input = standardInput.nextInt();

		//読み込んだ値分の配列を生成させる
		int[] inputArray = new int[input];

		//全ての要素に対し、生成された乱数を代入させる
		for (int i = 0; i < input; i++) {
			inputArray[i] = 1 + randomValue.nextInt(10);
		}

		//縦向きのグラフを出力させるため、乱数の最大数10まで繰り返す処理
		for(int i = 0; i < 10; i++) {
			//入力した値まで繰り返す処理を行う
			for(int j = 0; j < input; j++) {
				//繰り返し用の変数iよりも、最大数10を差し引いた状態で、代入された乱数が大きい場合
				if(i >= (10 - inputArray[j])) {
					//縦向きグラフとして表示させるため、*を出力させる
					System.out.print("*");
				//それ以外の場合、*と出力させないため、空欄を表示させる
				} else {
					//空欄を出力させるため、print関数を定義する
					System.out.print(" ");
				}

				//次の行に改行表示させるため、入力した値を1マイナスした値と繰り返し変数jが等しくなった場合
				if(j == (input - 1)) {
					//改行表示させる
					System.out.println();
				//折り返し最終表示以外の場合
				} else {
					//入力した値分グラムを表示させるため、改行せず、空欄を出力
					System.out.print(" ");
				}
			}
		}
		//表示区切り-を出力させるため、読み込んだ値分繰り返し処理を定義する
		for(int i = 0; i < input; i++) {
			//区切り表示のため、-を出力させる
			System.out.print("-");
			//読み込んだ値まで出力させた場合改行させる
			if(i == input -1) {
				//改行表示させるため、printlnを定義
				System.out.println();
			//読み込んだ値まで出力させるまで、-を出力させる
			} else {
				//-でグラフとインデックスを区切るため、-を出力させる
				System.out.print("-");
			}
		}
		//最下段に読み込んだ値分の値を10で割った値を出力させるため繰り返し処理を定義
		for(int i = 0; i < input; i++) {
			//繰り返した値の数を10で割り、数値を出力させる
			System.out.print(i % 10);
			//読み込んだ値まで出力させた場合改行させる
			if(i == input - 1) {
				//改行表示させるため、printlnを定義
				System.out.println();
			//読み込んだ値まで、表示させたインデックスの間に半角スペースを出力させる
			} else {
				//半角スペースを出力させる
				System.out.print(" ");
			}
		}





	}

}

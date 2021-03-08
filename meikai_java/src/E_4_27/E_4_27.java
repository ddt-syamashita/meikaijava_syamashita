
/*
 *
 * List 4-3（p.98）の数あてゲームのプレーヤーが入力できる回数に制限を設けたプログラムを作成せよ。
 * 制限回数内にあてられなかった場合は、正解を表示してゲームを終了すること。
 *
 *
 * 作成者：山下
 * 作成日：2021/02/20
 *
 */

package E_4_27;

import java.util.Random;
import java.util.Scanner;

public class E_4_27 {

	public static void main(String[] args) {

		//乱数を取得するため、Randomクラスをインスタンス化する
		Random random = new Random();

		//入力を取得するため、Scannerクラスをインスタンス化する
		Scanner standardInput = new Scanner(System.in);

		int randomNumber = random.nextInt(100);

		System.out.println("数あてゲーム開始！！");
		System.out.println("0～99の数を当ててください。");

		//読み込んだ値を数値で取得するため、int型変数を定義
		int inputNumber;

		//入力できる回数に制限を設定するため、1～10の値を乱数で生成する
		int randomCount = random.nextInt(10) + 1;
		//入力後に、残りの入力回数を保持するため、int型変数に代入する
		int remainingNumber = randomCount;

		System.out.println("入力制限：" + randomCount + "回");

		//残り回数を計算するため、int型変数を定義する
		int countValue = 1;

		do {
			//残り回数と、入力を促す文言を出力させる
			System.out.print("残り" + remainingNumber-- + "回。いくつかな：");
			//数を当てるための入力値を変数に代入する
			inputNumber = standardInput.nextInt();

			if (inputNumber > randomNumber) {
				System.out.println("もっと小さな数字だよ。");
			} else if (inputNumber < randomNumber) {
				System.out.println("もっと大きな数字だよ。");
			}
			//乱数で取得した回数制限と、入力したカウント値が同値になった場合、入力ループを終了させる
			if (countValue == randomCount) {
				//入力ループを終了させるため、breakを定義
				break;
			}
			//ループカウントをループを行うたびにインクリメントする
			countValue++;
			//乱数で取得した答え値と、入力値が一致しない場合は繰り返す処理条件を定義
		} while (inputNumber != randomNumber);

		//乱数で取得した答え値と、入力値が一致した場合
		if (inputNumber == randomNumber) {
			//正解の文言を出力させる
			System.out.println("正解だよ！");
		} else {
			//不正解の場合は、正解の乱数と、不正解の文言を出力させる
			System.out.println("不正解。答えは" + randomNumber + "だよ");
		}

	}

}

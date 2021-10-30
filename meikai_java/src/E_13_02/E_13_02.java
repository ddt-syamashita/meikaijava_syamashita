/*
 * 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
 * 左下が直角のもの、左上が直角のもの、右下が直角のもの、右上が直角のものを追加すること。
 * 直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること。
 * 
 * 作成者：山下
 * 作成日：2021/10/30
 * 
 */

package E_13_02;

import java.util.Scanner;

public class E_13_02 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 入力値から三角形の個数を代入させるため、int型変数を定義
		int inputTriangle = 0;

		// 1以上の値が入力されるまで繰り返させる
		do {
			// 入力を促す文言を出力し、入力値をint型変数に代入させる
			System.out.print("三角形は何個：");
			inputTriangle = standardInput.nextInt();
		} while (inputTriangle <= 0);

		// 抽象クラスの三角形クラスをインスタンス化
		AbstTriangle[] triangleArray = new AbstTriangle[inputTriangle];

		//三角形の入力個数分繰り返すため、for文を定義
		for (int i = 0; i < triangleArray.length; i++) {

			// 三角形の種類を入力値で指定するため、代入させるint型変数に代入させる変数を定義
			int inputMenu = 0;

			// 0～4の値が入力されるまで繰り返させるため、do文を定義する
			do {
				// 入力を促す文言を出力し、入力値をint型変数に代入させる
				System.out.print((i + 1) + "番の三角形の種類（1・・・左下直下／2・・・左上直下／3・・・右下直下／4・・・右上直下）：");
				inputMenu = standardInput.nextInt();
			} while (inputMenu <= 0 || inputMenu > 4);

			// 長さを入力値から取得させるため、int型変数を定義
			int inputLength;

			// 三角形の種類を1～4の入力値からそれぞれ分岐させるため、switch文を定義
			switch (inputMenu) {
			// 三角形の種類1の分岐
			case 1:
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したTriangleLeftBorderクラスをインスタンス化
				triangleArray[i] = new TriangleLeftBorder(inputLength);
				break;
			// 三角形の種類2の分岐
			case 2:
				// 長さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したTriangleLeftUpperクラスをインスタンス化し、引数に長さの入力値を定義
				triangleArray[i] = new TriangleLeftUpper(inputLength);
				break;
			// 三角形の種類3の分岐
			case 3:
				// 長さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したTriangleRightBorderクラスをインスタンス化し、引数に長さの入力値を定義
				triangleArray[i] = new TriangleRightBorder(inputLength);
				break;
			// 三角形の種類4の分岐
			case 4:
				// 長さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したTriangleLeftUpperクラスをインスタンス化し、引数に長さの入力値を定義
				triangleArray[i] = new TriangleRightUpper(inputLength);
				break;
			}

		}

		// ShapeクラスのtriangleArrayの全要素を出力させるため、拡張for文を定義
		for (AbstTriangle s : triangleArray) {
			// printメソッドで全要素を出力させる
			s.print();
			// 出力後、コンソール上で確認しやすいよう改行させる
			System.out.println();
		}

	}

}

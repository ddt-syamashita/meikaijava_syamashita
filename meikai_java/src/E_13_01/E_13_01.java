/*
 * 図形クラス群をテストするプログラムを作成せよ。List 13-9 と同じく、Shape型の配列を利用して、インスタンスの生成と表示を行うこと。
 * ただし、個々の要素が参照するインスタンスは、プログラム内で与えるのではなく、キーボードから読み込むようにすること。
 * 
 * 作成者：山下
 * 作成日：2021/10/25
 */

package E_13_01;

import java.util.Scanner;

public class E_13_01 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 入力値から図形の個数を代入させるため、int型変数を定義
		int inputFigre = 0;

		// 1以上の値が入力されるまで繰り返させる
		do {
			// 入力を促す文言を出力し、入力値をint型変数に代入させる
			System.out.print("図形は何個：");
			inputFigre = standardInput.nextInt();
		} while (inputFigre <= 0);

		// 抽象クラスのＳｈａｐｅを配列型としてインスタンス化する
		Shape[] shapeArray = new Shape[inputFigre];

		//図形の入力個数分繰り返すため、for文を定義
		for (int i = 0; i < shapeArray.length; i++) {

			// 図形の種類を入力値で指定するため、代入させるint型変数に代入させる変数を定義
			int inputMenu = 0;

			// 0～4の値が入力されるまで繰り返させるため、do文を定義する
			do {
				// 入力を促す文言を出力し、入力値をint型変数に代入させる
				System.out.print((i + 1) + "番の図形の種類（1・・・点／2・・・水平直線／3・・・垂直直線／4・・・長方形）：");
				inputMenu = standardInput.nextInt();
			} while (inputMenu <= 0 || inputMenu > 4);

			// 長さ、幅、高さを入力値から取得させるため、int型変数を定義
			int inputLength;
			int inputWidth;
			int inputHeight;

			// 図形の種類を1～4の入力値からそれぞれ分岐させるため、switch文を定義
			switch (inputMenu) {
			// 図形の種類1の分岐
			case 1:
				// 派生したPointクラスをインスタンス化
				shapeArray[i] = new Point();
				break;
			// 図形の種類2の分岐
			case 2:
				// 長さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したHorzLineクラスをインスタンス化し、引数に長さの入力値を定義
				shapeArray[i] = new HorzLine(inputLength);
				break;
			// 図形の種類3の分岐
			case 3:
				// 長さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("長さ：");
				inputLength = standardInput.nextInt();
				// 派生したVirtLineクラスをインスタンス化し、引数に長さの入力値を定義
				shapeArray[i] = new VirtLine(inputLength);
				break;
			// 図形の種類4の分岐
			case 4:
				// 幅の入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("幅　：");
				inputWidth = standardInput.nextInt();
				// 高さの入力を促す文言を出力し、入力値を変数に代入させる
				System.out.print("高さ：");
				inputHeight = standardInput.nextInt();
				// 派生したRentangleクラスをインスタンス化し、引数に幅と高さの入力値を定義
				shapeArray[i] = new Rectangle(inputWidth, inputHeight);
				break;
			}

		}

		// ShapeクラスのshapeArrayの全要素を出力させるため、拡張for文を定義
		for (Shape s : shapeArray) {
			// printメソッドで全要素を出力させる
			s.print();
			// 出力後、コンソール上で確認しやすいよう改行させる
			System.out.println();
		}

	}

}

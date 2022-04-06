/**
 * 
 * クラスDVDPlayerを利用するプログラム例を作成せよ。
 * 
 * 作成者：山下
 * 作成日：2021/12/18
 * 
 */

package E_14_03;

import java.util.Scanner;

public class E_14_03 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		System.out.print("選択肢（0：再生／1：停止／2：スロー再生）");

		int inputMenu = standardInput.nextInt();

		// DVDPlayerクラスをインスタンスする
		DVDPlayer dvdPlayerTest = new DVDPlayer();

		// インタフェースPlayer型のDVDPlayerをインスタンス化する
		Player playerTest = new DVDPlayer();

		// インタフェースExPlayer型のDVDPlayerをインスタンス化する
		ExPlayer exPlayerTest = new DVDPlayer();

		// 入力値によって処理を分岐させるため、switch文を定義する
		switch (inputMenu) {
		// 入力値が0の場合
		case 0:
			// 再生のplayメソッドを使用する
			dvdPlayerTest.play();
			break;
		// 入力値が1の場合
		case 1:
			// 停止のstopメソッドを使用する
			dvdPlayerTest.stop();
			break;
		// 入力値が2の場合
		case 2:
			// スロー再生のslowメソッドを使用する
			dvdPlayerTest.slow();
			break;

		}

		System.out.println("\n各インタフェース型のメソッド出力確認");
		
		// playerTestの再生と停止メソッドを使用した結果を確認する
		System.out.println("Player型");
		playerTest.play();
		playerTest.stop();

		// exPlayerTestの再生、停止、スロー再生メソッドを使用した結果を確認する
		System.out.println("ExPlayer型");
		exPlayerTest.play();
		exPlayerTest.stop();
		exPlayerTest.slow();

	}

}

/*
 * 前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
 * インスタンスを生成するたびに識別番号をnずつ増やして与える（nは正の数）。nの値は、指定されない限り1とするが、
 * メソッドを通じて取得・変更できるようにする。
 * たとえばインスタンスを3個生成した後にnを4に変更した場合、インスタンスに与える識別番号は生成順に1, 2, 3, 7, 11, 15 ・・・となる。
 * 
 * 作成者；山下
 * 作成日：2021/08/18
 * 
 */

package E_10_02;

import java.util.Scanner;

public class E_10_02 {

	public static void main(String[] args) {

		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);
				
		// ExIdクラスをまず3つインスタンス化する
		ExId testId1 = new ExId();
		ExId testId2 = new ExId();
		ExId testId3 = new ExId();
		
		//識別番号の入力を促す文言を出力
		System.out.print("識別番号：");
		
		//識別番号を入力値で代入させるため、int型変数に代入させる
		int inputValue = standardInput.nextInt();
		
		// インスタンスに与える識別番号を4に変更する
		ExId.changeN(inputValue);

		// ExIdクラスを3つインスタンス化する
		ExId testId4 = new ExId();
		ExId testId5 = new ExId();
		ExId testId6 = new ExId();

		// 各インスタンス化した値を調べるため、getExIdメソッドを使用し出力させる
		System.out.println("testId1の識別番号：" + testId1.getExId());
		System.out.println("testId2の識別番号：" + testId2.getExId());
		System.out.println("testId3の識別番号：" + testId3.getExId());
		System.out.println("testId4の識別番号：" + testId4.getExId());
		System.out.println("testId5の識別番号：" + testId5.getExId());
		System.out.println("testId6の識別番号：" + testId6.getExId());

		// それぞれ全てのインスタンスのcounter値を調べるため、出力させる
		System.out.println("ExId.counter = " + ExId.counter);
		System.out.println("testId1.counter = " + testId1.counter);
		System.out.println("testId2.counter = " + testId2.counter);
		System.out.println("testId3.counter = " + testId3.counter);
		System.out.println("testId4.counter = " + testId4.counter);
		System.out.println("testId5.counter = " + testId5.counter);
		System.out.println("testId6.counter = " + testId6.counter);
		System.out.println("MaxId = " + ExId.getMaxExId());

	}

}

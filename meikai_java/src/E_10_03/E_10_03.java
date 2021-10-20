
/*
 * 二値／三値／配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ。
 * 
 * 作成者：山下
 * 作成日：2021/08/19
 * 
 */

package E_10_03;

import java.util.Scanner;

public class E_10_03 {

	public static void main(String[] args) {
		
		//Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);
		
		//引数2つのminメソッドを使用するため、入力を促す文言を出力
		System.out.println("引数2つのminメソッドの引数値を入力してください。");

		//1つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("min(a, b) a：");
		int inputTwoMinA = standardInput.nextInt();
		
		//2つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("min(a, b) b：");
		int inputTwoMinB = standardInput.nextInt();
		
		//入力値をminメソッドの引数に定義し、結果を出力させる
		System.out.println("最小値：" + MinMax.min(inputTwoMinA, inputTwoMinB));
		
		//引数3つのminメソッドを使用するため、入力を促す文言を出力
		System.out.println("\n引数3つのminメソッドの引数値を入力してください。");
		
		//1つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("min(a, b, c) a：");
		int inputThreeMinA = standardInput.nextInt();
		
		//2つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("min(a, b, c) b：");
		int inputThreeMinB = standardInput.nextInt();
		
		//3つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("min(a, b, c) c：");
		int inputThreeMinC = standardInput.nextInt();
		
		//入力値をminメソッドの引数に定義し、結果を出力させる
		System.out.println("最小値：" + MinMax.min(inputThreeMinA, inputThreeMinB, inputThreeMinC));
		
		
		//引数2つのmaxメソッドを使用するため、入力を促す文言を出力
		System.out.println("\n引数2つのmaxメソッドの引数値を入力してください。");
		
		//1つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("max(a, b) a：");
		int inputTwoMaxA = standardInput.nextInt();
		
		//2つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("max(a, b) b：");
		int inputTwoMaxB = standardInput.nextInt();
		
		//入力値をmaxメソッドの引数に定義し、結果を出力させる
		System.out.println("最大値：" + MinMax.max(inputTwoMaxA, inputTwoMaxB));
		
		//引数3つのmaxメソッドを使用するため、入力を促す文言を出力
		System.out.println("\n引数3つのmaxメソッドの引数値を入力してください。");
		
		//1つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("max(a, b, c) a：");
		int inputThreeMaxA = standardInput.nextInt();

		//2つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("max(a, b, c) b：");
		int inputThreeMaxB = standardInput.nextInt();
		
		//3つ目の引数の入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("max(a, b, c) c：");
		int inputThreeMaxC = standardInput.nextInt();
		
		//入力値をmaxメソッドの引数に定義し、結果を出力させる
		System.out.println("最大値：" + MinMax.max(inputThreeMaxA, inputThreeMaxB, inputThreeMaxC));
		
		//配列を引数として取得するminArray,maxArrayメソッドを使用するため、生成した配列の要素数の入力を促す文言を出力
		System.out.println("\nminArrayとmaxArrayメソッドの配列を生成するため、要素数を入力してください。");
		
		//minArray,maxArrayメソッドを使用するための配列の要素を保持するint型配列を定義する
		int inputMinElement = 0;
		
		//要素数を入力するため、1以上の値が入力されるまで繰り返させる
		do {
			//要素数の入力を促す文言を出力し、入力値を変数に代入させる
			System.out.print("要素数:");
			inputMinElement = standardInput.nextInt();
		} while (inputMinElement <= 0);
		
		//minArray,maxArrayメソッドを使用するint型配列を生成し、要素数は入力値を定義する
		int[] testArray = new int[inputMinElement];
		
		//testArrayの要素数分繰り返すため、for文を定義する
		for(int i = 0; i < testArray.length; i++) {
			//各要素の入力を促す文言を出力し、入力値を要素に代入させる
			System.out.print("testArray[" + i + "] = ");
			testArray[i] = standardInput.nextInt();
		}
		//testArrayの最小値、最大値を求めた結果を出力させる
		System.out.println("testArrayの最小値 = " + MinMax.minArray(testArray));
		System.out.println("testArrayの最大値 = " + MinMax.maxArray(testArray));
				
	}

}

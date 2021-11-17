/**
 * ロボット型ペットクラスRobotPet(p.407)を拡張した、着せかえ可能なロボット型ペットクラスを作成せよ。
 * インタフェースSkinnableを実装すること。
 * 
 * 作成者：山下
 * 作成日：2021/11/17
 */

package E_14_02;

import java.util.Scanner;

public class E_14_02 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		System.out.print("ペットの名前：");
		
		//入力値をペットの名前としてString型変数に代入させる
		String inputPetName = standardInput.next();
		
		System.out.print("ペットの主人の名前：");
		
		//入力値をご主人の名前としてString型変数に代入させる
		String inputMasterName = standardInput.next();
		
		//Petクラスをインスタンス化する。引数に入力値を定義する
		Pet pet = new Pet(inputPetName, inputMasterName);
		
		//introduceメソッドを使用し、自己紹介を出力する
		pet.introduce();
		
		//　身体の色を変更するchangeSkinメソッドを使用する
		pet.changeSkin(9);

		System.out.print("ロボットの名前：");

		// 入力値をロボットの名前としてString型変数に代入させる
		String inputRobotName = standardInput.next();

		System.out.print("ロボットの主人の名前：");

		// 入力値をロボットのご主人の名前としてString型変数に代入させる
		String inputRobotMasterName = standardInput.next();

		// RobotPetクラスをインスタンスする。引数に各入力値の変数を定義する
		RobotPet robot = new RobotPet(inputRobotName, inputRobotMasterName);

		System.out.print("依頼する家事を選択してください。 0：掃除／1：洗濯／2：炊事  入力値：");

		// introduceメソッドを使用し、ロボットの自己紹介を出力する
		robot.introduce();

		// 家事の選択肢を入力値として取得するため、int型を変数し代入させる
		int inputWork = standardInput.nextInt();

		// workメソッドを使用し、家事を洗濯する
		robot.work(inputWork);

		// 機体の色を変更するchangeSkinメソッドを使用する
		robot.changeSkin(3);

	}

}

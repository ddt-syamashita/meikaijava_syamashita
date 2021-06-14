
/*
 * 名前・身長・体重などをメンバとしてもつ《人間クラス》を作成せよ。（フィールドやメソッドなどは自分で自由に設計すること）
 * 
 * 作成者：山下
 * 作成日：2021/05/31
 */

package E_8_01;

public class E_8_01 {

	public static void main(String[] args) {

		// Humanクラスを型に変数名tanakaをインスタンス化する
		Human tanaka = new Human();

		// Humanクラスを型に変数名jacksonをインスタンス化する
		Human jackson = new Human();

		// 1人目の人間クラスに情報を定義するため、各フィールドに対し値を代入させる
		tanaka.name = "田中太郎";
		tanaka.height = 170;
		tanaka.weight = 60;

		// 2人目の人間クラスに情報を定義するため、各フィールドに対し値を代入させる
		jackson.name = "マイケルジャクソン";
		jackson.height = 183;
		jackson.weight = 70;

		// 正常に代入させたことを確認するため、1人目の代入された各フィールドの値を出力する
		System.out.println("名前：" + tanaka.name);
		System.out.println("身長：" + tanaka.height + "cm");
		System.out.println("体重：" + tanaka.weight + "kg");

		// 正常に代入させたことを確認するため、2人目の代入された各フィールドの値を出力する
		System.out.println("名前：" + jackson.name);
		System.out.println("身長：" + jackson.height + "cm");
		System.out.println("体重：" + jackson.weight + "kg");

	}

}

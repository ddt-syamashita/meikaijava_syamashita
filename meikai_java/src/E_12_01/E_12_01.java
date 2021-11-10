/*
 * 総走行距離を表すフィールドと、その値を調べるメソッドを値化した自動車クラスを作成せよ。
 * 自動車クラスCar第2版(p.324)から派生すること。
 * 
 * 作成者：山下
 * 作成日：2021/09/11
 * 
 */

package E_12_01;

public class E_12_01 {

	public static void main(String[] args) {

		// 派生させた自動車クラスを引数にスペックを定義し、インスタンス化する
		ExtendCar car = new ExtendCar("アクア", 169, 155, 440, 40, new Day(2015, 8), 500);

		// 移動した文言を出力する
		System.out.println("一度目の移動");

		// 一度目の移動
		car.move(12.4, 15.9);

		// 自動車のスペックを出力させる
		car.putSpec();

		// 二度目に移動した文言を出力する
		System.out.println("二度目の移動");

		// 二度目の移動
		car.move(12.9, 10.3);

		// 自動車のスペックを出力させる
		car.putSpec();

		// 移動後の総走行距離を出力
		System.out.println("現在の走行距離：" + car.getTotalMileage() + "km");

	}

}

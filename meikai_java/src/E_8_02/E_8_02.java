/*
 * 自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ。
 * たとえば：タンク容量を表すフィールドを追加する／ナンバーを表すフィールドを追加する／
 * 燃費を表すフィールドを追加する／移動による燃料残量の計算に燃費を反映させる／給油のためのメソッドを追加する etc・・・。
 * 
 * 作成者：山下
 * 作成日：2021/05/10
 */

package E_8_02;

import java.util.Scanner;

class Car {
	// 車の名前を保持するフィールド
	private String name;
	// 車のナンバーを保持するフィールド
	private String namber;
	// 車のメーカーを保持するフィールド
	private String maker;
	// 車の排気量を保持するフィールド
	private String displacement;
	// 車の幅を保持するフィールド
	private int width;
	// 車の高さを保持するフィールド
	private int height;
	// 車の長さを保持するフィールド
	private int length;
	// 車の現在位置X座標を取得
	private double x;
	// 車の現在位置Y座標を取得
	private double y;
	// 車の残り燃料を保持するフィールド
	private double fuel;
	// 車のタンク容量を保持するフィールド
	private double tankCapacity;
	// 車の燃費を保持するフィールド
	private double gasMileage;

	// 引数として取得し、フィールドに代入させるため、引数ありのコンストラクタを定義する
	Car(String name, String namber, String maker, String displacement, int width, int height, int length, double fuel,
			double tankCapacity, double gasMileage) {
		// 取得した各引数を、フィールドに代入させる
		this.name = name;
		this.namber = namber;
		this.maker = maker;
		this.displacement = displacement;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.tankCapacity = tankCapacity;
		this.gasMileage = gasMileage;
		x = 0.0;
		y = 0.0;
	}

	/**
	 * 現在位置X座標を取得するメソッド
	 * 
	 * @return：現在位置X座標を返却する
	 */
	double getX() {
		return x;
	}

	/**
	 * 現在位置Y座標を取得するメソッド
	 * 
	 * @return：現在位置Y座標を返却する
	 */
	double getY() {
		return y;
	}

	/**
	 * 残りの燃料を取得するメソッド
	 * 
	 * @return：車の残り燃料を返却する
	 */
	double getFuel() {
		return fuel;
	}

	/**
	 * 給油前に残り燃料を初期化するためのメソッド
	 */
	void fuelClear() {
		fuel = 0.0;
	}

	/**
	 * 車の燃料を給油するためのメソッド
	 * 
	 * @param add：給油する値を引数として取得する
	 */
	void refueling(double add) {

		// 引数値が0より大きい場合
		if (add > 0) {
			// 給油し燃料を増やすため、引数で取得した値を残り燃料の変数に加算する
			fuel += add;
			// タンク容量より残り燃料が多い場合
			if (fuel > tankCapacity) {
				// タンク容量の最大値として、残り燃料に代入させる
				fuel = tankCapacity;
			}
		}
	}

	/**
	 * 車のスペックを出力するメソッド
	 */
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("ナンバー：" + namber);
		System.out.println("メーカー：" + maker);
		System.out.println("排気量：" + displacement + "cc");
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
		System.out.println("燃料タンク：" + tankCapacity + " リットル");
		System.out.println("燃費：" + gasMileage + "km／リットル");
	}

	/**
	 * 車の移動距離を求めるメソッド
	 * 
	 * @param dx：X軸の移動距離を取得
	 * @param dy：Y軸の移動距離を取得
	 * @return：移動判定フラグを返却する
	 */
	boolean move(double dx, double dy) {
		// 移動距離を引数で取得した値で算出させ、double型変数に代入させる
		double distance = Math.sqrt(dx * dx + dy * dy);

		// 燃費を求めるため、仮のdouble型変数を定義し、移動距離と入力された車の燃費と割り算し、代入させる
		double gasMileageTemporary = distance / gasMileage;

		// 車の残り燃料が移動距離よりも小さい場合
		if (distance > fuel) {
			// 燃料が不足し移動できないため、falseを返却する
			return false;
			// 移動距離に対し、残り燃料が多い場合
		} else {
			// 移動距離の値分、残り燃料を減算する
			fuel -= gasMileageTemporary;
			// 現在位置X座標を保持する変数に対し、引数dxの値を加算する
			x += dx;
			// 現在位置Y座標を保持する変数に対し、引数dyの値を加算する
			y += dy;

			// 判定として、移動成功したため、trueを返却する
			return true;
		}
	}

}

public class E_8_02 {

	public static void main(String[] args) {

		// Scannerクラスをインスタンス化
		Scanner standardInput = new Scanner(System.in);

		// 車情報の入力を促す文言を出力する
		System.out.println("車情報を入力してください。");

		// 各情報に対し、入力を促す文言を出力し、入力値を変数に代入させる
		System.out.print("名前：");
		String inputName = standardInput.next();

		System.out.print("ナンバー：");
		String inputNumber = standardInput.next();

		System.out.print("メーカー：");
		String inputMaker = standardInput.next();

		System.out.print("排気量：");
		String inputDisplacement = standardInput.next();

		System.out.print("車幅：");
		int inputWidth = standardInput.nextInt();

		System.out.print("車高：");
		int inputHeight = standardInput.nextInt();

		System.out.print("車長：");
		int inputLength = standardInput.nextInt();

		System.out.print("残ガソリン量：");
		double inputFuel = standardInput.nextDouble();

		System.out.print("タンク容量：");
		double inputTankCapacity = standardInput.nextDouble();

		System.out.print("燃費：");
		double inputGasMileage = standardInput.nextDouble();

		// Carクラスをインスタンス化し、入力値を各引数に定義する
		Car myCar = new Car(inputName, inputNumber, inputMaker, inputDisplacement, inputWidth, inputHeight, inputLength,
				inputFuel, inputTankCapacity, inputGasMileage);

		// 車情報のスペックを表示する
		System.out.println("-------------------");
		System.out.println("入力された車の情報");
		myCar.putSpec();
		System.out.println("-------------------");

		// 車の移動距離を入力し、燃料が足りなくなるまで繰り返し処理を行うため、while文を定義する
		while (true) {
			// 現在位置、残り燃料などを出力させる
			System.out.println("現在値(" + myCar.getX() + ", " + myCar.getY() + ") \n残り燃料：" + myCar.getFuel() + " リットル");
			System.out.print("車で移動しますか？【1・・・Yes／0・・・No】：");
			// 移動の質問に対し、0が入力された場合、
			if (standardInput.nextInt() == 0) {
				// 繰り返し処理を終了させる
				break;
			}

			// X方向の移動距離の入力を促す文言を出力し、入力値をdouble型変数に代入させる
			System.out.print("X方向の移動距離：");
			double dx = standardInput.nextDouble();

			// Y方向の移動距離の入力を促す文言を出力し、入力値をdouble型変数に代入させる
			System.out.print("Y方向の移動距離：");
			double dy = standardInput.nextDouble();

			// moveメソッドが燃料が足りない処理に入り、falseだった場合
			if (!myCar.move(dx, dy)) {
				// 燃料が足りなくなった旨の文言を出力する
				System.out.println("燃料が足りません。\n");

				// 給油する・しないの入力を促す文言を出力
				System.out.print("給油しますか？【1・・・Yes／0・・・No】：");

				// 0が入力された場合
				if (standardInput.nextInt() == 0) {
					System.out.print("車の移動を終了します。");
					// 繰り返し処理を終了させる
					break;
				}

				// 給油する際、元々の残り燃料を初期化するため、fuelClearメソッドを呼び出す。
				myCar.fuelClear();
				
				// 給油量の入力を促す文言を出力し、入力値を給油メソッドの引数に定義させる
				System.out.print("燃料の給油量：");
				myCar.refueling(standardInput.nextDouble());
			}
		}

	}

}

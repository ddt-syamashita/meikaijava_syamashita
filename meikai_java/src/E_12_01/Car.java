package E_12_01;

public class Car {
	// 車の名前を保持するフィールド
	private String name;
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
	// 車の購入日を保持するフィールド
	private Day purchaseDay;

	// 引数として取得し、フィールドに代入させるため、引数ありのコンストラクタを定義する
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		// 取得した各引数を、フィールドに代入させる
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.purchaseDay = new Day(purchaseDay);
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
	 * 購入日を取得するメソッド
	 * @return:購入日を返却
	 */
	public Day getPurchaseDay() {
		return purchaseDay;
	}

	/**
	 * 車のスペックを出力するメソッド
	 */
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
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

		// 車の残り燃料が移動距離よりも小さい場合
		if (distance > fuel) {
			// 燃料が不足し移動できないため、falseを返却する
			return false;
			// 移動距離に対し、残り燃料が多い場合
		} else {
			// 移動距離の値分、残り燃料を減算する
			fuel -= distance;
			// 現在位置X座標を保持する変数に対し、引数dxの値を加算する
			x += dx;
			// 現在位置Y座標を保持する変数に対し、引数dyの値を加算する
			y += dy;

			// 判定として、移動成功したため、trueを返却する
			return true;
		}
	}
}

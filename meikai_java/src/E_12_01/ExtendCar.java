package E_12_01;

class ExtendCar extends Car {

	// 総走行距離を保持するため、double型変数を定義
	private double totalMileage;

	// コンストラクタを定義
	public ExtendCar(String name, int width, int height, int length, double fuel, Day purchaseDay,
			double totalMileage) {
		// スーパークラスのコンストラクタを定義
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}

	/**
	 * 総走行距離を取得するメソッド
	 * 
	 * @return 総走行距離の値を返却
	 */
	public double getTotalMileage() {
		// フィールドに定義されている総走行距離の値を返却
		return this.totalMileage;
	}

	/**
	 * 車のスペックを出力するメソッド
	 */
	public void putSpec() {
		super.putSpec();
		System.out.println("購入日：" + getPurchaseDay());
		System.out.println("総走行距離：" + totalMileage + "km");
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
		if (!super.move(dx, dy)) {

			System.out.println("燃料が足りません。");
			// 燃料が不足し移動できないため、falseを返却する
			return false;
			// 移動距離に対し、残り燃料が多い場合
		} else {
			// 移動距離の値分、総走行距離を加算する
			totalMileage += distance;

			System.out.println("自動車で移動しました。");
			// 判定として、移動成功したため、trueを返却する
			return true;
		}
	}
}
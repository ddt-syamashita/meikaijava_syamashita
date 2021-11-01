package E_14_01;

public class Parallelogram extends Shape implements Plane2D {

	// 幅の値を保持する変数を定義
	private int width;

	// 高さの値を保持する変数を定義
	private int height;

	// インスタンス化する際、値を取得するため、2つの引数持つコンストラクタを定義
	public Parallelogram(int width, int height) {
		// フィールド変数widthに引数widthの値を代入させる
		this.width = width;
		// フィールド変数heightに引数heightの値を代入させる
		this.height = height;
	}

	/**
	 * width,heightの値の文字列表現を返却するメソッド
	 * 
	 * @return：width,heightの値の文字列
	 */
	public String toString() {
		// フィールド変数の値を文字列として返却する
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	/**
	 * 図形を描画売るメソッド
	 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= width; j++) {
				System.out.print('#');
			}
			System.out.println();
		}
	}

	/**
	 * 面積を求めるメソッド
	 * 
	 * @return：面積の値を返却する
	 */
	public int getArea() {
		return width * height;
	}
}

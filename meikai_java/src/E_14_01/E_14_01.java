
/**
 * ここに示した図形クラス群を利用するプログラム例を作成せよ。
 * 
 * 作成者：山下
 * 作成日：2021/11/1
 * 
 */

package E_14_01;

public class E_14_01 {

	public static void main(String[] args) {

		// 2次元インタフェースを利用するため、長方形を生成するRetangleクラスをインスタンス化
		Plane2D testRectangle = new Rectangle(2, 6);

		// 2次元インタフェースを利用するため平行四辺形を生成するParallelogramクラスをインスタンス化
		Plane2D testParallelogram = new Parallelogram(4, 6);

		// 図形クラス群の利用例としてtestRectangleの面積を出力するため、getAreaメソッドから値を取得する
		System.out.println("testRectangleの面積= " + testRectangle.getArea());

		// 図形クラス群の利用例としてtestParallelogramの面積を出力するため、getAreaメソッドから値を取得する
		System.out.println("testParallelogramの面積= " + testParallelogram.getArea());
	}

}

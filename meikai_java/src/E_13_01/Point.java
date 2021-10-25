package E_13_01;

/**
 * クラスPointは、点を表すクラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * フィールドはありません。
 * @author 柴田望洋
 * @see Shape
 *
 */
public class Point extends Shape {
	
	/**
	 * 点を生成するコンストラクタです。
	 * 受け取る引数はありません。
	 */
	public Point() {
		
	}
	
	/**
	 * メソッドtoStringは、点に関する図形情報を表す文字列を返却します。
	 * 返却する文字列は、常に"Point"です。
	 * @return：文字列"Point"を返却します。
	 */
	public String toString() {
		return "Point";
	}
	
	/**
	 * メソッドdrawは、点を描画するメソッドです。
	 * プラス記号'+'を1個だけ表示して改行します。
	 */
	public void draw() {
		System.out.println('+');
	}
}

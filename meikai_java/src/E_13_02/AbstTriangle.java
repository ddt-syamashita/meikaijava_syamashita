package E_13_02;

/**
 * 直角二等辺三角形を表す抽象クラス
 * 
 * @author s.yamashita
 * @see Shape
 *
 */
public abstract class AbstTriangle extends Shape {

	/**
	 * 直線の長さを表すint型のフィールドです。
	 */
	private int length;

	/**
	 * 直線を生成するコンストラクタです。 長さを引数として受け取ります。
	 * 
	 * @param：length 生成する直線の長さ。
	 */
	public AbstTriangle(int length) {
		setLength(length);
	}
	
	/**
	 * 直線の長さを取得します。
	 * @return：直線の長さ。
	 */
	public int getLength() {
		return length;
	}

	/**
	 * 直線の長さを設定します。
	 * 
	 * @param length 設定する直線の長さ。
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * メソッドtoStringは、直線に関する図形情報を表す文字列を返却します。
	 * 
	 * @retun 文字列"AbstLine(length:3"を返却します。3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "AbstTriangle(length：" + length + ")";
	}

}

package E_13_02;

/**
 * 左下が直角の二等辺三角形を表すクラス
 * 
 * @author s.yamashita
 * @see AbstTriangle
 *
 */
public class TriangleLeftBorder extends AbstTriangle {

	/**
	 * 直線の長さを表すint型のフィールドです。
	 */
	private int length;

	/**
	 * 直線を生成するコンストラクタです。 長さを引数として受け取ります。
	 * 
	 * @param：length 生成する直線の長さ。
	 */
	public TriangleLeftBorder(int length) {
		super(length);
	}
	
	/**
	 * メソッドtoStringは、左下が直角の二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @retun 文字列"TraiangleLeftBorder(length:3)"を返却します。3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "TraiangleLeftBorder(length：" + getLength() + ")";
	}

	/**
	 * 左下が直角の二等辺三角形を描画する
	 */
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}

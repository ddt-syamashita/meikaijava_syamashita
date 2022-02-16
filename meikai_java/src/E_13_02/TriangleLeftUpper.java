package E_13_02;

/**
 * 右上が直角の二等辺三角形を表すクラス
 * 
 * @author s.yamashita
 * @see AbstTriangle
 *
 */
public class TriangleLeftUpper extends AbstTriangle {

	/**
	 * 直線を生成するコンストラクタです。 長さを引数として受け取ります。
	 * 
	 * @param：length 生成する直線の長さ。
	 */
	public TriangleLeftUpper(int length) {
		super(length);
	}
	
	/**
	 * メソッドtoStringは、右上が直角の二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @retun 文字列"TraiangleLeftUpper(length:3)"を返却します。3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "TraiangleLeftUpper(length：" + getLength() + ")";
	}


	/**
	 * 右上が直角の二等辺三角形を描画する
	 */
	public void draw() {
		for(int i = getLength(); i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}

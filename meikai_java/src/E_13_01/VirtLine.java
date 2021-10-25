package E_13_01;

/**
 * クラスVirtLineは垂直直線を表すクラスです。
 * このクラスは、直線を表す抽象クラスAbstLineから派生したクラスです。
 * @author 柴田望洋
 * @see Shape
 * @see AbstLine
 *
 */
public class VirtLine extends AbstLine {

	/**
	 * 垂直直線を生成するコンストラクタです。
	 * 長さを引数として受け取ります。
	 * @param length：生成する直線の長さ。
	 */
	public VirtLine(int length) {
		super(length);
	}
	
	/**
	 * メソッドtoStringは、垂直直線に関する図形情報を表す文字列を返却します。
	 * @return：文字列"VirtLine(length:3)"を返却します。3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "VirtLine(length:" + getLength() + ")";
	}
	
	/**
	 * メソッドdrawは、水平直線を描画します。 描画は、縦線記号'|'を縦に並べることによって行います。 長さの個数だけ'|'を表示して改行するのを繰り返します。
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			System.out.println('|');
		}
	}


}

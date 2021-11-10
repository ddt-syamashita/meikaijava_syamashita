/*
 * List 10-12(p.356)のクラスDateIdをパッケージIdに所属させるように書き換えよ。
 * なお、クラスDateIdTesterは無名パッケージに所属させること。
 * 
 * 作成者：山下
 * 作成日：2021/09/05
 * 
 */

package E_11_01;

import E_11_01.id.DateId;

public class DataIdTester {

	public static void main(String[] args) {

		// DateIdを3つ分インスタンス化する
		DateId dateA = new DateId();
		DateId dateB = new DateId();
		DateId dateC = new DateId();

		// インスタンス化した各識別番号をgetIdメソッドから出力させる
		System.out.println("dateAの識別番号：" + dateA.getId());
		System.out.println("dateBの識別番号：" + dateB.getId());
		System.out.println("dateCの識別番号：" + dateC.getId());

	}

}

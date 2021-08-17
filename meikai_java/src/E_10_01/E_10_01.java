/*
 * List 10-3 (p.340)に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ。
 *   static int getMaxId()
 * なお、このメソッドは、インスタンスをn個生成した時点で呼び出すとnを返すことになる。
 * 
 * 作成者：山下
 * 作成日：2021/08/17
 */

package E_10_01;

public class E_10_01 {

	public static void main(String[] args) {

		// 識別番号を確認するため、Idクラスを2つインスタンス化する
		Id testId1 = new Id();
		// 識別番号が2番とさせるため、Idクラスをインスタンス化
		Id testId2 = new Id();

		System.out.println("testId1の識別番号：" + testId1.getId());
		System.out.println("testId2の識別番号：" + testId2.getId());

		// getMaxIdメソッドを使用し、最後に付与された識別番号を出力させる
		System.out.println("最後に付与された識別番号：" + Id.getMaxId());

	}

}

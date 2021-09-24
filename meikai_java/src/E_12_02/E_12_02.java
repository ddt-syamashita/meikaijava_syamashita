/*
 * 定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計金額を
 * 比較した結果を返却するメソッドcomBalanceを作成せよ。
 *   static int comBalance(Account a, Account b)
 * 合計額を比較して、aのほうが多ければ1、等しければ0、bのほうが多ければ-1を返却すること。
 * もしaやbの参照先が、定期預金をもたないAccount型のインスタンスであれば、普通預金の金額を比較対象とすること。
 * 
 * 作成者：山下
 * 作成日：2021/09/24
 * 
 */

package E_12_02;

public class E_12_02 {

	public static void main(String[] args) {

		// 2つの定期預金付き銀行口座クラスをインスタンス化する
		TimeAccount accountA = new TimeAccount("田中太郎", "101", 500000, 20000);

		System.out.println(accountA);

		TimeAccount accountB = new TimeAccount("山田太郎", "102", 500000, 25000);

		System.out.println(accountB);

		// 比較結果を出力させるため、普通預金と定期預金の合計を比較するメソッドの結果をint型変数に代入させる
		int result = TimeAccount.comBalance(accountA, accountB);

		// 比較結果によって、文言を分岐して出力する
		System.out.println("普通預金と定期預金の合計額を比較します。");
		if (result == 0) {
			System.out.println("比較結果：accountAとaccountBの合計額は等しいです。");
		} else if (result == 1) {
			System.out.println("比較結果：accountAのほうが合計額が多いです。");
		} else {
			System.out.println("比較結果：accountBのほうが合計額が多いです。");
		}
	}

}

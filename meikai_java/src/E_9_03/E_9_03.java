/*
 * 第8章で作成した≪銀行口座クラス（第2版）≫に、口座開設日のフィールドとtoStringメソッドを追加せよ。
 * 
 * 作成者：山下
 * 作成日：2021/07/09
 * 
 */

package E_9_03;

public class E_9_03 {

	public static void main(String[] args) {
		
		//Accountクラスをインスタンス化する
		Account myBank = new Account("田中達也", "123456", 500000, new Day(2021, 5, 21));
		
		//預金に2000円を入金する
		myBank.deposit(2000);
		
		//口座情報を出力する
		System.out.println(myBank.toString());

	}

}

/*
 * インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、銀行口座クラスAccountを変更せよ。
 * 表示はインスタンス初期化子で行うこと。
 * 
 * 作成者：山下
 * 作成日：2021/09/04
 * 
 */

package E_10_05;

public class E_10_05 {

	public static void main(String[] args) {
		// Accountクラスをインスタンス化する
		Account myBank = new Account("田中達也", "123456", 500000, new Day(2021, 6, 16));

		// 預金に2000円を入金する
		myBank.deposit(2000);

		// 口座情報を出力する
		System.out.println(myBank.toString());

		// Accountクラスをインスタンス化する
		Account myBank2 = new Account("山田太郎", "1234567788", 80000, new Day(2021, 6, 16));

		// 預金に2000円を入金する
		myBank2.withdraw(3000);

		// 口座情報を出力する
		System.out.println(myBank2.toString());

	}

}

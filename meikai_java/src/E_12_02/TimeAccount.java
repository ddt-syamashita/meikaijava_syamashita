package E_12_02;

public class TimeAccount extends Account {
	//預金残高（定期預金）
	private long timeBalance;

	//コンストラクタを定義
	TimeAccount(String name, String no, long balance, long timeBalance){
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	/**
	 * 定期預金の残高を取得するメソッド
	 * @return：定期預金の値を返却
	 */
	long getTimeBalance() {
		return timeBalance;
	}
	
	/**
	 * 定期預金を解約して全額を普通預金に移すメソッド
	 * @param k：定期預金の残高を取得
	 */
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
	/**
	 * 普通預金と定期預金の残高を取得し、合計額を比較後、結果をint型で返却する
	 * @param a：定期預金付き銀行口座クラスを取得
	 * @param b：比較対象の定期預金付き銀行口座クラスを取得
	 * @return：比較結果を返却
	 */
	static int comBalance(TimeAccount a, TimeAccount b) {
		
		//比較結果を返却するため、変数を定義
		int result;
		
		long totalBalanceA = a.getBalance() + a.getTimeBalance();
		long totalBalanceB = b.getBalance() + b.getTimeBalance();

		
		//aとbの合計額が等しい場合
		if(totalBalanceA == totalBalanceB) {
			result = 0;
		//aの合計額が多い場合
		} else if(totalBalanceA > totalBalanceB) {
			result = 1;
		//bの合計額が多い場合
		} else {
			result = -1;
		}
		
		//比較結果が代入されたresult変数を返却する
		return result;
		
	}
	
	/**
	 * 文字列表現を返却させる
	 */
	public String toString() {
		return String.format("口座名義：%s\n口座番号：%s\n預金残高(普通預金)：%d\n預金残高(定期預金)：%d\n", getName(), getNo(), getBalance(), timeBalance);
	}
	
}

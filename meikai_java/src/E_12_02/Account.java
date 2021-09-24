package E_12_02;

public class Account {

	// 何番まで識別番号を与えたか
	private static int counter = 0;

	// 口座名義
	private String name;

	// 口座番号
	private String no;

	// 預金残高（普通預金）
	private long balance;

	//預金残高（定期預金）
	private long timeBalance;
	
	//識別番号
	int id;
	
	
	
	//インスタンス初期化子
	{
		//インスタンスが生成されるたびに識別番号をインクリメントする
		id = ++counter;
		//指定された文言をインスタンスが生成されるたびに出力させる
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	// コンストラクタを定義
	Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	/**
	 * 口座名義を調べるためフィールド変数nameを返却させるメソッド
	 * 
	 * @return：口座名義を返却
	 */
	public String getName() {
		return name;
	}

	/**
	 * 口座番号を調べるため、フィールド変数noを返却させるメソッド
	 * 
	 * @return：口座番号を返却
	 */
	public String getNo() {
		return no;
	}

	/**
	 * 預金残高を調べるため、フィールド変数balanceを返却させるメソッド
	 * 
	 * @return：預金残高を返却
	 */
	public long getBalance() {
		return balance;
	}
	
	/**
	 * 識別番号を取得するメソッド
	 * @return：識別番号を返却する
	 */
	public int getId() {
		return id;
	}

	/**
	 * 引数の値分、預金残高に値を加算する
	 * 
	 * @param k：預金する値を取得する
	 */
	public void deposit(long k) {
		balance += k;
	}

	/**
	 * 引数の値分、預金残高に値を減算する
	 * 
	 * @param k：預金残高から引き出す値を取得する
	 */
	public void withdraw(long k) {
		balance -= k;
	}

	/**
	 * 文字列表現を返却させる
	 */
	public String toString() {
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n識別番号：%s\n", name, no, balance, id);
	}
}

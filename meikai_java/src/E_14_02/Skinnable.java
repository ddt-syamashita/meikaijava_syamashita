package E_14_02;

/*
 * 着せ替えインタフェース
 */
public interface Skinnable {
	
	// 黒色
	int BLACK = 0;
	//赤色
	int RED = 1;
	//緑
	int GREEN = 2;
	//青
	int BLUE = 3;
	// 豹柄
	int LEOPARD = 4;
	// 茶色
	int BROWN = 5;
	//銀色
	int SILVER = 6;
	// 白色
	int WHITE = 7;
	
	/**
	 * スキンを変更するメソッド
	 */
	void changeSkin(int skin);
}

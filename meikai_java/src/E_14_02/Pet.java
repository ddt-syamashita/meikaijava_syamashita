package E_14_02;

public class Pet implements Skinnable{
	
	// ペットの名前を保持する変数を定義
	private String name;
	
	//飼い主の名前を保持する変数を定義
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	/**
	 * ペットの名前を返却するメソッド
	 * @return：ペットの名前を返却
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 飼い主の名前を返却するメソッド
	 * @return：飼い主の名前を返却
	 */
	public String getMasterName() {
		return masterName;
	}
	
	/**
	 * 自己紹介を出力するメソッド
	 */
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！");
		System.out.println("■ご主人様は" + masterName + "です！");
	}
	
	/**
	 * スキンを変更するメソッド
	 */
	public void changeSkin(int skin) {
		System.out.print("身体の色を ");
		switch (skin) {
		case BLACK:
			System.out.print("黒色ボディ");
			break;
		case RED:
			System.out.print("赤色ボディ");
			break;
		case GREEN:
			System.out.print("緑色ボディ");
			break;
		case BLUE:
			System.out.print("青色ボディ");
			break;
		case LEOPARD:
			System.out.print("豹柄ボディ");
			break;
		case BROWN:
			System.out.print("茶色ボディ");
			break;
		case SILVER:
			System.out.print("銀色ボディ");
			break;
		case WHITE:
			System.out.print("白色ボディ");
			break;
		default:
			System.out.print("無色ボディ");
			break;
		}
		System.out.println("に変更しました。");
	}

}

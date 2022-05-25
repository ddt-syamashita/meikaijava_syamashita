package E_14_02;

public class RobotPet extends Pet implements Skinnable {

	// コンストラクタを定義
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	/**
	 * 自己紹介を出力するメソッド
	 */
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	/**
	 * 家事をするメソッド
	 * 
	 * @param sw：家事を指定する値
	 */
	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("掃除します。");
			break;
		case 1:
			System.out.println("洗濯します。");
			break;
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}

	/**
	 * スキンを変更するメソッド
	 * 
	 * @param skin：色を指定する値 
	 * 
	 */
	public void changeSkin(int skin) {
		System.out.print("ロボットのボディ色を ");
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
		System.out.println(" に変更しました。");
	}

}

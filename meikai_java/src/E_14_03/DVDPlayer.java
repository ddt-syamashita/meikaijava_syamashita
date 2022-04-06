package E_14_03;

public class DVDPlayer implements ExPlayer {

	//再生メソッド
	public void play() {
		System.out.println("■DVD再生開始！");
	}

	//停止メソッド
	public void stop() {
		System.out.println("■DVD再生終了！");
	}

	//スロー再生メソッド
	public void slow() {
		System.out.println("■DVDスロー再生開始！");
	}
	
	

}

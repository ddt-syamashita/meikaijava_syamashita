
/*
 * ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ。そのクラスから、以下のクラスを派生すること
 * 
 * ・人間プレーヤクラス（出す手をキーボードから読み込む）
 * ・コンピュータプレーヤクラス（出す手を乱数で生成する）
 * 
 * 作成者：山下
 * 作成日：2021/10/31
 * 
 */

package E_13_03;

public class E_13_03 {

	public static void main(String[] args) {

		System.out.println("ジャンケンをはじめます。出す手を選んでください。");

		// 人間プレーヤクラスをインスタンス化する。出す手の値を引数に定義する。
		HumanPlayer human = new HumanPlayer();

		// コンピュータクラスをインスタンス化する。出す手の値を引数に定義する。
		ComputerPlayer computer = new ComputerPlayer();

		// resultHandメソッドを使用し、出した手の値をhumanHand変数に代入する
		int humanHand = human.resultHand();
		
		// resultHandメソッドを使用し、出した手の値をcomputerHand変数に代入する
		int computerHand = computer.resultHand();


		// プレーヤの出した手の文言を出力する
		System.out.println("あなた：" + human.getHand());

		// コンピュータの出した手の文言を出力する
		System.out.println("コンピュータ：" + computer.getHand());

		// じゃんけんの勝敗判定を行うため、判定変数を定義する
		int resultJudge = (humanHand - computerHand + 3) % 3;

		// じゃんけんの結果を表示させるため、文言を出力する
		System.out.print("じゃんけんの結果：");

		//　resultJudgeに代入された判定結果を0～2の値によって、分岐させるためswitch文を定義する
		switch (resultJudge) {
		//resultJudge変数の値が0の場合
		case 0:
			//あいこの文言を出力する
			System.out.println("あいこです。");
			break;
		//resultJudge変数の値が1の場合
		case 1:
			System.out.println("あなたの負けです。");
			break;
		//resultJudge変数の値が2の場合
		case 2:
			System.out.println("あなたの勝ちです！");
			break;
		}
	}

}

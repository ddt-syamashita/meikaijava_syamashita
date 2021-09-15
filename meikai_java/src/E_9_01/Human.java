package E_9_01;

public class Human {
	// 人間クラスの名前を定義する
	String name = "";
	// 人間クラスの身長を定義する
	int height = 0;
	// 人間クラスの体重を定義する
	int weight = 0;

	// 名前、身長、体重の変数に代入させるため、引数ありのコンストラクタを定義する
	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}

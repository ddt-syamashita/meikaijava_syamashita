
/**
 * コマンドライン引数で与えられた実数値をすべて合計した値を表示するプログラムを作成せよ。
 * 拡張for文を用いて実現すること。
 * 
 * 作成者：山下
 * 作成日：2022/2/16
 * 
 */

package E_15_07;

public class E_15_07 {

	public static void main(String[] args) {
		
		//合計値を代入させるdouble型変数を定義する
		double sum = 0.0;
		
		//拡張for文で、コマンドライン引数で与えられた値分繰り返す
		for(String argumentValue : args) {
			//コマンドライン引数で与えられた値をsumの変数に加算する
			sum += Double.parseDouble(argumentValue);
		}
		//合計を出力する
		System.out.println("コマンドライン引数の合計：" + sum);
	}

}

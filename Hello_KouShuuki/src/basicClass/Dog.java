package basicClass;

public class Dog {
	
	//Q1 動物の名前の変数
	String name;//動物の名前
	
	//Q2 動物の数の変数
	int number;//動物の数
	
	//Q3 Q1で作成した変数に「犬」を代入するコンストラクタを作成
	//コンストラクタ1：「犬」を代入
	public Dog() {
		this.name = "犬";
	}
	
	//Q4 Q2で作成した変数に引数を代入するコンストラクタを作成
	//コンストラクタ2：動物の数を引数で受け取って代入
	public Dog(int number) {
		this.number = number;
	}
	
//	//合体例
//	public Dog(String name, int number) {
//		this.name = name;
//	    this.number = number;
//	}
}

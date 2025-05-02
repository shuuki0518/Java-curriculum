package java1_30;

public class Person {
      //インスタンスフィールド
	  String name;
	  int age;
	  double height;
	  double weight;

	  //人数カウント用 static フィールド
	  static int count = 0;

	  //コンストラクタ
	  public Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;

	    count++;
	  }
	  
	  //BMI計算メソッド
	  public double bmi() {
		  double rawBmi = this.weight / (this.height * this.height);
		  return Math.floor(rawBmi);//小数第2位に四捨五入
	  }

	  //情報出力メソッド
	  public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.println("BMIは" + this.bmi() + "です");
	  }
}

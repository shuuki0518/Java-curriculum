package java1_31;

public class Person {
	
	//インスタンスフィールド（個々の人の情報）
    public String name;
    public int age;
    public double height;
    public double weight;

    //クラスフィールド（全インスタンスで共通の変数）
    //すべてのPersonオブジェクトで共有される変数 count を宣言（初期値0）
    public static int count = 0;

    //コンストラクタ（Person オブジェクトを作成する際に呼ばれる）
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        //オブジェクトが作られるたびに count を1増やす
        count++;
    }

    //BMI（体格指数）を計算するメソッド
    public double bmi() {
        return this.weight / this.height / this.height;
    }

    //オブジェクトの情報を出力するメソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
    }

    //クラスメソッド（クラスに対して呼び出す static メソッド）
    public static void printCount() {
        //クラスフィールド count を使って人数を出力
        System.out.println("合計" + count + "人です");
    }

}

package java1_31;

public class Main {

	public static void main(String[] args) {
		
		//Personオブジェクトの生成（ここで count が 1 増える）
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
        person1.print();

        //2人目のPerson（ここでさらに count が 1 増える）
        Person person2 = new Person("山田花子", 22, 1.5, 40);
        person2.print();

        //クラスフィールド count を直接使って人数を出力
        System.out.println("合計" + Person.count + "人です");

        //クラスメソッドを呼び出して人数を出力
        Person.printCount();
	}

}

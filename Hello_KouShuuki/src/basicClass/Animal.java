package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Animal {

	public static void main(String[] args) {
		
        //Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Dog dog1 = new Dog();
		System.out.println("動物の名前 : " + dog1.name);
		
        //Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
		Dog dog2 = new Dog(3);// ex)3匹
		System.out.println("動物の名前 : " + dog2.number);
		
		//現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"));
		System.out.println("現在の日時 : " + now);

	}

}

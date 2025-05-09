package java1_33;

import java1_33.Person;

//java1.32の一部流用。
public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		//CarとBicycleのインスタンスを作成
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        
        //person1がcarを購入する
        person1.buy(car);

        //person2がbicycleを購入する
        person2.buy(bicycle);

//        //購入後の所有者を表示
//        System.out.println("carの所有者: " + car.getOwner());
//        System.out.println("bicycleの所有者: " + bicycle.getOwner());
		
	}

}

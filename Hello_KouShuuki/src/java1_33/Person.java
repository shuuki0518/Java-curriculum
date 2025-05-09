package java1_33;

//java1.32の一部流用
public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private double height;
    private double weight;

    //コンストラクタ
    public Person(String lastName, String firstName, int age, double height, double weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //フルネーム
    public String fullName() {
        return this.lastName + " " + this.firstName;
    }
    
    //車の購入処理
    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "がCarを購入しました");
    }
    
    //自転車の購入処理
    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "がBicycleを購入しました");
    }
}

package java1_23;

public class capsule {
	
	//フィールド
	private String name;
	private double length;
	private int speed;
	
	//コンストラクタ
	public capsule(String name, double length, int speed) {
		
		this.name = name;
		this.length = length;
		this.speed = speed;
		
	}
	
	//setter
	public void setName(String name) {
		
		this.name = name;
		
	}
	public void setLength(double length) {
		
		this.length = length;
		
	}
	public void setSpeed(int speed) {
		
		this.speed = speed;
		
	}
	
	//getter
	public String getName() {
		
		return this.name;
		
	}
	public double getLength() {
		
		return this.length;
		
	}
	public int getSpeed() {
		
		return this.speed;
		
	}
	
	//main
	public static void main(String[] args) {
		
		//動物のオブジェクトを生成
		capsule lion = new capsule("ライオン", 2.1, 80);
		
		//出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
		
	}

}

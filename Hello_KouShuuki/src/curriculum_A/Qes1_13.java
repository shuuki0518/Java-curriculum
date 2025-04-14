package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		//1
		//バイト型　短整数型　整数型　長整数型
		byte Byte;
		short Short;
		int Int;
		long Long;

		//単精度浮動小数点数型　倍精度浮動小数点数型
		float Float;
		double Double;

		//文字型　文字列型
		char Char;
		String string; 

		//ブーリアン型
		boolean bool;
		
		//2
		//初期値入力
		Byte = 0;
		Short = 0;
		Int = 0;
		Long = 0L;
		Float = 0.0f;
		Double = 0.0d;
		Char = '\u0000';
		string = null; 
		bool = false;
		
		//3
		//初期値から代入
		Byte = 10;
		Short = 100;
		Int = 1000;
		Long = 10000;
		Float = 9.5f;
		Double = 10.5;
		Char = 'a';
		string = "ハロー"; 
		bool = true;

		//4
		//コンソール出力
		//11110
		System.out.println("4.コンソール出力");
		long all = Byte + Short + Int + Long;
		System.out.println(all);

		//20
		double shou = Float + Double;
		System.out.println((int)shou);

		//a ハロー true
		System.out.print(Char + " ");
		System.out.print(string + " ");
		System.out.println(Boolean.toString(bool));

		//11130 
		double all2 = all + shou;
		System.out.println((int)all2);

		//10000000000
		long kake = Byte * Short * Int * Long;
		System.out.println(kake);

		// 10.5/100
		double wari = Double / 100.000;
		System.out.println(wari);

		// 10-100
		int cast = Byte;
		int minus = cast - Short;
		System.out.println(minus);
		System.out.println();
		
		//5
		//正しく動作するように修正
		System.out.println("5.正しく動作するように修正");
		String num="20";
		String num1 = "23";//int num1 = 23;  整数扱い
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println();
		
		//6
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』を使用してコンソール出力
		System.out.println("6.『山田太郎 18歳 170.5cm 62.2kg 寿司』を使用してコンソール出力");
		String name = "山田太郎";
		int age = 18;
		float tall = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + tall + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println();
		
		//7
		//6のBMIをコンソール出力
		System.out.println("7.6のBMIをコンソール出力");
		float mTall = 1.705f;//BMI計算のため作成
		double mTall2 = Math.pow(mTall, 2);//BMI計算のため作成。べき乗
		double BMI = weight / (mTall2);//BMI計算
		System.out.println("BMIは" + Math.round(BMI) + "です");
		System.out.println();
		
		//8
		//6で宣言した変数に再代入後、コンソール出力
		System.out.println("8.6で宣言した変数に再代入後、コンソール出力");
		name = "鈴木一郎";
		age = 24;
		tall = 168.5f;
		weight = 64.2f;
		mTall = 1.685f;
		mTall2 = Math.pow(mTall, 2);
		BMI = weight / (mTall2);
		double bmiR = ((double)Math.round(BMI * 10))/10;
		food = "オムライス";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + tall + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmiR + "です");
		System.out.println();
		
		//9
		//8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、コンソールに出力
		System.out.println("9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、コンソールに出力");
		age += age;
		tall += tall;
		weight += weight;
		float m2Tall = 3.37f;//BMI計算のため作成
		double m2Tall2 = Math.pow(m2Tall, 2);//BMI計算のため作成。べき乗
		double BMI2 = weight / (m2Tall2);//和算したときのBMI
		double bmiR2 = ((double)Math.round(BMI2 * 100))/100;//四捨五入
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + tall + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmiR2 + "です");
		System.out.println();
		
		//10
		//8で使用した年齢が25歳以上ならtrueが出力されるようにする
		age = 24;
		System.out.println("10.8で使用した年齢が25歳以上ならtrueが出力されるようにする");
		System.out.println(age >= 25);
		System.out.println();
		
		//11
		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
		System.out.println("11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力");
		age = 24;
		String sAge = String.valueOf(age);
		tall = 168.5f;
		int inTall = (int)tall;
		String sTall = String.valueOf(inTall);
		weight = 64.2f;
		int inWeight = (int)weight;		
		String sWeight = String.valueOf(inWeight);
		System.out.println(sAge + " ・ " + sTall + " ・ " + sWeight);
		System.out.println();
		//↑無理やり少数から整数に変換したんですが大丈夫ですかね…
		
		//12
		//11で使用した【年齢・身長】を整数型に型変換し繋げて出力
		System.out.println("12.11で使用した【年齢・身長】を整数型に型変換し繋げて出力");
		int iAge = Integer.parseInt(sAge);
		int iTall = Integer.parseInt(sTall);
		System.out.println(iAge + " ・ " + iTall);
		System.out.println();
		
		//13
		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		System.out.println("13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力");
		System.out.println(iAge >= 25 || iTall >= 160);
	}

}

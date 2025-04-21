package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		//5　九九表 20*9
		
		//外側 縦9
		for(int j = 1; j < 10; j++) {
			//内側　横20
			for(int i = 1; i < 21; i++) {
				int result = i * j;//計算結果
				System.out.print(String.format("%03d×%03d=%03d", i, j, result));//3桁そろえ
				
				//i = 19まで　|| で区切りをつける
				if(i != 20) {
					System.out.print(" || ");
				}
			}
			System.out.println();//20まで終わると改行
		}
	}

}

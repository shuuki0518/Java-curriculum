package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		//4　九九表
		
		//外側
		for(int i = 1; i < 10; i++) {
			//内側
			for(int j = 1; j < 10; j++) {
				int result = i * j;//計算結果
				
				//i * j = result
				System.out.print(String.format("%02d×%02d=%02d", i, j, result));
				
				//j = 8まで　|| で区切りをつける
                if (j != 9) {
                    System.out.print(" || ");
                } 
             
			}
			System.out.println();//9まで終わると改行
		}
	}

}

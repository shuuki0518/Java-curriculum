//メインクラス
//処理
package adventureMain1_25;

import java.util.Scanner;
import adventureShori1_25.heroLogic;

public class heroMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力してしてください：");
		//名前入力
		String name = scanner.nextLine();
		
		//入力された名前を使って、ヒーロー(hero)を作成
		heroLogic hero = new heroLogic(name);
		//画面表示
		hero.displayStatus();
		
		scanner.close();
	}

}

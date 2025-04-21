package curriculum_B;

import java.util.Scanner;
import java.util.Random;

public class Qes6 {

	public static void main(String[] args) {
		
		//6 商品入力後、在庫数表示
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("家電名を  , で区切って入力してください");
		String input = scanner.nextLine();
		
		//「、」で分割して、配列にしてあげる
		String[] items = input.split("、");
		
		for(String item : items) {
			//空白全削除（半角・全角)
			String trimItem = item.replaceAll("[\\s　]", "");
			//入力確認用（デバッグ）
			//System.out.println("→ 入力チェック:[" + trimItem + "]");
			
			int stock = random.nextInt(12);//0~11個のランダムな在庫数
			
			switch(trimItem) {
			
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stock + "台です。");
				break;
				
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stock + "台です。");
				break;
				
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stock + "台です。");
				break;
				
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stock + "台です。");
				break;
				
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stock + "台です。");
				break;
				
			//テレビとディスプレイは同一の物と考える	
			case "テレビ":
			case "ディスプレイ":
				int tvStock = trimItem.equals("ディスプレイ") ? 11 - stock : stock;//ディスプレイだけは11から引いた値で台数表現
		        String productName = trimItem.equals("ディスプレイ") ? "ディスプレイ" : "テレビ";
		        String suffix = trimItem.equals("ディスプレイ") ? "（※テレビと同在庫）" : "";//"ディスプレイ（※テレビと同在庫）" のように表示するための補足テキスト
		        System.out.println(productName + "の残り台数は" + tvStock + "台です" + suffix);
				break;
				
			default:
				System.out.println("「" + trimItem + "」" + "は指定の商品ではありません。");
			
			}
		}
		scanner.close();
	}

}

package curriculum_B;

import java.util.Scanner;
import java.util.Random;

public class Qes1_3 {

	public static void main(String[] args) {
		
		//1
		//ログイン時の入力チェックシステム
		Scanner scanner = new Scanner(System.in);//キーボード入力
		String name;//名前
		
		while(true) {
			System.out.print("名前を入力してください：");
			name = scanner.nextLine().trim(); // ← トリムで空白・改行削除
			
			System.out.println("入力された名前（デバッグ）：「" + name + "」"); // デバッグ出力

			
			//nullまたは0文字の場合
			if(name == null || name.isEmpty()) {
				System.out.println("名前を入力してください");
			}
			//文字列の長さが10文字を超えた場合
			else if(name.length() > 10) {
				System.out.println();
				System.out.println("名前を10文字以内で入力してください");
			}
			//半角英数字以外を使った場合
			else if(!name.matches("^[a-zA-Z0-9]+$")) {
				System.out.println();
				System.out.println("半角英数字のみで名前を入力してください");
			}
			//正常の場合
			else {
				System.out.println();
				System.out.println("ユーザー名「" + name + "」を登録しました");
				break;
			}
			
		}
		
		Random random = new Random();//相手がランダムに手を出させるようにするやつ
		int count = 0;//勝ちまでの回数
		System.out.println();
		System.out.println("じゃんけんをしましょう！");
		
		while (true) {         
			System.out.println();
            System.out.println("0:グー 1:チョキ 2:パー");
            System.out.print("あなたの手を数字で入力：");

            String input = scanner.nextLine().trim();

            // 数字かどうか判定（正規表現）
            if (!input.matches("^[0-2]$")) {
                System.out.println("0〜2の数字で入力してください。");
                continue;
            }

            int userHand = Integer.parseInt(input);
            int cpuHand = random.nextInt(3);

            String[] hands = {"グー", "チョキ", "パー"};
            System.out.println();
            System.out.println(name + "：" + hands[userHand] + " vs コンピュータ：" + hands[cpuHand]);

            count++;
            
            //あいこの場合
            if (userHand == cpuHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } 
            //勝った場合
            else if ((userHand == 0 && cpuHand == 1) ||
                       (userHand == 1 && cpuHand == 2) ||
                       (userHand == 2 && cpuHand == 0)) {
                System.out.println(name + "。やるやん。");
                System.out.println("勝つまでにかかった回数は" + count + "回です！");
                break;
            } 
            //負けた場合
            else {
                System.out.println(name + "…あなたの負けです…");

                //負けたパターン別の処理
                //パーに負けた
                if (userHand == 0 && cpuHand == 2) {
                	System.out.println();
                	System.out.println("cpu : 私の勝ち！");
                    System.out.println("cpu : なぜ負けたのか、明日まで考えてください。");
                    System.out.println("cpu : そしたら何かが見えてくるはずです");
                } 
                //グーに負けた
                else if (userHand == 1 && cpuHand == 0) {
                	System.out.println();
                    System.out.println("cpu : 私の勝ち！");
                    System.out.println("cpu : 負けは次につながるチャンスです！");
                    System.out.println("cpu : ネバーギブアップ！");
                } 
                //チョキに負けた
                else if (userHand == 2 && cpuHand == 1) {
                	System.out.println();
                	System.out.println("cpu : 私の勝ち！");
                    System.out.println("cpu : たかがじゃんけん…そう思ってないですか？");
                    System.out.println("cpu : それでしたら、次もわたしが勝ちますよ");
                }

                System.out.println();
                System.out.println("もう一度挑戦しよう！");
            }
        }
		
		scanner.close();
	}

}

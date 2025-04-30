//サブクラス
//冒険者（hero）を作る
package adventureShori1_25;

import java.util.Random;

//charaParamBaseを継承(extends)
public class heroLogic extends charaParamBase{

	//コンストラクタの中でステータスのランダム出力を行う
	public heroLogic(String name) {
		super(name);
		generateRandomParam();
	}

	//ランダム生成
	private void generateRandomParam() {
		Random rand = new Random();
        setHp(rand.nextInt(1000) + 1);
        setMp(rand.nextInt(1000) + 1);
        setAtk(rand.nextInt(500) + 1);
        setSpd(rand.nextInt(1000) + 1);
        setDef(rand.nextInt(300) + 1);
	}
	
	//画面に出す
	public void displayStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAtk());
        System.out.println("素早さ：" + getSpd());
        System.out.println("防御力：" + getDef());
        System.out.println("\nさあ冒険に出かけよう！");
	}
}

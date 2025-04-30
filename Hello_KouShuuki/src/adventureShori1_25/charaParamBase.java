//スーパークラス
//キャラクター基本情報
package adventureShori1_25;

public class charaParamBase {

	//フィールド
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int spd;
	private int def;
	
	//コンストラクタ
	public charaParamBase(String name) {
		this.name = name;
	}
	
	//setter
	public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    //getter
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAtk() {
        return atk;
    }

    public int getSpd() {
        return spd;
    }

    public int getDef() {
        return def;
    }
	
}

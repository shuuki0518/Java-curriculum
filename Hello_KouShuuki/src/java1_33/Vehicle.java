package java1_33;

//全乗り物に共通する所有者フィールドを持つクラス
public class Vehicle {
	
	//所有者（文字列）を表すフィールド。直接アクセスは不可（カプセル化）。
	private String owner;
	
	//所有者の名前を取得するゲッター（読み取り用）
	public String getOwner() {
		return owner;
	}
	
	//所有者の名前を設定するセッター（書き込み用）
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}

package prefectureData1_28_29;

//都道府県データを表すクラス
public class PrefectureData {
    private String name;      // 都道府県名
    private String capital;   // 県庁所在地
    private double area;      // 面積（km2）

    public PrefectureData(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
    
    //各フィールドの取得メソッド
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    //オブジェクトの情報を整形して文字列として返す
    public String toString() {
        return "都道府県名：" + name + "\n"
             + "県庁所在地：" + capital + "\n"
             + "面積：" + area + "km2\n";
    }
}

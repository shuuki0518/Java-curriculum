package prefectureMain1_28_29;

import prefectureData1_28_29.PrefectureData;
import java.util.*;

public class PrefectureMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //都道府県データの初期化（インデックスは0から10まで）
        PrefectureData[] prefectures = {
            new PrefectureData("北海道", "札幌市", 83424),
            new PrefectureData("青森県", "青森市", 9646),
            new PrefectureData("岩手県", "盛岡市", 15275),
            new PrefectureData("宮城県", "仙台市", 7282),
            new PrefectureData("秋田県", "秋田市", 11638),
            new PrefectureData("山形県", "山形市", 9323),
            new PrefectureData("福島県", "福島市", 13784),
            new PrefectureData("茨城県", "水戸市", 6097),
            new PrefectureData("栃木県", "宇都宮市", 6408),
            new PrefectureData("群馬県", "前橋市", 6362),
            new PrefectureData("埼玉県", "さいたま市", 3798)
        };
        
     //入力受付
        System.out.println("表示したい番号をカンマ区切りで入力してください（例：8,5,9）：");
        String inputLine = scanner.nextLine();//ユーザー入力を受け取る
        String[] tokens = inputLine.split(",");//カンマで分割して配列に

        List<PrefectureData> selected = new ArrayList<>();

        for (String token : tokens) {
            String trimmed = token.trim();//空白を除去
            if (isNumeric(trimmed)) {     //数字かどうかを判定
                int index = Integer.parseInt(trimmed);
                if (index >= 0 && index < prefectures.length) {
                    selected.add(prefectures[index]);//有効なインデックスならリストに追加
                } else {
                    System.out.println("範囲外の番号です: " + index);
                }
            } else {
                System.out.println("無効な入力です（数値のみ受け付けます）: " + trimmed);
            }
        }

        //昇順/降順の指定
        System.out.println("昇順なら asc、降順なら desc を入力してください：");
        String order = scanner.nextLine().trim().toLowerCase();

        //面積によるソート
        if (order.equals("desc")) {
            selected.sort((a, b) -> Double.compare(b.getArea(), a.getArea()));
        } else {
            selected.sort((a, b) -> Double.compare(a.getArea(), b.getArea()));
        }

        // --- 結果出力 ---
        for (PrefectureData p : selected) {
            System.out.println(p);
        }
        scanner.close();
	}
	
    //数値かどうかを判定するメソッド
    private static boolean isNumeric(String str) {
        //正規表現で整数かどうかをチェック（負の数や小数は対象外）
        return str.matches("\\d+");
    }
	
}

//コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
//ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

package java1_26_28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//動物を表すクラス
class Animal {
 private String name;
 private double height;
 private int speed;
 private String scientificName;

 public Animal(String name, double height, int speed, String scientificName) {
     this.name = name;
     this.height = height;
     this.speed = speed;
     this.scientificName = scientificName;
 }

 public void printInfo() {
     System.out.println();
     System.out.println("動物名：" + name);
     System.out.println("体長：" + height + "m");
     System.out.println("速度：" + speed + "km/h");
     System.out.println("学名：" + scientificName);
 }
}


public class animal1_26_28 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();

        //学名をマッピング 登録
        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");

        //入力をカンマで分割
        String[] animalsData = input.split(",");
        //動物たちをリストにまとめて管理
        List<Animal> animals = new ArrayList<>();

        for (String animalData : animalsData) {
            String[] parts = animalData.split(":");
            if (parts.length != 3) {
                continue;//データが壊れてたらスキップ
            }
            String name = parts[0];//動物の名前
            double height = Double.parseDouble(parts[1]);//体長
            int speed = Integer.parseInt(parts[2]);//速度
            //学名を取得
            String scientificName = scientificNames.getOrDefault(name, "不明");

            Animal animal = new Animal(name, height, speed, scientificName);
            animals.add(animal);
        }

        //出力
        for (Animal animal : animals) {
            animal.printInfo();
        }

        scanner.close();
		
	}

}

package sushiLogic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sushiDousa {

    private String aisatsu;
    private String tasteComment;
    private String categoryComment;
    private String currentDateTime;

    public sushiDousa() {
        this.aisatsu = "こんにちは！ここは日本です！";
        this.tasteComment = "この寿司はうまい";
        this.categoryComment = "寿司は和食です";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です";
    }

    public String getAisatsu() {
        return this.aisatsu;
    }

    public String getTasteComment() {
        return this.tasteComment;
    }

    public String getCategoryComment() {
        return this.categoryComment;
    }

    public String getCurrentDateTime() {
        return this.currentDateTime;
    }
	
}

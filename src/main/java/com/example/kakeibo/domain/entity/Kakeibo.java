package com.example.kakeibo.domain;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Data;

@Data
public class Kakeibo {
    private final int id;
    private final LocalDate date;
    private final String contents;
    private final String category;
    private final int expenditure;

    public Kakeibo(int id, String date, String contents, String category, String expenditure) {
        
        // yyyy-mm-ddの形式に変換
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        LocalDate localDate = localDateTime.toLocalDate();

        this.id = id;
        this.date = localDate;
        this.contents = contents;
        this.category = category;
        this.expenditure = Integer.parseInt(expenditure);
	}
}
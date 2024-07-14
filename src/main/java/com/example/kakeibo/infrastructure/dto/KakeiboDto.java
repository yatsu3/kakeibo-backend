package com.example.kakeibo.infrastructure;
import java.time.LocalDate;
import lombok.Data;
@Data
public class KakeiboDto {
    private final int id;
    private final String date;
    private final String contents;
    private final String category;
    private final int subTotal;
    private final boolean isExpenses;

    public KakeiboDto(int id, LocalDate date, String contents, String category, int subTotal, boolean isExpenses) {
        this.id = id;
        this.date = date.toString();
        this.contents = contents;
        this.category = category;
        this.subTotal = subTotal;
        this.isExpenses = isExpenses;
    }
    
}
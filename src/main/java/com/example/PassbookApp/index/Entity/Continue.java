package com.example.PassbookApp.index.Entity;

public enum Continue {

    ONE_MONTH("1ヶ月", 1),
    TWO_MONTH("2ヶ月", 2),
    THREE_MONTH("3ヶ月", 3),
    SIX_MONTH("6ヶ月", 6),
    ONE_YEAR("1年", 12);

    private final String label; // 画面表示用
    private final int months;   // ロジック用（月数）

    Continue(String label, int months) {
        this.label = label;
        this.months = months;
    }

    public String getLabel() {
        return label;
    }

    public int getMonths() {
        return months;
    }
}

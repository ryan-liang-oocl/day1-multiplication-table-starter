package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public boolean isEndGreaterThanStart(int start, int end) {
        return end >= start;
    }

    public boolean isStartAndEndInRange(int start, int end) {
        return start > 1 && end <= 1000;
    }

    public boolean isValid(int start, int end) {
        return isEndGreaterThanStart(start, end) && isStartAndEndInRange(start, end);
    }



}

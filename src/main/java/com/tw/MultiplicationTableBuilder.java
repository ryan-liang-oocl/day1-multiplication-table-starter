package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.createMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String createMultiplicationTable(int start, int end) {
        boolean isValid = isValid(start, end);
        if (!isValid) {
            return null;
        }
        return generateMultiplicationTable(start, end);
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

    public String generateMultiplicationTable(int start, int end) {
        StringBuilder multiplicationTable = new StringBuilder();
        for (int i = start; i <= end; i++) {
            generateMultiplicationRow(multiplicationTable, start, i);
            multiplicationTable.append("\n");
        }
        return multiplicationTable.toString();
    }

    public void generateMultiplicationRow(StringBuilder multiplicationTable, int start, int end) {
        for (int j = start; j <= end; j++) {
            multiplicationTable.append(j).append("*").append(end).append("=").append(end * j);
            if (j != end) {
                multiplicationTable.append(" ");
            }
        }
    }



}

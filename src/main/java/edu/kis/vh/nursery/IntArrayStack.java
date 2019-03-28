package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int TOTAL_FULL_VALUE = 11;

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    // alt + <- powrót do wcześniej modyfikowanego pliku
    // alt + -> przejście do następnego pliku

    private final int[] numbers = new int[MAX_SIZE];

    private int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == TOTAL_FULL_VALUE;
    }

    public int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getTotalFullValue() {
        return TOTAL_FULL_VALUE;
    }
}

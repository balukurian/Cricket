package com.workshop;

public enum BatsmanType {

    HITTER(new int[]{0, 4, 6}),
    DEFENSIVE(new int[]{0, 1, 2, 3}),
    NORMAL(new int[]{0, 1, 2, 3, 4, 5, 6, 7}),
    TAILENDER(NORMAL.possibleRuns());

    private int[] possibleRuns;

    private BatsmanType(int[] possibleRuns) {
        this.possibleRuns = possibleRuns;
    }

    public int[] possibleRuns() {
        return this.possibleRuns;
    }
}

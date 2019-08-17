package com.workshop.behaviour;

import com.workshop.BatsmanType;

import java.util.Random;

public class BattingBehaviour {

    private int[] possibleRuns;
    private Random random = new Random();
    private BatsmanType batsmanType;

    public BattingBehaviour() {
        possibleRuns = BatsmanType.NORMAL.possibleRuns();
    }

    public BattingBehaviour(BatsmanType batsmanType) {
        possibleRuns = batsmanType.possibleRuns();
    }

    public BattingBehaviour(int[] possibleRuns) {
        this.possibleRuns = possibleRuns;
    }

    public int strike() {
        return possibleRuns[random.nextInt(possibleRuns.length)];
    }

    public BatsmanType type() {
        return this.batsmanType;
    }
}

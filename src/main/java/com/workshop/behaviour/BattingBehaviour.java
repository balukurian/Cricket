package com.workshop.behaviour;

import com.workshop.BatsmanType;

public class BattingBehaviour extends Behaviour{

    private int[] possibleRuns;
    private BatsmanType batsmanType;

    public BattingBehaviour() {
        this.batsmanType = BatsmanType.NORMAL;
        this.possibleRuns = this.batsmanType.possibleRuns();
    }

    public BattingBehaviour(BatsmanType batsmanType) {
        this.batsmanType = batsmanType;
        this.possibleRuns = batsmanType.possibleRuns();
    }

    public int strike() {
        return this.possibleRuns[random.nextInt(possibleRuns.length)];
    }

    public BatsmanType type() {
        return this.batsmanType;
    }
}

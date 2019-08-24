package com.workshop;

import com.workshop.behaviour.BattingBehaviour;
import com.workshop.behaviour.BowlingBehaviour;

public class Player {

    protected BattingBehaviour battingBehaviour;
    protected BowlingBehaviour bowlingBehaviour;
    protected boolean out;
    protected int runs;

    public Player() {
        this.battingBehaviour = new BattingBehaviour();
        this.bowlingBehaviour = new BowlingBehaviour();
    }

    public Player(BattingBehaviour battingBehaviour, BowlingBehaviour bowlingBehaviour) {
        this.battingBehaviour = battingBehaviour;
        this.bowlingBehaviour = bowlingBehaviour;
        this.out = false;
    }

    public int hit() {
        return this.battingBehaviour.strike();
    }

    public int bowl() {
        return this.bowlingBehaviour.bowl();
    }

    public int runs() {
        return this.runs;
    }

    public boolean canTakeWickets() {
        return this.bowlingBehaviour.canTakeWickets();
    }

}

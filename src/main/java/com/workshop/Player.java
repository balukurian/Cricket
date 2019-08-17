package com.workshop;

import com.workshop.behaviour.BattingBehaviour;
import com.workshop.behaviour.BowlingBehavior;

public class Player {

    protected BattingBehaviour battingBehaviour;
    protected BowlingBehavior bowlingBehavior;
    protected boolean out;
    protected int runs;

    public Player(BattingBehaviour battingBehaviour, BowlingBehavior bowlingBehavior) {
        this.battingBehaviour = battingBehaviour;
        this.bowlingBehavior = bowlingBehavior;
        this.out = false;
    }

    public int hit() {
        return this.battingBehaviour.strike();
    }

    public int bowl() {
        return this.bowlingBehavior.bowl();
    }

    public int runs() {
        return this.runs;
    }


}

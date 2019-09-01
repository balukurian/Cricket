package com.workshop.behaviour;

import com.workshop.BowlerType;

public class BowlingBehaviour extends Behaviour {

    private int[] possibleRuns = {0, 1, 2, 3, 4, 5, 6};
    private BowlerType bowlerType = BowlerType.NORMAL;

    public BowlingBehaviour() {
    }

    public BowlingBehaviour(BowlerType bowlerType) {
        this.bowlerType = bowlerType;
    }

    public int bowl() {
        return possibleRuns[random.nextInt(possibleRuns.length)];
    }

    public boolean canTakeWickets() {
        return this.bowlerType == BowlerType.NORMAL;
    }

}

package com.workshop.behaviour;

import com.workshop.BatsmanType;
import com.workshop.Player;
import org.junit.Assert;
import org.junit.Test;

public class BattingBehaviourTest {

    @Test
    public void testNormalBatsman() {
        Player normalBatsman = new Player();
        Assert.assertTrue(valuePresent(BatsmanType.NORMAL.possibleRuns(), normalBatsman.hit()));
    }

    @Test
    public void testHitterBatsman() {
        Player hitterBatsman = new Player(new BattingBehaviour(BatsmanType.HITTER), new BowlingBehaviour());
        Assert.assertTrue(valuePresent(BatsmanType.HITTER.possibleRuns(), hitterBatsman.hit()));
    }

    @Test
    public void testTailEnderBatsman() {
        Player tailEnderBatsman = new Player(new BattingBehaviour(BatsmanType.TAILENDER), new BowlingBehaviour());
        Assert.assertTrue(valuePresent(BatsmanType.TAILENDER.possibleRuns(), tailEnderBatsman.hit()));
    }

    @Test
    public void testDefensiveBatsman() {
        Player defensiveBatsman = new Player(new BattingBehaviour(BatsmanType.DEFENSIVE), new BowlingBehaviour());
        Assert.assertTrue(valuePresent(BatsmanType.DEFENSIVE.possibleRuns(), defensiveBatsman.hit()));
    }


    private boolean valuePresent(int[] list, int value) {
        for (int item : list) {
            if (item == value)
                return true;
        }
        return false;
    }

}

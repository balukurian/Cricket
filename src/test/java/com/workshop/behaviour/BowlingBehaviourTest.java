package com.workshop.behaviour;

import com.workshop.BowlerType;
import com.workshop.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingBehaviourTest {

    private Player normalBowler;
    private Player partTimeBowler;

    @Before
    public void setup() {
        normalBowler = new Player();
        partTimeBowler = new Player(new BattingBehaviour(), new BowlingBehaviour(BowlerType.PART_TIME));
    }

    @Test
    public void normalBowlerCanTakeWickets() {
        Assert.assertTrue(normalBowler.canTakeWickets());
    }

    @Test
    public void partTimeBowlerCantTakeWickets() {
        Assert.assertFalse(partTimeBowler.canTakeWickets());
    }

    @Test
    public void testNormalBowler() {
        Assert.assertTrue(valuePresent(new int[]{0, 1, 2, 3, 4, 5, 6}, normalBowler.bowl()));
    }

    @Test
    public void testPartTimeBowler() {
        Assert.assertTrue(valuePresent(new int[]{0, 1, 2, 3, 4, 5, 6}, partTimeBowler.bowl()));
    }

    private boolean valuePresent(int[] list, int value) {
        for (int item : list) {
            if (item == value)
                return true;
        }
        return false;
    }

}

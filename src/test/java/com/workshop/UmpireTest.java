package com.workshop;

import com.workshop.behaviour.BattingBehaviour;
import com.workshop.behaviour.BowlingBehavior;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UmpireTest {

    private Player normalBatsman;
    private Player normalBowler;

    @Before
    public void init() {
        this.normalBatsman = new Player(new BattingBehaviour(BatsmanType.NORMAL), new BowlingBehavior(BowlerType.NORMAL));
        this.normalBowler = new Player(new BattingBehaviour(BatsmanType.NORMAL), new BowlingBehavior(BowlerType.NORMAL));
    }

    @Test
    public void testWicket() {
        BallResult ballResult = Umpire.decide(4, 4, normalBatsman, normalBowler);
        Assert.assertEquals(ballResult, BallResult.WICKET);
    }

    @Test
    public void testRun() {
        BallResult ballResult = Umpire.decide(4, 1, normalBatsman, normalBowler);
        Assert.assertEquals(ballResult, BallResult.RUN);
    }

}

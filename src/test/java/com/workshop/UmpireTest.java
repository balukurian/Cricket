package com.workshop;

import com.workshop.behaviour.BattingBehaviour;
import com.workshop.behaviour.BowlingBehavior;
import org.junit.Assert;
import org.junit.Test;

public class UmpireTest {

    @Test
    public void testWicket() {

        Player normalBatsman = new Player(new BattingBehaviour(BatsmanType.NORMAL), new BowlingBehavior(BowlerType.NORMAL));
        Player normalBowler = new Player(new BattingBehaviour(BatsmanType.NORMAL), new BowlingBehavior(BowlerType.NORMAL));

        BallResult ballResult = Umpire.decide(4, 4, normalBatsman, normalBowler);

        Assert.assertEquals(ballResult, BallResult.WICKET);

    }

}

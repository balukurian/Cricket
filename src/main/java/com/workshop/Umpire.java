package com.workshop;

public class Umpire {

    public static BallResult decide(int batsmanRun, int bowlerBall, Player batsman, Player bowler) {

        if (bowler.bowlingBehavior.canTakeWickets()) {
            if (batsman.battingBehaviour.type() == BatsmanType.TAILENDER) {
                return decideTailEnder(batsmanRun, bowlerBall);
            } else if (batsmanRun == bowlerBall) {
                System.out.println("Batsman is out");
                return BallResult.WICKET;
            } else {
                return BallResult.RUN;
            }
        } else {
            return BallResult.NO_RUN;
        }
    }

    private static BallResult decideTailEnder(int batsmanRun, int bowlerBall) {
        if (batsmanRun % 2 == 0 && bowlerBall % 2 == 0) {
            System.out.println("Batsman is out");
            return BallResult.WICKET;
        } else
            return BallResult.RUN;
    }

}

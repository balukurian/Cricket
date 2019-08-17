package com.workshop;

public class CricketGame {
    private final int NUMBER_OF_BALLS_IN_OVER = 6;
    private int overs;
    private Player batsman;
    private Player bowler;
    private int score;
    private int targetScore;

    public CricketGame(int overs, int targetScore, Player batsman, Player bowler) {
        this.overs = overs;
        this.score = 0;
        this.targetScore = targetScore;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public void playGame() {

        for (int i = 0; i < overs * NUMBER_OF_BALLS_IN_OVER; i++) {
            int run = batsman.hit();

            BallResult ballResult = Umpire.decide(run, bowler.bowl(), batsman, bowler);

            if (ballResult.equals(BallResult.WICKET)) {
                break;
            } else if (ballResult.equals(BallResult.RUN)) {
                score += run;
            }

            if (score >= targetScore) {
                break;
            }
        }
    }

    public boolean result() {
        return (score >= targetScore);
    }

}

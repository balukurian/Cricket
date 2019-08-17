package com.workshop;

import com.workshop.behaviour.BattingBehaviour;
import com.workshop.behaviour.BowlingBehavior;

public class Program {

    public static void main(String[] args) {

        int score = 12;
        int overs = 1;
        int batsmanType = 1;

        CricketGame game;

        if(batsmanType == 1) {
            game = new CricketGame(overs,score,
                    new Player(new BattingBehaviour(BatsmanType.HITTER), new BowlingBehavior()),
                    new Player(new BattingBehaviour(), new BowlingBehavior()));
        } else if(batsmanType == 0) {
            game = new CricketGame(overs, score,
                    new Player(new BattingBehaviour(), new BowlingBehavior()),
                    new Player(new BattingBehaviour(), new BowlingBehavior()));
        } else if(batsmanType == 2) {
            game = new CricketGame(overs, score,
                    new Player(new BattingBehaviour(BatsmanType.DEFENSIVE), new BowlingBehavior()),
                    new Player(new BattingBehaviour(), new BowlingBehavior()));
        }else {
            throw new IllegalArgumentException("Enter a valid batsman");
        }

        game.playGame();

        if(game.result()) {
            System.out.println("\nBatsman has won");
        } else {
            System.out.println("\nBatsman has lost");
        }

    }

}

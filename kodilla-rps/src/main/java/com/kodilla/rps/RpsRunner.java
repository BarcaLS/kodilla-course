package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();

        while(!game.getEnd()) {
            game.setEnd(false);
            game.setNewGame(false);
            game.setCurrentRound(1);
            game.welcome(game);
            game.keysInfo();
            while(game.getCurrentRound() <= game.getRounds()) {
                System.out.println("It's round nr " + game.getCurrentRound());
                game.generalInput();
                if(game.getNewGame()) {
                    break;
                }
                game.setCurrentRound(game.getCurrentRound() + 1);
            }
            if(!game.getNewGame()) {
                game.gameOver();
                game.endGameInput();
            }
        }
    }
}

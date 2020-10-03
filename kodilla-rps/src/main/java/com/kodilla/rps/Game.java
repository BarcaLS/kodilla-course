package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String username;
    private int rounds = 0;
    private int currentRound = 1;
    private int playerPoints = 0;
    private int computerPoints = 0;
    private boolean end = false;
    private boolean new_game = false;

    public Game() {}
    public int getRounds() {
        return rounds;
    }
    public int getCurrentRound() {
        return currentRound;
    }
    public boolean getEnd() {
        return end;
    }
    public boolean getNewGame() {
        return new_game;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }
    public void setEnd(boolean end) {
        this.end = end;
    }
    public void setNewGame(boolean end) {
        this.new_game = end;
    }

    void welcome(Game game) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello, what is your name? ");
        game.setUsername(scanner.nextLine());
        System.out.print("How many rounds should it take to win? ");
        game.setRounds(scanner.nextInt());
    }

    void keysInfo() {
        System.out.println("You can use following keys to play:\n" +
                "key 1 – play with \"Rock\",\n" +
                "key 2 – play with \"Paper\",\n" +
                "key 3 – play with \"Scissors\",\n" +
                "key 4 – play with \"Lizard\",\n" +
                "key 5 – play with \"Spock\",\n" +
                "key x – end game,\n" +
                "key n – restart game");
    }

    void generalInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Make your choice: ");
        String key = scanner.nextLine();
        switch (key) {
            case "x":
                if(affirmAction("Are you sure you want to end game?"))
                    endGame();
                else
                    this.setCurrentRound(this.getCurrentRound() - 1);
                break;
            case "n":
                if(affirmAction("Are you sure you want to restart game?"))
                    restartGame();
                else
                    this.setCurrentRound(this.getCurrentRound() - 1);
                break;
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                checkMove(key);
                break;
        }
    }

    void endGameInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What now (x - end game, n - restart game)? ");
        String key = scanner.nextLine();
        switch (key) {
            case "x":
                endGame();
                break;
            case "n":
                restartGame();
                break;
        }
    }

    void checkMove(String playerChoose) {
        switch (playerChoose) {
            case "1":
                checkSpecificMove("Rock");
                break;
            case "2":
                checkSpecificMove("Paper");
                break;
            case "3":
                checkSpecificMove("Scissors");
                break;
            case "4":
                checkSpecificMove("Lizard");
                break;
            case "5":
                checkSpecificMove("Spock");
                break;
            default:
                System.out.println("You pressed wrong key.");
                break;
        }
    }

    void checkSpecificMove(String playerMoveString) {
        String computerMove = computerLooseDrawWin();
        int choose;
        Move playerMove;
        Random random = new Random();

        switch (playerMoveString) {
            case "Rock":
                playerMove = new Rock();
                break;
            case "Paper":
                playerMove = new Paper();
                break;
            case "Scissors":
                playerMove = new Scissors();
                break;
            case "Lizard":
                playerMove = new Lizard();
                break;
            default:
                playerMove = new Spock();
                break;
        }
        switch (computerMove) {
            case "loose":
                choose = random.nextInt(playerMove.getToBeat().size());
                announceResult(playerMove, playerMove.getToBeat().get(choose), "You ");
                return;
            case "win":
                choose = random.nextInt(playerMove.getToBeBeaten().size());
                announceResult(playerMove, playerMove.getToBeBeaten().get(choose), "I ");
                return;
            case "draw":
                announceResult(playerMove, playerMoveString, "It's a draw!");
                break;
        }
    }

    String computerLooseDrawWin() {
        Random random = new Random();
        int computer_chances = random.nextInt(99) + 1;
        if (computer_chances < ComputerChancesPercentage.LOOSE.level)
            return "loose";
        else if (computer_chances > ComputerChancesPercentage.DRAW.level)
            return "win";
        else
            return "draw";
    }

    void announceResult(Move playerMove, String computerMove, String winner) {
        System.out.print("I chose " + computerMove + ". ");
        switch (winner) {
            case "You ":
                System.out.println(winner + " won because " + playerMove.getName() + " beats " + computerMove + "!");
                this.playerPoints++;
                break;
            case "I ":
                System.out.println(winner + " won because " + computerMove + " beats " + playerMove.getName() + "!");
                this.computerPoints++;
                break;
            case "It's a draw!":
                System.out.println(winner);
                break;
        }
        System.out.println("You have " + playerPoints + " points, I have " + computerPoints + " points.");
    }

    boolean affirmAction(String message) {
            Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        if (scanner.nextLine().equals("y"))
            return true;
        else
            return false;
    }

    void endGame(){
        System.out.println("Bye, bye!");
        System.exit(0);
    }

    void restartGame(){
        System.out.println("Let's play a new game.");
        this.new_game = true;
    }

    void gameOver() {
        System.out.println("Game over.");
        if(this.computerPoints > this.playerPoints)
            System.out.println("### Computer won! ###");
        else if(this.computerPoints < this.playerPoints)
            System.out.println("### " + this.username + " won! ###");
        else
            System.out.println("### It's a draw! ###");
    }
}

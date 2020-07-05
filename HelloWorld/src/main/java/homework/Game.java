package homework;
import scala.Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {
    private Player winner = null;
    private Boolean continueGame;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<Player> players = new ArrayList<Player>();
    enum Category {
        PRIVACY,
        SEX
    }
    public static void main(String[] args) {
        Game aGame = new Game();
        aGame.addPlayer(new Player("Tom"));
        aGame.addPlayer(new Player("Jack"));
        ArrayList<Question> questions = new ArrayList<Question>(Arrays.asList(new Question[]{}));
        questions.add(new Question("How old are you?", Category.PRIVACY));
        questions.add(new Question("Are you single?", Category.SEX));
        aGame.addQuestions(questions);
        int currentPlayerIndex = 0;
        while (aGame.winner == null) {
            if (currentPlayerIndex > aGame.players.size() - 1) {
                currentPlayerIndex = currentPlayerIndex - aGame.players.size();
            }
            Player currentPlayer = aGame.players.get(currentPlayerIndex);
            aGame.play(currentPlayer, questions);
            if (currentPlayer.prize >= 6) {
                aGame.setWinner(currentPlayer);
            } else {
                currentPlayerIndex++;
            }
        }
    }

    private void setWinner(Player currentPlayer) {
        this.winner = currentPlayer;
    }

    private void play(Player player, ArrayList<Question> questions) {
        int gambleNumber = this.getGambleNumber(this.players.size());
        if (player.isInPrison) {
            if (isPair(gambleNumber)) {
               System.out.println(player + "get out of prison");
               freeFromPrison(player);
               answerAndChange(player, questions, gambleNumber);
            } else {
                System.out.println(player + "still stay in prison");
            }
        } else  {
            answerAndChange(player, questions, gambleNumber);
        }
    }

    private void freeFromPrison(Player player) {
        player.isInPrison = false;
    }


    private void answerAndChange(Player player, ArrayList<Question> questions, int gambleNumber) {
        Category category = getCategory(gambleNumber);
        Question targetQuestion = questions.stream().filter(question -> {
            return question.category == category;
        }).collect(Collectors.toList()).get(0);
        System.out.println(player + "try to answer question:" + targetQuestion);
        if (canAnswer(player, targetQuestion)) {
            System.out.println(player + "answer " + targetQuestion + " correctly!");
            prizePlayer(player, 1);
        } else {
            System.out.println(player + "answer " + targetQuestion + " wrongly!");
            putInPrison(player);
        }
    }

    private int prizePlayer(Player player, int mark) {
        System.out.println(player + "get " + mark + " core!");
        return player.prize += mark ;
    }

    private boolean canAnswer(Player player, Question targetQuestion) {
        if (new Random().nextInt(10) > 5) {
            return true;
        } else {
            return false;
        }
    }

    private void putInPrison(Player player) {
        System.out.println(player + "is put into prison");
        player.isInPrison = true;
    }

    private Category getCategory(int gambleNumber) {
        if (isPair(gambleNumber)) {
            return Category.PRIVACY;

        } else {
            return Category.SEX;
        }
    }

    private boolean isPair(int gambleNumber) {
        if (gambleNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void addQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Player>  addPlayer(Player player) {
        this.players.add(player);
        return players;
    }

    public int getGambleNumber(int upper) {
        return new Random().nextInt(upper);
    }


}

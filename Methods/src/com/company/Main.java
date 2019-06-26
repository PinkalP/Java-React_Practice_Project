package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;
        int highscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("your final score was " + highscore);

        calculateScore(true,800,5,100);

         score =800;
         levelCompleted = 5;
         bonus = 100;

        calculateScore(gameOver,score,levelCompleted,bonus);

        int position = calculateHighScore(1500);
        displayHightScorePosition("pinkal", position);

         position = calculateHighScore(900);
        displayHightScorePosition("Bob", position);

        position = calculateHighScore(400);
        displayHightScorePosition("Martin", position);

        position = calculateHighScore(50);
        displayHightScorePosition("Martin", position);
    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver)
        {
            int finalscore = score + (levelCompleted * bonus);
            finalscore +=2000;
            return finalscore ;
        }
        return -1;

    }

    public static void displayHightScorePosition(String playerName, int position) {
        System.out.println(playerName + "managed to get into position"
                + position  + " on the hightscore table");
    }


    public static int   calculateHighScore(int playerscore) {
        if (playerscore >= 1000){
            return 1;
        }else if( playerscore >= 500 && playerscore < 1000){
            return 2;
        }else if( playerscore >= 100 && playerscore < 500){
            return 3;
        }else {
            return 4;
        }
    }
}

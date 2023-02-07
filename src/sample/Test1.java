package sample;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Test1 {
    //String[] tossMatch = {"Tail", "Head"};

    /*public String Toss() {
        Random t = new Random();
        int chooseToss = t.nextInt(tossMatch.length);
        String wonToss = tossMatch[chooseToss];
        return (wonToss);
    }*/

    public int WideToScore() {
        int play = 7;
        int score = 0;
        int play2 = 0;

        if (play == 7) {
            play2 = 1;
            score = score + 1 + play2;
        }
        return (score);
    }

    public int NoballToScore() {
        int play = 8;
        int score = 0;
        int play2;

        if (play == 8) {
            play2 = 3;
            score = score + 1 + play2;
        }
        return (score);
    }

    public int WicketCounter() {
        int play = 9;
        int wickets = 3;

        if (play == 9) {
            wickets++;
        }
        return (wickets);
    }

    public int Score() {
        int play = 6;
        int score = 3;

        score = score + play;
        return (score);
    }

    public int IndividualBatsmanScore() {
        int play2 = 6;
        int individualBatsmanScore = 25;

        individualBatsmanScore = individualBatsmanScore + play2;
        return (individualBatsmanScore);
    }

    public int BallCounter() {
        int balls = 6;

        balls++;
        return (balls);
    }

    public int WinCount() {
        int scoreSecondInnForStanding = 250;
        int scoreFirstInnForStanding = 160;
        int sriLankaWinCount = 0;

        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            sriLankaWinCount++;
        }
        return (sriLankaWinCount);
    }

    public int LossCount() {
        int scoreSecondInnForStanding = 250;
        int scoreFirstInnForStanding = 360;
        int australiaLossCount = 0;

        if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            australiaLossCount++;
        }
        return (australiaLossCount);
    }

    public String MatchDraw() {
        int scoreSecondInnForStanding = 180;
        int scoreFirstInnForStanding = 180;

        if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            return ("Match is Draw");
        }
        return ("Match is Draw");
    }

    public int BatsmanScore(){
        List<Integer> individualBatsmanScoreList = Arrays.asList(44, 23, 32, 12, 13, 4, 6);

        int highestNumberS = Collections.max(individualBatsmanScoreList);
        return highestNumberS;
    }

    public int BowlerScore(){
        List<Integer> individualBowlerScoreList = Arrays.asList(44, 23, 32, 12, 13, 4, 6);

        int lowestNumberS = Collections.min(individualBowlerScoreList);
        return lowestNumberS;
    }

    public int BatsmanPosition(){
        List<Integer> individualBatsmanScoreList = Arrays.asList(44, 23, 32, 12, 13, 4, 6);

        int highestNumber = Collections.max(individualBatsmanScoreList);
        int batsmanPosition = individualBatsmanScoreList.indexOf(highestNumber);

        return batsmanPosition;
    }

    public int BowlerPosition(){
        List<Integer> individualBowlerScoreList = Arrays.asList(44, 23, 32, 12, 13, 4, 6);

        int lowestNumber = Collections.min(individualBowlerScoreList);
        int batsmanPosition = individualBowlerScoreList.indexOf(lowestNumber);

        return batsmanPosition;
    }

    public int AddToList() {
        List<Integer> scorelist = new ArrayList<>();
        int score1 = 2;
        int i;

        scorelist.add(score1);

        for (i = 0; i < scorelist.size(); i++) {
            return scorelist.get(i);
        }
        return scorelist.get(i);
    }

    public int RemoveFromList() {
        List<Integer> scorelist = new ArrayList<>();
        int score1 = 2;
        int score2 = 5;
        int i;

        scorelist.add(score1);
        scorelist.add(score2);
        scorelist.remove(1);

        for (i = 0; i < scorelist.size(); i++) {
            return scorelist.get(i);
        }
        return scorelist.get(i);
    }
}
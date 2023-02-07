package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.*;

abstract class Main2 {

    //The main logic of the random match.

    int balls = 0;
    int wickets = 0;
    int currun = 0;
    int play2;
    int score = 0;

    int ballsS = 0;
    int wicketsS = 0;
    int currunS = 0;
    int play2S;
    int scoreS = 0;

    int individualBatsmanScore = 0;
    int individualBatsmanScoreS = 0;

    int scoreFirst = 0;
    int scoreSecond = 0;

    int methodOfDismissal;
    int methodOfDismissalS;

    int australiaWinCount = 0;
    int sriLankaWinCount = 0;
    int bangladeshWinCount = 0;
    int westIndiesWinCount = 0;

    int australiaLossCount = 0;
    int sriLankaLossCount = 0;
    int bangladeshLossCount = 0;
    int westIndiesLossCount = 0;

    int indiaWinCount = 0;
    int pakistanWinCount = 0;
    int afghanistanWinCount = 0;
    int englandWinCount = 0;

    int indiaLossCount = 0;
    int pakistanLossCount = 0;
    int afghanistanLossCount = 0;
    int englandLossCount = 0;

    int scoreSecondInnForStanding;
    int scoreFirstInnForStanding;
    int ballsToFile;
    int ballsSToFile;
    int wicketToFile;
    int wicketSToFile;

    List<Integer> possibilities = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer> otherpossibilities = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

    List<String> scorelist = new ArrayList<String>();
    List<Integer> scorelistSum = new ArrayList<Integer>();
    List<Integer> individualBatsmanScoreList = new ArrayList<Integer>();
    List<Integer> individualBowlerScoreList = new ArrayList<Integer>();

    List<String> scorelistS = new ArrayList<String>();
    List<Integer> scorelistSumS = new ArrayList<Integer>();
    List<Integer> individualBatsmanScoreListS = new ArrayList<Integer>();
    List<Integer> individualBowlerScoreListS = new ArrayList<Integer>();

    String[] dismissalMethod = {"LBW !", "Catch !", "Wicket !", "Run Out !"};
    List<String> dismissalMethodDisplay = new ArrayList<String>();
    List<String> dismissalMethodDisplayS = new ArrayList<String>();

    String[] tossMatch = {"Tail", "Head"};


    @FXML
    Label display1;
    @FXML
    Label display2;
    @FXML
    Label display3;
    @FXML
    Label display4;
    @FXML
    Label display5;
    @FXML
    Label display6;
    @FXML
    Label display6a;
    @FXML
    Label display6b;
    @FXML
    Label display6c;
    @FXML
    Label display6d;
    @FXML
    Label display7;
    @FXML
    Label display8;
    @FXML
    Label display9;
    @FXML
    Label display10;
    @FXML
    Label display11;
    @FXML
    Label display12;
    @FXML
    Label display13;
    @FXML
    Label display15;
    @FXML
    Label display16;

    //First Inningns start from this point

    public void firstInningns(ActionEvent event) {

        Random list = new Random();
        int chooseToss = list.nextInt(tossMatch.length);
        String wonToss = tossMatch[chooseToss];

        int ballFirstInningns = 120;

        while (balls < ballFirstInningns) {

            //Random list = new Random();

            Integer play = list.nextInt(possibilities.size());

            if (play == 7) {

                play2 = list.nextInt(otherpossibilities.size());
                scorelist.add("Wide");
                scorelistSum.add((currun + 1 + play2));
                scorelist.add(String.valueOf(play2));
                scorelistSum.add(play2);
                scoreFirst = scoreFirst + 1 + play2;

            } else if (play == 8) {

                play2 = list.nextInt(otherpossibilities.size());
                scorelist.add("No-Ball");
                scorelist.add(String.valueOf(play2));
                scorelistSum.add(play2);
                scorelistSum.add((currun + 1 + play2));
                scoreFirst = scoreFirst + 1 + play2;

            } else if (play == 9) {

                wickets++;
                scorelist.add("W");
                methodOfDismissal = list.nextInt(dismissalMethod.length);
                dismissalMethodDisplay.add(dismissalMethod[methodOfDismissal]);

                individualBatsmanScore = individualBatsmanScore + play2;
                individualBatsmanScoreList.add(individualBatsmanScore);

                if (wickets > 10) {
                    break;
                }

            } else {

                scorelist.add(String.valueOf(play));
                scorelistSum.add(play);
                scoreFirst = scoreFirst + play;

            }
            balls++;

            if (balls % 6 == 0) {
                individualBowlerScoreList.add(scoreFirst);
                scoreFirst = 0;
            }
        }

        try {
            for (int i = 0; i < scorelistSum.size(); i++) {
                score += scorelistSum.get(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds");
        }

        int finalScoreFirstInn = score;

        int highestNumber = Collections.max(individualBatsmanScoreList);
        int batsmanPosition = individualBatsmanScoreList.indexOf(highestNumber) + 1;

        int lowestNUmber = Collections.min(individualBowlerScoreList);
        int bowlerPosition = individualBowlerScoreList.indexOf(lowestNUmber) + 1;

        System.out.println("The toss won: " + " " + wonToss);
        System.out.println("Score of the team: " + " " + finalScoreFirstInn);
        System.out.println("scorelistS" + scorelist);
        System.out.println("No of balls played: " + " " + balls);
        System.out.println("No of wickets fallen: " + " " + wickets);
        System.out.println("Method Of Dismissal: " + " " + dismissalMethodDisplay);
        System.out.println("Individual Batsman Score" + individualBatsmanScoreList);
        System.out.println("Individual Bowler Score" + " " + individualBowlerScoreList);

        display1.setText(String.valueOf(wonToss));
        display2.setText(String.valueOf(score));
        display3.setText(String.valueOf(scorelist));
        display4.setText(String.valueOf(balls));
        display5.setText(String.valueOf(wickets));
        display15.setText(String.valueOf(dismissalMethodDisplay));
        display6.setText(String.valueOf(individualBatsmanScoreList));
        display7.setText(String.valueOf(individualBowlerScoreList));

        System.out.println("Best Batsman : " + " " + "Batsman" + " " + batsmanPosition);
        display6a.setText("Batsman" + " " + batsmanPosition);

        System.out.println("Best Bowler : " + " " + "Bowler" + " " + bowlerPosition);
        display6c.setText("Bowler" + " " + bowlerPosition);

        scoreFirstInnForStanding = score;
        ballsToFile = balls;
        wicketToFile = wickets;

        score=0;
        currun = 0;
        scorelist.clear();
        scorelistSum.clear();
        balls=0;
        wickets=0;
        individualBatsmanScoreList.clear();
        individualBowlerScoreList.clear();
        dismissalMethodDisplay.clear();
    }

    //Second inningns start from here

    public void secondInningns(ActionEvent event) {
        int ballSecondInningns = 120;
        while (ballsS < ballSecondInningns) {

            Random list = new Random();
            Integer playS = list.nextInt(possibilities.size());

            if (playS == 7) {

                play2S = list.nextInt(otherpossibilities.size());
                scorelistS.add("Wide");
                scorelistSumS.add((currunS + 1 + play2S));
                scorelistS.add(String.valueOf(play2S));
                scorelistSumS.add(play2S);
                scoreSecond = scoreSecond + 1 + play2;

            } else if (playS == 8) {

                play2S = list.nextInt(otherpossibilities.size());
                scorelistS.add("No-Ball");
                scorelistS.add(String.valueOf(play2S));
                scorelistSumS.add(play2S);
                scorelistSumS.add((currunS + 1 + play2S));
                scoreSecond = scoreSecond + 1 + play2;

            } else if (playS == 9) {

                wicketsS++;
                scorelistS.add("W");

                methodOfDismissalS = list.nextInt(dismissalMethod.length);
                dismissalMethodDisplayS.add(dismissalMethod[methodOfDismissalS]);

                individualBatsmanScoreS = individualBatsmanScoreS + play2;
                individualBatsmanScoreListS.add(individualBatsmanScoreS);
                if (wicketsS > 10) {
                    break;
                }
            } else {
                scorelistS.add(String.valueOf(playS));
                scorelistSumS.add(playS);
                scoreSecond = scoreSecond + playS;
            }
            ballsS++;

            if (ballsS % 6 == 0) {
                individualBowlerScoreListS.add(scoreSecond);
                scoreSecond = 0;
            }
        }

        try {
            for (int i = 0; i < scorelistSumS.size(); i++) {
                scoreS += scorelistSumS.get(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bounds");
        }

        int finalScoreFirstInnS = scoreS;

        System.out.println("Score of the team: " + " " + finalScoreFirstInnS);
        System.out.println("scorelistS" + scorelistS);
        System.out.println("No of balls played: " + " " + ballsS);
        System.out.println("No of wickets fallen: " + " " + wicketsS);
        System.out.println("Method Of Dismissal: " + " " + dismissalMethodDisplayS);
        System.out.println("Individual Batsman Score" + individualBatsmanScoreListS);
        System.out.println("Individual Bowler Score" + " " + individualBowlerScoreListS);

        display8.setText(String.valueOf(scoreS));
        display9.setText(String.valueOf(scorelistS));
        display10.setText(String.valueOf(ballsS));
        display11.setText(String.valueOf(wicketsS));
        display16.setText(String.valueOf(dismissalMethodDisplayS));
        display12.setText(String.valueOf(individualBatsmanScoreListS));
        display13.setText(String.valueOf(individualBowlerScoreListS));

        int highestNumberS = Collections.max(individualBatsmanScoreListS);
        int batsmanPositionS = individualBatsmanScoreListS.indexOf(highestNumberS) + 1;

        int lowestNUmberS = Collections.min(individualBowlerScoreListS);
        int bowlerPositionS = individualBowlerScoreListS.indexOf(lowestNUmberS) + 1;

        System.out.println("Best Batsman : " + " " + "Batsman" + " " + batsmanPositionS);
        display6b.setText("Batsman" + " " + batsmanPositionS);

        display6d.setText("Bowler" + " " + bowlerPositionS);

        scoreSecondInnForStanding = scoreS;
        ballsSToFile = ballsS;
        wicketSToFile = wicketsS;

        scoreS=0;
        scorelistS.clear();
        scorelistSumS.clear();
        currunS = 0;
        ballsS=0;
        wicketsS=0;
        individualBatsmanScoreListS.clear();
        individualBowlerScoreListS.clear();
        dismissalMethodDisplayS.clear();
    }
}
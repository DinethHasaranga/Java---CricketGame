package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SriLankavsAustralia extends Main2 {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/SLvsBAN1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void firstInningns(ActionEvent event) {
        super.firstInningns(event);
    }

    @Override
    public void secondInningns(ActionEvent event) {
        super.secondInningns(event);
    }

    List<String> matchPlayedTeam1 = new ArrayList<String>();

    String[][] matchSheduleGroupA = {{"SriLanka", "Australia"}, {"SriLanka", "Bangladesh"}, {"SriLanka", "West Indies"},
            {"Australia", "Bangladesh"}, {"Australia", "West Indies"}, {"West Indies", "Bangladesh"}};
    @FXML
    Label display1a;
    @FXML
    Label W1;

    public void SLvsAUS(ActionEvent event) {
        String Team1 = matchSheduleGroupA[0][0];
        String Team2 = matchSheduleGroupA[0][1];

        matchPlayedTeam1.add(Team1);
        matchPlayedTeam1.add(Team2);

        Random t = new Random();

        int chooseTeam = t.nextInt(matchPlayedTeam1.size());
        String choosenTeam = matchPlayedTeam1.get(chooseTeam);
        display1a.setText(choosenTeam);

        System.out.println("Toss won Team :" + choosenTeam);
    }
    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            sriLankaWinCount++;
            australiaLossCount++;
            W1.setText("Sri Lanka");

        } else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            australiaWinCount++;
            sriLankaLossCount++;
            W1.setText("Australia");

        } else if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            W1.setText("Match is Draw");
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\srilankaWinCount.txt"));

            writer.write(String.valueOf(sriLankaWinCount));
            writer.newLine();
            writer.write(String.valueOf(sriLankaLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\australiaWinCount.txt"));

            writer.write(String.valueOf(australiaLossCount));
            writer.newLine();
            writer.write(String.valueOf(australiaWinCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void File(ActionEvent event) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\MatchSummary\\SLvsAUS.txt",true));

            writer.write("Sri Lanka vs Australia");
            writer.newLine();
            writer.write("Score of First Inningns: " + String.valueOf(scoreFirstInnForStanding));
            writer.newLine();
            writer.write("Balls of First Inningns: " + String.valueOf(ballsToFile));
            writer.newLine();
            writer.write("Wickets of First Inningns: " + String.valueOf(wicketToFile));
            writer.newLine();
            writer.write("Score of Second Inningns: " + String.valueOf(scoreSecondInnForStanding));
            writer.newLine();
            writer.write("Balls of Second Inningns: " + String.valueOf(ballsSToFile));
            writer.newLine();
            writer.write("Wickets of Second Inningns: " + String.valueOf(wicketSToFile));
            writer.newLine();
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

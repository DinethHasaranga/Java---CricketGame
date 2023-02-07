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

public class AustraliavsWIndies extends Main2 {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/WIvsBAN1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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

    String[][] matchSheduleGroupA = {{"SriLanka","Australia"},{"SriLanka","Bangladesh"},{"SriLanka","West Indies"},
            {"Australia","Bangladesh"},{"Australia","West Indies"},{"West Indies","Bangladesh"}};

    List<String> matchPlayedTeam5 = new ArrayList<String>();

    @FXML
    Label displayTeam5;
    @FXML
    Label W1;

    public void AUSvsWI() {
        String Team1 = matchSheduleGroupA[4][0];
        String Team2 = matchSheduleGroupA[4][1];

        matchPlayedTeam5.add(Team1);
        matchPlayedTeam5.add(Team2);
        System.out.println(matchPlayedTeam5);

        Random t = new Random();

        int chooseTeam = t.nextInt(matchPlayedTeam5.size());
        String choosenTeam = matchPlayedTeam5.get(chooseTeam);
        displayTeam5.setText(choosenTeam);
    }
    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            australiaWinCount++;
            westIndiesLossCount++;
            W1.setText("Australia");
        }
        else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            australiaLossCount++;
            westIndiesWinCount++;
            W1.setText("West Indies");
        }
        else if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            W1.setText("Match is Draw");
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\australiaWinCount.txt"));

            writer.write(String.valueOf(australiaWinCount));
            writer.newLine();
            writer.append(String.valueOf(australiaLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\windiesWinCount.txt"));

            writer.append(String.valueOf(westIndiesWinCount));
            writer.newLine();
            writer.append(String.valueOf(westIndiesLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void File(ActionEvent event) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\MatchSummary\\SLvsAUS.txt",true));

            writer.write("Australia vs West Indies");
            writer.newLine();
            writer.write("Score of First Inningns: " + String.valueOf(scoreFirstInnForStanding));
            writer.newLine();
            writer.write("Balls of First Inningns: " + String.valueOf(ballsToFile));
            writer.newLine();
            writer.write("Wickets of First Inningns: " + String.valueOf(wicketToFile));
            writer.newLine();
            writer.write("Score of Second Inningns: " + String.valueOf(ballsSToFile));
            writer.newLine();
            writer.write("Balls of Second Inningns: " + String.valueOf(scoreSecondInnForStanding));
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

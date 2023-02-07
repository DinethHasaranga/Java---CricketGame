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

public class SriLankavsWIndies extends Main2 {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/AUSvsBAN1.fxml"));
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

    List<String> matchPlayedTeam3 = new ArrayList<String>();

    String[][] matchSheduleGroupA = {{"SriLanka","Australia"},{"SriLanka","Bangladesh"},{"SriLanka","West Indies"},
            {"Australia","Bangladesh"},{"Australia","West Indies"},{"West Indies","Bangladesh"}};

    @FXML
    Label displayTeam3;
    @FXML
    Label W1;

    public void SLvsWI() {
        String Team1 = matchSheduleGroupA[2][0];
        String Team2 = matchSheduleGroupA[2][1];

        matchPlayedTeam3.add(Team1);
        matchPlayedTeam3.add(Team2);
        System.out.println(matchPlayedTeam3);

        Random t3 = new Random();

        int chooseTeam = t3.nextInt(matchPlayedTeam3.size());
        String choosenTeam = matchPlayedTeam3.get(chooseTeam);
        displayTeam3.setText(choosenTeam);
    }
    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            sriLankaWinCount++;
            westIndiesLossCount++;
            W1.setText("Sri Lanka");
        }
        else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            sriLankaLossCount++;
            westIndiesWinCount++;
            W1.setText("West Indies");
        }
        else if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            W1.setText("Match is Draw");
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\srilankaWinCount.txt"));

            writer.write(String.valueOf(sriLankaWinCount));
            writer.newLine();
            writer.append(String.valueOf(sriLankaLossCount));
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

            writer.write("Sri Lanka vs West Indies");
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

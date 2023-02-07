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

public class WIndiesvsBangladesh extends Main2{
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/GroupBStartPage1.fxml"));
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

    int bangladeshWinCount = 0;
    int westIndiesWinCount = 0;
    int bangladeshLossCount = 0;
    int westIndiesLossCount = 0;

    List<String> matchPlayedTeam6 = new ArrayList<String>();

    @FXML
    Label displayTeam6;
    @FXML
    Label W1;

    public void WIvsBAN() {
        String Team1 = matchSheduleGroupA[5][0];
        String Team2 = matchSheduleGroupA[5][1];

        matchPlayedTeam6.add(Team1);
        matchPlayedTeam6.add(Team2);
        System.out.println(matchPlayedTeam6);

        Random t = new Random();

        int chooseTeam = t.nextInt(matchPlayedTeam6.size());
        String choosenTeam = matchPlayedTeam6.get(chooseTeam);
        displayTeam6.setText(choosenTeam);
    }

    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            westIndiesWinCount++;
            bangladeshLossCount++;
            W1.setText("West Indies");
        }
        else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            bangladeshWinCount++;
            westIndiesLossCount++;
            W1.setText("Bangladesh");
        }
        else if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            W1.setText("Match is Draw");
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\windiesWinCount.txt"));

            writer.write(String.valueOf(westIndiesWinCount));
            writer.newLine();
            writer.append(String.valueOf(westIndiesLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\bangladeshWinCount.txt"));

            writer.append(String.valueOf(bangladeshWinCount));
            writer.newLine();
            writer.append(String.valueOf(bangladeshLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void File(ActionEvent event) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\MatchSummary\\SLvsAUS.txt",true));

            writer.write("West Indies vs Bangladesh");
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

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

public class PakistanvsEngland extends Main2 {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/AFGvsENG1.fxml"));
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

    List<String> matchPlayedTeam10 = new ArrayList<String>();

    String[][] matchSheduleGroupB = {{"India","Pakistan"},{"India","Afghanistan"},{"India","England"},
            {"Pakistan","England"},{"Afghanistan","England"},{"Pakistan","Afghanistan"}};

    @FXML
    Label displayTeam10;
    @FXML
    Label W1;

    public void PAKvsENG() {
        String Team1 = matchSheduleGroupB[3][0];
        String Team2 = matchSheduleGroupB[3][1];

        matchPlayedTeam10.add(Team1);
        matchPlayedTeam10.add(Team2);
        System.out.println(matchPlayedTeam10);

        Random t = new Random();

        int chooseTeam = t.nextInt(matchPlayedTeam10.size());
        String choosenTeam = matchPlayedTeam10.get(chooseTeam);
        displayTeam10.setText(choosenTeam);
    }

    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            pakistanWinCount++;
            englandLossCount++;
            W1.setText("Pakistan");
        }
        else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            pakistanLossCount++;
            englandWinCount++;
            W1.setText("England");
        }
        else if (scoreSecondInnForStanding == scoreFirstInnForStanding) {
            W1.setText("Match is Draw");
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\pakistanWinCount.txt"));

            writer.write(String.valueOf(pakistanWinCount));
            writer.newLine();
            writer.append(String.valueOf(pakistanLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\Standings\\englandWinCount.txt"));

            writer.append(String.valueOf(englandWinCount));
            writer.newLine();
            writer.append(String.valueOf(englandLossCount));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void File(ActionEvent event) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\java fx course work final\\MatchSummary\\SLvsAUS.txt",true));

            writer.write("Pakistan vs England");
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

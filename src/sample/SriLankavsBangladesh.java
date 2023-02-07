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

public class SriLankavsBangladesh extends Main2 {

private Stage stage;
private Scene scene;
private Parent root;

public void switchToScene2(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("../FXML_FILES/SLvsWI1.fxml"));
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

    List<String> matchPlayedTeam2 = new ArrayList<String>();

    @FXML
    Label displayTeam2;
    @FXML
    Label W1;

    public void SLvsBAN() {
        String Team_s1 = matchSheduleGroupA[1][0];
        String Team_b1 = matchSheduleGroupA[1][1];

        matchPlayedTeam2.add(Team_s1);
        matchPlayedTeam2.add(Team_b1);
        System.out.println(matchPlayedTeam2);

        Random t1 = new Random();

        int chooseTeam1 = t1.nextInt(matchPlayedTeam2.size());
        String choosenTeam1 = matchPlayedTeam2.get(chooseTeam1);
        displayTeam2.setText(choosenTeam1);
    }

    public void Winner(ActionEvent event){
        if (scoreSecondInnForStanding > scoreFirstInnForStanding) {
            sriLankaWinCount++;
            bangladeshLossCount++;
            System.out.println(sriLankaWinCount);
            System.out.println(bangladeshLossCount++);
            W1.setText("Sri Lanka");
        }
        else if (scoreSecondInnForStanding < scoreFirstInnForStanding) {
            bangladeshWinCount++;
            sriLankaLossCount++;
            System.out.println(bangladeshWinCount++);
            System.out.println(sriLankaLossCount);
            W1.setText("Bangladesh");

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

            writer.write("Sri Lanka vs Bangladesh");
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

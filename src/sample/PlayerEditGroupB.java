package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerEditGroupB {
    @FXML
    TextArea Display4;
    @FXML
    Button DP4;
    @FXML
    TextField TRP4;
    @FXML
    TextField TAP4;

    @FXML
    TextArea Display5;
    @FXML
    Button DP5;
    @FXML
    TextField TRP5;
    @FXML
    TextField TAP5;

    @FXML
    TextArea Display6;
    @FXML
    Button DP6;
    @FXML
    TextField TRP6;
    @FXML
    TextField TAP6;

    @FXML
    TextArea Display7;
    @FXML
    Button DP7;
    @FXML
    TextField TRP7;
    @FXML
    TextField TAP7;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/StartPage1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ShowplayerIND() {
        Display4.clear();
        List<String> arrayIND = Arrays.asList("IN_1_BT","IN_2_BT","IN_3_BT","IN_4_BT","IN_5_BT","IN_6_BT","IN_7_BT","IN_8_BL","IN_9_BL","IN_10_BL","IN_11_BL");

        for (int i = 0; i < arrayIND.size(); i++) {
            Display4.appendText(arrayIND.get(i) + "\n");
        }
    }

    public void NewplayerIND() {
        ArrayList<String> arrayIND = new ArrayList<String>();

        arrayIND.add(TAP4.getText());

        for (int i = 0; i < arrayIND.size(); i++) {
            Display4.appendText(arrayIND.get(i) + "\n");
        }
    }

    public void DeleteplayerIND() {
        ArrayList<String> arrayIND = new ArrayList<String>();

        arrayIND.add("IN_1_BT");
        arrayIND.add("IN_2_BT");
        arrayIND.add("IN_3_BT");
        arrayIND.add("IN_4_BT");
        arrayIND.add("IN_5_BT");
        arrayIND.add("IN_6_BT");
        arrayIND.add("IN_7_BT");
        arrayIND.add("IN_8_BL");
        arrayIND.add("IN_9_BL");
        arrayIND.add("IN_10_BL");
        arrayIND.add("IN_11_BL ");

        arrayIND.remove(TRP4.getText());
        Display4.clear();

        for (int i = 0; i < arrayIND.size(); i++) {
            Display4.appendText(arrayIND.get(i) + "\n");
        }
    }

    //*******************************************************************************************************************************************************

    public void ShowplayerPAK() {
        Display5.clear();
        List<String> arrayPAK = Arrays.asList("PA_1_BT","PA_2_BT","PA_3_BT","PA_4_BT","PA_5_BT","PA_6_BT","PA_7_BT","PA_8_BL","PA_9_BL","PA_10_BL","PA_11_BL ");

        for (int i = 0; i < arrayPAK.size(); i++) {
            String current = arrayPAK.get(i);
            Display5.appendText(current + "\n");
        }
    }

    public void NewplayerPAK() {
        ArrayList<String> arrayPAK = new ArrayList<String>();

        arrayPAK.add(TAP5.getText());

        for (int i = 0; i < arrayPAK.size(); i++) {
            Display5.appendText(arrayPAK.get(i) + "\n");
        }
    }

    public void DeleteplayerPAK() {
        ArrayList<String> arrayPAK = new ArrayList<String>();

        arrayPAK.add("PA_1_BT");
        arrayPAK.add("PA_2_BT");
        arrayPAK.add("PA_3_BT");
        arrayPAK.add("PA_4_BT");
        arrayPAK.add("PA_5_BT");
        arrayPAK.add("PA_6_BT");
        arrayPAK.add("PA_7_BT");
        arrayPAK.add("PA_8_BL");
        arrayPAK.add("PA_9_BL");
        arrayPAK.add("PA_10_BL");
        arrayPAK.add("PA_11_BL");

        arrayPAK.remove(TRP5.getText());
        Display5.clear();

        for (int i = 0; i < arrayPAK.size(); i++) {
            Display5.appendText(arrayPAK.get(i) + "\n");
        }
    }

    //*******************************************************************************************************************************************************

    public void ShowplayerAFG() {
        Display6.clear();
        List<String> arrayAFG = Arrays.asList("AF_1_BT","AF_2_BT","AF_3_BT","AF_4_BT","AF_5_BT","AF_6_BT","AF_7_BT","AF_8_BL","AF_9_BL","AF_10_BL","AF_11_BL");

        for (int i = 0; i < arrayAFG.size(); i++) {
            Display6.appendText(arrayAFG.get(i) + "\n");
        }
    }

    public void NewplayerAFG() {
        ArrayList<String> arrayAFG = new ArrayList<String>();

        arrayAFG.add(TAP6.getText());

        for (int i = 0; i < arrayAFG.size(); i++) {
            Display6.appendText(arrayAFG.get(i) + "\n");
        }
    }

    public void DeleteplayerAFG() {
        ArrayList<String> arrayAFG = new ArrayList<String>();

        arrayAFG.add("AF_1_BT");
        arrayAFG.add("AF_2_BT");
        arrayAFG.add("AF_3_BT");
        arrayAFG.add("AF_4_BT");
        arrayAFG.add("AF_5_BT");
        arrayAFG.add("AF_6_BT");
        arrayAFG.add("AF_7_BT");
        arrayAFG.add("AF_8_BL");
        arrayAFG.add("AF_9_BL");
        arrayAFG.add("AF_10_BL");
        arrayAFG.add("AF_11_BL");

        arrayAFG.remove(TRP6.getText());
        Display6.clear();

        for (int i = 0; i < arrayAFG.size(); i++) {
            Display6.appendText(arrayAFG.get(i) + "\n");
        }
    }

    //*******************************************************************************************************************************************************

    public void ShowplayerENG() {
        Display7.clear();
        List<String> arrayENG = Arrays.asList("EN_1_BT","EN_2_BT","EN_3_BT","EN_4_BT","EN_5_BT","EN_6_BT","EN_7_BT","EN_8_BL","EN_9_BL","EN_10_BL","EN_11_BL");

        for (int i = 0; i < arrayENG.size(); i++) {
            String current = arrayENG.get(i);
            Display7.appendText(current + "\n");
        }
    }

    public void NewplayerENG() {
        ArrayList<String> arrayENG = new ArrayList<String>();

        arrayENG.add(TAP7.getText());

        for (int i = 0; i < arrayENG.size(); i++) {
            Display7.appendText(arrayENG.get(i) + "\n");
        }
    }

    public void DeleteplayerENG() {
        ArrayList<String> arrayENG = new ArrayList<String>();

        arrayENG.add("EN_1_BT");
        arrayENG.add("EN_2_BT");
        arrayENG.add("EN_3_BT");
        arrayENG.add("EN_4_BT");
        arrayENG.add("EN_5_BT");
        arrayENG.add("EN_6_BT");
        arrayENG.add("EN_7_BT");
        arrayENG.add("EN_8_BL");
        arrayENG.add("EN_9_BL");
        arrayENG.add("EN_10_BL");
        arrayENG.add("EN_11_BL");

        arrayENG.remove(TRP7.getText());
        Display7.clear();

        for (int i = 0; i < arrayENG.size(); i++) {
            Display7.appendText(arrayENG.get(i) + "\n");
        }
    }

}




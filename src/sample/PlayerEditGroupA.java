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

public class PlayerEditGroupA   {
    @FXML
    TextArea Display;
    @FXML
    Button DP;
    @FXML
    TextField TRP;
    @FXML
    TextField TAP;

    @FXML
    TextArea Display1;
    @FXML
    Button DP1;
    @FXML
    TextField TRP1;
    @FXML
    TextField TAP1;

    @FXML
    TextArea Display2;
    @FXML
    Button DP2;
    @FXML
    TextField TRP2;
    @FXML
    TextField TAP2;

    @FXML
    TextArea Display3;
    @FXML
    Button DP3;
    @FXML
    TextField TRP3;
    @FXML
    TextField TAP3;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/playerDisplay2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Showplayer() {
        Display.clear();
        List<String> arraySL = Arrays.asList("SL_1_BT","SL_2_BT", "SL_3_BT","SL_4_BT","SL_5_BT","SL_6_BT", "SL_7_BT", "SL_8_BL", "SL_9_BL", "SL_10_BL","SL_11_BL");

        for (int i = 0; i < arraySL.size(); i++) {
            Display.appendText(arraySL.get(i) + "\n");
        }
    }

    public void Newplayer() {
        ArrayList<String> arraySL = new ArrayList<String>();

        arraySL.add(TAP.getText());

        for (int i = 0; i < arraySL.size(); i++) {
            Display.appendText(arraySL.get(i) + "\n");
        }
    }

    public void Deleteplayer() {
        ArrayList<String> arraySL = new ArrayList<String>();

        arraySL.add("SL_1_BT");
        arraySL.add("SL_2_BT");
        arraySL.add("SL_3_BT");
        arraySL.add("SL_4_BT");
        arraySL.add("SL_5_BT");
        arraySL.add("SL_6_BT");
        arraySL.add("SL_7_BT");
        arraySL.add("SL_8_BL");
        arraySL.add("SL_9_BL");
        arraySL.add("SL_10_BL");
        arraySL.add("SL_11_BL");

        arraySL.remove(TRP.getText());
        Display.clear();

        for (int i = 0; i < arraySL.size(); i++) {
            Display.appendText(arraySL.get(i) + "\n");
        }
    }

    //*******************************************************************************************************************************************************

        public void ShowplayerAUS() {
            Display1.clear();
            List<String> arrayAUS = Arrays.asList("AU_1_BT","AU_2_BT", "AU_3_BT","AU_4_BT","AU_5_BT","AU_6_BT","AU_7_BT","AU_8_BL","AU_9_BL","AU_10_BL","AU_11_BL");

            for (int i = 0; i < arrayAUS.size(); i++) {
                Display1.appendText(arrayAUS.get(i) + "\n");
            }
        }

        public void NewplayerAUS() {
            ArrayList<String> arrayAUS = new ArrayList<String>();

            arrayAUS.add(TAP1.getText());

            for (int i = 0; i < arrayAUS.size(); i++) {
                Display1.appendText(arrayAUS.get(i) + "\n");
            }
        }

        public void DeleteplayerAUS() {
            ArrayList<String> arrayAUS = new ArrayList<String>();

            arrayAUS.add("AU_1_BT");
            arrayAUS.add("AU_2_BT");
            arrayAUS.add("AU_3_BT");
            arrayAUS.add("AU_4_BT");
            arrayAUS.add("AU_5_BT");
            arrayAUS.add("AU_6_BT");
            arrayAUS.add("AU_7_BT");
            arrayAUS.add("AU_8_BL");
            arrayAUS.add("AU_9_BL");
            arrayAUS.add("AU_10_BL");
            arrayAUS.add("AU_11_BL");

            arrayAUS.remove(TRP1.getText());
            Display1.clear();

            for (int i = 0; i < arrayAUS.size(); i++) {
                Display1.appendText(arrayAUS.get(i) + "\n");
            }
        }

    //*******************************************************************************************************************************************************

    public void ShowplayersBAN(){
        Display2.clear();
        List<String> arrayBAN = Arrays.asList("BA_1_BT","BA_2_BT", "BA_3_BT","BA_4_BT","BA_5_BT","BA_6_BT","BA_7_BT","BA_8_BL","BA_9_BL","BA_10_BL","BA_11_BL");

        for (int i = 0; i < arrayBAN.size(); i++) {
            Display2.appendText(arrayBAN.get(i) + "\n");
        }
    }

    public void NewplayerBAN(){
        ArrayList<String> arrayBAN = new ArrayList<String>();

        arrayBAN.add(TAP2.getText());

        for (int i = 0; i < arrayBAN.size(); i++) {
            Display2.appendText(arrayBAN.get(i) + "\n");
        }
    }

    public void DeleteplayerBAN(){
        ArrayList<String> arrayBAN = new ArrayList<String>();

        arrayBAN.add("BA_1_BT");
        arrayBAN.add("BA_2_BT");
        arrayBAN.add("BA_3_BT");
        arrayBAN.add("BA_4_BT");
        arrayBAN.add("BA_5_BT");
        arrayBAN.add("BA_6_BT");
        arrayBAN.add("BA_7_BT");
        arrayBAN.add("BA_8_BL");
        arrayBAN.add("BA_9_BL");
        arrayBAN.add("BA_10_BL");
        arrayBAN.add("BA_11_BL");

        arrayBAN.remove(TRP2.getText());
        Display2.clear();

        for (int i = 0; i < arrayBAN.size(); i++) {
            Display2.appendText(arrayBAN.get(i) + "\n");
        }
    }

    //*******************************************************************************************************************************************************

    public void ShowplayerWI(){
        Display3.clear();
        List<String> arrayWI = Arrays.asList("WI_1_BT","WI_2_BT","WI_3_BT","WI_4_BT","WI_5_BT","WI_6_BT","WI_7_BT","WI_8_BL","WI_9_BL","WI_10_BL","WI_11_BL");

        for (int i = 0; i < arrayWI.size(); i++) {
            Display3.appendText(arrayWI.get(i) + "\n");
        }
    }

    public void NewplayerWI(){
        ArrayList<String> arrayWI = new ArrayList<String>();

        arrayWI.add(TAP3.getText());

        for (int i = 0; i < arrayWI.size(); i++) {
            Display3.appendText(arrayWI.get(i) + "\n");
        }
    }

    public void DeleteplayerWI(){
        ArrayList<String> arrayWI = new ArrayList<String>();

        arrayWI.add("WI_1_BT");
        arrayWI.add("WI_2_BT");
        arrayWI.add("WI_3_BT");
        arrayWI.add("WI_4_BT");
        arrayWI.add("WI_5_BT");
        arrayWI.add("WI_6_BT");
        arrayWI.add("WI_7_BT");
        arrayWI.add("WI_8_BL");
        arrayWI.add("WI_9_BL");
        arrayWI.add("WI_10_BL");
        arrayWI.add("WI_11_BL");

        arrayWI.remove(TRP3.getText());
        Display3.clear();

        for (int i = 0; i < arrayWI.size(); i++) {
            Display3.appendText(arrayWI.get(i) + "\n");
        }
    }
}




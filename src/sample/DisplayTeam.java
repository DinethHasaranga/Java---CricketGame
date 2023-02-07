package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisplayTeam {

    @FXML
    TextArea displayT;

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

    public void DisplayTeam(ActionEvent event){
        TeamDetails td = new TeamDetails();

        td.setPlayer1("SL_1_BT");td.setPlayer2("SL_2_BT");td.setPlayer3("SL_3_BT");td.setPlayer4("SL_4_BT");td.setPlayer5("SL_5_BT");td.setPlayer6("SL_6_BT");td.setPlayer7("SL_7_BT");
        td.setPlayer8("SL_8_BL");td.setPlayer9("SL_9_BL");td.setPlayer10("SL_10_BL");td.setPlayer11("SL_11_BL");

        List<String> displaySL = new ArrayList<String>();

        displaySL.add(td.getPlayer1());displaySL.add(td.getPlayer2());displaySL.add(td.getPlayer3());displaySL.add(td.getPlayer4());displaySL.add(td.getPlayer5());
        displaySL.add(td.getPlayer6());displaySL.add(td.getPlayer7());displaySL.add(td.getPlayer8());displaySL.add(td.getPlayer9());displaySL.add(td.getPlayer10());
        displaySL.add(td.getPlayer11());

        displayT.appendText("SRI LANKA" + "\n");
        displayT.appendText(String.valueOf(displaySL) + "\n");
        displayT.appendText("\n");

//------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td2 = new TeamDetails();

        td2.setPlayer1("AU_1_BT");td2.setPlayer2("AU_2_BT");td2.setPlayer3("AU_3_BT");td2.setPlayer4("AU_4_BT");td2.setPlayer5("AU_5_BT");td2.setPlayer6("AU_6_BT");td2.setPlayer7("AU_7_BT");
        td2.setPlayer8("AU_8_BL");td2.setPlayer9("AU_9_BL");td2.setPlayer10("AU_10_BL");td2.setPlayer11("AU_11_BL");

        List<String> displayAUS = new ArrayList<String>();

        displayAUS.add(td2.getPlayer1());displayAUS.add(td2.getPlayer2());displayAUS.add(td2.getPlayer3());displayAUS.add(td2.getPlayer4());displayAUS.add(td2.getPlayer5());
        displayAUS.add(td2.getPlayer6());displayAUS.add(td2.getPlayer7());displayAUS.add(td2.getPlayer8());displayAUS.add(td2.getPlayer9());displayAUS.add(td2.getPlayer10());
        displayAUS.add(td2.getPlayer11());

        displayT.appendText("AUSTRALIA" + "\n");
        displayT.appendText(String.valueOf(displayAUS) + "\n");
        displayT.appendText("\n");

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td3 = new TeamDetails();

        td3.setPlayer1("BA_1_BT");td3.setPlayer2("BA_2_BT");td3.setPlayer3("BA_3_BT");td3.setPlayer4("BA_4_BT");td3.setPlayer5("BA_5_BT");td3.setPlayer6("BA_6_BT");td3.setPlayer7("BA_7_BT");
        td3.setPlayer8("BA_8_BL");td3.setPlayer9("BA_9_BL");td3.setPlayer10("BA_10_BL");td3.setPlayer11("BA_11_BL");

        List<String> displayBAN = new ArrayList<String>();

        displayBAN.add(td3.getPlayer1());displayBAN.add(td3.getPlayer2());displayBAN.add(td3.getPlayer3());displayBAN.add(td3.getPlayer4());displayBAN.add(td3.getPlayer5());
        displayBAN.add(td3.getPlayer6());displayBAN.add(td3.getPlayer7());displayBAN.add(td3.getPlayer8());displayBAN.add(td3.getPlayer9());displayBAN.add(td3.getPlayer10());
        displayBAN.add(td3.getPlayer11());

        displayT.appendText("BANGLADESH" + "\n");
        displayT.appendText(String.valueOf(displayBAN) + "\n");
        displayT.appendText("\n");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td4 = new TeamDetails();

        td4.setPlayer1("WI_1_BT");td4.setPlayer2("WI_2_BT");td4.setPlayer3("WI_3_BT");td4.setPlayer4("WI_4_BT");td4.setPlayer5("WI_5_BT");td4.setPlayer6("WI_6_BT");td4.setPlayer7("WI_7_BT");
        td4.setPlayer8("WI_8_BL");td4.setPlayer9("WI_9_BL");td4.setPlayer10("WI_10_BL");td4.setPlayer11("WI_11_BL");

        List<String> displayWI = new ArrayList<String>();

        displayWI.add(td4.getPlayer1());displayWI.add(td4.getPlayer2());displayWI.add(td4.getPlayer3());displayWI.add(td4.getPlayer4());displayWI.add(td4.getPlayer5());
        displayWI.add(td4.getPlayer6());displayWI.add(td4.getPlayer7());displayWI.add(td4.getPlayer8());displayWI.add(td4.getPlayer9());displayWI.add(td4.getPlayer10());
        displayWI.add(td4.getPlayer11());

        displayT.appendText("WEST INDIES" + "\n");
        displayT.appendText(String.valueOf(displayWI) + "\n");
        displayT.appendText("\n");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td5 = new TeamDetails();

        td5.setPlayer1("IN_1_BT");td5.setPlayer2("IN_2_BT");td5.setPlayer3("IN_3_BT");td5.setPlayer4("IN_4_BT");td5.setPlayer5("IN_5_BT");td5.setPlayer6("IN_6_BT");td5.setPlayer7("IN_7_BT");
        td5.setPlayer8("IN_8_BL");td5.setPlayer9("IN_9_BL");td5.setPlayer10("IN_10_BL");td5.setPlayer11("IN_11_BL");

        List<String> displayIN = new ArrayList<String>();

        displayIN.add(td5.getPlayer1());displayIN.add(td5.getPlayer2());displayIN.add(td5.getPlayer3());displayIN.add(td5.getPlayer4());displayIN.add(td5.getPlayer5());
        displayIN.add(td5.getPlayer6());displayIN.add(td5.getPlayer7());displayIN.add(td5.getPlayer8());displayIN.add(td5.getPlayer9());displayIN.add(td5.getPlayer10());
        displayIN.add(td5.getPlayer11());

        displayT.appendText("INDIA" + "\n");
        displayT.appendText(String.valueOf(displayIN) + "\n");
        displayT.appendText("\n");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td6 = new TeamDetails();

        td6.setPlayer1("PA_1_BT");td6.setPlayer2("PA_2_BT");td6.setPlayer3("PA_3_BT");td6.setPlayer4("PA_4_BT");td6.setPlayer5("PA_5_BT");td6.setPlayer6("PA_6_BT");td6.setPlayer7("PA_7_BT");
        td6.setPlayer8("PA_8_BL");td6.setPlayer9("PA_9_BL");td6.setPlayer10("PA_10_BL");td6.setPlayer11("PA_11_BL");

        List<String> displayPAK = new ArrayList<String>();

        displayPAK.add(td6.getPlayer1());displayPAK.add(td6.getPlayer2());displayPAK.add(td6.getPlayer3());displayPAK.add(td6.getPlayer4());displayPAK.add(td6.getPlayer5());
        displayPAK.add(td6.getPlayer6());displayPAK.add(td6.getPlayer7());displayPAK.add(td6.getPlayer8());displayPAK.add(td6.getPlayer9());displayPAK.add(td6.getPlayer10());
        displayPAK.add(td6.getPlayer11());

        displayT.appendText("INDIA" + "\n");
        displayT.appendText(String.valueOf(displayPAK) + "\n");
        displayT.appendText("\n");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td7 = new TeamDetails();

        td7.setPlayer1("EN_1_BT");td7.setPlayer2("EN_2_BT");td7.setPlayer3("EN_3_BT");td7.setPlayer4("EN_4_BT");td7.setPlayer5("EN_5_BT");td7.setPlayer6("EN_6_BT");td7.setPlayer7("EN_7_BT");
        td7.setPlayer8("EN_8_BL");td7.setPlayer9("EN_9_BL");td7.setPlayer10("EN_10_BL");td7.setPlayer11("EN_11_BL");

        List<String> displayEN = new ArrayList<String>();

        displayEN.add(td7.getPlayer1());displayEN.add(td7.getPlayer2());displayEN.add(td7.getPlayer3());displayEN.add(td7.getPlayer4());displayEN.add(td7.getPlayer5());
        displayEN.add(td7.getPlayer6());displayEN.add(td7.getPlayer7());displayEN.add(td7.getPlayer8());displayEN.add(td7.getPlayer9());displayEN.add(td7.getPlayer10());
        displayEN.add(td7.getPlayer11());

        displayT.appendText("ENGLAND" + "\n");
        displayT.appendText(String.valueOf(displayEN) + "\n");
        displayT.appendText("\n");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TeamDetails td8 = new TeamDetails();

        td8.setPlayer1("AFG_1_BT");td8.setPlayer2("AFG_2_BT");td8.setPlayer3("AFG_3_BT");td8.setPlayer4("AFG_4_BT");td8.setPlayer5("AFG_5_BT");td8.setPlayer6("AFG_6_BT");td8.setPlayer7("AFG_7_BT");
        td8.setPlayer8("AFG_8_BL");td8.setPlayer9("AFG_9_BL");td8.setPlayer10("AFG_10_BL");td8.setPlayer11("AFG_11_BL");

        List<String> displayAFG = new ArrayList<String>();

        displayAFG.add(td8.getPlayer1());displayAFG.add(td8.getPlayer2());displayAFG.add(td8.getPlayer3());displayAFG.add(td8.getPlayer4());displayAFG.add(td8.getPlayer5());
        displayAFG.add(td8.getPlayer6());displayAFG.add(td8.getPlayer7());displayAFG.add(td8.getPlayer8());displayAFG.add(td8.getPlayer9());displayAFG.add(td8.getPlayer10());
        displayAFG.add(td8.getPlayer11());

        displayT.appendText("AFGANISTAN" + "\n");
        displayT.appendText(String.valueOf(displayAFG) + "\n");
        displayT.appendText("\n");

    }
}

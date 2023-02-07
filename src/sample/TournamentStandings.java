package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TournamentStandings extends Main2 {

    @FXML
    Label W1;
    @FXML
    Label W2;
    @FXML
    Label W3;
    @FXML
    Label W4;
    @FXML
    Label W5;
    @FXML
    Label W6;
    @FXML
    Label W7;
    @FXML
    Label W8;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void mainGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../FXML_FILES/StartPage1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static <T, U> List<U>
    convertStringListToIntList(List<T> listOfString,
                               Function<T, U> function) {
        return listOfString.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public void tournament() {
        List<String> srilankacount = Collections.emptyList();
        try {
            srilankacount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\srilankawinCount.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Required file is not found");
        }
            //System.out.println(srilankacount);
            int j = 0;

            List<Integer> sriLankaCountList = convertStringListToIntList(
                    srilankacount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < sriLankaCountList.size(); i++) {
                j += sriLankaCountList.get(i);
            }
            System.out.println(j);
//----------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> australiacount = Collections.emptyList();
            try {
                australiacount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\australiawinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(australiacount);

            int j1 = 0;

            List<Integer> australiaCountList = convertStringListToIntList(
                    australiacount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < australiaCountList.size(); i++) {
                j1 += australiaCountList.get(i);
            }
            System.out.println(j1);
//------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> bangladeshcount = Collections.emptyList();
            try {
                bangladeshcount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\bangladeshwinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(australiacount);

            int j2 = 0;

            List<Integer> bangladeshCountList = convertStringListToIntList(
                    bangladeshcount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < bangladeshCountList.size(); i++) {
                j2 += bangladeshCountList.get(i);
            }
            System.out.println(j2);

            //------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> englandcount = Collections.emptyList();
            try {
                englandcount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\englandwinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(australiacount);

            int j3 = 0;

            List<Integer> englandCountList = convertStringListToIntList(
                    englandcount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < englandCountList.size(); i++) {
                j3 += englandCountList.get(i);
            }
            System.out.println(j3);

            //------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> afghancount = Collections.emptyList();
            try {
                afghancount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\afghanwinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(australiacount);

            int j4 = 0;

            List<Integer> afghanCountList = convertStringListToIntList(
                    afghancount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < afghanCountList.size(); i++) {
                j4 += afghanCountList.get(i);
            }
            System.out.println(j4);

            //------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> indiacount = Collections.emptyList();
            try {
                indiacount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\indiawinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(australiacount);

            int j5 = 0;

            List<Integer> indiaCountList = convertStringListToIntList(
                    indiacount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < indiaCountList.size(); i++) {
                j5 += afghanCountList.get(i);
            }
            System.out.println(j5);

            //------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> windiescount = Collections.emptyList();
            try {
                windiescount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\windieswinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(windiescount);

            int j6 = 0;

            List<Integer> windiesCountList = convertStringListToIntList(
                    windiescount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < windiesCountList.size(); i++) {
                j6 += windiesCountList.get(i);
            }
            System.out.println(j6);

            //------------------------------------------------------------------------------------------------------------------------------------------------------------
            List<String> pakistancount = Collections.emptyList();
            try {
                pakistancount = Files.readAllLines(Paths.get("C:\\Users\\HP\\java fx course work final\\Files\\pakistanwinCount.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Required file is not found");
            }
            //System.out.println(windiescount);

            int j7 = 0;

            List<Integer> pakistanCountList = convertStringListToIntList(
                    pakistancount,
                    Integer::parseInt);
            //System.out.println(sriLankaCountList);
            for (int i = 0; i < pakistanCountList.size(); i++) {
                j7 += pakistanCountList.get(i);
            }
            System.out.println(j7);


            List<Integer> matchWinCountListGroupA = new ArrayList<Integer>();
            List<Integer> matchWinCountListGroupB = new ArrayList<Integer>();

            List<String> teamGroupA = Arrays.asList("SriLanka", "Australia", "Bangladesh", "West Indies");
            List<String> teamGroupB = Arrays.asList("India", "Pakistan", "Afghanistan", "England");

            HashMap<String, Integer> tournamentStandingsA = new HashMap<String, Integer>();
            HashMap<String, Integer> tournamentStandingsB = new HashMap<String, Integer>();


            //TOURNAMENT STANDINGS
            matchWinCountListGroupA.add(j);
            matchWinCountListGroupA.add(j1);
            matchWinCountListGroupA.add(j2);
            matchWinCountListGroupA.add(j6);

            matchWinCountListGroupB.add(j5);
            matchWinCountListGroupB.add(j7);
            matchWinCountListGroupB.add(j4);
            matchWinCountListGroupB.add(j3);

            //TOURNAMENT STANDINGS GROUP A
            for (int k = 0; k < teamGroupA.size(); k++) {
                tournamentStandingsA.put(teamGroupA.get(k), matchWinCountListGroupA.get(k));
            }

            System.out.println("TOURNAMENT STANDINGS GROUP A");

            Set<Map.Entry<String, Integer>> entrySet = tournamentStandingsA.entrySet();
            List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
            Collections.sort(list, (o2, o1) -> o1.getValue().compareTo(o2.getValue()));
            list.forEach(s -> {
                System.out.println(s.getKey() + "\t" + s.getValue());
            });
            W1.setText("Sri Lanka   " + String.valueOf(j));
            W2.setText("Austarlia   " + String.valueOf(j1));
            W3.setText("Bangladesh  " + String.valueOf(j2));
            W4.setText("West Indies " + String.valueOf(j3));

            System.out.println("");

            //TOURNAMENT STANDINGS GROUP B
            for (int k = 0; k < teamGroupB.size(); k++) {
                tournamentStandingsB.put(teamGroupB.get(k), matchWinCountListGroupB.get(k));
            }

            System.out.println("TOURNAMENT STANDINGS GROUP B");

            Set<Map.Entry<String, Integer>> entrySetB = tournamentStandingsB.entrySet();
            List<Map.Entry<String, Integer>> listB = new ArrayList<>(entrySetB);
            Collections.sort(listB, (B2, B1) -> B1.getValue().compareTo(B2.getValue()));
            listB.forEach(s1 -> {
                System.out.println(s1.getKey() + "\t" + s1.getValue());
            });

            W5.setText("England     " + String.valueOf(j4));
            W6.setText("Afghanistan " + String.valueOf(j5));
            W7.setText("Pakistan    " + String.valueOf(j6));
            W8.setText("India       " + String.valueOf(j7));
        }
    }

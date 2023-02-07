package sample;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test1Test {

    Test1 k = new Test1();

    /*@Test
    public void Toss() {
        String actual = k.Toss();
        String expected = "Tail";
        assertEquals(expected, actual);
    }*/

    @Test
    public void WideToScore(){
        int actual = k.WideToScore();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void NoballToScore(){
        int actual = k.NoballToScore();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void WicketCounter(){
        int actual = k.WicketCounter();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void Score(){
        int actual = k.Score();
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void BallCounter(){
        int actual = k.BallCounter();
        int expected = 7;
        assertEquals(expected,actual);
    }

    @Test
    public void IndividualBatsmanScore(){
        int actual = k.IndividualBatsmanScore();
        int expected = 31;
        assertEquals(expected,actual);
    }

    @Test
    public void WinCount(){
        int actual = k.WinCount();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void LossCount(){
        int actual = k.LossCount();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void MatchDraw(){
        String actual = k.MatchDraw();
        String expected = "Match is Draw";
        assertEquals(expected,actual);
    }

    @Test
    public void BatsmanScore(){
        int actual = k.BatsmanScore();
        int expected = 44;
        assertEquals(expected,actual);
    }

    @Test
    public void BolwerScore(){
        int actual = k.BowlerScore();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void BatsmanPosition(){
        int actual = k.BatsmanPosition();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void BowlerPosition(){
        int actual = k.BowlerPosition();
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void AddToList(){
        int actual = k.AddToList();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void RemoveFromList(){
        int actual = k.RemoveFromList();
        int expected = 2;
        assertEquals(expected,actual);
    }
}

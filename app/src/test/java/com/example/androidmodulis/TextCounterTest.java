package com.example.androidmodulis;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextCounterTest {
    @Test
    //neįvedamas joks tekstas
    public void noInputTestChars() {
        String inputValue = null;
        int expectedResult = 0;
        int actualResult = Functions.countChars(inputValue);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    //normalus tekstas
    public void normalInputTestChars() {
        String inputValue = "abcd";
        int expectedResult = 4;
        int actualResult = Functions.countChars(inputValue);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    // įvedamas tik 'space'
    public void spacesTestChars() {
        String inputValue = "";
        int expectedResult = 0;
        int actualResult = Functions.countChars(inputValue);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    //įvedamas normalūs žodžiai
    public void normalInputTestWords() {
        String inputValue = "Tikrinimai yra gerai";
        int expectedResult = 3;
        int actualResult = Functions.countWords(inputValue);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    //neįvedamas joks tekstas
    public void noInputTestWords() {
        String inputValue = "";
        int expectedResult = 0;
        int actualResult = Functions.countWords(inputValue);
        assertEquals(expectedResult, actualResult);
    }
}


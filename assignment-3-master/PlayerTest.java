package Assingment3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player testing = new Player();


    @Test
    public void setName() {
        String expected = "Ali", expected2 = "Marcos", expected3= "John",expected4 = "Emilia", expected5 = "Lana";
        String actual;

        testing.setName(expected);
        actual = testing.getName();
        assertEquals(expected, actual);

        testing.setName(expected2);
        actual = testing.getName();
        assertEquals(expected2, actual);

        testing.setName(expected3);
        actual = testing.getName();
        assertEquals(expected3, actual);

        testing.setName(expected4);
        actual = testing.getName();
        assertEquals(expected4, actual);

        testing.setName(expected5);
        actual = testing.getName();
        assertEquals(expected5, actual);

    }

    @Test
    public void setAge() {
        int expected = 20,expected2 = 30, expected3= 40,expected4 = 50, expected5 = 60;

        testing.setAge(expected);
        int actual = testing.getAge();
        assertEquals(actual, expected);

        testing.setAge(expected2);
        actual = testing.getAge();
        assertEquals(actual, expected2);

        testing.setAge(expected3);
        actual = testing.getAge();
        assertEquals(actual, expected3);

        testing.setAge(expected4);
        actual = testing.getAge();
        assertEquals(actual, expected4);

        testing.setAge(expected5);
        actual = testing.getAge();
        assertEquals(actual, expected5);


    }

    @Test
    public void setDate()  {
        try {
            int expected = 2020;
            int expected2 = 11;
            int expected3 = 06;
            testing.setDate(expected, expected2, expected3);

            int expectedYear = 1999;
            int expectedMonth = 06;
            int expectedDay = 01;
            testing.setDate(expectedYear, expectedMonth, expectedDay);


            int expectedYear1 = 2020;
            int expectedMonth1 = 10;
            int expectedDay1 = 15;
            testing.setDate(expectedYear1, expectedMonth1, expectedDay1);


            int expectedYear2 = 1985;
            int expectedMonth2 = 05;
            int expectedDay2 = 29;
            testing.setDate(expectedYear2, expectedMonth2, expectedDay2);


            int expectedYear3 = 2019;
            int expectedMonth3 = 3;
            int expectedDay3= 25;
            testing.setDate(expectedYear3, expectedMonth3, expectedDay3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setSurvey() {
        String expected = "I love the game", expected2 = "It was hard for me ", expected3= "It was amazing, loved it",
                expected4 = "Maybe its better to add some hints", expected5 = "Wow, it was absolutely a fun experience";

        testing.setSurvey(expected);
        String actual = testing.getSurvey();
        assertEquals(expected, actual);

        testing.setSurvey(expected2);
         actual = testing.getSurvey();
        assertEquals(expected2, actual);

        testing.setSurvey(expected3);
        actual = testing.getSurvey();
        assertEquals(expected3, actual);

        testing.setSurvey(expected4);
        actual = testing.getSurvey();
        assertEquals(expected4, actual);

        testing.setSurvey(expected5);
        actual = testing.getSurvey();
        assertEquals(expected5, actual);
    }

    @Test
    public void getName() {
        String expected = "Johnny", expected2 = "Victor", expected3= "Bryan",expected4 = "John snow", expected5 = "Mother of dragons";

        testing.setName(expected);
        String actual = testing.getName();
        assertEquals(expected, actual);

        testing.setName(expected2);
        actual = testing.getName();
        assertEquals(expected2, actual);

        testing.setName(expected3);
        actual = testing.getName();
        assertEquals(expected3, actual);

        testing.setName(expected4);
        actual = testing.getName();
        assertEquals(expected4, actual);

        testing.setName(expected5);
        actual = testing.getName();
        assertEquals(expected5, actual);
    }

    @Test
    public void getAge() {
        int expected = 12,expected2 = 35, expected3= 25,expected4 = 65, expected5 =90;

        testing.setAge(expected);
        int actual = testing.getAge();
        assertEquals(expected, actual);

        testing.setAge(expected2);
         actual = testing.getAge();
        assertEquals(expected2, actual);

        testing.setAge(expected3);
        actual = testing.getAge();
        assertEquals(expected3, actual);

        testing.setAge(expected4);
        actual = testing.getAge();
        assertEquals(expected4, actual);

        testing.setAge(expected5);
        actual = testing.getAge();
        assertEquals(expected5, actual);
    }

    @Test
    public void getSurvey() {
        String expected = "was nice", expected2 = "SoSO", expected3= "Such an amazing game",
                expected4 = "Didn't like the game", expected5 = "Boring";


        testing.setSurvey(expected);
        String actual = testing.getSurvey();
        assertEquals(actual, expected);

        testing.setSurvey(expected2);
        actual = testing.getSurvey();
        assertEquals(actual, expected2);

        testing.setSurvey(expected3);
        actual = testing.getSurvey();
        assertEquals(actual, expected3);
    }

    @Test
    public void getDate() throws Exception {
        try {

            int year = 2020, month = 05, day = 06;
            testing.setDate(year, month, day);
            String actual = testing.getDate();
            assertEquals(day + "/" + month + "/" + year, actual);

            int year1 = 2019, month1 = 10, day1 = 13;
            testing.setDate(year1, month1, day1);
             actual = testing.getDate();
            assertEquals(day1 + "/" + month1 + "/" + year1, actual);

            int year2 = 2018, month2 = 12, day2 = 28;
            testing.setDate(year2, month2, day2);
            actual = testing.getDate();
            assertEquals(day2 + "/" + month2 + "/" + year2, actual);

            int year3 = 1995, month3 = 03, day3 = 01;
            testing.setDate(year3, month3, day3);
            actual = testing.getDate();
            assertEquals(day3 + "/" + month3 + "/" + year3, actual);

            int year4 = 1999, month4 = 07, day4 = 30;
            testing.setDate(year4, month4, day4);
            actual = testing.getDate();
            assertEquals(day4 + "/" + month4 + "/" + year4, actual);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setValidDate() {
        int expected = 2020;
        int expected2 = 11;
        int expected3 = 06;
        try {
            testing.setDate(expected, expected2, expected3);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
        assertEquals(expected3 + "/" + expected2 + "/" + expected, testing.getDate());

        expected = 1378;
        expected2 = 01;
        expected3 = 4;
        try {
            testing.setDate(expected, expected2, expected3);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
        assertEquals(expected3 + "/" + expected2 + "/" + expected, testing.getDate());
    }
    @Test
    public void setInvalidDate() {
        assertThrows(Exception.class,() -> {
            testing.setDate(2020, 13, 06);
        });

        assertThrows(Exception.class,() -> {
            testing.setDate(2020, 01, 40);
        });
    }
    @Test
    public void checkAli() {
        assertTrue(testing.isAli("Ali"));
        // This test will pass if the 3 lines of codes that I put in comment in player class in the lines 56,57,58 are commented out.
    }

    @Test
    public void checkJack() {
        assertFalse(testing.isAli("Jack"));

    }
}

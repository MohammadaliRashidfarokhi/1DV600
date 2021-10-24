

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player testing = new Player();

    @Test
    public void setName() {
        String deset = "Ali";
        testing.setName(deset);
        String actual = testing.getName();
        assertEquals(deset, actual);
    }

    @Test
    public void setAge() {
        int expected = 20;
        testing.setAge(expected);
        int actual = testing.getAge();
        assertEquals(actual, expected);
    }

    @Test
    public void setDate() throws Exception {
        int expected = 2020;
        int expected2 = 11;
        int expected3 = 06;
        testing.setDate(expected, expected2, expected3);
    }

    @Test
    public void setSurvey() {
        String expected = "I love the game";
        testing.setSurvey(expected);
        String actual = testing.getSurvey();
        assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Ali";
        testing.setName(expected);
        String expected2 = "Ali";
        String actual = testing.getName();
        assertEquals(expected2, actual);
    }

    @Test
    public void getAge() {
        int expected = 20;
        testing.setAge(expected);
        int expected2 = 20;
        int actual = testing.getAge();
        assertEquals(expected2, actual);
    }

    @Test
    public void getSurvey() {
        String expected = "I loved the game";
        testing.setSurvey(expected);
        String expected2 = "I loved the game";
        String actual = testing.getSurvey();
        assertEquals(actual, expected2);
    }

    @Test
    public void getDate() throws Exception {
        int year = 2020, month = 05, day = 06;
        testing.setDate(year, month, day);
        int year2 = 2020, month2 = 05, day2 = 06;
        String actual = testing.getDate();
        assertEquals(day2 + "/" + month2 + "/" + year2, actual);
    }

    @Test
    public void checkAli() {
        assertTrue(testing.isAli("Ali"));
        // This test will pass if the 3 line of codes that I put in comment in player class in the lines 56,57,58 are commented out.
    }

    @Test
    public void checkJack() {
        assertFalse(testing.isAli("Jack"));

    }
}

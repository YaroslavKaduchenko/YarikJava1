package aboutme;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @org.junit.jupiter.api.Test
    void weekAlgorythm() {
    }

    @org.junit.jupiter.api.Test
    void determoneDay_whenWorkday_thenHaveLessons() {
        String actual = DayOfTheWeek.determineDay("Workday");
        assertEquals("Have lessons", actual);
    }

    @org.junit.jupiter.api.Test
    void determoneDay_whenWeekend_thenDoHomework(){
        String actual = DayOfTheWeek.determineDay("Weekend");
        assertEquals("Do homework", actual);
    }

    @org.junit.jupiter.api.Test
    void determoneDay_whenSmthElse_thenTakeARest(){
        String actual = DayOfTheWeek.determineDay("Abracadabra");
        assertEquals("Take a rest", actual);
    }
}

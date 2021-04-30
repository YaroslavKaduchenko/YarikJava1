package aboutme;

import static org.junit.jupiter.api.Assertions.*;

class MyWeekTest {

    @org.junit.jupiter.api.Test
    void weekAlgorythm() {
    }

    @org.junit.jupiter.api.Test
    void weekAlgorythmShort_whenWorkDay_thenRurnGoTOSchool() {
        String actual = MyWeek.weekAlgorythmShort("Monday");
        assertEquals("GoToSchool", actual, "Oups, workdays don't work.");
    }

    @org.junit.jupiter.api.Test
    void weekAlgorythmShort_whenWeekend_thenReturnStayAtHome(){
        String actual = MyWeek.weekAlgorythmShort("Sunday");
        assertEquals("StayAtHome", actual);
    }

    @org.junit.jupiter.api.Test
    void weekAlgorythmShort_whenWrongInput_thenReturnError(){
        String actual = MyWeek.weekAlgorythmShort("Abracadabra");
        assertEquals("Error", actual);
    }
}
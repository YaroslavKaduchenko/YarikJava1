package algorytm;

import static algorytm.Fizbuz.*;
import static algorytm.Fizbuz.FIZBUZ;
import static org.junit.jupiter.api.Assertions.*;

    class FizbuzTest {

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithmOptimal_when3_thenFiz() {
            String actual = Fizbuz.fizbuzAlgorithmOptimal(3);
            assertEquals(FIZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithmOptimal_when5_thenBuz(){
            String actual = Fizbuz.fizbuzAlgorithmOptimal(5);
            assertEquals(BUZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithmOptimal_when15_thenFizbuz(){
            String actual = Fizbuz.fizbuzAlgorithmOptimal(15);
            assertEquals(FIZBUZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithmOptimal_when2_thenNothing(){
            String actual = Fizbuz.fizbuzAlgorithmOptimal(2);
            assertEquals("", actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithm_when3_thenFiz() {
            String actual = Fizbuz.fizbuzAlgorithm(3);
            assertEquals(FIZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithm_when5_thenBuz(){
            String actual = Fizbuz.fizbuzAlgorithm(5);
            assertEquals(BUZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithm_when15_thenFizbuz(){
            String actual = Fizbuz.fizbuzAlgorithm(15);
            assertEquals(FIZBUZ, actual);
        }

        @org.junit.jupiter.api.Test
        void FizbuzAlgorithm_when2_thenNothing(){
            String actual = Fizbuz.fizbuzAlgorithm(2);
            assertEquals("", actual);
        }

}
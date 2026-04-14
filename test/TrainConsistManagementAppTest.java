import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_Basic() {
        String[] arr = {"Sleeper","AC Chair","First Class"};
        Arrays.sort(arr);
        assertArrayEquals(new String[]{"AC Chair","First Class","Sleeper"}, arr);
    }

    @Test
    void testSort_SingleElement() {
        String[] arr = {"Sleeper"};
        Arrays.sort(arr);
        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}
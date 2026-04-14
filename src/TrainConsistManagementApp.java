import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC17 - Sort Bogie Names ");
        System.out.println("=======================================\n");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("After Sorting: " + Arrays.toString(bogies));
    }
}
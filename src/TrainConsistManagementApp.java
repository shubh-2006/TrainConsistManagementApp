import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        List<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        train.add(2, "Pantry Car");

        System.out.println("\nAfter inserting 'Pantry Car' at position 2:");
        System.out.println(train);

        train.remove(0);
        train.remove(train.size() - 1);

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}
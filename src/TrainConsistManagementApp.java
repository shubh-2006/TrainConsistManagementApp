import java.util.Arrays;

public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String searchId) {
        if (bogieIds.length == 0) {
            return false;
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = bogieIds[mid].compareTo(searchId);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchId = "BG205";

        System.out.println("=======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=======================================\n");

        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = binarySearch(bogieIds, searchId);

        System.out.println("\nSearch Key: " + searchId);
        System.out.println("Result: " + (found ? "Bogie found" : "Bogie not found"));
        System.out.println("\nUC19 execution completed...");
    }
}
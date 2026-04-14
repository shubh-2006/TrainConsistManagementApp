public class TrainConsistManagementApp {

    public static boolean linearSearch(String[] bogieIds, String searchId) {
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchId = "BG309";

        System.out.println("=======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=======================================\n");

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = linearSearch(bogieIds, searchId);

        System.out.println("\nSearch Key: " + searchId);
        System.out.println("Result: " + (found ? "Bogie found" : "Bogie not found"));
        System.out.println("\nUC18 execution completed...");
    }
}
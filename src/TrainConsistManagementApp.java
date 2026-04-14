public class TrainConsistManagementApp {

    public static boolean search(String[] bogieIds, String searchId) {

        // FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // SEARCH LOGIC
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("=======================================\n");

        String[] bogieIds = {};   // EMPTY CASE (important)
        String searchId = "BG101";

        try {
            boolean found = search(bogieIds, searchId);

            System.out.println("Search Key: " + searchId);
            System.out.println("Result: " + (found ? "Bogie found" : "Bogie not found"));

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}
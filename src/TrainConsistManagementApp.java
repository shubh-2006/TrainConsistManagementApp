import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC11 - Regex Validation ");
        System.out.println("=======================================\n");

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        boolean validTrain = Pattern.matches("TRN-\\d{4}", trainId);
        boolean validCargo = Pattern.matches("PET-[A-Z]{2}", cargo);

        System.out.println("Train ID Valid: " + validTrain);
        System.out.println("Cargo Code Valid: " + validCargo);
    }
}
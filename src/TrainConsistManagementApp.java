public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC14 - Custom Exception ");
        System.out.println("=======================================\n");

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1.name);

            Bogie b2 = new Bogie("AC Chair", -10);
            System.out.println("Created: " + b2.name);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
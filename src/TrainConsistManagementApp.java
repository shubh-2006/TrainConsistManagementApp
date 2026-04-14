public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String msg) {
            super(msg);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment");
                }
                this.cargo = cargo;
                System.out.println("Cargo Assigned: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Assignment attempt finished");
            }
        }

        boolean isCargoAssigned() {
            return cargo != null;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=======================================\n");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");
    }
}
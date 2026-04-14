public class TrainConsistManagementApp {

    // Bubble Sort method
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC16 - Bubble Sort (Passenger Capacity) ");
        System.out.println("=======================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original Capacities: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        bubbleSort(capacities);

        System.out.print("\nSorted Capacities: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}
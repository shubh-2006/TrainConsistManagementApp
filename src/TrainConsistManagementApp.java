import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("=======================================\n");

        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie("Sleeper", i % 100));
        }

        long start1 = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) loopResult.add(b);
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        List<Bogie> streamResult = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}
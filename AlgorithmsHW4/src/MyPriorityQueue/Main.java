package MyPriorityQueue;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();

        Comparator<Employee> nameSorter = Comparator.comparing(Employee::getName);
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(nameSorter);

        priorityQueue.add(new Employee(1l, "AAA", LocalDate.now()));
        priorityQueue.add(new Employee(4l, "CCC", LocalDate.now()));
        priorityQueue.add(new Employee(5l, "BBB", LocalDate.now()));
        priorityQueue.add(new Employee(2l, "FFF", LocalDate.now()));
        priorityQueue.add(new Employee(3l, "DDD", LocalDate.now()));
        priorityQueue.add(new Employee(6l, "EEE", LocalDate.now()));

        while(true)
        {
            Employee e = priorityQueue.poll();
            System.out.println(e);

            if(e == null) break;
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time spent: " + elapsedTime + " nanoseconds");
    }
}

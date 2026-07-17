package com.biet.dsa.dataStructures.nonLinear.heaps;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

// Comparator => For multiple parameter check
class Patient {
    String name;
    int severity; // 1 => High, 3 = Medium, 5 = Low
    LocalDateTime arrivalTime;

    public Patient(String name, int severity, LocalDateTime arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
    @Override
    public String toString(){
        return name + " ( severity=" + severity + ", arrival=" + arrivalTime + ")";
    }
}
public class EmergencyRoomII {
    public static void main(String[] args) {
        // Custom Comparator
        Queue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> {
                 if(p1.severity != p2.severity){
                     return Integer.compare(p1.severity, p2.severity);
                 }else {
                     return p1.arrivalTime.compareTo(p2.arrivalTime);
                 }
                }
        );
        queue.offer(new Patient("Allen", 3,
                LocalDateTime.of(2026, 7, 17, 10, 0)));
        queue.offer(new Patient("Sam", 1,
                LocalDateTime.of(2026, 7, 17, 10, 5)));
        queue.offer(new Patient("Joe", 1,
                LocalDateTime.of(2026, 7, 17, 10, 2)));
        // Let's see the first patient to be treated
        Patient treated = queue.poll();
        System.out.println("Patient that gets treated first: " + treated);
        System.out.println("Patients in queue: " + queue);
    }
}

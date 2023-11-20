package org.example.v3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhilosopherDining fivePhilosopher = new PhilosopherDining(5, 3);
        fivePhilosopher.startDinner();
    }
}

package com.ChapterSeven;

public class AirLine {
    private static int ECONOMIC_CLASS_SEAT = 5;
    boolean[] seatStatus = new boolean[10];
    private int FIRST_CLASS_SEAT = 5;

    public void assignFirstClass() {
        if (FIRST_CLASS_SEAT > 0) {
            checkSeat();
            FIRST_CLASS_SEAT--;
        }
    }


    public void assignEconomicClass() {
        if (ECONOMIC_CLASS_SEAT > 0) {
            int i = FIRST_CLASS_SEAT;
            for (; i < ECONOMIC_CLASS_SEAT; i++) {
                ECONOMIC_CLASS_SEAT--;
            }
        }
    }

    public boolean checkSeat() {
        int i = 0;
        for (; i < FIRST_CLASS_SEAT; i++) {
            if (seatStatus[i] = false) {
                seatStatus[i] = true;
            }
        }
        return seatStatus[i];
    }

    public void displayGreet() {
        String greeting = """
                welcome POP Airline
                Enter 1 for first class seat
                Enter 2 for Economic class seat
                """;
        System.out.println(greeting);
    }

    public void customerChoice(int seatChoice) {
        if (seatChoice == 1) {
            assignFirstClass();
        } else if (seatChoice == 2) {
            assignEconomicClass();
        }
    }

    public void recommedationMessage() {
        String message = """
                "Economic class is full,\\n  will you like First class seat"
                Enter 1 to proceed with first Class
                Enter 2 to Exit
                """;
        System.out.println(message);
    }

    public void exitPattern() {
        String exitMessage = """
                Sorry!!! for the inconvinecy
                Next flight leaves in 3 hours.
                """;
        System.out.println(exitMessage);

    }

    public void makeRecommadetion() {
        if (ECONOMIC_CLASS_SEAT == 0) {
            recommedationMessage();
        } else if (ECONOMIC_CLASS_SEAT == 0 && FIRST_CLASS_SEAT == 0) {
            exitPattern();
        }
    }
}



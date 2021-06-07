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
            checkSeat();
            ECONOMIC_CLASS_SEAT--;
        }
    }

    public boolean checkSeat() {
        int i = 0;
        for (; i < 5; i++) {
            if (seatStatus[i] = false) {
                seatStatus[i] = true;
            }
        }
        return seatStatus[i];
    }
    public void displayGreet() {
        String greeting = """
                welcome Afric Airline
                Enter 1 for first class seat
                Enter 2 for Ecinomic class seat
                """;
        System.out.println(greeting);
    }
    public void customerChoice(int seatChoice){
        if (seatChoice == 1){
            assignFirstClass();
        }else if(seatChoice == 2){
            assignEconomicClass();
        }
    }
    public void makeRecommadetion(){
        if (ECONOMIC_CLASS_SEAT == 0){

        }
    }
}

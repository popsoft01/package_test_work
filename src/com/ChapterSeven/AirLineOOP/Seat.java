package com.ChapterSeven.AirLineOOP;

public class Seat {
    private boolean seatStatus;
    private int seatNumber;

    public Seat(boolean seatStatus, int seatNumber) {
        this.seatStatus = seatStatus;
        this.seatNumber = seatNumber;
    }

    public boolean isSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(boolean seatStatus) {
        this.seatStatus = seatStatus;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatStatus=" + seatStatus +
                ", seatNumber=" + seatNumber +
                '}';
    }
}

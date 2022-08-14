package com.ChapterSeven.AirLineOOP;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String planeName;
    private List<Seat> seats = new ArrayList<>();

    public void assignEconomicSeat(Pessenger pessenger, Seat seat) {
        for (int i = 0; i < seats.size() / 2; i++) {
            if (!seat.isSeatStatus()) {
                pessenger.setSeatNumber(i + 1);
                boolean b = seat.isSeatStatus();
            }
        }
    }

    public void assignFirstSeat(Pessenger pessenger, Seat seat) {
        for (int i = seats.size() / 2; i < seats.size(); i++) {
            if (!seat.isSeatStatus()) {
                pessenger.setSeatNumber(i);
                boolean b = seat.isSeatStatus();
            }
        }
    }

    public String printPass(Pessenger pessenger, Seat seat) {
        return "welcome to elenu airline mr " + pessenger.toString() + "with seat details"
                + seat.toString();
    }
}

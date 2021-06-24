package com.ChapterEight;

public enum LigthColour {
    RED,
    GREEN,
    YELLOW;

//
//    LigthColour(int duration) {
//    }

    @Override
    public String toString() {
        switch (this){
            case RED -> { return "red"; }
            case GREEN -> { return "green"; }
            case YELLOW -> { return "yellow"; }

        }
        return super.toString();
    }
}

package com.ChapterEight;

public enum LigthColour {
    RED(20),
    GREEN(30),
    YELLOW(30);


    LigthColour(int duration) {
    }

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

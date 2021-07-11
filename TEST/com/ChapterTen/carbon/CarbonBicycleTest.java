package com.ChapterTen.carbon;

import org.junit.jupiter.api.BeforeEach;

public class CarbonBicycleTest {
    Bicycle bicycle;
    @BeforeEach
    void startEachWith(){
        bicycle = new Bicycle();
    }
}

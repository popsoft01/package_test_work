package mayersBriggs;

import org.junit.jupiter.api.Test;

public class MayerBriggsDemo {
    @Test
    void canChooseAnAnswer(){
        String quetion = "expend energy, enjoy groups or b. conserve energy, enjoy one-on-one";
        MayerBriggs.displayQuestion(quetion);
    }
}

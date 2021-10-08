package algorithmTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation cardValidation;
    @BeforeEach
    void setUp() {
        cardValidation  = new CreditCardValidation();
    }

    @Test
    void cardValidation() {
        String cardNumber = "4003600000000014";
        int[] stringArray =  {4,0,0,3,6,0,0,0,0,0,0,0,0,0,1,4};
        assertArrayEquals(stringArray, cardValidation.cardValidation(cardNumber));
    }
    @Test
    void cardNumberMultiplicationFromBack(){
        int[] stringArray =  {4,0,0,3,6,0,0,0,0,0,0,0,0,0,1,4};
        int[] newString = {4, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4};
        assertArrayEquals(newString,cardValidation.multiplyCardNumberFromBack(stringArray));
    }
    @Test
    void cardNumberSumation(){
//        int[] stringArray =  {1,2,3,4,5,6,7,8,9,1};
        int[] newString = {4, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4};
        assertEquals(25,cardValidation.sumTheCardNumber(newString));
    }
    @Test
    void checkForValidation(){
        assertTrue(cardValidation.isValid(25));
    }
//    @Test
//    void allValidation(){
//        asser
//    }
}
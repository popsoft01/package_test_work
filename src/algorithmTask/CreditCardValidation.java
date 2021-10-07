package algorithmTask;

import java.util.Arrays;

public class CreditCardValidation {
    public int[] cardValidation(String cardNumber) {
        int length = cardNumber.length();
        int[] cardNumberArray = new int[length];
        for (int i = 0; i < cardNumber.length(); i++) {
            cardNumberArray[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }
//        System.out.println(Arrays.toString(c));

        return cardNumberArray;
    }

    public int[] multiplyCardNumberFromBack(int[] stringArray) {
        int multiply = 0;
        for (int j = stringArray.length - 2; j > 0; j = j - 2) {
            multiply = stringArray[j] * 2;
            if (multiply > 9) {
                multiply = multiply % 10 + 1;
            }
            stringArray[j] = multiply;
//            System.out.println(Arrays.toString(stringArray));
        }
        System.out.println(Arrays.toString(stringArray));
        return stringArray;
    }

    public int sumTheCardNumber(int[] newString) {
        int totalSum = 0;
//        newString = multiplyCardNumberFromBack(newString);
        for (int j : newString) {
            totalSum = totalSum + j;
        }
        return totalSum;
    }

    public boolean isValid(int cardSummation) {
        return cardSummation % 10 == 0;
    }
}
package com.chapterFourteen;

public class Telephone {
    private String phoneNumber;

    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public String tokenSplit() {
      String  firstIndex = " ";
      String[] newToken = getPhonenumber().split(" ");
      for (int i = 0; i < newToken.length; i++){
          firstIndex = newToken[0];
      }
      return firstIndex;
    }

    public String tokenLastSplit() {
        String  lastIndex = " ";
        String[] newToken = getPhonenumber().split(" ");
        for (int i = 0; i < newToken.length; i++){
            lastIndex = newToken[newToken.length-1];
        }
        return lastIndex;
    }

    public String tokenLastFourSplit() {
        return tokenLastSplit().substring(5);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "phoneNumber='" + getPhonenumber() + '\'' + " first Four String= " + tokenSplit() + " Join first and last= " + tokenConcat() +
                '}';
    }

    public String tokenConcat() {
        return tokenSplit().concat(tokenLastFourSplit());
    }
}

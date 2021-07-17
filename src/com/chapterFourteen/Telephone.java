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
}

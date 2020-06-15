package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String CharacterConstantBy3 = "3";

    public String say(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        boolean isDivideBy7 = number % 7 == 0;
        if (isDividedBy3&&isDividedBy5){
          return FIZZ+BUZZ;
        }
        else if (isDividedBy3){
            return FIZZ;
        }else if (isDividedBy5){
            return BUZZ;
        }else if (isDivideBy7){
            return WHIZZ;
        }else if(isContainBy3(number)){
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isContainBy3(int num) {
        return String.valueOf(num).contains(CharacterConstantBy3);
    }
}

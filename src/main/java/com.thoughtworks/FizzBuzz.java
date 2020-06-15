package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FizzNumber = 3;
    public static final int BuzzNumber = 5;
    public static final int WhizzNumber = 7;


    public String say(int number) {

        if (isDividedByNum(number,FizzNumber)&&isDividedByNum(number,BuzzNumber)){
          return FIZZ+BUZZ;
        }
        if (isDividedByNum(number,WhizzNumber)&&isDividedByNum(number,FizzNumber)){
            return FIZZ+WHIZZ;
        }
        if (isDividedByNum(number,BuzzNumber)&&isDividedByNum(number,WhizzNumber)){
            return BUZZ+WHIZZ;
        }
         if (isDividedByNum(number,FizzNumber)){
            return FIZZ;
        }
        if (isDividedByNum(number,BuzzNumber)){
            return BUZZ;
        }
        if (isDividedByNum(number,WhizzNumber)){
            return WHIZZ;
        }

        if(isContainBy3(number)){
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isContainBy3(int num) {
        return String.valueOf(num).contains(String.valueOf(FizzNumber));
    }
    private boolean isDividedByNum(int dividend,int divisor){
        if (dividend % divisor == 0) {
            return true;
        }
        return false;
    }
}

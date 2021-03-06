package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FizzNumber = 3;
    public static final int BuzzNumber = 5;
    public static final int WhizzNumber = 7;


    public String say(int number) {
        if(isContainByNum(number,FizzNumber)&&!isContainByNum(number,BuzzNumber)){
            return FIZZ;
        }
        if (isDividedByNum(number,FizzNumber)&&isDividedByNum(number,BuzzNumber)&&isDividedByNum(number,WhizzNumber)&&!isContainByNum(number,BuzzNumber)&&!isContainByNum(number,BuzzNumber)){
            return FIZZ+BUZZ+WHIZZ;
        }
        if (isDividedByNum(number,FizzNumber)&&isDividedByNum(number,BuzzNumber)&&!isContainByNum(number,BuzzNumber)&&!isContainByNum(number,WhizzNumber)){
          return FIZZ+BUZZ;
        }
        if (isDividedByNum(number,WhizzNumber)&&isDividedByNum(number,FizzNumber)&&!isContainByNum(number,BuzzNumber)){
            return FIZZ+WHIZZ;
        }
        if (isDividedByNum(number,BuzzNumber)&&isDividedByNum(number,WhizzNumber)&&!isContainByNum(number,WhizzNumber)){
            return BUZZ+WHIZZ;
        }

         if (isDividedByNum(number,FizzNumber)&&(!isContainByNum(number,BuzzNumber)||isContainByNum(number,WhizzNumber))){
            return FIZZ;
        }
        if (isDividedByNum(number,BuzzNumber)&&!isContainByNum(number,WhizzNumber)){
            return BUZZ;
        }
        if (isDividedByNum(number,WhizzNumber)){
            return WHIZZ;
        }

        return String.valueOf(number);
    }

    private boolean isContainByNum(int number,int num) {
        return String.valueOf(number).contains(String.valueOf(num));
    }
    private boolean isDividedByNum(int dividend,int divisor){
        if (dividend % divisor == 0) {
            return true;
        }
        return false;
    }
}

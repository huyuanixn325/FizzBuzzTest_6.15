package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        boolean isDivideBy7 = number % 7 == 0;
        if (isDividedBy3&&isDividedBy5){
          return "FizzBuzz";
        }
        else if (isDividedBy3){
            return "Fizz";
        }else if (isDividedBy5){
            return "Buzz";
        }else if (isDivideBy7){
            return "Whizz";
        }else if(isContainBy3(number)){
            return "Fizz";
        }
        return String.valueOf(number);
    }

    private boolean isContainBy3(int num) {
        return String.valueOf(num).contains("3");
    }
}

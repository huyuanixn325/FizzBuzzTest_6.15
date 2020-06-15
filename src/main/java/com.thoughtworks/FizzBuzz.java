package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        if (isDividedBy3&&isDividedBy5){
          return "FizzBuzz";
        }
        else if (isDividedBy3){
            return "Fizz";
        }else if (isDividedBy5){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}

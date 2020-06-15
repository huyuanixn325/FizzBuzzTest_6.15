package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        if (isDividedBy3){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

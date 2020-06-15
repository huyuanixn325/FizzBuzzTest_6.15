package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        if (number % 3 == 0){
            return "Fizz";
        }else if (number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}

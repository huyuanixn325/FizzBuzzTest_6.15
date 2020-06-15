package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("1",result);
    }

    @Test
    public void should_return_Fizz_when_input_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Buzz_when_input_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Buzz",result);
    }

}

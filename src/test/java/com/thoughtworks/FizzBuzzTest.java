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

    @Test
    public void should_return_FizzBuzz_when_input_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void should_return_Whizz_when_input_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Whizz",result);
    }

    @Test
    public void should_return_Fizz_when_input_13(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 13;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }
}

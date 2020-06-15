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
        Assert.assertEquals("Buzz",result);
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
    public void should_return_Whizz_when_input_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 21;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("FizzWhizz",result);
    }
    @Test
    public void should_return_Whizz_when_input_70(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 70;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Whizz",result);
    }
    @Test
    public void should_return_Whizz_when_input_140(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 140;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("BuzzWhizz",result);
    }
    @Test
    public void should_return_Whizz_when_input_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 35;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("BuzzWhizz",result);
    }
    @Test
    public void should_return_Whizz_when_input_105(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 105;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("BuzzWhizz",result);
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
    @Test
    public void should_return_Fizz_when_input_153(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 153;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("153",result);
    }


    @Test
    public void should_return_Fizz_when_input_73(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 73;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Fizz_when_input_173(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 173;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Fizz_when_input_753(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 753;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Fizz_when_input_75(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 753;
        //when
        String result = fizzBuzz.say(number);
        //then
        Assert.assertEquals("Fizz",result);
    }
}

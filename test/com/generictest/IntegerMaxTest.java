package com.generictest;

import org.junit.Assert;
import org.junit.Test;



public class IntegerMaxTest {
   @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax()  {
       Integer result = new IntegerMax.FindMax<>(400,250,300).findMaxValue();
        Assert.assertEquals((Integer)400,result);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax()  {
        Integer result = new IntegerMax.FindMax<>(5,122,10).findMaxValue();
        Assert.assertEquals((Integer)122,result);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax()  {
        Integer result = new IntegerMax.FindMax<>(200,1600,800).findMaxValue();
        Assert.assertEquals((Integer)1600,result);
    }

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() {
        Integer result = new IntegerMax.FindMax<>(100, 300, 500, 2500).findMaxValue();
        Assert.assertEquals((Integer)2500,result);
    }

}
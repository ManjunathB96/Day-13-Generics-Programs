package com.generictest;

import com.generictest.MaximumTC1.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTC1Test {
   // Test Cases For Integer Array values
    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax()  {
        Integer max = new FindMax<>(400,250,300).findMaxValue();
        Assert.assertEquals((Integer) 400, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax()  {
        Integer max = new FindMax<>(5,25,10).findMaxValue();
        Assert.assertEquals((Integer) 25, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax()  {
       Integer max = new FindMax<>(200,600,800).findMaxValue();
        Assert.assertEquals((Integer) 800,max);
    }

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() {
        Integer max = new FindMax<>(100, 300, 500, 700).findMaxValue();
        Assert.assertEquals((Integer) 700, max);
    }

   // Test Cases For Float Array
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax()  {
        Float max = new FindMax<>(200f,100f,150f).findMaxValue();
        Assert.assertEquals((Float) 200f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float max = new FindMax<>(100f,150f,50f).findMaxValue();
        Assert.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax()  {
        Float max = new FindMax<>(100f,500f,1000f).findMaxValue();
        Assert.assertEquals((Float) 1000f, max);
    }

    @Test
    public void givenForthFloatNumberAsLarge_ShouldReturn_ForthNumberAsMax()  {
        Float max = new FindMax<>(150f,200f,100f,600f).findMaxValue();
        Assert.assertEquals((Float) 600f, max);
    }

   // Test Cases For String Array
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax()  {
        String max = new FindMax<>("Tanu", "Rohan", "Banu").findMaxValue();
        Assert.assertEquals("Tanu", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_SecondStringAsMax()  {
        String max = new FindMax<>("Manjunath", "Sadashiv", "Belagavi").findMaxValue();
        Assert.assertEquals("Sadashiv", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String max = new FindMax<>("Belagavi", "Manjunath", "Sadashiv").findMaxValue();
        Assert.assertEquals("Sadashiv", max);
    }
    @Test
    public void givenForthStringAsLarge_ShouldReturn_ForthStringAsMax(){
        String max = new FindMax<>("Manjunath", "Sadashiv", "Belagavi","You").findMaxValue();
        Assert.assertEquals("You", max);
    }

}
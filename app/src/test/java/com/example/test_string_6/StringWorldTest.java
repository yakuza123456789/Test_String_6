package com.example.test_string_6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringWorldTest {

    StringWorld stringWorld;

    @Before
   public void setUp(){
        System.out.println("Before");
        stringWorld = new StringWorld();
    }

    @Test
    public void reverseTest(){
        System.out.println("reverseTest");
       assertEquals("dlroW olleH", stringWorld.ReverseWorld("Hello World"));
    }


    @Test
    public void swapTest(){
        System.out.println("swapTest");
       assertEquals("World Hello", stringWorld.SwapWorld("Hello World"));
    }

    @After
    public void clearUp(){
        System.out.println("After");
    }

}

package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenTest {
    
    ExampleEven ob1=new ExampleEven();

    @Test
    public void isEven(){
        assertEquals("Even", ob1.even(10));
    }
}

package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App ob = new App();

    @Test
    public void shouldBeFive()
    {
        assertEquals( 5, ob.add( 2, 3 ) );
    }
    @Test
    public void shouldBeSix(){
        assertEquals(6,ob.add(2,3));
    }
    @Test
    public void shouldBeSeven(){
        assertEquals(7,ob.add(5,2));
    }
}
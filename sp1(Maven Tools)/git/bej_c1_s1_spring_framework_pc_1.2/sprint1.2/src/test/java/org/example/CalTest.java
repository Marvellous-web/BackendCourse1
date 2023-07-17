package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalTest {
    Calculator cal;

    @BeforeEach
    public void setup() {cal=new Calculator();}
    @AfterEach
    public void clean() {cal=null;}

    @Test
    public void testAddEqual() {assertEquals(7,cal.add(5,2));}
    @Test
    public void testAddNotEqual() {assertNotEquals(5,cal.add(5,2));}

    @Test
    public void testSubEqual() {assertEquals(3,cal.sub(5,2));}
    @Test
    public void testSubNotEqual() {assertNotEquals(5,cal.sub(5,2));}

    @Test
    public void testMulEqual() {assertEquals(10,cal.mul(5,2));}
    @Test
    public void testMulNotEqual() {assertNotEquals(5,cal.mul(5,2));}


}
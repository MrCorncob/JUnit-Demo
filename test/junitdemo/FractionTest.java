/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Le Vu Dai Yen <daiyen@daiyen.info>
 */
public class FractionTest {
    
    public FractionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Fraction.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(1, 2);
        Fraction expResult = new Fraction(3, 4);
        Fraction result = instance.add(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    /**
     * Test of add method, of class Fraction.
     */
    @Test
    public void tesstAddZero() {
        System.out.println("add zero");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(0, 2);
        Fraction expResult = new Fraction(1, 4);
        Fraction result = instance.add(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    
    /**
     * Test of add method, of class Fraction.
     */
    @Test(expected=Exception.class)
    public void testAddZeroDenominator() {
        System.out.println("add zero");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(0, 0);
        Fraction result = instance.add(frac);
        
    }
    /**
     * Test of subtract method, of class Fraction.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(1, 2);
        Fraction expResult = new Fraction(1, 4);
        Fraction result = instance.subtract(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    /**
     * Test of multiply method, of class Fraction.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(1, 2);
        Fraction expResult = new Fraction(1, 8);
        Fraction result = instance.multiply(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    /**
     * Test of multiply method, of class Fraction.
     */
    @Test
    public void testMultiplyNegative() {
        System.out.println("multiply with negative");
        Fraction frac = new Fraction(-1, 4);
        Fraction instance = new Fraction(1, -2);
        Fraction expResult = new Fraction(1, 8);
        Fraction result = instance.multiply(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }
    /**
     * Test of devide method, of class Fraction.
     */
    @Test
    public void testDevide() {
        System.out.println("subtract");
        Fraction frac = new Fraction(1, 4);
        Fraction instance = new Fraction(1, 2);
        Fraction expResult = new Fraction(2, 1);
        Fraction result = instance.devide(frac);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    /**
     * Test of toString method, of class Fraction.
     */
    @Ignore("skip to test code coverage")
    @Test
    public void testToString() {
        System.out.println("To String");
        Fraction instance = new Fraction(1, 2);
        String expResult = "1/2";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getNumerator method, of class Fraction.
     */
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        Fraction instance = new Fraction();
        int expResult = 0;
        int result = instance.getNumerator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumerator method, of class Fraction.
     */
    @Test
    public void testSetNumerator() {
        System.out.println("setNumerator");
        int numerator = 0;
        Fraction instance = new Fraction();
        instance.setNumerator(numerator);
    }

    /**
     * Test of getDenominator method, of class Fraction.
     */
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        Fraction instance = new Fraction();
        int expResult = 1;
        int result = instance.getDenominator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDenominator method, of class Fraction.
     */
    @Test
    public void testSetDenominator() {
        System.out.println("setDenominator");
        int denominator = 0;
        Fraction instance = new Fraction();
        instance.setDenominator(denominator);
    }
    
}

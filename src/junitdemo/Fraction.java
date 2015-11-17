/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import static java.lang.Math.abs;

/**
 *
 * @author Le Vu Dai Yen <daiyen@daiyen.info>
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int getGreatestDevisor(int a, int b) {
        while (a != 0 && b != 0) // until either one of them is 0
        {
            int c = b;
            b = a % b;
            a = c;
        }
        return a + b; // either one is 0, so return the non-zero value

    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    private void makeSimplest() {
        int greatestDevisor = getGreatestDevisor(abs(numerator), abs(denominator));
        this.numerator = this.numerator / greatestDevisor;
        this.denominator = this.denominator / greatestDevisor;
    }

    public Fraction add(Fraction frac) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac.denominator + frac.numerator * this.denominator;
        result.denominator = this.denominator * frac.denominator;
        result.makeSimplest();
        return result;
    }

    public Fraction subtract(Fraction frac) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac.denominator - frac.numerator * this.denominator;
        result.denominator = this.denominator * frac.denominator;
        result.makeSimplest();
        return result;
    }

    public Fraction multiply(Fraction frac) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac.numerator;
        result.denominator = this.denominator * frac.denominator;
        result.makeSimplest();
        return result;
    }

    public Fraction devide(Fraction frac) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac.denominator;
        result.denominator = this.denominator * frac.numerator;
        result.makeSimplest();
        return result;
    }
    
    @Override
    public String toString()
    {
        String result = String.format("%1$d/%2$d", this.numerator, this.denominator);
        return result;
    }
    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}

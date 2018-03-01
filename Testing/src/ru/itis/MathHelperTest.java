package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 01.03.2018
 * MathHelperTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MathHelperTest {
    private MathHelper testedMathHelper;

    @Before
    public void setUp() {
        testedMathHelper = new MathHelper();
    }

    @Test
    public void testIsPrimeOnPrimeNumber() {
        boolean result = testedMathHelper.isPrime(23);
        Assert.assertTrue(result);
    }

    @Test
    public void testPrimeOnNotPrimeNumber() {
        boolean result = testedMathHelper.isPrime(24);
        Assert.assertFalse(result);
    }

    @Test
    public void testPrimeOn9() {
        boolean result = testedMathHelper.isPrime(9);
        Assert.assertFalse(result);
    }
}

package com.test;

import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParenthesisMatchingTest {

    private ParenthesisMatching parenthesisMatching;

    @Before
    public void init() {
        parenthesisMatching = new ParenthesisMatching();
    }

    @org.junit.Test
    public void testBalanced() {
        assertTrue(parenthesisMatching.testBalanced("(a[0]+b[2c[6]]){24 + 53}"));
        assertTrue(parenthesisMatching.testBalanced("f(e(d))"));
        assertTrue(parenthesisMatching.testBalanced("[()]{}([])"));
        assertTrue(parenthesisMatching.testBalanced("(a[])"));
        assertFalse(parenthesisMatching.testBalanced("((b)"));
        assertFalse(parenthesisMatching.testBalanced("(c]"));
        assertFalse(parenthesisMatching.testBalanced("{(a[])"));
        assertFalse(parenthesisMatching.testBalanced("([)]"));
        assertFalse(parenthesisMatching.testBalanced(")("));
        assertFalse(parenthesisMatching.testBalanced(""));
        assertFalse(parenthesisMatching.testBalanced(null));
    }
}
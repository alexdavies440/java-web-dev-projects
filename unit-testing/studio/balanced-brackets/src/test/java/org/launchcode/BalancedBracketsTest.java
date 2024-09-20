package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testSingleInnerBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testSingleOuterBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testBracketSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testEnclosedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[String]"));
    }

    @Test
    public void testBracketSetOutsideString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]String"));
    }

    @Test
    public void testBracketSetWithinString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("St[rin]g"));
    }

    @Test
    public  void testBracketSetOverlapsString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Str[ing]"));
    }

    @Test
    public void testBracketSetInception() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Str[[]]"));
    }

    @Test
    public void testBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testStrayBracketWithinBracketSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void testBackwardsBracketsAroundString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]str["));
    }

    @Test
    public void testBackwardsBracketSetEnclosingStringOutsideString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("String]str["));
    }

}
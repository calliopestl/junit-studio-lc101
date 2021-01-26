package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void testPairOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testPairOfBracketsFacingWrongWay() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testSingleCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testSingleOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[")));
    }

    @Test
    public void testPairOfBracketsMidString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testStartWithClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void testOnlyHasClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]"));
    }

    @Test
    public void testStringStartsWithOpenBracketWithoutClosing() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testStringStartsWithPairOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testStringEnclosedByBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testMultipleCompleteSetsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void testMultipleUnmatchedOpeningBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
    }
}

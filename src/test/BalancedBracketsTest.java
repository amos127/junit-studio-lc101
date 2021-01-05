package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("string"));
    }

    @Test
    public void balancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Opener["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Closer]"));
    }

    @Test
    public void backwardsBracketBeforeOpeningShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //This doesn't work if the brackets are equal in number but unbalanced
    @Test
    public void multipleBracketsUnbalancedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]"));
    }

    @Test
    public void balancedBracketsWithinStringShouldReturnTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void unbalancedBracketsWithinStringShouldReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Un[[[balanced]!!!"));
    }

}

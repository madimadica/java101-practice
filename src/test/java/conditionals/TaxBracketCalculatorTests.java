package conditionals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaxBracketCalculatorTests {
    
    private void assertCorrect(long input) {
        assertEquals(
                Solution_TaxBracketCalculator.calculateFederalTax(input),
                TaxBracketCalculator.calculateFederalTax(input)
        );
    }
    
    @Test
    void test0() {
        assertCorrect(0);
    }

    @Test
    void test1() {
        assertCorrect(1);
    }

    @Test
    void test2() {
        assertCorrect(2);
    }

    @Test
    void test4() {
        assertCorrect(4);
    }

    @Test
    void test5() {
        // Tests rounding up
        assertCorrect(5);
    }

    @Test
    void test10() {
        assertCorrect(10);
    }

    @Test
    void test15() {
        // Tests rounding up
        assertCorrect(15);
    }

    @Test
    void testUpperLimit1() {
        assertCorrect(11598);
        assertCorrect(11599);
        assertCorrect(11600);
        assertCorrect(11601);
        assertCorrect(11602);
    }

    @Test
    void testUpperLimit2() {
        assertCorrect(47148);
        assertCorrect(47149);
        assertCorrect(47150);
        assertCorrect(47151);
        assertCorrect(47152);
    }

    @Test
    void testUpperLimit3() {
        assertCorrect(100523);
        assertCorrect(100524);
        assertCorrect(100525);
        assertCorrect(100526);
        assertCorrect(100527);
        assertCorrect(100527);
    }

    @Test
    void testUpperLimit4() {
        assertCorrect(191948);
        assertCorrect(191949);
        assertCorrect(191950);
        assertCorrect(191951);
        assertCorrect(191952);
    }

    @Test
    void testUpperLimit5() {
        assertCorrect(243723);
        assertCorrect(243724);
        assertCorrect(243725);
        assertCorrect(243726);
        assertCorrect(243727);
    }

    @Test
    void testUpperLimit6() {
        assertCorrect(609348);
        assertCorrect(609349);
        assertCorrect(609350);
        assertCorrect(609351);
        assertCorrect(609352);
    }

    @Test
    void testBracket7() {
        assertCorrect(1000000);
        assertCorrect(5000000);
        assertCorrect(50000000);
        assertCorrect(100000000);
        assertCorrect(1000000000);
        assertCorrect(10000000000L);
    }

    @Test
    void testMisc() {
        assertCorrect(100);
        assertCorrect(1000);
        assertCorrect(5000);
        assertCorrect(12000);
        assertCorrect(15000);
        assertCorrect(30000);
        assertCorrect(47000);
        assertCorrect(50000);
        assertCorrect(100000);
    }
}

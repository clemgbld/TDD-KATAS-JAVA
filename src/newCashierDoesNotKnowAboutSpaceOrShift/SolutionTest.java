package newCashierDoesNotKnowAboutSpaceOrShift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void shouldSeparateAndCapitalizeWordsInAnOrder(){
        assertEquals("Chicken",Solution.getOrder("chicken"));
        assertEquals("Fries Chicken",Solution.getOrder("frieschicken"));
        assertEquals("Fries Chicken",Solution.getOrder("Frieschicken"));
        assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.getOrder("burgerfrieschickenpizzapizzapizzasandwichmilkshakemilkshakecoke"));
        assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
    }

}
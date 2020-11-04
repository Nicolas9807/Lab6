package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stolyar Mykola
 */

class ShoppingCartTest {

    /**
     * Test of appendFormatted method, of class ShoppingCart.
     */
    @Test
    public void testAppendFormatted() {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "12345", -1, 5);
        assertEquals(sb.toString(), "12345 ");
    }

    /**
     * Test of calculateDiscount method, of class ShoppingCart.
     */
    @Test
    public void testCalculateDiscount() {
        assertEquals(80, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 500));
        assertEquals(73, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 30));
        assertEquals(71, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 10));

        assertEquals(70, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 9));
        assertEquals(70, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SALE, 1));

        assertEquals(0, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.NEW,20));
        assertEquals(0, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.NEW,10));
        assertEquals(0, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.NEW, 1));

        assertEquals(80, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 500));
        assertEquals(53, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 30));
        assertEquals(51, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 10));

        assertEquals(50, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 9));
        assertEquals(50, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 2));
        assertEquals(0, ShoppingCart.calculateDiscount(ShoppingCart.ItemType.SECOND_FREE, 1));
    }
}
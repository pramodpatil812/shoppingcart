package com.cdkglobal;

import com.cdkglobal.customers.CustomerFactory;
import com.cdkglobal.exceptions.InvalidCustomerTypeException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Unit test for ShoppingCartApplicationTest
 */
public class ShoppingCartApplicationTest {

    @Test
    public void testRegularCustomerBillingWithSlab1() throws InvalidCustomerTypeException {
        Cart cart = new Cart(1000, CustomerFactory.getCustomer("Regular"));
        assertEquals(1000.0, cart.calculateBillingAmount());

        cart = new Cart(4000, CustomerFactory.getCustomer("Regular"));
        assertEquals(4000.0, cart.calculateBillingAmount());
    }

    @Test
    public void testRegularCustomerBillingWithSlab2() throws InvalidCustomerTypeException {
        Cart cart = new Cart(8000, CustomerFactory.getCustomer("Regular"));
        assertEquals(7700.0, cart.calculateBillingAmount());
    }

    @Test
    public void testRegularCustomerBillingWithSlab3() throws InvalidCustomerTypeException {
        Cart cart = new Cart(15000, CustomerFactory.getCustomer("Regular"));
        assertEquals(13500.0, cart.calculateBillingAmount());
    }

    @Test
    public void testPremiumCustomerBillingWithSlab1() throws InvalidCustomerTypeException {
        Cart cart = new Cart(2000, CustomerFactory.getCustomer("Premium"));
        assertEquals(1800.0, cart.calculateBillingAmount());
    }

    @Test
    public void testPremiumCustomerBillingWithSlab2() throws InvalidCustomerTypeException {
        Cart cart = new Cart(6000, CustomerFactory.getCustomer("Premium"));
        assertEquals(5300.0, cart.calculateBillingAmount());
    }

    @Test
    public void testPremiumCustomerBillingWithSlab3() throws InvalidCustomerTypeException {
        Cart cart = new Cart(12000, CustomerFactory.getCustomer("Premium"));
        assertEquals(10200.0, cart.calculateBillingAmount());
    }

    @Test
    public void testPremiumCustomerBillingWithSlab4() throws InvalidCustomerTypeException {
        Cart cart = new Cart(20000, CustomerFactory.getCustomer("Premium"));
        assertEquals(15800., cart.calculateBillingAmount());
    }

    @Test(expected = InvalidCustomerTypeException.class)
    public void testInvalidCustomerCreation() throws InvalidCustomerTypeException {
        Cart cart = new Cart(12000, CustomerFactory.getCustomer("NonexistentCustomerType"));
    }

}

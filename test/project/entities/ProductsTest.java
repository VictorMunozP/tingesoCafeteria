/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class ProductsTest {
    
    public ProductsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Products.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Products instance = new Products();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Products.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Products instance = new Products();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Products.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Products instance = new Products();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Products.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Producto_1";
        Products instance = new Products();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        if(name == null){
           fail("The test case is a prototype.");
        }

    }

    /**
     * Test of getPrice method, of class Products.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Products instance = new Products();
        Integer expResult = null;
        Integer result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Products.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Integer price = null;
        Products instance = new Products();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMark method, of class Products.
     */
    @Test
    public void testGetMark() {
        System.out.println("getMark");
        Products instance = new Products();
        String expResult = "";
        String result = instance.getMark();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMark method, of class Products.
     */
    @Test
    public void testSetMark() {
        System.out.println("setMark");
        String mark = "";
        Products instance = new Products();
        instance.setMark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Products.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Products instance = new Products();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Products.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Products instance = new Products();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Products.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Products instance = new Products();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

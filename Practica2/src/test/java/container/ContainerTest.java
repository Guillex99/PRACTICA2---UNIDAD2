/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guille
 */
public class ContainerTest {
    
    public ContainerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Container.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Package b = null;
        Container instance = new Container();
        boolean expResult = false;
        boolean result = instance.add(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Container.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Package b = null;
        Container instance = new Container();
        boolean expResult = false;
        boolean result = instance.remove(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Container.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Container instance = new Container();
        double expResult = 0.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Container.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Container instance = new Container();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Container.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Container instance = new Container();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Container.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Package b = null;
        Container instance = new Container();
        boolean expResult = false;
        boolean result = instance.contains(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

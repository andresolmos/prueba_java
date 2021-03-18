/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class clidaoTest {
    
    public clidaoTest() {
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
     * Test of consultarcliente method, of class clidao.
     */
    @Test
    public void testConsultarcliente() {
        System.out.println("consultarcliente");
        String nonbre = "";
        clidao instance = new clidao();
        List expResult = instance.consultarcliente(nonbre);
        List result = instance.consultarcliente(nonbre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of testcliente method, of class clidao.
     */
    @Test
    public void testTestcliente() {
        System.out.println("testcliente");
        clidao instance = new clidao();
        List expResult = instance.testcliente();
        List result = instance.testcliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actcliente method, of class clidao.
     */
    @Test
    public void testActcliente() {
        System.out.println("actcliente");
        String nonbre = "";
        String apellido = "";
        int edad = 0;
        String correo = "";
        clidao instance = new clidao();
        instance.actcliente(nonbre, apellido, edad, correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modcliente method, of class clidao.
     */
    @Test
    public void testModcliente() {
        System.out.println("modcliente");
        String nonbre = "";
        String apellido = "";
        int edad = 0;
        String correo = "";
        int id = 0;
        clidao instance = new clidao();
        instance.modcliente(nonbre, apellido, edad, correo, id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borcliente method, of class clidao.
     */
    @Test
    public void testBorcliente() {
        System.out.println("borcliente");
        int id = 0;
        clidao instance = new clidao();
        instance.borcliente(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

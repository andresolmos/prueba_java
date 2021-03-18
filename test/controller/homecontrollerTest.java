/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import model.personabean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andre
 */
public class homecontrollerTest {
    
    public homecontrollerTest() {
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
     * Test of form method, of class homecontroller.
     */
    @Test
    public void testForm() {
        System.out.println("form");
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verform method, of class homecontroller.
     */
    @Test
    public void testVerform() {
        System.out.println("verform");
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.verform();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of client method, of class homecontroller.
     */
    @Test
    public void testClient() {
        System.out.println("client");
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.client();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addvlient method, of class homecontroller.
     */
    @Test
    public void testAddvlient() {
        System.out.println("addvlient");
        personabean personabean = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.addvlient(personabean, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acttclient method, of class homecontroller.
     */
    @Test
    public void testActtclient() {
        System.out.println("acttclient");
        HttpServletRequest request = null;
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.acttclient(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modclient method, of class homecontroller.
     */
    @Test
    public void testModclient() {
        System.out.println("modclient");
        personabean personabean = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.modclient(personabean, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrclient method, of class homecontroller.
     */
    @Test
    public void testBorrclient() {
        System.out.println("borrclient");
        HttpServletRequest request = null;
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.borrclient(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarclientebyid method, of class homecontroller.
     */
    @Test
    public void testCargarclientebyid() {
        System.out.println("cargarclientebyid");
        int id = 0;
        homecontroller instance = new homecontroller();
        personabean expResult = null;
        personabean result = instance.cargarclientebyid(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectform method, of class homecontroller.
     */
    @Test
    public void testSelectform() {
        System.out.println("selectform");
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.selectform();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectverform method, of class homecontroller.
     */
    @Test
    public void testSelectverform() {
        System.out.println("selectverform");
        personabean personabean = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homecontroller instance = new homecontroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.selectverform(personabean, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

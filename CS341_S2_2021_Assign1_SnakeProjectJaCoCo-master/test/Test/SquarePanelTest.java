/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lina_Grace
 */
public class SquarePanelTest {
    
    public SquarePanelTest() {
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
     * Test of ChangeColor method, of class SquarePanel.
     */
    @Test
    public void testChangeColor() {
        System.out.println("ChangeColor");
        Color d = null;
        SquarePanel instance = null;
        instance.ChangeColor(d);
        
    }
    
}

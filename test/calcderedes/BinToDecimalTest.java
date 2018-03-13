/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcderedes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class BinToDecimalTest {
    
    public BinToDecimalTest() {
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
     * Test of converter method, of class BinToDecimal.
     */
    @Test
    public void testConverter() {
        System.out.println("converter");
        String[] ipDividido= new String[4];
        ipDividido[0]="11000000";
        ipDividido[1]="10101000";
        ipDividido[2]="00000000";
        ipDividido[3]="00000001";
        BinToDecimal instance = new BinToDecimal();
        String expResult = "192.168.0.1";
        String result = instance.converter(ipDividido);
        assertEquals(expResult, result);
    }
    
}

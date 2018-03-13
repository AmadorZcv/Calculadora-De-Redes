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
public class DecimalToBinTest {
    
    public DecimalToBinTest() {
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
     * Test of converter method, of class DecimalToBin.
     */
    @Test
    public void testConverter() {
        System.out.println("converter");
        String[] ipDividido= new String[4];
        ipDividido[0]="192";
        ipDividido[1]="168";
        ipDividido[2]="0";
        ipDividido[3]="1";
        DecimalToBin instance = new DecimalToBin();
        String expResult = "11000000.10101000.00000000.00000001";
        String result = instance.converter(ipDividido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

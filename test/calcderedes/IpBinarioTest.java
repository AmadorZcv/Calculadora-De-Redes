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
public class IpBinarioTest {

    public IpBinarioTest() {
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
     * Test of toRede method, of class IpBinario.
     */
    @Test
    public void testToRede() {
        System.out.println("toRede");
        int mascara = 4;
        IpBinario instance = new IpBinario("11000000.10101000.00000000.00000001");
        String expResult = "192.0.0.0";
        String result = instance.toRede(mascara);
        assertEquals(expResult, result);
    }

    /**
     * Test of toBroadCast method, of class IpBinario.
     */
    @Test
    public void testToBroadCast() {
        System.out.println("toBroadCast");
        int mascara = 4;
        IpBinario instance = new IpBinario("11000000.10101000.00000000.00000001");
        String expResult = "207.255.255.255";
        String result = instance.toBroadCast(mascara);
        assertEquals(expResult, result);
    }

    /**
     * Test of toHost1 method, of class IpBinario.
     */
    @Test
    public void testToHost1() {
        System.out.println("toHost1");
        int mascara = 4;
        IpBinario instance = new IpBinario("11000000.10101000.00000000.00000001");
        String expResult = "192.0.0.1";
        String result = instance.toHost1(mascara);
        assertEquals(expResult, result);
    }

    /**
     * Test of toHostN method, of class IpBinario.
     */
    @Test
    public void testToHostN() {
        System.out.println("toHostN");
        int mascara = 4;
        IpBinario instance = new IpBinario("11000000.10101000.00000000.00000001");
        String expResult = "207.255.255.254";
        String result = instance.toHostN(mascara);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIp method, of class IpBinario.
     */
    @Test
    public void testGetIp() {
        System.out.println("getIp");
        IpBinario instance = new IpBinario("0");
        String expResult = "0";
        String result = instance.getIp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIp method, of class IpBinario.
     */
    @Test
    public void testSetIp() {
        System.out.println("setIp");
        String ip = "1";
        IpBinario instance = new IpBinario();
        instance.setIp(ip);
        assertEquals(ip, instance.getIp());
    }

}

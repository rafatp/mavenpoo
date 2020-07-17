
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaelpereira
 */
public class ApplicationTest extends TestCase{
    public ApplicationTest(String testname)
    {
        super(testname);
    }
    public static Test suite()
    {
        return new TestSuite(ApplicationTest.class);
    }
    public void test()
    {
        assertTrue(true);
   }
}

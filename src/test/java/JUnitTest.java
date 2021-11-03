/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import AssignmentA.Student;
import AssignmentA.Module;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jredd
 */
public class JUnitTest {

    @Test
    public void JUnitTests() {

        // JUnit Tests done here, tried to make fail first with false expected results
        Student sta = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("Reddington32",sta.getUsername());

        Student stb = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("John",stb.getFirst_name());

        Student stc = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("John",stc.getFirst_name());

        Student std = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("Reddington",std.getSurname());

        Student ste = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals(32,ste.getAge());

        Student stf = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("01/11/81",stf.getDob());

        Student stg = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals("01/11/81",stg.getDob());

        Student sth = new Student("John","Reddington",32,"01/11/81",15104599);
        assertEquals(15104599,sth.getId());

        Module moda = new Module("Programming", "CT2103");
        assertEquals("Programming",moda.getMod_name());

        Module modb = new Module("Programming", "CT2103");
        assertEquals("CT2103",modb.getMod_id());
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

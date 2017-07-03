package example.codeclan.com.cordwount;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class CordWountTest {

        CordWount cordWount;
        ArrayList<String> testWords;
        int total;


        @Before
        public void setUp() throws Exception {

            cordWount= new CordWount(testWords);

            testWords = new ArrayList<String>();
            testWords.add("Hello");
            testWords.add("There");
        }

    @Test
    public void createAnswersWithListTest() throws Exception {
        testWords = new ArrayList<String>();
        assertEquals(2, CordWount.getLength());
    }



}

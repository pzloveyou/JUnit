package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class fgfTest {
      String age;
    @Before
    public void setUp() throws Exception {
        System.out.println(1);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(2);
    }

    @Test
    public void main() {
        System.out.println(3);
    }
}
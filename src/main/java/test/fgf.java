package test;

import org.junit.*;

public class fgf {
    String age="哈哈哈";
    @javafs({321,342})
    public void setUp(){
        System.out.println("Before Method");
    }

    @After
    public void tearDown(){
        System.out.println("After Method");
    }
    @Test
    public void dg(){
        System.out.println("dfshddscs");
    }
}

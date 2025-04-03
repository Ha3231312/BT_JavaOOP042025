package Bai3.Testcase;

import Bai3.Common.BaseTest;

public class TestCase extends BaseTest {
    public void testLogin(){
        createDriver();
        closeDriver();

    }

    public void testAddCategory(){
        createDriver("Chrome");
        System.out.println("Navigater to http://tester.com");
        System.out.println("enter email");
        System.out.println("Enter passion");
        System.out.println("Click login button");
        closeDriver("Chrome");

    }
}

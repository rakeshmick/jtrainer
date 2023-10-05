package org.jtrainer;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(false, "test failed");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This is before");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This is after");
    }

}

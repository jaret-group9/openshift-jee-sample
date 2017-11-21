package com.group9.demo.travis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void testDetermineTitle() {
        final Application subject = new Application();
        assertEquals("Demo Application", subject.determineTitle());
    }
}

package com.twu.valueobject;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {
    @Test
    public void shouldEqual10EurosWhenComparedWith13_5Dollars() {
        assertEquals(new Dollar(13.5), new Euro(10));
    }

    @Test
    public void shouldNotEqual10EurosWhenComparedWith13Dollars() {
        assertNotEquals(new Dollar(13), new Euro(10));
    }
}

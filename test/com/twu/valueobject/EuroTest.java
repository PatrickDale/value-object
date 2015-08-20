package com.twu.valueobject;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EuroTest {

    @Test
    public void shouldBeEqualToAEuroOfSameValueWhenComparedToThatEuro() {
        assertEquals(
                new Euro(10),
                new Euro(10)
        );
    }

    @Test
    public void shouldNotBeEqualToNullObjectWhenEuroIsNotNull() {
        assertNotEquals(
                new Euro(10),
                null
        );
    }

    @Test
    public void shouldNotBeEqualToAEuroOfDifferentValueWhenComparedToThatEuro() {
        assertNotEquals(
                new Euro(10),
                new Euro(5)
        );
    }

    @Test
    public void shouldNotBeEqualToADifferentObject() {
        assertNotEquals(
                new Euro(10),
                new Object()
        );
    }

    @Test
    public void shouldNotBeEqualWhen10EurosAreComparesTo5Plus2Euros() {
        assertNotEquals(
                new Euro(10),
                new Euro(5).add(new Euro(2))
        );
    }

    @Test
    public void shouldBeEqualWhen10EurosAreComparedTo7Plus3Euros() {
        assertEquals(
                new Euro(10),
                new Euro(7).add(
                        new Euro(3)
                )
        );
    }

    @Test
    public void shouldNotEqual10DollarsWhenComparedTo10Euros() {
        assertNotEquals(
                new Euro(10),
                new Dollar(10)
        );
    }

    @Test
    public void shouldEqual13_5DollarsWhenComparedTo10Euros() {
        assertEquals(
                new Euro(10),
                new Dollar(13.5)
        );

    }
}

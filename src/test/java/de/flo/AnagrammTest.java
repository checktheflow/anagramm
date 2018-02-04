package de.flo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagrammTest {
    private Anagramm angramm;

    @Before
    public void setUp() throws Exception {
        angramm = new Anagramm();
    }

    @Test
    public void anna() {
        assertTrue(angramm.isAnagramm("anna", "anna"));
    }

    @Test
    public void bert() {
        assertFalse(angramm.isAnagramm("bert", "anna"));
    }

    @Test
    public void ignoreWhiteSpaces() {
        assertTrue(angramm.isAnagramm("alter Schwede", "alte Schwe der"));
    }
}
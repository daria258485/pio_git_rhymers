package edu.kis.vh.nursery;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFORhymerTest {
    @Test
    public void testCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        assertEquals(1, rhymer.countOut());
        assertEquals(2, rhymer.countOut());
        assertEquals(3, rhymer.countOut());
    }

    @Test
    public void testCountOutOnEmptyReturnsDefault() {
        FIFORhymer rhymer = new FIFORhymer();

        assertEquals(-1, rhymer.countOut());
    }
}
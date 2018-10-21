package com.practice.Oct2018;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximizeDistanceSeatsTest
{

    @Test
    public void maxDistToClosest01()
    {
        int seats[] = {1,0,0,0,1,0,1};
        MaximizeDistanceSeats mds = new MaximizeDistanceSeats();
        int re = mds.maxDistToClosest(seats);

        assertEquals(2, re);
    }


    @Test
    public void maxDistToClosest02()
    {
        int seats[] = {1,0,0,0};
        MaximizeDistanceSeats mds = new MaximizeDistanceSeats();
        int re = mds.maxDistToClosest(seats);

        assertEquals(3, re);
    }

    @Test
    public void maxDistToClosest03()
    {
        int seats[] = {0,0,1,0,0,0};
        MaximizeDistanceSeats mds = new MaximizeDistanceSeats();
        int re = mds.maxDistToClosest(seats);

        assertEquals(3, re);
    }

    @Test
    public void maxDistToClosest04()
    {
        int seats[] = {1,0,0,1};
        MaximizeDistanceSeats mds = new MaximizeDistanceSeats();
        int re = mds.maxDistToClosest(seats);

        assertEquals(1, re);
    }

    @Test
    public void maxDistToClosest05()
    {
        int seats[] = {0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1};
        MaximizeDistanceSeats mds = new MaximizeDistanceSeats();
        int re = mds.maxDistToClosest(seats);

        assertEquals(3, re);
    }
}
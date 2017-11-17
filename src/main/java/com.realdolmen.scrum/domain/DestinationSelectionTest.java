package com.realdolmen.scrum.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DestinationSelectionTest {

    DestinationSelection ds = new DestinationSelection();
    ArrayList<Destination> destinations = new ArrayList<>();
    ArrayList<String> criteria = new ArrayList<>();

    @Before
    public void initialize(){


        Destination athens = new Destination("Athens", "warm", "low", "active");
        Destination brussels = new Destination("Brussels", "cold", "high", "relaxed");
        destinations.add(athens);
        destinations.add(brussels);

        criteria.add("warm");
        criteria.add("low");
        criteria.add("active");

    }

    @Test
    public void testSpecificFlight() {
        Assert.assertEquals("Athens", ds.selectDestination(destinations, criteria).getName() );
        Assert.assertNotEquals("Brussels", ds.selectDestination(destinations, criteria).getName());
    }

}

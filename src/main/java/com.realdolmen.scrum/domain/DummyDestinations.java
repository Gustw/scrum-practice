package com.realdolmen.scrum.domain;

import java.util.ArrayList;

public class DummyDestinations {

    ArrayList<Destination> destinations = new ArrayList<>();

    public ArrayList<Destination> getDestinations() {

        Destination athens = new Destination("Athens", "warm", "low", "active");
        Destination brussels = new Destination("Brussels", "cold", "high", "relaxed");

        destinations.add(new Destination("Athens", "warm", "low", "active"));
        destinations.add(new Destination("Brussels", "cold", "high", "relaxed"));
        destinations.add(new Destination("Hawaii", "warm", "high", "active"));

        destinations.add(new Destination("North Pole", "cold", "low", "relaxed"));

        destinations.add(new Destination("Athens", "warm", "low", "active"));

        destinations.add(new Destination("Athens", "warm", "low", "active"));

        destinations.add(new Destination("Athens", "warm", "low", "active"));

        destinations.add(new Destination("Athens", "warm", "low", "active"));


        return destinations;
    }
}

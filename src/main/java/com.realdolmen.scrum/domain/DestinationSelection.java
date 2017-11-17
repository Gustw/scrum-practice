package com.realdolmen.scrum.domain;

import java.util.ArrayList;

public class DestinationSelection {


    public Destination selectDestination(ArrayList<Destination> destinations, ArrayList<String> criteria ) {

        for (Destination destination : destinations) {

            boolean flag = true;

            if (!destination.getClimate().equals(criteria.get(0))) flag = false;
            if (!destination.getBudget().equals(criteria.get(1)))   flag = false;
            if (!destination.getActivity().equals(criteria.get(2))) flag = false;

            if (flag) return destination;
        }

        return null;
    }

}

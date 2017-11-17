package com.realdolmen.scrum.domain;

public class Destination {
    private String name;
    private String climate;
    private String budget;
    private String activity;

    public Destination(String name, String climate, String budget, String activity) {
        this.name = name;
        this.climate = climate;
        this.budget = budget;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}

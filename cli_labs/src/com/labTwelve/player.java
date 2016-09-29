package com.labTwelve;


public abstract class player {
    protected String name;
    protected RPS choice;

    public abstract RPS generateRPS();

    public RPS getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }
}

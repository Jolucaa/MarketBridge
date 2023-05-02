package com.project.tienda.model;

public enum Location {
    TIENDA("Tienda"),
    VENDING_MACHINE("Vending Machine");

    private final String location;

    private Location (String location){
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

}

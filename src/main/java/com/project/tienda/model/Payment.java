package com.project.tienda.model;

public class Payment {
    private Location location;

    public boolean isValid() {
        this.setLocation(Location.TIENDA);
        return true;
    }

    private void setLocation(Location location) {
        this.location = location;
    }
}

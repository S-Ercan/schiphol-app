package nl.schiphol.schipholapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
    @Id
    private int id;

    private String gate;

    private String flightName;

    private String destination;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
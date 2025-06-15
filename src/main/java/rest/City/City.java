package rest.City;

import jakarta.persistence.*;
import rest.Airport.Airport;
import rest.Passenger.Passenger;

import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String province;
    private int population;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Passenger> passengers;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Airport> airports;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getProvince() {
        return province;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}

package ru.ssau.domain;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "FLIGHTS")
@SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @Column(name = "flight_id")
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "aircraft_id")
    private AirCraft airCraft;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "pilot_id")
    private Pilot pilot;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "departure", nullable = false, length = 50)
    private String departure;

    @Column(name = "destination", nullable = false, length = 50)
    private String destination;

    @Column(name = "tickets_bought", nullable = false)
    private Integer ticketsBought;

    @Column(name = "tickets_available", nullable = false)
    private Integer ticketsAvailable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getTicketsBought() {
        return ticketsBought;
    }

    public void setTicketsBought(Integer ticketsBought) {
        this.ticketsBought = ticketsBought;
    }

    public Integer getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(Integer ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }
}

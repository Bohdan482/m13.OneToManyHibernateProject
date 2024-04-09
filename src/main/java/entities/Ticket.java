package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static java.time.ZoneOffset.UTC;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne(targetEntity = Client.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column
    private LocalDateTime created_at = LocalDateTime.now(UTC);

    @ManyToOne(targetEntity = Planet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "from_planet_id", nullable = false)
    private Planet from;

    @ManyToOne(targetEntity = Planet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "to_planet_id", nullable = false)
    private Planet to;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Planet getFrom() {
        return from;
    }

    public void setFrom(Planet from) {
        this.from = from;
    }

    public Planet getTo() {
        return to;
    }

    public void setTo(Planet to) {
        this.to = to;
    }
}

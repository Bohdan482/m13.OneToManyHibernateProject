package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    @Size(min = 3, max = 200)
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Ticket> tickets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
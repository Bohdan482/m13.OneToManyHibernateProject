package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Column
    @Pattern(regexp = "^[A-Z0-9]+$")
    private String id;

    @Column
    @Size(min = 1, max = 500)
    private String name;

    @OneToMany(mappedBy = "from")
    private List<Ticket> ticketsFrom;

    @OneToMany(mappedBy = "to")
    private List<Ticket> ticketsTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
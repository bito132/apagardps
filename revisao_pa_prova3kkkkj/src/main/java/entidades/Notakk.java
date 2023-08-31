package entidades;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table
public class Notakk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    private Turmakk turmakkj;
    @Column
    private Double notakkj;

    public Notakk(Turmakk turmakkj, Double notakkj) {
        this.turmakkj = turmakkj;
        this.notakkj = notakkj;
    }

    public Turmakk getTurmakkj() {
        return turmakkj;
    }

    public void setTurmakkj(Turmakk turmakkj) {
        this.turmakkj = turmakkj;
    }

    public Double getNotakkj() {
        return notakkj;
    }

    public void setNotakkj(Double notakkj) {
        this.notakkj = notakkj;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Notakk{" +
                "id=" + id +
                ", turmakkj=" + turmakkj +
                ", notakkj=" + notakkj +
                '}';
    }
}

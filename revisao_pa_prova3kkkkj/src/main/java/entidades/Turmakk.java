package entidades;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Turmakk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    private Professorkk professorkkj;
    @Column
    private Integer horariokkj;
    @JoinColumn
    @OneToMany(cascade = CascadeType.ALL)
    private List<Alunokk> alunoskkj;
    @Column
    private String codigokkj;

    public Turmakk(Professorkk professorkkj, Integer horariokkj, List<Alunokk> alunoskkj, String codigokkj) {
        this.professorkkj = professorkkj;
        this.horariokkj = horariokkj;
        this.alunoskkj = alunoskkj;
        this.codigokkj = codigokkj;
    }

    public Professorkk getProfessorkkj() {
        return professorkkj;
    }

    public void setProfessorkkj(Professorkk professorkkj) {
        this.professorkkj = professorkkj;
    }

    public Integer getHorariokkj() {
        return horariokkj;
    }

    public void setHorariokkj(Integer horariokkj) {
        this.horariokkj = horariokkj;
    }

    public String getCodigokkj() {
        return codigokkj;
    }

    public void setCodigokkj(String codigokkj) {
        this.codigokkj = codigokkj;
    }

    public Long getId() {
        return id;
    }

    public List<Alunokk> getAlunoskkj() {
        return alunoskkj;
    }

    @Override
    public String toString() {
        return "Turmakk{" +
                "id=" + id +
                ", professorkkj=" + professorkkj +
                ", horariokkj=" + horariokkj +
                ", alunoskkj=" + alunoskkj +
                ", codigokkj='" + codigokkj + '\'' +
                '}';
    }
}

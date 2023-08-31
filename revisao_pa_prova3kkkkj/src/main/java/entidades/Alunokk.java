package entidades;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Alunokk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String senhakkj;
    @JoinColumn
    @OneToMany(cascade = CascadeType.ALL)
    private List<Notakk> notaskkj;
    @Column
    private String nomekkj;
    @Column
    private String prontuariokkj;
    @Column
    private Double mediakkj;

    public Alunokk(String senhakkj, List<Notakk> notaskkj, String nomekkj, String prontuariokkj) {
        this.senhakkj = senhakkj;
        this.notaskkj = notaskkj;
        this.nomekkj = nomekkj;
        this.prontuariokkj = prontuariokkj;
    }

    public String getNomekkj() {
        return nomekkj;
    }

    public void setNomekkj(String nomekkj) {
        this.nomekkj = nomekkj;
    }

    public String getSenhakkj() {
        return senhakkj;
    }

    public void setSenhakkj(String senhakkj) {
        this.senhakkj = senhakkj;
    }

    public Long getId() {
        return id;
    }

    public List<Notakk> getNotaskkj() {
        return notaskkj;
    }

    public String getProntuariokkj() {
        return prontuariokkj;
    }

    public Double getMediakkj() {
        return mediakkj;
    }

    @Override
    public String toString() {
        return "Alunokk{" +
                "id=" + id +
                ", senhakkj='" + senhakkj + '\'' +
                ", notaskkj=" + notaskkj +
                ", nomekkj='" + nomekkj + '\'' +
                ", prontuariokkj='" + prontuariokkj + '\'' +
                ", mediakkj=" + mediakkj +
                '}';
    }
}

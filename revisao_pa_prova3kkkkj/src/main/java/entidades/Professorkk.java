package entidades;

import jakarta.persistence.*;

@Entity
@Table
public class Professorkk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String senhakkj;
    @Column
    private String cpfkkj;
    @Column
    private String nomekkj;
    @Column
    private String prontuariokkj;

    public Professorkk(String senhakkj, String cpfkkj, String nomekkj, String prontuariokkj) {
        this.senhakkj = senhakkj;
        this.cpfkkj = cpfkkj;
        this.nomekkj = nomekkj;
        this.prontuariokkj = prontuariokkj;
    }

    public String getNomekkj() {
        return nomekkj;
    }

    public void setNomekkj(String nomekkj) {
        this.nomekkj = nomekkj;
    }

    public Long getId() {
        return id;
    }

    public String getSenhakkj() {
        return senhakkj;
    }

    public String getCpfkkj() {
        return cpfkkj;
    }

    public String getProntuariokkj() {
        return prontuariokkj;
    }

    public void setSenhakkj(String senhakkj) {
        this.senhakkj = senhakkj;
    }

    @Override
    public String toString() {
        return "Professorkk{" +
                "id=" + id +
                ", senhakkj='" + senhakkj + '\'' +
                ", cpfkkj='" + cpfkkj + '\'' +
                ", nomekkj='" + nomekkj + '\'' +
                ", prontuariokkj='" + prontuariokkj + '\'' +
                '}';
    }
}

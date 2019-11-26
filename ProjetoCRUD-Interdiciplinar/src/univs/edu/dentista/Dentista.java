package univs.edu.dentista;

import univs.edu.cliente.*;
import univs.edu.usuario.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dentista {
    
    @Id
    @GeneratedValue
    private int idDentista;
    
    @Column(length = 20, nullable = false)
    private String nome;
    
    @Column(length = 20, nullable = false)
    private String cpf;

    public int getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(int idDentista) {
        this.idDentista = idDentista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}

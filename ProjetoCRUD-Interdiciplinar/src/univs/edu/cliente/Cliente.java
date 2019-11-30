package univs.edu.cliente;

import univs.edu.usuario.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private int idCliente;
    
    @Column(length = 20, nullable = false)
    private String nome;
    
    @Column(length = 20, nullable = false)
    private String cpf;
    
   

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    /**
     * @return the usuario
     */
  
    }
    


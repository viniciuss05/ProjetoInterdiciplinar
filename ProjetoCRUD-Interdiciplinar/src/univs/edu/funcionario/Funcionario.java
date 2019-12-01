
package univs.edu.funcionario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import univs.edu.usuario.Usuario;

@Entity
public class Funcionario {
    
    @Id
    @GeneratedValue
    private int idFuncionario;
    
    @Column (length =100, nullable = false)
    private String nome;
    
    @Column (length =50, nullable = false)
    private String cargo;
    
    @Column (length =20, nullable = false)
    private double salario;
    
    @Column (length =20, nullable = false)
    private int numero;
    
    
    @OneToOne
    private Usuario usuario;
    

    /**
     * @return the idFncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFncionario the idFncionario to set
     */
    public void setIdFuncionario(int idFncionario) {
        this.idFuncionario = idFncionario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    

}

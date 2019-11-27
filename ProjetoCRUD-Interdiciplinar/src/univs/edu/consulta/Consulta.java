
package univs.edu.consulta;

import java.util.Date;
import univs.edu.funcionario.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import univs.edu.cliente.Cliente;
import univs.edu.dentista.Dentista;
import univs.edu.usuario.Usuario;

@Entity
public class Consulta {
    
    @Id
    @GeneratedValue
    private int idConsulta;
    
    @Column (length =100, nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
   
    
    
    @ManyToMany
    private Cliente cliente;
    
    @ManyToMany
    private Dentista dentista;

    /**
     * @return the idConsulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the dentista
     */
    public Dentista getDentista() {
        return dentista;
    }

    /**
     * @param dentista the dentista to set
     */
    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public void getData(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}

package univs.edu.cliente;

import univs.edu.cliente.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

public class ClienteDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Cliente cliente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(cliente.getIdCliente()==0){
            sessao.save(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        }else{
            editar(cliente);
             JOptionPane.showMessageDialog(null, "Cliente editado com sucesso");
        }
        transacao.commit();
        sessao.close();
    }
    
    public void excluir(Cliente cliente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(cliente);
        transacao.commit();
        sessao.close();
    }
    
    public void editar(Cliente cliente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(cliente);
        transacao.commit();
        sessao.close();
    }
    
    public Cliente pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Cliente cliente = (Cliente) sessao.createCriteria(Cliente.class).add(Restrictions.eq("idCliente", id)).uniqueResult();
        sessao.close();
        return cliente;
    }
    public Cliente autenticarCliente(String login,String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Cliente cliente = (Cliente) sessao.createCriteria(Cliente.class).add(Restrictions.eq("login", login)).add(Restrictions.eq("senha", senha)).uniqueResult();
        sessao.close();
        
        return cliente != null? cliente:null;
    }
    
       public List<Cliente> ListarClientes() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Cliente> clientes = sessao.createCriteria(Cliente.class).list();
        sessao.close();
        return clientes;
    }
       
        public List<Cliente> pesquisar (String campo, String valor){
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Cliente> clientes = sessao.createCriteria(Cliente.class).add(Restrictions.ilike(campo, "%"+valor+"%")).list();
        sessao.close();
        
        return clientes;
        }
       
}

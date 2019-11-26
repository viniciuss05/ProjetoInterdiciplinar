package univs.edu.dentista;

import univs.edu.dentista.*;
import univs.edu.dentista.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

public class DentistaDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Dentista dentista) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(dentista.getIdDentista()==0){
            sessao.save(dentista);
            JOptionPane.showMessageDialog(null, "Dentista cadastrado com sucesso");
        }else{
            editar(dentista);
             JOptionPane.showMessageDialog(null, "Dentista editado com sucesso");
        }
        transacao.commit();
        sessao.close();
    }
    
    public void excluir(Dentista dentista) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(dentista);
        transacao.commit();
        sessao.close();
    }
    
    public void editar(Dentista dentista) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(dentista);
        transacao.commit();
        sessao.close();
    }
    
    public Dentista pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Dentista dentista = (Dentista) sessao.createCriteria(Dentista.class).add(Restrictions.eq("idDentista", id)).uniqueResult();
        sessao.close();
        return dentista;
    }
    public Dentista autenticarDentista(String login,String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Dentista dentista = (Dentista) sessao.createCriteria(Dentista.class).add(Restrictions.eq("login", login)).add(Restrictions.eq("senha", senha)).uniqueResult();
        sessao.close();
        
        return dentista != null? dentista:null;
    }
    
       public List<Dentista> ListarDentistas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Dentista> dentistas = sessao.createCriteria(Dentista.class).list();
        sessao.close();
        return dentistas;
    }
       
        public List<Dentista> pesquisar (String campo, String valor){
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Dentista> dentistas = sessao.createCriteria(Dentista.class).add(Restrictions.ilike(campo, "%"+valor+"%")).list();
        sessao.close();
        
        return dentistas;
        }
       
}

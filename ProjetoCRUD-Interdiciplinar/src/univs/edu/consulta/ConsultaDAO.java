package univs.edu.consulta;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import univs.edu.consulta.*;
import univs.edu.consulta.*;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.cliente.Cliente;
import univs.edu.consulta.Consulta;
import univs.edu.util.HibernateUtil;

public class ConsultaDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Consulta consulta) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (consulta.getIdConsulta() == 0) {
            sessao.save(consulta);
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso");
        } else {
            editar(consulta);
            JOptionPane.showMessageDialog(null, "Consulta editada com sucesso");
        }
        transacao.commit();
        sessao.close();
    }

    public void excluir(Consulta consulta) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(consulta);
        transacao.commit();
        sessao.close();
    }

    public void editar(Consulta consulta) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(consulta);
        transacao.commit();
        sessao.close();
    }

    public Consulta pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Consulta consulta = (Consulta) sessao.createCriteria(Consulta.class).add(Restrictions.eq("idConsulta", id)).uniqueResult();
        sessao.close();
        return consulta;
    }

    public Consulta autenticarConsulta(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Consulta consulta = (Consulta) sessao.createCriteria(Consulta.class).add(Restrictions.eq("usuario.login", login)).add(Restrictions.eq("usuario.senha", senha)).uniqueResult();
        sessao.close();

        return consulta != null ? consulta : null;
    }

    public List<Consulta> ListarConsultas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Consulta> consultas = sessao.createCriteria(Consulta.class).list();
        sessao.close();
        return consultas;
    }

    public List<Consulta> pesquisar(String campo, String valor) {

        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Consulta> consultas = sessao.createCriteria(Consulta.class).add(Restrictions.ilike(campo, "%" + valor + "%")).list();
        sessao.close();

        return consultas;
    }
    public List<Consulta> pesquisar(String campo, int id) {

        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Consulta> consultas = sessao.createCriteria(Consulta.class).add(Restrictions.eq(campo, id)).list();
        sessao.close();

        return consultas;
    }
}

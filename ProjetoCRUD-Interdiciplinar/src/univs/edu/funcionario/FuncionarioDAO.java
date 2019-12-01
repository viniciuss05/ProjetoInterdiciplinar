package univs.edu.funcionario;

import univs.edu.funcionario.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.funcionario.Funcionario;
import univs.edu.util.HibernateUtil;

public class FuncionarioDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Funcionario funcionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (funcionario.getIdFuncionario() == 0) {
            sessao.save(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        } else {
            editar(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso");
        }
        transacao.commit();
        sessao.close();
    }

    public void excluir(Funcionario funcionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(funcionario);
        transacao.commit();
        sessao.close();
    }

    public void editar(Funcionario funcionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(funcionario);
        transacao.commit();
        sessao.close();
    }

    public Funcionario pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Funcionario funcionario = (Funcionario) sessao.createCriteria(Funcionario.class).add(Restrictions.eq("idFuncionario", id)).uniqueResult();
        sessao.close();
        return funcionario;
    }

    public Funcionario autenticarFuncionario(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Funcionario funcionario = (Funcionario) sessao.createCriteria(Funcionario.class).add(Restrictions.eq("usuario.login", login)).add(Restrictions.eq("usuario.senha", senha)).uniqueResult();
        sessao.close();

        return funcionario != null ? funcionario : null;
    }

    public List<Funcionario> ListarFuncionarios() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Funcionario> funcionarios = sessao.createCriteria(Funcionario.class).list();
        sessao.close();
        return funcionarios;
    }
     public List<Funcionario> pesquisar (String campo, String valor){
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Funcionario> funcionarios = sessao.createCriteria(Funcionario.class).add(Restrictions.ilike(campo, "%"+valor+"%")).list();
        sessao.close();
        
        return funcionarios;
        }

    /**
     *
     * @param login
     * @param senha
     * @return
     */
  
}

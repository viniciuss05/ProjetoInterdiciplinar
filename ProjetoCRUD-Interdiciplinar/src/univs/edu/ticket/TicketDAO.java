/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.ticket;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author LABORATORIO 01
 */
public class TicketDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Ticket ticket) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(ticket);
        JOptionPane.showMessageDialog(null, "Ticket enviado");
        transacao.commit();
        sessao.close();
    }

    public void editar(Ticket ticket) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(ticket);
        JOptionPane.showMessageDialog(null, "Resposta Enviada!");
        transacao.commit();
        sessao.close();
    }

    public void excluir(Ticket ticket) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(ticket);
        transacao.commit();
        sessao.close();
    }

    public Ticket pesquisar(int id) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Ticket ticket = (Ticket) sessao.createCriteria(Ticket.class).add(Restrictions.eq("idTicket", id)).uniqueResult();
        return ticket;
    }
    
    public List<Ticket> pesquisar(String campo, int id) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Ticket> tickets =  sessao.createCriteria(Ticket.class).add(Restrictions.eq(campo, id)).list();
        return tickets;
    }

    public List<Ticket> pesquisar() {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Ticket> usuarios = sessao.
                createCriteria(Ticket.class).list();
        return usuarios;
    }

}

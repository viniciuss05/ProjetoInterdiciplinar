package univs.edu.ticket;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.ticket.Ticket;

/**
 *
 * @author Akari
 */
public class TicketTableModel extends AbstractTableModel {

    private List<Ticket> tickets = new ArrayList<>();
    private String[] colunas = {"Id", "Assunto", "Requisitante"};

    public TicketTableModel(List<Ticket> ticket) {
        this.tickets = ticket;
    }

    @Override
    public int getRowCount() {
        return tickets.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ticket ticket = tickets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ticket.getIdTicket();
            case 1:
                return ticket.getAssunto();
            case 2:
                return ticket.getCliente().getNome();
                
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];

        }
        return null;
    }

}

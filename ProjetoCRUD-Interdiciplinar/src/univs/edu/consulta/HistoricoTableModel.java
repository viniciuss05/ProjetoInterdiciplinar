package univs.edu.consulta;

import univs.edu.consulta.*;
import univs.edu.consulta.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dentista.Dentista;

public class HistoricoTableModel extends AbstractTableModel {

    private List<Consulta> consultas = new ArrayList<>();
    private String[] colunas = {"Data","Horario", "Dentista", "Cliente","Consulta","Valor","Status"};

    public HistoricoTableModel(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public int getRowCount() { 
        return consultas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consulta consulta = consultas.get(rowIndex);
        switch (columnIndex) {
            
            case 0:
                return consulta.getData();
                
            case 1:
                return consulta.getHorario();
           
            case 2:
                return consulta.getDentista().getNome();
                
            case 3:
                return consulta.getCliente().getNome();
                              
            case 4:
                return consulta.getTipoConsulta();
                
            case 5:
                return consulta.getValor();
                
            case 6:
                return consulta.getStatus();
            
                
                
            
          
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
               
            case 3:
                return colunas[3];
               
            case 4:
                return colunas[4];
                
            case 5:
                return colunas[5];
                
            case 6:
                return colunas[6];
                           

        }
        return null;
    }

}
